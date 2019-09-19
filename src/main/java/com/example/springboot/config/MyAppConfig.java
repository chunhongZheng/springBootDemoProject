package com.example.springboot.config;

import com.example.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 标识为springboot的配置类
 * **/
@Configuration
//springboot不建议使用ImportResource注解加载配置文件，而是使用配置类方式和bean注解结合使用
//@ImportResource(locations = {"classpath:beans.xml"})
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件的id默认为方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean注解给容器添加组件类helloService");
        return  new HelloService();
    }


}
