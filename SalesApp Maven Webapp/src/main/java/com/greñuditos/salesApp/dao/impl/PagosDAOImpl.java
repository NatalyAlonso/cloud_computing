package com.greñuditos.salesApp.dao.impl;


import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PagosDAOImpl implements PagosDAO {

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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM Pagos ").uniqueResult()).intValue();
    }

    public void addPago(Pagos pago) {

    }

    public ArrayList<Pagos> getPagos() {
        return new ArrayList<Pagos>(getCurrentSession().createQuery("FROM Pagos ").list());
    }

    public Pagos getPagosById(int pagosId) {
        return (Pagos) getCurrentSession().get(Pagos.class, pagosId);
    }

    public void deletePagos(Pagos pagos) {
        getCurrentSession().delete(pagos);
    }

    public void updatePagos(Pagos pagos) {
        getCurrentSession().update(pagos);
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