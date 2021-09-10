package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hihi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "asdf");
        return "greetings"; //templates/greetings.mustache -> 브라우저 전송
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "qwerty");
        return "goodbye"; //templates/greetings.mustache -> 브라우저 전송
    }
}
