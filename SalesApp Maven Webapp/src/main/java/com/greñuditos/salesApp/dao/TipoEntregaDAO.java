package com.greñuditos.salesApp.dao;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface TipoEntregaDAO {
    int getCount();
    ArrayList<TipoEntrega> getTipoEntregas();
    TipoEntrega getTipoEntregaById(int tipoEntregaId);
    void deleteTipoEntrega(TipoEntrega tipoEntrega);
    void updateTipoEntrega(TipoEntrega tipoEntrega);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();

}