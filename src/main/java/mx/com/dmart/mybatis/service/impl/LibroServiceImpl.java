package mx.com.dmart.mybatis.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.dmart.mybatis.domain.Libro;
import mx.com.dmart.mybatis.persistence.LibroMapper;
import mx.com.dmart.mybatis.service.LibroService;

@Service("libroService")
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroMapper libroMapper;
	
	
	@Override
	public List<Libro> buscarTodos() {
		List<Libro> lstLibro= null;
		
		try {
			lstLibro= this.libroMapper.buscarTodos();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			lstLibro= new ArrayList<Libro>();
		}
		return lstLibro;
	}

	@Override
	public boolean guardar(Libro libro) {
		boolean respuesta = false;
		try {
			libroMapper.guardar(libro);
			respuesta= true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return respuesta;
	}

	@Override
	public boolean actualizar(Libro libro) {
		boolean respuesta= false;
		
		try {
			libroMapper.actualizar(libro);
			respuesta= true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return respuesta;
	}

	@Override
	public Libro buscarPorId(int id) {
		Libro  libro= null;
		try {
			libro= this.libroMapper.buscarPorId(id);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return libro;
	}

}
