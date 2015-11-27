package com.greñuditos.salesApp.dto;

import org.springframework.web.multipart.MultipartFile;

import java.sql.Blob;

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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private int id_producto;

    public int getId_categoria_productos() {
        return id_categoria_productos;
    }

    public void setId_categoria_productos(int id_categoria_productos) {
        this.id_categoria_productos = id_categoria_productos;
    }

    private int id_categoria_productos;
    private String nombre;
    private String descripcion;
    private String codigo;

    private float precio;
    private String marca;
    private String color;


    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

    private Blob imagen;

    public MultipartFile getBfImage() {
        return bfImage;
    }

    public void setBfImage(MultipartFile bfImage) {
        this.bfImage = bfImage;
    }

    private MultipartFile bfImage;

}