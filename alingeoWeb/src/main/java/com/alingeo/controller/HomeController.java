package com.alingeo.controller;

import com.alingeo.util.MailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alingeo.domin.Join;
import com.alingeo.service.JoinService;

@Controller
public class HomeController {
	@Autowired
	private JoinService joinService;



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		return "home";
	}



	@RequestMapping(value = "/join/index", method = RequestMethod.GET)
	public String joinIndex(Model model) {
		return "join";
	}



	@RequestMapping(value = "/join/create", method = RequestMethod.POST)
	public String join(@ModelAttribute Join join, Model model) {
		joinService.create(join);
		MailManager.SendEmail();
		return "redirect:/";
	}
}
