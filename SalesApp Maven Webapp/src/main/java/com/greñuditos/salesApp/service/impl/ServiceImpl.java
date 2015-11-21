package com.greñuditos.salesApp.service.impl;


import com.greñuditos.salesApp.dao.impl.*;
import com.greñuditos.salesApp.dto.Producto;
import com.greñuditos.salesApp.service.Service;

import java.util.ArrayList;

public class ServiceImpl implements Service {

    private ProductoDAOImpl productoDAOImpl;

    public void setProductoDAOImpl(ProductoDAOImpl productoDAOImpl){
        this.productoDAOImpl = productoDAOImpl;
    }

    public int getCount() {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        int result = this.productoDAOImpl.getCount();
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
        return result;
    }

    public ArrayList<Producto> getProducts() {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        ArrayList<Producto> productos = this.productoDAOImpl.getProducts();
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
        return productos;
    }

    public Producto getProductById(int productId) {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        Producto producto = this.productoDAOImpl.getProductById(productId);
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
        return producto;
    }

    public void deleteProduct(int productId) {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        Producto producto = this.productoDAOImpl.getProductById(productId);
        this.productoDAOImpl.deleteProduct(producto);
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void updateProduct(Producto product) {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        this.productoDAOImpl.updateProduct(product);
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
    }
}
