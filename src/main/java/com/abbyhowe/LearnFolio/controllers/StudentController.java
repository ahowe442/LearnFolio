package com.abbyhowe.LearnFolio.controllers;

import com.abbyhowe.LearnFolio.repository.StudentData;
import com.abbyhowe.LearnFolio.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("students")
public class StudentController {

//    @Autowired
//    private static List<Student> students = new ArrayList<>();

    @GetMapping
    public String displayAllStudents(Model model){
        model.addAttribute("title", "All Students");
        model.addAttribute("students", StudentData.getAll());
        return "students/index";
    }


    @GetMapping("create")
    public String displayCreateStudentForm(Model model){
        model.addAttribute("title", "Create Student");

        model.addAttribute(new Student());

        model.addAttribute("firstName", "First Name");
        model.addAttribute("lastName", "Last Name");
        model.addAttribute("email", "Email");
        return "students/create";
    }

    @PostMapping(value = "create")
    public String processCreateStudentForm(@ModelAttribute @Valid Student newStudent,
                                           Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Event");
            return "students/create";
        }

        StudentData.add(newStudent);
        return "redirect:";
    }

    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
        Student student = StudentData.getById(id);
        model.addAttribute("student", student);
        return "update-student";
    }

    @PostMapping("update/{id}")
    public String updateStudent(@PathVariable("id") int id, @Valid Student student, Model model) {
        StudentData.add(student);
        model.addAttribute("students", StudentData.getAll());
        return "index";
    }

    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") int id, Model model) {
        Student student = StudentData.getById(id);
        StudentData.remove(id);
        model.addAttribute("students", StudentData.getAll());
        return "index";
    }

    @GetMapping("portfolio")
    public String displayStudentPortfolio(Model model){
        return "students/portfolio";
    }
}
