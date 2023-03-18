package com.souz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloWorldController {
    @GetMapping("/test")
    @ResponseBody
    public String printHello(){
        return "Hello! ";
    }
    @GetMapping("/test2")
    public String showHelloPage(Model model){
        model.addAttribute("message","hi");
        return "HelloPage";
    }

}
