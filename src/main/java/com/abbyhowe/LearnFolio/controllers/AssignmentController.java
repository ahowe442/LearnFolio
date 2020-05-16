package com.abbyhowe.LearnFolio.controllers;

import com.abbyhowe.LearnFolio.repository.AssignmentData;
import com.abbyhowe.LearnFolio.repository.StudentData;
import com.abbyhowe.LearnFolio.models.Assignment;
import com.abbyhowe.LearnFolio.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("assignments")
public class AssignmentController {


        @GetMapping
        public String displayAllAssignments(Model model){
            model.addAttribute("title", "All Assignments");
            model.addAttribute("assignments", AssignmentData.getAll());
            return "assignments/index";
        }


        @GetMapping("create")
        public String displayCreateAssignmentForm(Model model){
            model.addAttribute("title", "Create Assignment");

            model.addAttribute(new Assignment());

            model.addAttribute("title", "Title");
            model.addAttribute("description", "Description");
            model.addAttribute("dueDate", "Due Date");
            model.addAttribute("createdBy", "Created By");
            return "assignments/create";
        }

        @PostMapping(value = "create")
        public String processCreateAssignmentForm(@ModelAttribute @Valid Assignment newAssignment,
                                               Errors errors, Model model) {
            if(errors.hasErrors()) {
                model.addAttribute("title", "Create Event");
                return "assignments/create";
            }

            AssignmentData.add(newAssignment);
            return "redirect:";
        }

        @GetMapping("edit/{id}")
        public String showUpdateAssignmentForm(@PathVariable("id") int id, Model model) {
            Assignment assignment = AssignmentData.getById(id);
            model.addAttribute("assignment", assignment);
            return "assignments/update-assignment";
        }

        @PostMapping("update/{id}")
        public String updateAssignment(@PathVariable("id") int id, @Valid Assignment assignment, Model model) {
            AssignmentData.add(assignment);
            model.addAttribute("assignments", AssignmentData.getAll());
            return "assignments/index";
        }

        @GetMapping("delete/{id}")
        public String deleteStudent(@PathVariable("id") int id, Model model) {
            Student student = StudentData.getById(id);
            StudentData.remove(id);
            model.addAttribute("students", StudentData.getAll());
            return "assignments/index";
        }

        @GetMapping("portfolio")
        public String displayStudentPortfolio(Model model){
            return "students/portfolio";
        }
    }
