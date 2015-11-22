package com.greñuditos.salesApp.dao;

import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public interface EstadoProductoDAO {
    int getCount();
    ArrayList<EstadoProducto> getEstadoProductos();
    EstadoProducto getEstadoProductoById(int estadoProductoId);
    void deleteEstadoProducto(EstadoProducto estadoProducto);
    void updateEstadoProducto(EstadoProducto estadoProducto);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();

}