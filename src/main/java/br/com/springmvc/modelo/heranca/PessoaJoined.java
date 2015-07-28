//package br.com.springmvc.modelo.heranca;
//
//import javax.persistence.DiscriminatorColumn;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "pessoa_joined")
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "pertence_a_classe")
//public abstract class PessoaJoined {
//	
//	@Id
//    @GeneratedValue
//    private int id;
//
//	private String nome;
//	
//	public PessoaJoined() {}
//	
//	public PessoaJoined(String nome) {
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
