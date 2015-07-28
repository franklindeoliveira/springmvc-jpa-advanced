//package br.com.springmvc.modelo.heranca;
//
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//
//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "pertence_a_classe")
//public abstract class Pessoa {
//	
//	@Id
//    @GeneratedValue
//    private int id;
//
//	private String nome;
//	
//	public Pessoa() {}
//	
//	public Pessoa(String nome) {
//		this.nome = nome;
//	}
//
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getNome() {
//		return nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//}
