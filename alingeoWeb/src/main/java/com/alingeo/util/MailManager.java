package com.alingeo.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailManager {

	public static String	myEmailAccount		= "wuyaoiot@163.com";
	public static String	myEmailPassword		= "xxxxxxxxx";
	public static String	myEmailSMTPHost		= "smtp.163.com";
	public static String	receiveMailAccount	= "xxxxxxxxx@qq.com";



	public void SendEmail() {
		Properties props = new Properties();
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.host", myEmailSMTPHost);
		props.setProperty("mail.smtp.auth", "true");

		Session session = Session.getInstance(props);
		session.setDebug(true);
		try {
			MimeMessage message = createMimeMessage(session, myEmailAccount, receiveMailAccount);
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
	public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail) throws Exception {
		MimeMessage message = new MimeMessage(session);

		message.setFrom(new InternetAddress(sendMail, "wuyuoiot@163.com", "UTF-8"));

		message.setRecipient(MimeMessage.RecipientType.TO,
				new InternetAddress(receiveMail, "wuyuoiot@163.com", "UTF-8"));

		message.setSubject("alingeo", "UTF-8");

		message.setContent("alingeo email test", "text/html;charset=UTF-8");

		message.setSentDate(new Date());

		message.saveChanges();

		return message;
	}
}
