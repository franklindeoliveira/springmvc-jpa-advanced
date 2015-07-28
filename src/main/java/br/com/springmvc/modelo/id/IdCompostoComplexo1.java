//package br.com.springmvc.modelo.id;
//
//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "id_composto_complexo_1")
//public class IdCompostoComplexo1 implements Serializable {
//	
//	private static final long serialVersionUID = -1361428769041134630L;
//
//	public IdCompostoComplexo1() {}
//	
//	public IdCompostoComplexo1(IdCompostoComplexo1ID id, String atributo) {
//		this.id = id;
//		this.atributo = atributo;
//	}
//
//	@Id
//	@OneToOne
//	@JoinColumn(name = "codigo_id")
//	private IdCompostoComplexo1ID id;
//	
//	private String atributo;
//	
//	public IdCompostoComplexo1ID getId() {
//		return id;
//	}
//
//	public void setId(IdCompostoComplexo1ID id) {
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
