package com.greñuditos.salesApp.dao.impl;



import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PedidoDAOImpl implements PedidoDAO {

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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM Pedido ").uniqueResult()).intValue();
    }

    public void addPedidos(Pedido pedido) {

    }

    public ArrayList<Pedido> getPedidos() {
        return new ArrayList<Pedido>(getCurrentSession().createQuery("FROM Pedido ").list());
    }

    public Pedido getPedidoById(int pedidoId) {
        return (Pedido) getCurrentSession().get(Pagos.class, pedidoId);
    }

    public void deletePedido(Pedido pedido) {
        getCurrentSession().delete(pedido);
    }

    public void updatePedido(Pedido pedido) {
        getCurrentSession().update(pedido);
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