package com.greñuditos.salesApp.service.impl;


import com.greñuditos.salesApp.dao.impl.*;
import com.greñuditos.salesApp.dto.*;
import com.greñuditos.salesApp.service.Service;
import org.hibernate.Hibernate;

import java.io.IOException;
import java.util.ArrayList;

public class ServiceImpl implements Service {

    private ProductoDAOImpl productoDAOImpl;
    private RolDAOImpl rolDAOImpl;
    private ClienteDAOImpl clienteDAOImpl;

    public void setProductoDAOImpl(ProductoDAOImpl productoDAOImpl){
        this.productoDAOImpl = productoDAOImpl;
    }

    public void setRolDAOImpl(RolDAOImpl rolDAOImpl){
        this.rolDAOImpl = rolDAOImpl;
    }

    public void setClienteDAOImpl(ClienteDAOImpl clienteDAOImpl){
        this.clienteDAOImpl = clienteDAOImpl;
    }

    public int getCount() {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        int result = this.productoDAOImpl.getCount();
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
        return result;
    }

    public int getProductCount() {
        return 0;
    }

    public ArrayList<Producto> getProducts() {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        ArrayList<Producto> productos = this.productoDAOImpl.getProducts();
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
        return productos;
    }

    public Producto getProductById(int productId) {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        Producto producto = this.productoDAOImpl.getProductById(productId);
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
        return producto;
    }

    public void deleteProduct(int productId) {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        Producto producto = this.productoDAOImpl.getProductById(productId);
        this.productoDAOImpl.deleteProduct(producto);
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void updateProduct(Producto product) {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        this.productoDAOImpl.updateProduct(product);
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void addProducto(Producto product) {

    }

    public ArrayList<Rol> getRoles() {
        this.rolDAOImpl.openCurrentSessionwithTransaction();
        ArrayList<Rol> roles = this.rolDAOImpl.getRoles();
        this.rolDAOImpl.closeCurrentSessionwithTransaction();
        return roles;
    }

    public Rol getRolById(int rolId) {
        this.rolDAOImpl.openCurrentSessionwithTransaction();
        Rol rol = this.rolDAOImpl.getRolById(rolId);
        this.rolDAOImpl.closeCurrentSessionwithTransaction();
        return rol;
    }

    public int getClientCount() {
        return 0;
    }

    public ArrayList<Cliente> getClientes() {
        return null;
    }

    public Cliente getClienteById(int clienteId) {
        return null;
    }

    public void deleteCliente(int clienteId) {

    }

    public void updateCliente(Cliente cliente) {

    }

    public void addCliente(Cliente cliente) {
        this.clienteDAOImpl.openCurrentSessionwithTransaction();
        try {
            cliente.setImagen(Hibernate.getLobCreator(this.clienteDAOImpl.getCurrentSession()).createBlob(cliente.getBfImage().getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.clienteDAOImpl.addClient(cliente);
        this.clienteDAOImpl.closeCurrentSessionwithTransaction();
    }
}
