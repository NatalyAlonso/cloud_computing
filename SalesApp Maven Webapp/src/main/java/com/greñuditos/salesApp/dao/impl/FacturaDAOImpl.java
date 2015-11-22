package com.greñuditos.salesApp.dao.impl;


import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FacturaDAOImpl implements FacturaDAO {
    private SessionFactory sessionFactory;
    private Session currentSession;
    private Transaction currentTransaction;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public int getCount() {
        return ((Long)getCurrentSession().createQuery("select count(*) FROM Factura ").uniqueResult()).intValue();
    }

    public void addFactura(Factura factura) {

    }

    public ArrayList<Factura> getFacturas() {
        return new ArrayList<Factura>(getCurrentSession().createQuery("FROM Factura ").list());
    }

    public Factura getFacturaById(int facturaId) {
        return (Factura) getCurrentSession().get(Factura.class, facturaId);
    }

    public void deleteFactura(Factura factura) {
        getCurrentSession().delete(factura);
    }

    public void updateFactura(Factura factura) {
        getCurrentSession().update(factura);
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = sessionFactory.openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public Session getCurrentSession() {
        return currentSession;
    }
}