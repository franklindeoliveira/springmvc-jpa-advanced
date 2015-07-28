//package br.com.springmvc.modelo.relacionamentos.onetomany.bi;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Pessoa {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Integer id;
//	private String nome;
//	private String idade;
//	@OneToMany(mappedBy = "pessoa")
//	private List<Carro> carros;
//	
//	public Pessoa() {}
//	
//	public Pessoa(String nome, String idade) {
//		this.nome = nome;
//		this.idade = idade;
//	}
//	
//	public Pessoa(String nome, String idade, List<Carro> carros) {
//		this.nome = nome;
//		this.idade = idade;
//		this.carros = carros;
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
//	public String getIdade() {
//		return idade;
//	}
//
//	public void setIdade(String idade) {
//		this.idade = idade;
//	}
//
//	public List<Carro> getCarros() {
//		return carros;
//	}
//
//	public void setCarros(List<Carro> carros) {
//		this.carros = carros;
//	}
//	
//}