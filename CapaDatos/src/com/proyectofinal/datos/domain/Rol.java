package com.proyectofinal.datos.domain;

public class Rol {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column roles.id_rol
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    private Integer idRol;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column roles.nombre
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    private String nombre;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column roles.descripcion
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    private String descripcion;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column roles.id_rol
     *
     * @return the value of roles.id_rol
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public Integer getIdRol() {
        return idRol;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column roles.id_rol
     *
     * @param idRol the value for roles.id_rol
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column roles.nombre
     *
     * @return the value of roles.nombre
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column roles.nombre
     *
     * @param nombre the value for roles.nombre
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column roles.descripcion
     *
     * @return the value of roles.descripcion
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column roles.descripcion
     *
     * @param descripcion the value for roles.descripcion
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}