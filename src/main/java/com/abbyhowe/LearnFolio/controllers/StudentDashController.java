package com.abbyhowe.LearnFolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "studentdash")
public class StudentDashController {
    @RequestMapping("")
    public String studentdash(Model model) {
        return "studentdash";
    }


}
