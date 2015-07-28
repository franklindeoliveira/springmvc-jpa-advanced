//package br.com.springmvc.modelo.heranca;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//
//@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//public abstract class PessoaTPC {
//	
//	@Id
//    @GeneratedValue
//    private int id;
//
//	private String nome;
//	
//	public PessoaTPC() {}
//	
//	public PessoaTPC(String nome) {
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
