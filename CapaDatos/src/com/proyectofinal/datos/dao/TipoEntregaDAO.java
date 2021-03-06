package com.proyectofinal.datos.dao;

import com.proyectofinal.datos.domain.TipoEntrega;
import com.proyectofinal.datos.dto.TipoEntregaExample;

import java.util.List;

public interface TipoEntregaDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    int countByExample(TipoEntregaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    int deleteByPrimaryKey(Integer idTipoEntrega);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    Integer insert(TipoEntrega record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    Integer insertSelective(TipoEntrega record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    List<TipoEntrega> selectByExample(TipoEntregaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    TipoEntrega selectByPrimaryKey(Integer idTipoEntrega);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    int updateByExampleSelective(TipoEntrega record, TipoEntregaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    int updateByExample(TipoEntrega record, TipoEntregaExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    int updateByPrimaryKeySelective(TipoEntrega record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table tipo_entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    int updateByPrimaryKey(TipoEntrega record);
}