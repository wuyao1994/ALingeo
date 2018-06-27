package com.alingeo.controller;

import com.alingeo.domin.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alingeo.service.NewsService;

import java.util.List;

@Controller
public class HomeController {
	@Autowired
	private NewsService newsService;



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		List<News> newsList = newsService.findNewsByType("中心趣闻");
		model.addAttribute("newsList", newsList);
		return "index";
	}



	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String homeIndexPage(Model model) {
		List<News> newsList = newsService.findNewsByType("中心趣闻");
		model.addAttribute("newsList", newsList);
		return "index";
	}


	@RequestMapping(value = "/AlgCourse", method = RequestMethod.GET)
	public String getAlgCoursePage(Model model) {
		return "html/AlgCourse";
	}

    @RequestMapping(value = "/AboutUs", method = RequestMethod.GET)
    public String getAboutUsPage(Model model) {
        return "html/AboutUs";
    }

}
