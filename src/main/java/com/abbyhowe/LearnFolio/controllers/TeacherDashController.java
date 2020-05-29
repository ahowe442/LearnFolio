package com.abbyhowe.LearnFolio.controllers;

import com.abbyhowe.LearnFolio.models.User;
import com.abbyhowe.LearnFolio.models.UserFiles;
import com.abbyhowe.LearnFolio.repository.UserRepository;
import com.abbyhowe.LearnFolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping(value = "teacherdash")
public class TeacherDashController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    // TODO: Fix this controller so that the teacher dash will show the logged in user data.
    @RequestMapping("teacherdash/{userId}")
    public String teacherdash(Model model, @PathVariable Long userId) {
        User user = userService.findById(userId);
        model.addAttribute("user", user);
        model.addAttribute("title", "Teacher Dashboard");

        List<UserFiles> userFiles = userService.findFilesByUserId(userId);
        List<User> users = userService.getAllUsers();

        model.addAttribute("users", users);
        model.addAttribute("user", user);
        model.addAttribute("userfiles", userFiles);
        model.addAttribute("isAdd", false);

        return "teacherdash/{userId}";
    }


}
