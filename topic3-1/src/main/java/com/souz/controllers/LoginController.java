package com.souz.controllers;


import com.souz.models.LoginModel;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Log4j2
@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping("/")
    public String displayLoginForm(Model model){
        model.addAttribute("loginModel", new LoginModel());

        return "LoginForm";
    }
    @PostMapping("/processLogin")
    public String processLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            model.addAttribute("loginModel", loginModel);
            log.info("error while trying to login with Username: {} and Password: {}",loginModel.getUsername(),loginModel.getPassword());
            return "LoginForm";
        }
        log.info("successful login with Username: {} and Password: {}",loginModel.getUsername(),loginModel.getPassword());
        model.addAttribute("loginModel", loginModel);
        return "LoginResults";
    }

    

}
