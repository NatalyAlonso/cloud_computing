package com.greñuditos.salesApp.dao.impl;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class CategoriaProductoDAOImpl implements CategoriaProductoDAO {

    private SessionFactory sessionFactory;

    private Session currentSession;
    private Transaction currentTransaction;

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public int getCount() {
        return ((Long)getCurrentSession().createQuery("select count(*) FROM CategoriaProducto").uniqueResult()).intValue();
    }

    public void addCategoriaProducto(CategoriaProducto categoriaProducto) {

    }

    public ArrayList<CategoriaProducto> getCategoriaProductos() {
        return new ArrayList<CategoriaProducto>(getCurrentSession().createQuery("FROM CategoriaProducto ").list());
    }

    public CategoriaProducto getCategoriaProductoById(int categoriaProductoId) {
        return (CategoriaProducto) getCurrentSession().get(CategoriaProducto.class, categoriaProductoId);
    }

    public void deleteCategoriaProducto(CategoriaProducto categoriaProducto) {
        getCurrentSession().delete(categoriaProducto);
    }

    public void updateCategoriaProducto(CategoriaProducto categoriaProducto) {
        getCurrentSession().update(categoriaProducto);
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

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}