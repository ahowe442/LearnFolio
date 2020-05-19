package com.abbyhowe.LearnFolio.controllers;

import com.abbyhowe.LearnFolio.models.User;
import com.abbyhowe.LearnFolio.models.UserFiles;
import com.abbyhowe.LearnFolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SpringbootUploadDownloadController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public String users(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("title", "User Information");
        model.addAttribute("users", users);
        model.addAttribute("user", new User());
        model.addAttribute("userfiles", new ArrayList<UserFiles>());
        model.addAttribute("isAdd", true);
        return "view/user";
    }

    @PostMapping(value="/save")
    public String save(@ModelAttribute User user, RedirectAttributes redirectAttributes, Model model){
        User dbUser = userService.save(user);
        if(dbUser!=null){
            redirectAttributes.addFlashAttribute("successmessage", "User has been saved successfully");
            return "redirect:/users";
        }else{
            model.addAttribute("errormessage", "User has not been saved, Please try again");
            model.addAttribute("user", user);
            return "view/user";
        }
    }

    @GetMapping(value = "/edituser/{userId}")
    public String edituser(@PathVariable Long userId, Model model) {
        User user = userService.findById(userId);
        List<UserFiles> userFiles = userService.findFilesByUserId(userId);
        List<User> users = userService.getAllUsers();

        model.addAttribute("users", users);
        model.addAttribute("user", user);
        model.addAttribute("userfiles", userFiles);
        model.addAttribute("isAdd", false);
        return "view/user";
    }

    @PostMapping(value="/update")
    public String update(@ModelAttribute User user, RedirectAttributes redirectAttributes, Model model){
        User dbUser = userService.update(user);
        if(dbUser!=null){
            redirectAttributes.addFlashAttribute("successmessage", "User has been updated successfully");
            return "redirect:/users";
        }else{
            model.addAttribute("errormessage", "User has not been updated, Please try again");
            model.addAttribute("user", user);
            return "view/user";
        }
    }

    @GetMapping(value = "/deleteuser/{userId}")
    public String deleteuser(@PathVariable Long userId, RedirectAttributes redirectAttributes, Model model) {
        userService.deleteFilesByUserId(userId);
        userService.deleteUser(userId);
        redirectAttributes.addFlashAttribute("successmessage", "User has been updated successfully");

        return "redirect:/users";
    }

//    @GetMapping(value="/deletefile/{userId}")
//    public String deleteFile(@PathVariable Long userId, RedirectAttributes redirectAttributes, Model model ){
//        userService.deleteFilesByUserId(userId);
//        redirectAttributes.addFlashAttribute("successmessage", "File has been deleted");
//
//        return "redirect:/users";
//    }

    @GetMapping(value = "/viewuser/{userId}")
    public String viewuser(@PathVariable Long userId, Model model) {
        User user = userService.findById(userId);
        List<UserFiles> userFiles = userService.findFilesByUserId(userId);
        List<User> users = userService.getAllUsers();

        model.addAttribute("users", users);
        model.addAttribute("user", user);
        model.addAttribute("userfiles", userFiles);
        model.addAttribute("isAdd", false);
        return "view/viewuser";
    }


}
