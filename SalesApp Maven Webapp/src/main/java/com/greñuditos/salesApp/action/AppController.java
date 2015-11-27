package com.greñuditos.salesApp.action;

import com.greñuditos.salesApp.dto.*;
import com.greñuditos.salesApp.service.impl.ServiceImpl;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

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
        HttpSession session = request.getSession();
        String nombre_usuario = (String) session.getAttribute("nombre_usuario");
        String contrasena = (String) session.getAttribute("nombre_usuario");
        if (nombre_usuario!=null && contrasena !=null){
            Cliente cliente = service.isValidUser(nombre_usuario,nombre_usuario);
            model.addObject("usuario",cliente);
        }
        else
            model.addObject("usuario",null);

        return model;
    }

    @RequestMapping(value = "/doIniciarSesion", method = RequestMethod.POST, headers = "content-type=application/x-www-form-urlencoded")
    public String iniciarSesion(HttpServletRequest request) {
        String nombre_usuario = request.getParameter("nombre_usuario");
        String contrasena = request.getParameter("contrasena");
        Cliente cliente = service.isValidUser(nombre_usuario,contrasena);
        boolean iniciarSesion = false;
        HttpSession session = request.getSession();

        String redirect = "redirect:/login";
        if (cliente==null) {
            iniciarSesion = false;
            redirect = "redirect:/login";
        }
        else if (cliente.getId_rol() == 1 ) {
            iniciarSesion = true;
            redirect = "redirect:/AgregarCliente";
            session.setAttribute("nombre_usuario",nombre_usuario);
            session.setAttribute("contrasena",contrasena);
        }
        else if (cliente.getId_rol() == 2) {
            iniciarSesion = true;
            redirect = "redirect:/index";
            session.setAttribute("nombre_usuario",nombre_usuario);
            session.setAttribute("contrasena",contrasena);
        }

        return redirect;
    }

    @RequestMapping(value = "/doCerrarSesion")
    public String cerrarSesion(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("nombre_usuario");
        session.removeAttribute("contrasena");
        return "redirect:/index";
    }
    @RequestMapping("/index")
    public ModelAndView showProducts(HttpServletRequest request){
        ModelAndView model = new ModelAndView("index");
        HttpSession session = request.getSession();
        String nombre_usuario = (String) session.getAttribute("nombre_usuario");
        String contrasena = (String) session.getAttribute("contrasena");

        if (nombre_usuario != null && contrasena!=null){
            Cliente cliente = service.isValidUser(nombre_usuario,contrasena);
            model.addObject("usuario",cliente);
        }
        else {
            model.addObject("usuario", null);
        }

        model.addObject("productos", service.getProducts());
        model.addObject("categorias", service.getCategoriaProductos());
        return model;
    }

    @RequestMapping("/AgregarProducto")
    public ModelAndView addProducto(HttpServletRequest request){
        ModelAndView model = new ModelAndView("AgregarProducto");
        model.addObject("categorias", service.getCategoriaProductos());
        return model;
    }

    @RequestMapping("/agregarCliente")
    public ModelAndView addCliente(HttpServletRequest request){
        ModelAndView model = new ModelAndView("agregarCliente");
        HttpSession session = request.getSession();
        String nombre_usuario = (String) session.getAttribute("nombre_usuario");
        String contrasena = (String) session.getAttribute("contrasena");

        if (nombre_usuario != null && contrasena!=null) {
            Cliente cliente = service.isValidUser(nombre_usuario, contrasena);
            if (cliente != null && cliente.getId_rol() == 1)
                model.addObject("usuario", cliente);
            else {
                model.addObject("usuario", null);
                model.setViewName("login");
            }
        }
        else {
            model.setViewName("login");
            model.addObject("usuario", null);
        }
        model.addObject("roles", service.getRoles());
        return model;
    }

    @RequestMapping("/inventarioAdmin")
    public ModelAndView inventarioAdmin(HttpServletRequest request){
        ModelAndView model = new ModelAndView("inventarioAdmin");
        return model;
    }

    @RequestMapping("/shop")
    public ModelAndView shop(HttpServletRequest request){
        ModelAndView model = new ModelAndView("shop");
        return model;
    }

    @RequestMapping("/shopW")
    public ModelAndView shopW(HttpServletRequest request){
        ModelAndView model = new ModelAndView("shopW");
        return model;
    }

    @RequestMapping("/porsurtir")
    public ModelAndView porsurtir(HttpServletRequest request){
        ModelAndView model = new ModelAndView("porsurtir");
        return model;
    }

    @RequestMapping("/Entransito")
    public ModelAndView Entransito(HttpServletRequest request){
        ModelAndView model = new ModelAndView("enTransito");
        return model;
    }


    @RequestMapping("/entregado")
    public ModelAndView entregado(HttpServletRequest request){
        ModelAndView model = new ModelAndView("entregado");
        return model;
    }


    @RequestMapping(value="/getImagen", method=RequestMethod.GET)
    public ResponseEntity<byte[]> getImage(HttpServletRequest request,  HttpServletResponse response) {
        byte[] content = service.getImageBytes(Integer.parseInt(request.getQueryString().replace("productId=", "")));

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0); // Proxies.
        response.setContentType("image/jpeg");
        return new ResponseEntity<byte[]>(content, HttpStatus.OK);
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
        return "redirect:/AgregarCliente";
    }
    @RequestMapping(value = "/doAgregarProducto", method = RequestMethod.POST, headers = "content-type=multipart/*")
    public String doAgregarProducto(MultipartHttpServletRequest request) {
        Producto producto = new Producto();
        if (request.getParameter("nombre") != null) {
            producto.setNombre(request.getParameter("nombre"));
        }
        if (request.getParameter("precio") != null) {
            producto.setPrecio(Float.parseFloat(request.getParameter("precio")));
        }
        if (request.getParameter("descripcion") != null) {
            producto.setDescripcion(request.getParameter("descripcion"));
        }
        if (request.getParameter("id_categoria_productos") != null) {
            producto.setId_categoria_productos(Integer.parseInt(request.getParameter("id_categoria_productos")));
        }
        MultipartFile file;
        file = request.getFile("imagen");
        producto.setBfImage(file);
        service.addProducto(producto);
        return "redirect:/AgregarProducto";
    }
    @RequestMapping("/ModificarCliente")
    public ModelAndView modificarCliente(HttpServletRequest request){
        ModelAndView model = new ModelAndView("ModificarCliente");
        HttpSession session = request.getSession();
        String nombre_usuario = (String) session.getAttribute("nombre_usuario");
        String contrasena = (String) session.getAttribute("contrasena");
        String str_id_usr  = (String) session.getAttribute("id_usuario");

        if (str_id_usr != null)
        {
            int id_usr = Integer.parseInt(str_id_usr);
            Cliente selec_cliente = service.getClienteById(id_usr);
            model.addObject("usuario_selec",selec_cliente);
        }
        if (nombre_usuario != null && contrasena!=null) {
            Cliente cliente = service.isValidUser(nombre_usuario, contrasena);
            if (cliente != null && cliente.getId_rol() == 1)
                model.addObject("usuario", cliente);
            else {
                model.addObject("usuario", null);
                model.setViewName("login");
            }
        }
        else {
            model.setViewName("login");
            model.addObject("usuario", null);
        }
        model.addObject("usuarios",service.getClientes());
        model.addObject("roles", service.getRoles());
        return model;
    }
    @RequestMapping("/cart")
    public ModelAndView cart(HttpServletRequest request){


        ModelAndView model = new ModelAndView("cart");
        HttpSession session = request.getSession();
        Enumeration<String> session_names = session.getAttributeNames();
        ArrayList<Producto>productos_carrito = new ArrayList<Producto>();
        while(session_names.hasMoreElements()){
            String session_name = session_names.nextElement();
            if (session_name.contains("ids_")){
                String str_id = (String) session.getAttribute(session_name);
                int int_id = Integer.parseInt(str_id);
                Producto producto = service.getProductById(int_id);
                productos_carrito.add(producto);
            }
        }
        model.addObject("cart_products",productos_carrito);
        return model;
    }

    @RequestMapping(value = "/doAddToCart")
    public String doAddToCart(HttpServletRequest request, @RequestParam("id_producto") String id_producto_str) {
        HttpSession session = request.getSession();
        if (id_producto_str!=null)
            session.setAttribute("ids_producto_"+id_producto_str,id_producto_str);
        return "index";
    }
    @RequestMapping(value = "/doCheckout", method = RequestMethod.POST)
    public String doCheckout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        ModelAndView model = new ModelAndView("doCheckout");
        String nombre_usuario = (String)session.getAttribute("nombre_usuario");
        String contrasena = (String)session.getAttribute("contrasena");
        String ids_aray   = (String)request.getParameter("idscheckout");
        String cantidades = (String)request.getParameter("cantidades");
        session.setAttribute("idscheckout",ids_aray);
        session.setAttribute("cant_checkout",cantidades);
        String direccion = "";
        if (nombre_usuario != null && contrasena!=null) {
            Cliente cliente = service.isValidUser(nombre_usuario, contrasena);
            if (cliente != null && cliente.getId_rol() == 1) {
                model.addObject("usuario", cliente);
                model.setViewName("checkout");
                direccion = "redirect:checkout";
            }
            else {
                model.addObject("usuario", null);
                model.setViewName("login");
                direccion = "redirect:checkout";
            }
        }
        else {
            model.setViewName("login");
            model.addObject("usuario", null);
            direccion = "redirect:checkout";
        }
        return direccion;
    }


    @RequestMapping(value = "/doFinalizarPedido")
    public String doFinalizarPedido(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String ids_arr = (String) session.getAttribute("idscheckout");
        String cant_arr = (String) session.getAttribute("cant_checkout");
        String nombre_usuario = (String) session.getAttribute("nombre_usuario");
        String contrasena = (String) session.getAttribute("contrasena");
        Cliente cliente = service.isValidUser(nombre_usuario,contrasena);
        String [] ids_sep = ids_arr.split(",");
        String [] cant_sep = cant_arr.split(",");
        Pedido pedido = new Pedido();
        pedido.setId_estado_pedido(1);
        pedido.setId_cliente(cliente.getId_cliente());
        pedido.setFecha_pedido(new Date());
        service.addPedido(pedido);
        for (int i = 0; i < ids_sep.length; i++){
            Detalle detalle = new Detalle();
            detalle.setId_pedido(pedido.getId_pedido());
            int cantidad = Integer.parseInt(cant_sep[i]);
            int id_producto = Integer.parseInt(ids_sep[i]);
            detalle.setId_producto(id_producto);
            detalle.setCantidad(cantidad);
            service.addDetalle(detalle);
        }

        return "index";
    }
    @RequestMapping("/checkout")
    public ModelAndView checkout(HttpServletRequest request){
        ModelAndView model = new ModelAndView("checkout");
        HttpSession session = request.getSession();
        String nombre_usuario = (String)session.getAttribute("nombre_usuario");
        String contrasena = (String)session.getAttribute("contrasena");
        String direccion = "";
        if (nombre_usuario != null && contrasena!=null) {
            Cliente cliente = service.isValidUser(nombre_usuario, contrasena);
            if (cliente != null) {
                model.addObject("usuario", cliente);
            }
            else {
                model.addObject("usuario", null);
                model.setViewName("login");
            }
        }
        else {
            model.setViewName("login");
            model.addObject("usuario", null);
        }
        return model;
    }
}
