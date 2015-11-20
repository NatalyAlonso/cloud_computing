package com.proyectofinal.datos.test.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectofinal.datos.dao.ClienteDAO;
import com.proyectofinal.datos.domain.Cliente;
import com.proyectofinal.datos.test.base.BaseTestJunit;


public class ClienteDAOTest extends BaseTestJunit {

	@Autowired
	private ClienteDAO dao;
	
	public void	test_insert(){
		Cliente record = new Cliente();
		record.setNombre("Salvador");
		record.setApellido_paterno("Vicencio");
		record.setApellido_materno("Medina");
		record.setEmail("chavachuii@gmail.com");
		record.setNombre_usuario("chavachuy");
		record.setContrasena("chavachuy");
		Integer id = dao.insert(record);
		assertNotNull(id);
	}
	
	public void test_updateByPrimaryKeySelective() {
		Cliente record = new Cliente();
		record.setIdCliente(2);
		record.setNombre("Salvador de Jesus");
		
		int rows = dao.updateByPrimaryKeySelective(record);
		assertTrue(rows>0);
	}
	@Test
	public void test_selectByPrimaryKey() {
		Cliente cliente = dao.selectByPrimaryKey(1);
		assertNotNull(cliente);
	}

	
	public void test_deleteByPrimaryKey() {
		int i = dao.deleteByPrimaryKey(2);
		assertTrue(i>0);
	}
	
}
