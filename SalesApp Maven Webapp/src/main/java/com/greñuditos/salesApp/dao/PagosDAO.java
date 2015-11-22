package com.greñuditos.salesApp.dao;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface PagosDAO {
    int getCount();
    void addPago(Pagos pago);
    ArrayList<Pagos> getPagos();
    Pagos getPagosById(int pagosId);
    void deletePagos(Pagos pagos);
    void updatePagos(Pagos pagos);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}