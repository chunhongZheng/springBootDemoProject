package com.example.springboot.controller;

import com.example.springboot.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
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
    @Autowired
    ApplicationContext context;

    @RequestMapping("/testImportSource")
    public String testImportSource(){
       //测试使用importsource是否可以把类加载至容器中
        boolean b=context.containsBean("helloService");
        return "spring boot context whether contains bean helloService is ::"+b;
    }



}
