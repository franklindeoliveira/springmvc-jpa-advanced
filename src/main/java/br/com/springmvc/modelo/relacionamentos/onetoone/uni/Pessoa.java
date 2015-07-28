//package br.com.springmvc.modelo.relacionamentos.onetoone.uni;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Pessoa {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Integer id;
//	
//	private String nome;
//	public Pessoa(String nome, String idade, Rg rg) {
//		this.nome = nome;
//		this.idade = idade;
//		this.rg = rg;
//	}
//
//	private String idade;
//	
//	@OneToOne
//	@JoinColumn
//	private Rg rg;
//	
//	public Pessoa() {}
//
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getIdade() {
//		return idade;
//	}
//	public void setIdade(String idade) {
//		this.idade = idade;
//	}
//	public Rg getRg() {
//		return rg;
//	}
//	public void setRg(Rg rg) {
//		this.rg = rg;
//	}
//	
//}
