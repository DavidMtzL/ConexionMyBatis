package mx.com.dmart.mybatis.domain;

import java.io.Serializable;

public class Autor implements Serializable {


	private static final long serialVersionUID = 396235254351583209L;
	
	private int idAutor;
	private String nombres;
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nombres=" + nombres + "]";
	}
	
	
	

}
