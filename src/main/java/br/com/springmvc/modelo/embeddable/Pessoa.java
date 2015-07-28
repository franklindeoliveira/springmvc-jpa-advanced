//package br.com.springmvc.modelo.embeddable;
//
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
//@Entity
//public class Pessoa {
//	
//	public Pessoa() {}
//	
//	public Pessoa(String nome, Integer idade, Endereco endereco) {
//		this.nome = nome;
//		this.idade = idade;
//		this.endereco = endereco;
//	}
//
//	@Id
//	@GeneratedValue
//	private Integer id;
//	private String nome;
//	private Integer idade;
//	@Embedded
//	private Endereco endereco;
//	
//	public Integer getId() {
//		return id;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public Integer getIdade() {
//		return idade;
//	}
//
//	public void setIdade(Integer idade) {
//		this.idade = idade;
//	}
//
//	public Endereco getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}
//
//}
