package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;
import org.springframework.ui.Model; 

@Controller
public class HelloSpringBootWebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/result")
    public String send(@RequestParam("inputvalue")String inputvalue, Model model) {
        model.addAttribute("message", inputvalue);
        return "result";
    }
}