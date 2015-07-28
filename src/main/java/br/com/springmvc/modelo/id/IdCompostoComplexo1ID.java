//package br.com.springmvc.modelo.id;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "id_composto_complexo_1_id")
//public class IdCompostoComplexo1ID {
//	
//	public IdCompostoComplexo1ID() {}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//	
//	private String atributo;
//	
//	public IdCompostoComplexo1ID(String atributo) {
//		this.atributo = atributo;
//	}
//	
//	public IdCompostoComplexo1ID(Integer id, String atributo) {
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
