package com.proyectofinal.datos.test.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.proyectofinal.datos.dao.ClienteDAO;
import com.proyectofinal.datos.dao.FacturaDAO;
import com.proyectofinal.datos.domain.Cliente;
import com.proyectofinal.datos.domain.Factura;
import com.proyectofinal.datos.test.base.BaseTestJunit;


public class FacturaDAOTest extends BaseTestJunit {

	@Autowired
	private FacturaDAO dao;
	
	public void	test_insert(){
		Factura record = new Factura();
		record.setFecha_emision(new Date());
		record.setId_pedido(null);		
		record.setRFC_cliente("AOLI930727MASLN");
		Integer id = dao.insert(record);
		assertNotNull(id);
	}
	/*
	public void test_updateByPrimaryKeySelective() {
		Cliente record = new Cliente();
		record.setIdCliente(2);
		record.setNombre("Salvador de Jesus");
		
		int rows = dao.updateByPrimaryKeySelective(record);
		assertTrue(rows>0);
	}*/
	@Test
	public void test_selectByPrimaryKey() {
		Factura cliente = dao.selectByPrimaryKey(1);
		assertNotNull(cliente);
	}
/*
	@Test
	public void test_deleteByPrimaryKey() {
		int i = dao.deleteByPrimaryKey(2);
		assertTrue(i>0);
	}
	*/
}
