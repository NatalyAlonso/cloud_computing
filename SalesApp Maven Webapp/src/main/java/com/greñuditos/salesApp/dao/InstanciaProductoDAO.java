package com.greñuditos.salesApp.dao;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface InstanciaProductoDAO {
    int getCount();
    void addInstanciaProducto(InstanciaProducto factura);
    ArrayList<InstanciaProducto> getInstanciaProducto();
    InstanciaProducto getInstanciaProductoById(int instanciaProductoId);
    void deleteInstanciaProducto(InstanciaProducto instanciaProducto);
    void updateInstanciaProducto(InstanciaProducto instanciaProducto);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}