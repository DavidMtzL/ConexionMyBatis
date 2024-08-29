package mx.com.dmart.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.dmart.mybatis.domain.Usuario;
import mx.com.dmart.mybatis.persistence.UsuarioMapper;
import mx.com.dmart.mybatis.service.UsuarioService;

@Service("userService")
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioMapper usuarioMapper;
	
	
	@Override
	public List<Usuario> getAllUsers() {
		return usuarioMapper.getAllUsers();
	}

	@Override
	public boolean saveUser(Usuario usuario) {
		if(usuario.getId()==0) {
			return usuarioMapper.insertUser(usuario)==1;
		}else {
			return usuarioMapper.updateUser(usuario)==1;
		}
	}

}
