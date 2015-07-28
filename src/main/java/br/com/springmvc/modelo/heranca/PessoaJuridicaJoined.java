//package br.com.springmvc.modelo.heranca;
//
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "pessoa_juridica_joined")
//@DiscriminatorValue("PessoaJuridicaJoined")
//public class PessoaJuridicaJoined extends PessoaJoined {
//	
//	private String cnpj;
//	
//	public PessoaJuridicaJoined() {}
//
//	public PessoaJuridicaJoined(String nome, String cnpj) {
//		super(nome);
//		this.cnpj = cnpj;
//	}
//
//	public String getCnpj() {
//		return cnpj;
//	}
//
//	public void setCnpj(String cnpj) {
//		this.cnpj = cnpj;
//	}
//
//}