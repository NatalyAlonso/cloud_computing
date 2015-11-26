package com.greñuditos.salesApp.action;

import com.greñuditos.salesApp.dto.*;
import com.greñuditos.salesApp.service.impl.ServiceImpl;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class AppController {
    private ServiceImpl service;

    public AppController(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
       service = (ServiceImpl)context.getBean("ServiceImpl");
    }


    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request){
        ModelAndView model = new ModelAndView("login");
        return model;
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
    @RequestMapping("/agregarCliente")
    public ModelAndView addCliente(HttpServletRequest request){
        ModelAndView model = new ModelAndView("agregarCliente");
        model.addObject("roles", service.getRoles());
        return model;
    }

    @RequestMapping("/inventarioAdmin")
    public ModelAndView inventarioAdmin(HttpServletRequest request){
        ModelAndView model = new ModelAndView("inventarioAdmin");
        return model;
    }

    @RequestMapping("/pedidosAdmin")
    public ModelAndView pedidosAdmin(HttpServletRequest request){
        ModelAndView model = new ModelAndView("pedidosAdmin");
        return model;
    }
    @RequestMapping(value = "/doAgregarCliente", method = RequestMethod.POST, headers = "content-type=application/x-www-form-urlencoded")
    public String addProduct(@ModelAttribute Cliente cliente) {
        return "redirect:/viewProducts";
    }
}
