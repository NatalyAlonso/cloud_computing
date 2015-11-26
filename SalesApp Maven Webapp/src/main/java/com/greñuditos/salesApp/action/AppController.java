package com.greñuditos.salesApp.action;

import com.greñuditos.salesApp.dto.*;
import com.greñuditos.salesApp.service.impl.ServiceImpl;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import javax.sql.rowset.serial.SerialBlob;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

@MultipartConfig(
        fileSizeThreshold   = 1024 * 1024 * 1,  // 1 MB
        maxFileSize         = 1024 * 1024 * 10, // 10 MB
        maxRequestSize      = 1024 * 1024 * 15, // 15 MB
        location            = "/tmp"
)

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
    @RequestMapping("/agregarCliente")
    public ModelAndView addCliente(HttpServletRequest request){
        ModelAndView model = new ModelAndView("agregarCliente");
        model.addObject("roles", service.getRoles());
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
