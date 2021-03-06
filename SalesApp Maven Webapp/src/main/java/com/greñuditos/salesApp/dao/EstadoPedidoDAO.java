package com.greñuditos.salesApp.dao;

import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public interface EstadoPedidoDAO {
    int getCount();
    ArrayList<EstadoPedido> getEstadoPedidos();
    EstadoPedido getEstadoPedidoById(int estadoPedidoId);
    void deleteEstadoPedido(EstadoPedido client);
    void updateEstadoPedido(EstadoPedido client);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}