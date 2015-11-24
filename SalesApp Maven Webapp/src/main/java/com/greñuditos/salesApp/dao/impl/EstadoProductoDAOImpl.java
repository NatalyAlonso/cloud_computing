package com.greñuditos.salesApp.dao.impl;


import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EstadoProductoDAOImpl implements EstadoProductoDAO {

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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM EstadoProducto ").uniqueResult()).intValue();
    }

    public ArrayList<EstadoProducto> getEstadoProductos() {
        return new ArrayList<EstadoProducto>(getCurrentSession().createQuery("FROM EstadoProducto ").list());
    }

    public EstadoProducto getEstadoProductoById(int estadoProductoId) {
        return (EstadoProducto) getCurrentSession().get(EstadoProducto.class, estadoProductoId);
    }

    public void deleteEstadoProducto(EstadoProducto estadoProducto) {
        getCurrentSession().delete(estadoProducto);
    }

    public void updateEstadoProducto(EstadoProducto estadoProducto) {
        getCurrentSession().update(estadoProducto);
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