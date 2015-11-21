package com.greñuditos.salesApp.dto;

import java.util.Date;

public class Entrega {
    public int getId_entrega() {
        return id_entrega;
    }

    public void setId_entrega(int id_entrega) {
        this.id_entrega = id_entrega;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getPOD() {
        return POD;
    }

    public void setPOD(String POD) {
        this.POD = POD;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getId_tipo_entrega() {
        return id_tipo_entrega;
    }

    public void setId_tipo_entrega(int id_tipo_entrega) {
        this.id_tipo_entrega = id_tipo_entrega;
    }

    private int id_entrega;
    private String id_pedido;
    private String fecha_entrega;
    private String POD;
    private String comentarios;
    private int id_tipo_entrega;
}