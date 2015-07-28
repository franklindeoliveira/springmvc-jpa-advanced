//package br.com.springmvc.modelo.relacionamentos.manytomany.bi;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Livro {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Integer id;
//	private String titulo;
//	@ManyToMany(mappedBy = "livros")
//	private List<Autor> autores;
//	
//	public Livro() {}
//	public Livro(String titulo) {
//		this.titulo = titulo;
//	}
//	public Livro(String titulo, List<Autor> autores) {
//		this.titulo = titulo;
//		this.autores = autores;
//	}
//
//	public String getTitulo() {
//		return titulo;
//	}
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
//	public List<Autor> getAutores() {
//		if (this.autores == null) {
//			this.autores = new ArrayList<Autor>();
//		}
//		return autores;
//	}
//	public void setAutores(List<Autor> autores) {
//		this.autores = autores;
//	}
//}
