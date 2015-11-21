package com.greñuditos.salesApp.dao.impl;

import java.util.ArrayList;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.*;


public class ProductoDAOImpl implements ProductoDAO {


    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
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
    public void closeCurrentSession(){
        currentSession.close();
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public Transaction getCurrentTransaction(){
        return currentTransaction;
    }

    private Session currentSession;
    private Transaction currentTransaction;

    public int getCount() {
        return ((Long)getCurrentSession().createQuery("select count(*) FROM Producto").uniqueResult()).intValue();
    }

    public ArrayList<Producto> getProducts() {
        return new ArrayList<Producto>(getCurrentSession().createQuery("FROM Producto").list());
    }

    public Producto getProductById(int productId) {
        return (Producto)getCurrentSession().get(Producto.class, productId);
    }

    public void deleteProduct(Producto product) {
        getCurrentSession().delete(product);
    }

    public void updateProduct(Producto product) {
        getCurrentSession().update(product);
    }
}