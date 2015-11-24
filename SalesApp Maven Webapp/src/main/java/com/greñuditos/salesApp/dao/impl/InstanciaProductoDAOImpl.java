package com.greñuditos.salesApp.dao.impl;


import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InstanciaProductoDAOImpl implements InstanciaProductoDAO {
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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM InstanciaProducto ").uniqueResult()).intValue();
    }

    public void addInstanciaProducto(InstanciaProducto factura) {

    }

    public ArrayList<InstanciaProducto> getInstanciaProducto() {
        return new ArrayList<InstanciaProducto>(getCurrentSession().createQuery("FROM InstanciaProducto ").list());
    }

    public InstanciaProducto getInstanciaProductoById(int instanciaProductoId) {
        return (InstanciaProducto) getCurrentSession().get(Factura.class, instanciaProductoId);
    }

    public void deleteInstanciaProducto(InstanciaProducto instanciaProducto) {
        getCurrentSession().delete(instanciaProducto);
    }

    public void updateInstanciaProducto(InstanciaProducto instanciaProducto) {
        getCurrentSession().update(instanciaProducto);
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