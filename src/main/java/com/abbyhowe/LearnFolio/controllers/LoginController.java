package com.abbyhowe.LearnFolio.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

//    //to get login form page
//    @RequestMapping(value="/login", method= RequestMethod.GET )
//    public String getLoginForm() {
//        return "login";
//    }
//
//    //Check for login credentials
//    @RequestMapping(value="/login", method =RequestMethod.POST )
//    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model){
//        String username = loginForm.getUsername();
//        String password = loginForm.getPassword();
//
//        if ("admin".equals(username) && "admin".equals(password)){
//            //if both are true/correct
//            return "teacherdash";
//        } else if ("student".equals(username) && "student".equals(password)){
//            //if both are true/correct
//            return "studentdash";
//        }
//        // either are false or incorrect
//        model.addAttribute("invalidCredentials", true);
//        //return to login page
//        return "login";
//    }

}
