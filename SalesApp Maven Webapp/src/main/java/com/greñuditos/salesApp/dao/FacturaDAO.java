package com.greñuditos.salesApp.dao;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface FacturaDAO {
    int getCount();
    void addFactura(Factura factura);
    ArrayList<Factura> getFacturas();
    Factura getFacturaById(int facturaId);
    void deleteFactura(Factura factura);
    void updateFactura(Factura factura);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}