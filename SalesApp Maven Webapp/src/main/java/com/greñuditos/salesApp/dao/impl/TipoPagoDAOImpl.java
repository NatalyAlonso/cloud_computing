package com.greñuditos.salesApp.dao.impl;


import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TipoPagoDAOImpl implements TipoPagoDAO {
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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM TipoPago ").uniqueResult()).intValue();
    }


    public ArrayList<TipoPago> getTipoPago() {
        return new ArrayList<TipoPago>(getCurrentSession().createQuery("FROM TipoPago ").list());
    }

    public TipoPago getTipoPagoById(int tipoPagoId) {
        return (TipoPago) getCurrentSession().get(Pagos.class, tipoPagoId);
    }

    public void deleteTipoPago(TipoPago tipoPago) {
        getCurrentSession().delete(tipoPago);
    }

    public void updateTipoPago(TipoPago tipoPago) {
        getCurrentSession().update(tipoPago);
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