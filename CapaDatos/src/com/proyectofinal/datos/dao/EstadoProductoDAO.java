package com.proyectofinal.datos.dao;

import java.util.List;

import com.proyectofinal.datos.domain.EstadoProducto;
import com.proyectofinal.datos.dto.EstadoProductoExample;

public interface EstadoProductoDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int countByExample(EstadoProductoExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int deleteByPrimaryKey(Integer idEstadoProducto);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	Integer insert(EstadoProducto record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	Integer insertSelective(EstadoProducto record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	List<EstadoProducto> selectByExample(EstadoProductoExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	EstadoProducto selectByPrimaryKey(Integer idEstadoProducto);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int updateByExampleSelective(EstadoProducto record,
			EstadoProductoExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int updateByExample(EstadoProducto record, EstadoProductoExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int updateByPrimaryKeySelective(EstadoProducto record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table estado_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int updateByPrimaryKey(EstadoProducto record);
}