package com.alingeo.util;

import com.alingeo.domin.Join;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailManager {

	public static String	myEmailAccount		= "2810037561@qq.com";
	public static String	myEmailPassword		= "qczwrbmbgzihdgfh";
	public static String	myEmailSMTPHost		= "smtp.qq.com";
	public static String	receiveMailAccount	= "shentao_yx@163.com";



	public static void  SendEmail(Join join) {
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.host", myEmailSMTPHost);
		props.setProperty("mail.smtp.auth", "true");

		Session session = Session.getInstance(props);
		session.setDebug(true);
		try {
			MimeMessage message = createMimeMessage(session, myEmailAccount, receiveMailAccount, join);
			Transport transport = session.getTransport();
			transport.connect(myEmailAccount, myEmailPassword);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	/**
	 * @param session
	 * @param sendMail
	 * @param receiveMail
	 * @return
	 * @throws Exception
	 */
	public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail, Join join) throws Exception {
		MimeMessage message = new MimeMessage(session);

		message.setFrom(new InternetAddress(sendMail, "2810037561@qq.com", "UTF-8"));

		message.setRecipient(MimeMessage.RecipientType.TO,
				new InternetAddress(receiveMail, "shentao_yx@163.com", "UTF-8"));

		message.setSubject(join.getType(), "UTF-8");

		message.setContent("姓名：" + join.getName() + " 电话：" + join.getTelephone() + " 内容：" + join.getContent(), "text/html;charset=UTF-8");

		message.setSentDate(new Date());

		message.saveChanges();

		return message;
	}
}
