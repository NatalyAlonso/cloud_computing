package com.greñuditos.salesApp.dto;

public class CategoriaProducto {
    private int id_categoria_productos;
    private String  nombre;
    private String descripcion;

    public int getId_categoria_productos() {
        return id_categoria_productos;
    }

    public void setId_categoria_productos(int id_categoria_productos) {
        this.id_categoria_productos = id_categoria_productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}