package mx.com.dmart.mybatis.persistence;

import java.util.List;

import mx.com.dmart.mybatis.domain.Usuario;

public interface UsuarioMapper {

	public List<Usuario> getAllUsers();
	
	public int insertUser(Usuario usuario);
	
	public int updateUser(Usuario usuario);
	
}
