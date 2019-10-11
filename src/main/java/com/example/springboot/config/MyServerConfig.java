package com.example.springboot.config;

import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/***
 *
 * server相关的配置类
 * ***/
@Configuration
public class MyServerConfig {
    @Bean
    public ConfigurableServletWebServerFactory  webServerFactory(){
        TomcatServletWebServerFactory webServerFactory=new TomcatServletWebServerFactory();
        webServerFactory.setPort(9091);
        return webServerFactory;
    }

/*

   *//***
    * 配置tomcat
    * *//*
   @Bean
   public TomcatServletWebServerFactory setTomcat(){
       TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
       tomcat.setContextPath("/test"); // 设置项目访问路径
       tomcat.setPort(8090); // 设置项目端口号
       return tomcat;
   }

    *//**
     * 配置嵌入式的servlet容器--Jetty
     * @return
     *//*
    @Bean
    public JettyServletWebServerFactory setJetty(){
        JettyServletWebServerFactory jetty = new JettyServletWebServerFactory();
        jetty.setContextPath("/test"); // 设置项目访问路径
        jetty.setPort(8091); // 设置项目端口号
        return jetty;
    }

    *//**
     * 配置嵌入式的servlet容器--Undertow
     * @return
     *//*
    @Bean
    public UndertowServletWebServerFactory setUndertow(){
        UndertowServletWebServerFactory undertow = new UndertowServletWebServerFactory();
        undertow.setContextPath("/test"); // 设置项目访问路径
        undertow.setPort(8092); // 设置项目端口号
        return undertow;
    }
    */
}
