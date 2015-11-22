package com.greñuditos.salesApp.service;

import com.greñuditos.salesApp.dto.*;

import java.util.ArrayList;

public interface Service {
    //Producto
    int getCount();
    ArrayList<Producto> getProducts();
    Producto getProductById(int productId);
    void deleteProduct(int productId);
    void updateProduct(Producto product);

    //Rol
    ArrayList<Rol> getRoles();
    Rol getRolById(int rolId);
}
