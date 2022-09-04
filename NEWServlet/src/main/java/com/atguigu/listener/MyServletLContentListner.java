package com.atguigu.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author cc
 * @date 2022年09月04日 13:41
 */
@WebListener
public class MyServletLContentListner implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println();
    }
}
