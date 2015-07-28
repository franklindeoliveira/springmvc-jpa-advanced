//package br.com.springmvc.modelo.id;
//
//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.IdClass;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "id_composto_complexo_2")
//@IdClass(IdCompostoComplexoID.class)
//public class IdCompostoComplexo2 implements Serializable {
//	
//	private static final long serialVersionUID = -1361428769041134630L;
//
//	public IdCompostoComplexo2() {}
//	
//	public IdCompostoComplexo2(IdCompostoComplexo1ID id, IdCompostoComplexo2ID id2, String atributo) {
//		this.id = id;
//		this.id2 = id2;
//		this.atributo = atributo;
//	}
//
//	@Id
//	@OneToOne
//	@JoinColumn(name = "codigo_id1")
//	private IdCompostoComplexo1ID id;
//	
//	@Id
//	@OneToOne
//	@JoinColumn(name = "codigo_id2")
//	private IdCompostoComplexo2ID id2;
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
