package mx.com.dmart.mybatis.service;

import java.util.List;

import mx.com.dmart.mybatis.domain.Libro;

public interface LibroService {

	public List<Libro> buscarTodos();
	
	public boolean guardar(Libro libro);
	
	
	public boolean actualizar(Libro libro);
	
	public Libro buscarPorId(int id);
}
