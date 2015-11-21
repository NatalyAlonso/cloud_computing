package com.greñuditos.salesApp.dto;

public class TipoEntrega {
    public int getId_tipo_entrega() {
        return id_tipo_entrega;
    }

    public void setId_tipo_entrega(int id_tipo_entrega) {
        this.id_tipo_entrega = id_tipo_entrega;
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

    private int id_tipo_entrega;
    private String nombre;
    private String descripcion;

}