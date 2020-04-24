package com.abbyhowe.LearnFolio.controllers;

import com.abbyhowe.LearnFolio.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("students")
public class StudentController {

    @Autowired
    private static List<Student> students = new ArrayList<>();

    @GetMapping
    public String displayAllStudents(Model model){
        model.addAttribute("title", "All Students");
        model.addAttribute("students", students);
        return "students/index";
    }

    @GetMapping("create")
    public String displayCreateStudentForm(Model model){
        model.addAttribute("studentFirstName", "First Name");
        model.addAttribute("studentLastName", "Last Name");
        model.addAttribute("studentEmail", "Email");
        return "students/create";
    }

    @PostMapping("create")
    public String processCreateStudentForm(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {
        students.add(new Student(firstName, lastName, email));
        return "redirect:";
    }

    @GetMapping("portfolio")
    public String displayStudentPortfolio(Model model){
        return "students/portfolio";
    }
}
