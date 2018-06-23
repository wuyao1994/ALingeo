package com.alingeo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alingeo.domin.Center;
import com.alingeo.service.CenterService;

@Controller
public class CenterController {
	@Autowired
	private CenterService mCenterService;

	@RequestMapping(value = "/AlgCenter", method = RequestMethod.POST)
	private String findCenterByInputCity(@ModelAttribute("city") String city, Model model) {
		if(city == null || city.isEmpty()) {
			city = "北京";
		}
		List<Center> centerList = mCenterService.findByCityLike(city);
		model.addAttribute("city", city);
		model.addAttribute("centerList", centerList);
		return "html/AlgCenter";
	}



	@RequestMapping(value = "/AlgCenter", method = RequestMethod.GET)
	public String getAlgCenterPage(@ModelAttribute("city") String city, Model model) {
		if(city == null || city.isEmpty()) {
			city = "北京";
		}
		List<Center> centerList = mCenterService.findByCityLike(city);
		model.addAttribute("city",city);
		model.addAttribute("centerList", centerList);
		return "html/AlgCenter";
	}
}
