package mx.com.dmart.mybatis.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import mx.com.dmart.mybatis.domain.Libro;

public interface LibroMapper {

	public List<Libro> buscarTodos();

	public int guardar(Libro libro);
	
	@Results({
		@Result(property = "idLibro", column = "id_libro", id=true),
		@Result(property = "titulo", column = "titulo"),
		@Result(property = "estado", column = "estado"),
		@Result(property = "autor.idAutor", column = "aut_id")
		
	})
	
	@Select("SELECT li.id_libro, li.titulo, li.id_autor as aut_id, li.estado, 	 aut.nombres as aut_nombres "
			+ "	FROM libro li INNER JOIN autor aut ON aut.id_autor = li.id_autor WHERE id_libro = #{id}")
	public Libro buscarPorId(int id);

	public List<Libro> buscar(String titulo);

	public void actualizar(Libro libro);

}
