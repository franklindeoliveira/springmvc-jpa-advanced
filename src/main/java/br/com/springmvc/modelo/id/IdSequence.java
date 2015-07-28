//package br.com.springmvc.modelo.id;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "id_sequence")
//@SequenceGenerator(name = IdSequence.SEQUENCE_NAME, 
//				   sequenceName = IdSequence.SEQUENCE_NAME, 
//				   initialValue = 10, 
//				   allocationSize = 53)
//public class IdSequence {
//	
//	public static final String SEQUENCE_NAME = "SEQUENCIA_IDSEQUENCE";
//	
//	public IdSequence() {}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,
//    				generator = SEQUENCE_NAME)
//	private Integer id;
//	
//	private String atributo;
//	
//	public IdSequence(String atributo) {
//		this.atributo = atributo;
//	}
//	
//	public IdSequence(Integer id, String atributo) {
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
