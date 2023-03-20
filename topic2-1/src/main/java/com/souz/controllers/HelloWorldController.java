package com.souz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    @GetMapping("/test")
    @ResponseBody
    public String printHelloTxt(){
        return "Hello! ";
    }
    @GetMapping("/test2")
    public String showHelloPage(Model model){
        model.addAttribute("message","hi");
        model.addAttribute("rating",99);
        model.addAttribute("report", "Some great news from the station");
        return "HelloPage";
    }
    @GetMapping("/test3")
    public ModelAndView printHello(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Have a super day");
        mv.addObject("rating",55);
        mv.setViewName("HelloPage");
        return mv;
    }
    @GetMapping("/test4")
    public String showHelloPage4(@RequestParam("message") String message, Model model){
        model.addAttribute("message",message);
        model.addAttribute("rating",22);
        model.addAttribute("report","some great news");
        return "HelloPage";
    }

}
