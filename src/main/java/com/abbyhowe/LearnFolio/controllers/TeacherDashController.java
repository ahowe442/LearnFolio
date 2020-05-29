package com.abbyhowe.LearnFolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "teacherdash")
public class TeacherDashController {

    @RequestMapping("")
    public String teacherdash(Model model) {
        return "teacherdash";
    }

}
