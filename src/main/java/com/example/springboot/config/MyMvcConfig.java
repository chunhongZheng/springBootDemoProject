package com.example.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//WebMvcConfigurationAdapter已经废弃，extends WebMvcConfigurerAdapter 最好用implements WebMvcConfigurer代替
public class MyMvcConfig  implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送leaf请求来到success
        registry.addViewController("/leaf").setViewName("success");
    }
}
