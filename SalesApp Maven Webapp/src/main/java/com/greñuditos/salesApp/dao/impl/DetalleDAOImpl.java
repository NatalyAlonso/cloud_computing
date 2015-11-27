package com.greñuditos.salesApp.dao.impl;

import com.greñuditos.salesApp.dao.DetalleDAO;
import com.greñuditos.salesApp.dto.Detalle;
import com.greñuditos.salesApp.dto.Pagos;
import com.greñuditos.salesApp.dto.TipoPago;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;

/**
 * Created by Nataly on 27/11/2015.
 */
public class DetalleDAOImpl implements DetalleDAO {

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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM Detalle ").uniqueResult()).intValue();
    }

    public ArrayList<Detalle> getDetalles() {
        return new ArrayList<Detalle>(getCurrentSession().createQuery("FROM Detalle ").list());
    }

    public Detalle getDetalleById(int detalleId) {
        return (Detalle) getCurrentSession().get(Detalle.class, detalleId);
    }

    public void deleteDetalle(Detalle detalle) {
        getCurrentSession().delete(detalle);
    }

    public void updateDetalle(Detalle detalle) {
        getCurrentSession().update(detalle);
    }
    public void addDetalle(Detalle detalle) {
        getCurrentSession().save(detalle);
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
