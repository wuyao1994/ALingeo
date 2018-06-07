package com.alingeo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);



	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model, @RequestParam Optional<String> error) {
		LOGGER.debug("login page");
		model.addAttribute("error", error);
		return "login";
	}
}
