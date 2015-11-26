package com.greñuditos.salesApp.dao;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface PedidoDAO {
    int getCount();
    void addPedidos(Pedido pedido);
    ArrayList<Pedido> getPedidos();
    Pedido getPedidoById(int pedidoId);
    void deletePedido(Pedido pedido);
    void updatePedido(Pedido pedido);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}