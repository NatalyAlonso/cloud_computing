package com.greñuditos.salesApp.service;

import com.greñuditos.salesApp.dto.*;

import java.util.ArrayList;

public interface Service {
    //Producto
    int getProductCount();
    ArrayList<Producto> getProducts();
    Producto getProductById(int productId);
    void deleteProduct(int productId);
    void updateProduct(Producto product);
    void addProducto(Producto product);
    //Rol
    ArrayList<Rol> getRoles();
    Rol getRolById(int rolId);

    //Cliente
    int getClientCount();
    ArrayList<Cliente> getClientes();
    Cliente getClienteById(int clienteId);
    void deleteCliente(int clienteId);
    void updateCliente(Cliente cliente);
    void addCliente(Cliente cliente);
    Cliente isValidUser(String nombre_usuario, String contrasena);
}
