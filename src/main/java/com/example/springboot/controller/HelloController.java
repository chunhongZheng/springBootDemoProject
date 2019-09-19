package com.example.springboot.controller;

import com.example.springboot.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    String home() {
        return  "Hello World!";
    }
    /**
     * 取配置文件某个属性值时用@value，要获取整个配置对象则使用@ConfigurationProperties
     *
     * ***/
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
       return "say hello to "+name;
    }
    @Autowired
    Order order;

    @RequestMapping("/testPropertySource")
    public String testPropertySource(){
        return "orderno is :"+order.getOrderNo()+" and contNo is :"+order.getContNo();
    }


}
