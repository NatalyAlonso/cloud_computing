package com.greñuditos.salesApp.dao.impl;



import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EntregaDAOImpl implements EntregaDAO {

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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM Entrega ").uniqueResult()).intValue();
    }

    public void addEntrega(Entrega entrega) {

    }

    public ArrayList<Entrega> getEntregas() {
        return new ArrayList<Entrega>(getCurrentSession().createQuery("FROM Entrega ").list());
    }

    public Entrega getEntregaById(int entregaId) {
        return (Entrega) getCurrentSession().get(Entrega.class, entregaId);
    }

    public void deleteEntrega(Entrega entrega) {
        getCurrentSession().delete(entrega);
    }

    public void updateEntrega(Entrega entrega) {
        getCurrentSession().update(entrega);
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