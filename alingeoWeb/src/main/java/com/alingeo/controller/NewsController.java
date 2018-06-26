package com.alingeo.controller;

import com.alingeo.domin.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alingeo.service.NewsService;

@Controller
public class NewsController {
	@Autowired
	private NewsService newsService;



	@RequestMapping(value = "/News", method = RequestMethod.GET)
	public String getNewsPage(Model model) {
	    model.addAttribute("news", newsService.findAll());
		return "html/News";
	}
	@RequestMapping(value = "/News/Details/{id}")
	public String getNewsDetailPage(@PathVariable("id") Long id, Model model) {
		News news = newsService.findNewsById(id);
		model.addAttribute("news", news);
		return "html/Details";
	}
}
