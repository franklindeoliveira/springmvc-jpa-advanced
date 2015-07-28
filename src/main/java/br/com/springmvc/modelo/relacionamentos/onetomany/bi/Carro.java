//package br.com.springmvc.modelo.relacionamentos.onetomany.bi;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class Carro {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Integer id;
//	
//	private String marca;
//	private String modelo;
//	@ManyToOne
//	private Pessoa pessoa;
//	
//	public Carro() {}
//	
//	public Carro(String marca, String modelo) {
//		this.marca = marca;
//		this.modelo = modelo;
//	}
//
//	public Carro(String marca, String modelo, Pessoa pessoa) {
//		this.marca = marca;
//		this.modelo = modelo;
//		this.pessoa = pessoa;
//	}
//
//	public String getMarca() {
//		return marca;
//	}
//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//	public String getModelo() {
//		return modelo;
//	}
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
//	public Pessoa getPessoa() {
//		return pessoa;
//	}
//	public void setPessoa(Pessoa pessoa) {
//		this.pessoa = pessoa;
//	}
//	
//}
