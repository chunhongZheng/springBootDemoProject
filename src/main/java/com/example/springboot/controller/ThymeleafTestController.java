package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ThymeleafTestController {
    @RequestMapping("leaf/testThymeleaf")
    public String testThymeleaf(Map<Object,Object> map){
        //classpath:/templates/success.html
        map.put("hello","您好");
        return "success";
    }
}
