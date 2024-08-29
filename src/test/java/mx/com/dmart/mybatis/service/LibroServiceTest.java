package mx.com.dmart.mybatis.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import mx.com.dmart.mybatis.config.DataConfig;
import mx.com.dmart.mybatis.domain.Autor;
import mx.com.dmart.mybatis.domain.Libro;
import mx.com.dmart.mybatis.service.impl.LibroServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {DataConfig.class, LibroServiceImpl.class})
public class LibroServiceTest {

	@Autowired
	private LibroService libroService;
	
	
	@Test
	public void testBuscarTodos() {
		System.out.println("********************* Buscar Todos **********************");
		List<Libro> lstLibro = libroService.buscarTodos();
		for (Libro libro : lstLibro) {
			System.out.println(libro.toString());
		
		}
		assertNotNull("Libro no puede ser nulo", lstLibro);
	}
	
	@Test
	public void testBuscarPorId() {
		System.out.println("***********************Buscar por id****************");
		Libro libro= libroService.buscarPorId(4);
		System.out.println("********************* Buscar por id: "+ libro);
		assertNotNull("Libro no puede ser nulo", libro);
	}
	
	@Test
	public void testGuardar() {
		System.out.println("********************** Buscar por id*******************");
		Libro nuevoLibro = new Libro();
		nuevoLibro.setTitulo("Mybatis Expert");
		Autor autor= new Autor();
		autor.setIdAutor(1);
		nuevoLibro.setAutor(autor);
		nuevoLibro.setEstado(true);
		boolean respuesta= true;
		respuesta=libroService.guardar(nuevoLibro);
		
		Assert.assertEquals(true, respuesta);
	}
	
	@Test
	public void testActualizar() {
		System.out.println("*************Actualizar*********************");
		
		Libro libro= libroService.buscarPorId(5);
		libro.setTitulo("Learning Persistence with Mybatis");
		libro.setEstado(true);
		boolean respuesta= libroService.actualizar(libro);
		
		assertEquals(true, respuesta);
	}
	
}
