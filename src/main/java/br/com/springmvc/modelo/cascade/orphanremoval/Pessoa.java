//package br.com.springmvc.modelo.cascade.orphanremoval;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Pessoa {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Integer id;
//	private String nome;
//	private String idade;
//	@OneToOne(orphanRemoval = true)
//	private Rg rg;
//
//	public Pessoa() {}
//	
//	public Pessoa(String nome, String idade) {
//		this.nome = nome;
//		this.idade = idade;
//	}
//	
//	public Pessoa(String nome, String idade, Rg rg) {
//		this.nome = nome;
//		this.idade = idade;
//		this.rg = rg;
//	}
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
