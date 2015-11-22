package com.greñuditos.salesApp.dao;

import java.util.ArrayList;
import java.util.List;

import com.greñuditos.salesApp.dto.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public interface ClienteDAO {
    int getCount();
    ArrayList<Cliente> getClientes();
    Cliente getClientById(int clientId);
    void deleteClient(Cliente client);
    void updateClient(Cliente client);
    public Session openCurrentSessionwithTransaction();
    public void closeCurrentSessionwithTransaction();
    public void closeCurrentSession();
    public Transaction getCurrentTransaction();
    public Session getCurrentSession();
}