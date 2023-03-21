package com.souz.controllers;

import com.souz.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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
    @GetMapping("/people")
    public String showFriends(Model model){

        List<Person> people = new ArrayList<>();

        people.add(new Person(0, "Sarah Johnson",28 ,145f));
        people.add(new Person(1,"David Lee", 42 ,185f));
        people.add(new Person(2,"Emily Chen",19 ,120f));
        people.add(new Person(3,"Rachel Lee", 42, 150f));
        people.add(new Person(4,"David Brown", 18, 160f));
        people.add(new Person(5,"Lisa Wong", 29, 120));
        System.out.println(people);
       model.addAttribute("people", people);
        return "printPeople";
    }


}
