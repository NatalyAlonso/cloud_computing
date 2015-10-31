package com.proyectofinal.datos.dao;

import com.proyectofinal.datos.domain.Rol;
import com.proyectofinal.datos.dto.RolExample;

import java.util.List;

public interface RolDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int countByExample(RolExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int deleteByPrimaryKey(Integer idRol);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    Integer insert(Rol record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    Integer insertSelective(Rol record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    List<Rol> selectByExample(RolExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    Rol selectByPrimaryKey(Integer idRol);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int updateByExampleSelective(Rol record, RolExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int updateByExample(Rol record, RolExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int updateByPrimaryKeySelective(Rol record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int updateByPrimaryKey(Rol record);
}