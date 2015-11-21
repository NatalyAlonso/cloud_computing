package com.greñuditos.salesApp.dao;

import java.util.ArrayList;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.*;

public interface ProductoDAO {

    int getCount();
    ArrayList<Producto> getProducts();
    Producto getProductById(int productId);
    void deleteProduct(Producto product);
    void updateProduct(Producto product);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}