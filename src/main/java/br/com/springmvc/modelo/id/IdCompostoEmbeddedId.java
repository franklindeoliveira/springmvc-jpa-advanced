//package br.com.springmvc.modelo.id;
//
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "id_composto_embedded_id")
//public class IdCompostoEmbeddedId {
//	
//	@EmbeddedId
//	private IdCompostoEmbeddedIdID id;
//	
//	private String atributo;
//	
//	public IdCompostoEmbeddedId() {}
//	
//	public IdCompostoEmbeddedId(IdCompostoEmbeddedIdID id, String atributo) {
//		this.id = id;
//		this.atributo = atributo;
//	}
//
//	public IdCompostoEmbeddedIdID getId() {
//		return id;
//	}
//
//	public void setId(IdCompostoEmbeddedIdID id) {
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
