package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafTestController {
    @RequestMapping("leaf/testThymeleaf")
    public String testThymeleaf(){
        //classpath:/templates/success.html
        return "success";
    }
}
