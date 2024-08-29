package mx.com.dmart.mybatis.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import mx.com.dmart.mybatis.config.DataConfig;
import mx.com.dmart.mybatis.domain.Usuario;
import mx.com.dmart.mybatis.service.impl.UsuarioServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {DataConfig.class, UsuarioServiceImpl.class})
public class UsuarioServiceTest {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@Test
	public void testGetAllUsers() {
		List<Usuario> usuarios= usuarioService.getAllUsers();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.toString());
		}
		
		assertNotNull("users should not be null", usuarios);
	}

}
