package com.greñuditos.salesApp.dto;

public class EstadoProducto {
    public int getId_estado_producto() {
        return id_estado_producto;
    }

    public void setId_estado_producto(int id_estado_producto) {
        this.id_estado_producto = id_estado_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int id_estado_producto;
    private String    nombre;
    private String descripcion;
}