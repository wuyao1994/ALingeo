package com.alingeo.controller;

import javax.servlet.http.HttpServletRequest;

import com.alingeo.domin.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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



	@RequestMapping(value = "/imageUpload", method = RequestMethod.POST,produces = "application/json;")
	public String upLoadAccessory(@RequestParam("file") MultipartFile file, @RequestParam("id") Long id) {
		String fileName = file.getOriginalFilename();
		try {
			FileUtil.uploadFile(file.getBytes(), location, fileName);
			String iamgePath = location+fileName;
			News news = newsService.findNewsById(id);
			news.setImagePath(iamgePath);
			newsService.udpateNews(news);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/admin/news";
	}
}
