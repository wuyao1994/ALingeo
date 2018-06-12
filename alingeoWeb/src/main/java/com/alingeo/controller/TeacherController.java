package com.alingeo.controller;

import com.alingeo.domin.Teacher;
import com.alingeo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService mTeacherService;

    @RequestMapping(value = "/teacher/index", method = RequestMethod.POST)
    private String findTeacherByName(@ModelAttribute("name") String name, Model model) {
        List<Teacher> teacherList = mTeacherService.findByNameLike(name);
        model.addAttribute("teacherList", teacherList);
        return "teacher";
    }



    @RequestMapping(value = "/teacher/index", method = RequestMethod.GET)
    private String teacherIndexPage(Model model) {
        model.addAttribute("centerList", mTeacherService.findAll());
        return "teacher";
    }
}
