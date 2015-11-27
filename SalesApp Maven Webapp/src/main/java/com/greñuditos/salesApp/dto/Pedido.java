package com.greñuditos.salesApp.dto;

import java.util.Date;

public class Pedido {


    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_estado_pedido() {
        return id_estado_pedido;
    }

    public void setId_estado_pedido(int id_estado_pedido) {
        this.id_estado_pedido = id_estado_pedido;
    }

    private int  id_pedido;
    private int id_cliente;
    private Date fecha_pedido;
    private int id_estado_pedido;


    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }
}