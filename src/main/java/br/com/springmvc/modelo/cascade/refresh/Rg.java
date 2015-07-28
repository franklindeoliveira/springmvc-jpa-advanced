//package br.com.springmvc.modelo.cascade.refresh;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Rg {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private Integer id;
//	private String numero;
//	@Column(name = "data_emissao")
//	private String dataEmissao;
//	@OneToOne(mappedBy = "rg")
//	private Pessoa pessoa;
//	
//	public Rg() {}
//	
//	public Rg(String numero, String dataEmissao) {
//		this.numero = numero;
//		this.dataEmissao = dataEmissao;
//	}
//	
//	public Rg(String numero, String dataEmissao, Pessoa pessoa) {
//		this.numero = numero;
//		this.dataEmissao = dataEmissao;
//		this.pessoa = pessoa;
//	}
//	
//	public String getNumero() {
//		return numero;
//	}
//	public void setNumero(String numero) {
//		this.numero = numero;
//	}
//	public String getDataEmissao() {
//		return dataEmissao;
//	}
//	public void setDataEmissao(String dataEmissao) {
//		this.dataEmissao = dataEmissao;
//	}
//	public Pessoa getPessoa() {
//		return pessoa;
//	}
//	public void setPessoa(Pessoa pessoa) {
//		this.pessoa = pessoa;
//	}
//	
//}
