package com.alingeo.controller;

import com.alingeo.domin.Center;
import com.alingeo.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CenterController {
    @Autowired
    private CenterService mCenterService;

    @RequestMapping(value = "/center/city/{city}", method = RequestMethod.GET)
    private String findCenterByCity(@PathVariable("city") String city, Model model) {
        List<Center> centers = mCenterService.findByCityLike(city);
        model.addAttribute("centers", centers);
        return "center";
    }
}
