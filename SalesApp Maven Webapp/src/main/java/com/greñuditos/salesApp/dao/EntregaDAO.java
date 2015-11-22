package com.greñuditos.salesApp.dao;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface EntregaDAO {
    int getCount();
    void addEntrega(Entrega entrega);
    ArrayList<Entrega> getEntregas();
    Entrega getEntregaById(int entregaId);
    void deleteEntrega(Entrega entrega);
    void updateEntrega(Entrega entrega);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}