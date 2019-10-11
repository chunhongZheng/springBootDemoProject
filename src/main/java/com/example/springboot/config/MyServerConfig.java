package com.example.springboot.config;

import com.example.springboot.component.MyTomcatWebServerCustomizer;
import com.example.springboot.filter.MyFilter;
import com.example.springboot.listener.MyListener;
import com.example.springboot.servlet.MyServlet;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/***
 *
 * server相关的配置类
 * ***/
@Configuration
public class MyServerConfig {
    ////配置嵌入式servlet tomcat容器
    @Bean
    public MyTomcatWebServerCustomizer tomcatWebServerCustomizer(){
        return  new MyTomcatWebServerCustomizer();
    }
   //注册servlet
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean registrationBean=new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return  registrationBean;
    }
   //注册filter
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return registrationBean;
    }
    //注册listener 监听器
    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean registrationBean=new   ServletListenerRegistrationBean();
        registrationBean.setListener(new MyListener());
        return registrationBean;
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
