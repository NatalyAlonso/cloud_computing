package com.greñuditos.salesApp.dao;
import com.greñuditos.salesApp.dto.Detalle;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

/**
 * Created by Nataly on 27/11/2015.
 */
public interface DetalleDAO {
    int getCount();
    ArrayList<Detalle> getDetalles();
    Detalle getDetalleById(int detalleId);
    void deleteDetalle(Detalle detalle);
    void updateDetalle(Detalle detalle);
    void addDetalle(Detalle detalle);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}
