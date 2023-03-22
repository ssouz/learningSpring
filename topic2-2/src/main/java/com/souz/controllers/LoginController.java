package com.souz.controllers;

import com.souz.models.LoginModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        System.out.println("username: "+loginModel.getUsername());
        System.out.println("password: "+loginModel.getPassword());

        if (bindingResult.hasErrors()){
            model.addAttribute("loginModel", loginModel);
            System.out.println("fail");
            return "LoginForm";
        }

        model.addAttribute("loginModel", loginModel);
        return "LoginResults";
    }

}
