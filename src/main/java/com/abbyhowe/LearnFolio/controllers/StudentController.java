package com.abbyhowe.LearnFolio.controllers;

import com.abbyhowe.LearnFolio.models.Student;
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
    private static List<Student> students = new ArrayList<>();

    @GetMapping
    public String displayAllStudents(Model model){
        model.addAttribute("title", "All Students");
        model.addAttribute("students", students);
        return "students/index";
    }

    @GetMapping("create")
    public String displayCreateStudentForm(Model model){
        model.addAttribute("studentName", "Add Student");
        return "students/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String name, @RequestParam String address, @RequestParam int id) {
        students.add(new Student(name, address, id));
        return "redirect:";
    }
}
