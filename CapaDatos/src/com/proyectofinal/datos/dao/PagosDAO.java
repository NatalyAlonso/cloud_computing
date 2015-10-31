package com.proyectofinal.datos.dao;

import com.proyectofinal.datos.domain.Pagos;
import com.proyectofinal.datos.dto.PagosExample;

import java.util.List;

public interface PagosDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int countByExample(PagosExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int deleteByPrimaryKey(Integer idPago);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    Integer insert(Pagos record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    Integer insertSelective(Pagos record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    List<Pagos> selectByExample(PagosExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    Pagos selectByPrimaryKey(Integer idPago);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int updateByExampleSelective(Pagos record, PagosExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int updateByExample(Pagos record, PagosExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int updateByPrimaryKeySelective(Pagos record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pagos
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    int updateByPrimaryKey(Pagos record);
}