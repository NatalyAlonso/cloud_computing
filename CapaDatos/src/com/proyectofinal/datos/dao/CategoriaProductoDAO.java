package com.proyectofinal.datos.dao;

import java.util.List;

import com.proyectofinal.datos.domain.CategoriaProducto;
import com.proyectofinal.datos.dto.CategoriaProductoExample;

public interface CategoriaProductoDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int countByExample(CategoriaProductoExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int deleteByPrimaryKey(Integer idCategoriaProductos);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	Integer insert(CategoriaProducto record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	Integer insertSelective(CategoriaProducto record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	List<CategoriaProducto> selectByExample(CategoriaProductoExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	CategoriaProducto selectByPrimaryKey(Integer idCategoriaProductos);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int updateByExampleSelective(CategoriaProducto record,
			CategoriaProductoExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int updateByExample(CategoriaProducto record,
			CategoriaProductoExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int updateByPrimaryKeySelective(CategoriaProducto record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table categoria_productos
	 * @ibatorgenerated  Wed Oct 21 17:12:01 CDT 2015
	 */
	int updateByPrimaryKey(CategoriaProducto record);
}