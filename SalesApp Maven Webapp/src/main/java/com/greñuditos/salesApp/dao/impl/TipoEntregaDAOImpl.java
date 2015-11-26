package com.greñuditos.salesApp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class TipoEntregaDAOImpl implements TipoEntregaDAO {

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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM TipoEntrega ").uniqueResult()).intValue();
    }

    public ArrayList<TipoEntrega> getTipoEntregas() {
        return new ArrayList<TipoEntrega>(getCurrentSession().createQuery("FROM TipoEntrega ").list());
    }

    public TipoEntrega getTipoEntregaById(int tipoEntregaId) {
        return (TipoEntrega) getCurrentSession().get(Pagos.class, tipoEntregaId);
    }

    public void deleteTipoEntrega(TipoEntrega tipoEntrega) {
        getCurrentSession().delete(tipoEntrega);
    }

    public void updateTipoEntrega(TipoEntrega tipoEntrega) {
        getCurrentSession().update(tipoEntrega);
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