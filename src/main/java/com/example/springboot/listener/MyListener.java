package com.example.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
    public  void contextInitialized(ServletContextEvent sce) {
        System.out.println("web应用开始启动");
    }

    public  void contextDestroyed(ServletContextEvent sce){
        System.out.println("web应用开始停止");
    }
}
