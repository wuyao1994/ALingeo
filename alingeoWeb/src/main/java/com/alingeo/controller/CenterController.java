package com.alingeo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alingeo.domin.Center;
import com.alingeo.service.CenterService;

@Controller
public class CenterController {
	@Autowired
	private CenterService mCenterService;



	@RequestMapping(value = "/center/index", method = RequestMethod.POST)
	private String findCenterByCity(@ModelAttribute("city") String city, Model model) {
		List<Center> centerList = mCenterService.findByCityLike(city);
		model.addAttribute("centerList", centerList);
		return "center";
	}



	@RequestMapping(value = "/center/index", method = RequestMethod.GET)
	private String centerIndexPage(Model model) {
		model.addAttribute("centerList", mCenterService.findAll());
		return "center";
	}
}
