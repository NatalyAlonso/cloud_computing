package com.greñuditos.salesApp.action;

import com.greñuditos.salesApp.dto.*;
import com.greñuditos.salesApp.service.impl.ServiceImpl;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
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

    @RequestMapping(value = "/doAgregarCliente", method = RequestMethod.POST, headers = "content-type=multipart/*")
    public String doAgregarCliente(MultipartHttpServletRequest request) {
        Cliente cliente = new Cliente();
        if (request.getParameter("nombre") != null) {
            cliente.setNombre(request.getParameter("nombre"));
        }
        if (request.getParameter("apellido_paterno") != null) {
            cliente.setApellido_paterno(request.getParameter("apellido_paterno"));
        }
        if (request.getParameter("apellido_materno") != null) {
            cliente.setApellido_materno(request.getParameter("apellido_materno"));
        }
        if (request.getParameter("contrasena") != null) {
            cliente.setContrasena(request.getParameter("contrasena"));
        }
        if (request.getParameter("email") != null) {
            cliente.setEmail(request.getParameter("email"));
        }
        if (request.getParameter("id_rol") != null) {
            cliente.setId_rol(Integer.parseInt(request.getParameter("id_rol")));
        }
        if (request.getParameter("nombre_usuario") != null) {
            cliente.setNombre_usuario(request.getParameter("nombre_usuario"));
        }

        MultipartFile file;
        file = request.getFile("imagen");
        cliente.setBfImage(file);
        service.addCliente(cliente);

        return "redirect:/agregarCliente";
    }
}
