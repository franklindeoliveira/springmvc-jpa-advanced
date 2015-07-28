//package br.com.springmvc.modelo.heranca;
//
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "pessoa_fisica_joined")
//@DiscriminatorValue("PessoaFisicaJoined")
//public class PessoaFisicaJoined extends PessoaJoined {
//	
//	private String cpf;
//	
//	public PessoaFisicaJoined() {}
//
//	public PessoaFisicaJoined(String nome, String cpf) {
//		super(nome);
//		this.cpf = cpf;
//	}
//	
//	public String getCpf() {
//		return cpf;
//	}
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
//
//}