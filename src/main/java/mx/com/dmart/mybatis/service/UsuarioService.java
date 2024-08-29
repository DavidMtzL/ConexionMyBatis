package mx.com.dmart.mybatis.service;

import java.util.List;

import mx.com.dmart.mybatis.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> getAllUsers();
	
	public boolean saveUser(Usuario usuario);
}
