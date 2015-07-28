//package br.com.springmvc.modelo.id;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "id_identity")
//public class IdIdentity {
//	
//	public IdIdentity() {}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	
//	private String atributo;
//	
//	public IdIdentity(String atributo) {
//		this.atributo = atributo;
//	}
//	
//	public IdIdentity(Integer id, String atributo) {
//		this.id = id;
//		this.atributo = atributo;
//	}
//	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getAtributo() {
//		return atributo;
//	}
//
//	public void setAtributo(String atributo) {
//		this.atributo = atributo;
//	}
//
//}
