package com.greñuditos.salesApp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dao.*;
import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ClienteDAOImpl implements ClienteDAO {
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
        return ((Long)getCurrentSession().createQuery("select count(*) FROM Cliente").uniqueResult()).intValue();
    }

    public ArrayList<Cliente> getClientes() {
        return new ArrayList<Cliente>(getCurrentSession().createQuery("FROM Cliente ").list());
    }

    public Cliente getClientById(int clientId) {
        return (Cliente) getCurrentSession().get(Cliente.class, clientId);
    }

    public void deleteClient(Cliente client) {
        getCurrentSession().delete(client);
    }

    public void updateClient(Cliente client) {
        getCurrentSession().update(client);
    }

    public void addClient(Cliente client) {
        getCurrentSession().save(client);
    }
}