package com.greñuditos.salesApp.service.impl;


import com.greñuditos.salesApp.dao.impl.*;
import com.greñuditos.salesApp.dto.Cliente;
import com.greñuditos.salesApp.dto.Producto;
import com.greñuditos.salesApp.dto.Rol;
import com.greñuditos.salesApp.service.Service;
import java.io.IOException;
import org.hibernate.Hibernate;
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

    public int getProductCount() {
        this.productoDAOImpl.openCurrentSessionwithTransaction();
        int result = this.productoDAOImpl.getCount();
        this.productoDAOImpl.closeCurrentSessionwithTransaction();
        return result;
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
        this.clienteDAOImpl.openCurrentSessionwithTransaction();
        int result = this.clienteDAOImpl.getCount();
        this.clienteDAOImpl.closeCurrentSessionwithTransaction();
        return result;
    }

    public ArrayList<Cliente> getClientes() {
        this.clienteDAOImpl.openCurrentSessionwithTransaction();
        ArrayList<Cliente> clientes = this.clienteDAOImpl.getClientes();
        this.clienteDAOImpl.closeCurrentSessionwithTransaction();
        return clientes;
    }

    public Cliente getClienteById(int clienteId) {
        this.clienteDAOImpl.openCurrentSessionwithTransaction();
        Cliente cliente = this.clienteDAOImpl.getClientById(clienteId);
        this.clienteDAOImpl.closeCurrentSessionwithTransaction();
        return cliente;
    }

    public void deleteCliente(int clienteId) {
        this.clienteDAOImpl.openCurrentSessionwithTransaction();
        Cliente cliente = this.clienteDAOImpl.getClientById(clienteId);
        this.clienteDAOImpl.deleteClient(cliente);
        this.clienteDAOImpl.closeCurrentSessionwithTransaction();
    }

    public void updateCliente(Cliente cliente) {
        this.clienteDAOImpl.openCurrentSessionwithTransaction();
        this.clienteDAOImpl.updateClient(cliente);
        this.clienteDAOImpl.closeCurrentSessionwithTransaction();
    }

    public Cliente isValidUser(String nombre_usuario, String contrasena) {
        this.clienteDAOImpl.openCurrentSessionwithTransaction();
        Cliente cliente = clienteDAOImpl.getClientByUsername(nombre_usuario);
        this.clienteDAOImpl.closeCurrentSessionwithTransaction();
        if (cliente != null
                && cliente.getNombre_usuario().equals(nombre_usuario)
                && cliente.getContrasena().equals(contrasena))
            return  cliente;
        return null;

    }

    public void setClienteDAOImpl(ClienteDAOImpl clienteDAOImpl) {
        this.clienteDAOImpl = clienteDAOImpl;
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
