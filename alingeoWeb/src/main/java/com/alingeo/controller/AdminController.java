package com.alingeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alingeo.service.MessageService;

@Controller
public class AdminController {
	@Autowired
	private MessageService messageService;


	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("messages", messageService.findAll());
		return "admin";
	}
}
