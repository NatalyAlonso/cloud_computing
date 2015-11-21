package com.greñuditos.salesApp.dto;

public class Producto {
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen_1() {
        return imagen_1;
    }

    public void setImagen_1(String imagen_1) {
        this.imagen_1 = imagen_1;
    }

    public String getImagen_2() {
        return imagen_2;
    }

    public void setImagen_2(String imagen_2) {
        this.imagen_2 = imagen_2;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    private int id_producto;
    private String nombre;
    private String descripcion;
    private String codigo;
    private String imagen;
    private String imagen_1;
    private String imagen_2;
    private float precio;
}