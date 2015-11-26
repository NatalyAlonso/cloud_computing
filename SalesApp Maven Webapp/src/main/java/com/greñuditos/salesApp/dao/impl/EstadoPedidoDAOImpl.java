package com.greñuditos.salesApp.dao.impl;


import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EstadoPedidoDAOImpl implements EstadoPedidoDAO {

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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM EstadoPedido ").uniqueResult()).intValue();
    }

    public ArrayList<EstadoPedido> getEstadoPedidos() {
        return new ArrayList<EstadoPedido>(getCurrentSession().createQuery("FROM EstadoPedido ").list());
    }

    public EstadoPedido getEstadoPedidoById(int estadoPedidoId) {
        return (EstadoPedido) getCurrentSession().get(EstadoPedido.class, estadoPedidoId);
    }

    public void deleteEstadoPedido(EstadoPedido estadoPedido) {
        getCurrentSession().delete(estadoPedido);
    }

    public void updateEstadoPedido(EstadoPedido estadoPedido) {
        getCurrentSession().update(estadoPedido);
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