package test.com.proyectofinal.datos.test.dao;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyectofinal.datos.dao.ProductoDAO;
import com.proyectofinal.datos.domain.Producto;
import com.proyectofinal.datos.test.base.BaseTestJunit;


public class ProductoDAOTest extends BaseTestJunit {

	@Autowired
	private ProductoDAO dao;
	@Test
	public void	test_insert(){
		Producto record = new Producto();
		record.setNombre("Computadora HP");
		record.setDescripcion("Color rojo");
		record.setPrecio(12500.0);
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
	}
	
	public void test_selectByPrimaryKey() {
		Cliente cliente = dao.selectByPrimaryKey(2);
		assertNotNull(cliente);
	}

	@Test
	public void test_deleteByPrimaryKey() {
		int i = dao.deleteByPrimaryKey(2);
		assertTrue(i>0);
	}*/
	
}
