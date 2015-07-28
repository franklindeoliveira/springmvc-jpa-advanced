//package br.com.springmvc.modelo.relacionamentos.manytomany.uni;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Autor {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Integer id;
//	private String nome;
//	@ManyToMany
//	@JoinTable(name = "autor_livro")
//	private List<Livro> livros;
//	
//	public Autor() {}
//	public Autor(String nome) {
//		this.nome = nome;
//	}
//	public Autor(String nome, List<Livro> livros) {
//		this.nome = nome;
//		this.livros = livros;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public List<Livro> getLivros() {
//		if (this.livros == null) {
//			this.livros = new ArrayList<Livro>();
//		}
//		return livros;
//	}
//	public void setLivros(List<Livro> livros) {
//		this.livros = livros;
//	}
//	
//}
