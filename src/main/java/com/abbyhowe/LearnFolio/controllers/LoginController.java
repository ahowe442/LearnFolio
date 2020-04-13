package com.abbyhowe.LearnFolio.controllers;

import com.abbyhowe.LearnFolio.models.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    //to get login form page
    @RequestMapping(value="/login", method= RequestMethod.GET )
    public String getLoginForm() {
        return "login";
    }

    //Check for login credentials
    @RequestMapping(value="/login", method =RequestMethod.POST )
    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model){
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        if ("admin".equals(username) && "admin".equals(password)){
            //if both are true/correct
            return "home";
        }
        // either are false or incorrect
        model.addAttribute("Invalid Credentials, Try Again.", true);
        //return to login page
        return "login";
    }

}
