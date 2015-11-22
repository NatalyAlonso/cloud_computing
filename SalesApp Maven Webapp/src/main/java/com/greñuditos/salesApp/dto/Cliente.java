package com.greñuditos.salesApp.dto;

public class Cliente {
    private int id_cliente;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String email;
    private String nombre_usuario;
    private String contrasena;
    private String imagen;
    private String direccion;
    private int id_rol;

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getImagen() {
        return imagen;
    }

    public int getId_rol() {
        return id_rol;
    }

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }


}