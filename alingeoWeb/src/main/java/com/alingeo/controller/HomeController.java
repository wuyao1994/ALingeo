package com.alingeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alingeo.domin.Join;
import com.alingeo.service.JoinService;
import com.alingeo.util.MailManager;

@Controller
public class HomeController {
	@Autowired
	private JoinService joinService;



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
		return "html/AboutUs";
	}



	@RequestMapping(value = "/Teacher", method = RequestMethod.GET)
	public String getTeacherPage(Model model) {
		return "html/Teacher";
	}



	@RequestMapping(value = "/News", method = RequestMethod.GET)
	public String getNewsPage(Model model) {
		return "html/News";
	}



	@RequestMapping(value = "/AlgCenter", method = RequestMethod.GET)
	public String getAlgCenterPage(Model model) {
		return "html/AlgCenter";
	}



	@RequestMapping(value = "/JoinUs", method = RequestMethod.GET)
	public String getJoinUsPage(Model model) {
		return "html/JoinUs";
	}



	@RequestMapping(value = "/ContactUs", method = RequestMethod.GET)
	public String getContactUsPage(Model model) {
		return "html/ContactUs";
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
