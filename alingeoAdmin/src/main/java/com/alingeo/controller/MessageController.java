package com.alingeo.controller;

import com.alingeo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {
    @Autowired
    private MessageService messageService;
	@RequestMapping(value = "/")
	public String homePage(Model model) {
        model.addAttribute("messages", messageService.findAll());
        return "home";
	}
}
