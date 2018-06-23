package com.alingeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		return "index";
	}



	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String homeIndexPage(Model model) {
		return "index";
	}



	@RequestMapping(value = "/AboutUs", method = RequestMethod.GET)
	public String getAboutUsPage(Model model) {
		return "html/AboutUs";
	}



	@RequestMapping(value = "/AlgCourse", method = RequestMethod.GET)
	public String getAlgCoursePage(Model model) {
		return "html/AlgCourse";
	}



	@RequestMapping(value = "/Teacher", method = RequestMethod.GET)
	public String getTeacherPage(Model model) {
		return "html/Teacher";
	}



	@RequestMapping(value = "/AlgCenter", method = RequestMethod.GET)
	public String getAlgCenterPage(Model model) {
		return "html/AlgCenter";
	}

}
