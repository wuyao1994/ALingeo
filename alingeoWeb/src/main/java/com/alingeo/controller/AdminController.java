package com.alingeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.alingeo.domin.News;
import com.alingeo.service.JoinService;
import com.alingeo.service.NewsService;
import com.alingeo.util.FileUtil;

@Controller
public class AdminController {
	@Autowired
	private JoinService	joinService;
	@Autowired
	private NewsService	newsService;
	@Value("${img.location}")
	private String		location;



	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("joins", joinService.findAll());
		return "admin";
	}



	@RequestMapping(value = "/admin/news", method = RequestMethod.GET)
	public String getMessage(Model model) {
		model.addAttribute("news", newsService.findAll());
		return "news";
	}



	@RequestMapping(value = "/admin/message", method = RequestMethod.GET)
	public String getNews(Model model) {
		model.addAttribute("joins", joinService.findAll());
		return "admin";
	}



	@RequestMapping(value = "/imageUpload", method = RequestMethod.POST)
	public String upLoadAccessory(@RequestParam("file") MultipartFile file, @RequestParam("id") Long id) {
		String fileName = file.getOriginalFilename();
		try {
			FileUtil.uploadFile(file.getBytes(), location, fileName);
			String iamgePath = location + fileName;
			News news = newsService.findNewsById(id);
			news.setImagePath(iamgePath);
			newsService.udpateNews(news);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/admin/news";
	}



	@RequestMapping(value = "/admin/deleteNews/{id}", method = RequestMethod.GET)
	public String deleteNews(@PathVariable("id") Long id, Model model) {
		newsService.deleteNewsById(id);
		return "redirect:/admin/news";
	}



	@RequestMapping(value = "/admin/addNews", method = RequestMethod.GET)
	public String addNewsPage(Model model) {
		return "addNews";
	}



	@RequestMapping(value = "/admin/addNews", method = RequestMethod.POST)
	public String addNews(Model model, @ModelAttribute News news) {
		newsService.createNews(news);
		return "redirect:/admin/news";
	}
}
