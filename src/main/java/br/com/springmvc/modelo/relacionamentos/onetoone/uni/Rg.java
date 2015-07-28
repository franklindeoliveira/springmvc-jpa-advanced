//package br.com.springmvc.modelo.relacionamentos.onetoone.uni;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
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
//	
//	public Rg() {}
//	
//	public Rg(String numero, String dataEmissao) {
//		this.numero = numero;
//		this.dataEmissao = dataEmissao;
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
//	
//}
