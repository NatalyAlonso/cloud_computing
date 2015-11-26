package com.greñuditos.salesApp.dao;


import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface CategoriaProductoDAO {
    int getCount();
    void addCategoriaProducto(CategoriaProducto categoriaProducto);
    ArrayList<CategoriaProducto> getCategoriaProductos();
    CategoriaProducto getCategoriaProductoById(int categoriaProductoId);
    void deleteCategoriaProducto(CategoriaProducto client);
    void updateCategoriaProducto(CategoriaProducto client);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}