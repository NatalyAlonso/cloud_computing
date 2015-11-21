package com.greñuditos.salesApp.dto;

import java.util.Date;

public class InstanciaProducto {
    public int getId_instancia_producto() {
        return id_instancia_producto;
    }

    public void setId_instancia_producto(int id_instancia_producto) {
        this.id_instancia_producto = id_instancia_producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha_recibido() {
        return fecha_recibido;
    }

    public void setFecha_recibido(String fecha_recibido) {
        this.fecha_recibido = fecha_recibido;
    }

    public int getId_estado_producto() {
        return id_estado_producto;
    }

    public void setId_estado_producto(int id_estado_producto) {
        this.id_estado_producto = id_estado_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    private int id_instancia_producto;
    private String codigo;
    private String fecha_recibido;
    private int id_estado_producto;
    private int id_producto;
}