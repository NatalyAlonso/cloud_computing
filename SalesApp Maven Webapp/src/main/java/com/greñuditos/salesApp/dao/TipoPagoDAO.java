package com.greñuditos.salesApp.dao;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public interface TipoPagoDAO {
    int getCount();
    ArrayList<TipoPago> getTipoPago();
    TipoPago getTipoPagoById(int tipoPagoId);
    void deleteTipoPago(TipoPago tipoPago);
    void updateTipoPago(TipoPago tipoPago);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}