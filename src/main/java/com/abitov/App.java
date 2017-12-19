package com.abitov;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class App implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(WebConfig.class);
        webContext.setServletContext(servletContext);
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
