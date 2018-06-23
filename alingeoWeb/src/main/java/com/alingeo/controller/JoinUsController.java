package com.alingeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alingeo.domin.Join;
import com.alingeo.service.JoinService;
import com.alingeo.util.MailManager;

@Controller
public class JoinUsController {
	@Autowired
	private JoinService joinService;



	@RequestMapping(value = "/JoinUs", method = RequestMethod.GET)
	public String getJoinUsPage(Model model) {
		return "html/JoinUs";
	}



	@RequestMapping(value = "/JoinUs/create", method = RequestMethod.POST)
	@ResponseBody
	public String joinUsCreate(@ModelAttribute Join join, Model model) {
		joinService.create(join);
		MailManager.SendEmail(join);
		return "success";
	}



	@RequestMapping(value = "/ContactUs", method = RequestMethod.GET)
	public String getContactUsPage(Model model) {
		return "html/ContactUs";
	}

}
