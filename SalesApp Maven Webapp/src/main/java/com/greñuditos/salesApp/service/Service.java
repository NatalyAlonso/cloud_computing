package com.greñuditos.salesApp.service;

import com.greñuditos.salesApp.dto.Producto;

import java.util.ArrayList;

public interface Service {
    int getCount();
    ArrayList<Producto> getProducts();
    Producto getProductById(int productId);
    void deleteProduct(int productId);
    void updateProduct(Producto product);
}
