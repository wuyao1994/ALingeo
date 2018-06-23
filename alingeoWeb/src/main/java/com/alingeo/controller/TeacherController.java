package com.alingeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alingeo.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService mTeacherService;


	@RequestMapping(value = "/Teacher", method = RequestMethod.GET)
	public String getTeacherPage(Model model) {
        model.addAttribute("TeacherList", mTeacherService.findAll());
		return "html/Teacher";
	}
}
