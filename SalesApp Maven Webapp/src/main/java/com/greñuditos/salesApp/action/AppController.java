package com.greñuditos.salesApp.action;

import com.greñuditos.salesApp.service.impl.ServiceImpl;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class AppController {
    private ServiceImpl service;

    public AppController(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
       service = (ServiceImpl)context.getBean("ServiceImpl");
    }

    @RequestMapping("/index")
    public ModelAndView showProducts(HttpServletRequest request){
        ModelAndView model = new ModelAndView("index");
        model.addObject("productos", service.getProducts());
        return model;
    }
    @RequestMapping("/agregarProducto")
    public ModelAndView addProduct(HttpServletRequest request){
        ModelAndView model = new ModelAndView("agregarProducto");
        return model;
    }
}
