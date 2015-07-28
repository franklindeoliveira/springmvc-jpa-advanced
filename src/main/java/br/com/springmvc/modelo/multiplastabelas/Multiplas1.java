//package br.com.springmvc.modelo.multiplastabelas;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.SecondaryTable;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "multiplas1")
//@SecondaryTable(
//	    name="multiplas3",
//	    pkJoinColumns={@PrimaryKeyJoinColumn(name="id3")}
//	)
//public class Multiplas1 {
//	
//	@Id
//	@GeneratedValue
//	private Integer id1;
//	
//	private String atributo1;
//	
//	// Aqui indicamos que este atributo se refere a coluna 'atributo1' da tabela 'multiplas3'. 
//	@Column(name="atributo1", table="multiplas3")
//	private String atributo1M3;
//	
//	private String atributo2;
//	private String atributo3;
//	
//	@Column(table="multiplas3")
//	private String atributo4;
//	
//	@Column(table="multiplas3")
//	private String atributo7;
//	
//	public Multiplas1() {}
//	
//	public Multiplas1(String atributo1, String atributo2, String atributo3,
//			String atributo4, String atributo7) {
//		this.atributo1 = atributo1;
//		this.atributo1M3 = atributo1;
//		this.atributo2 = atributo2;
//		this.atributo3 = atributo3;
//		this.atributo4 = atributo4;
//		this.atributo7 = atributo7;
//	}
//
//	public Integer getId1() {
//		return id1;
//	}
//
//	public void setId1(Integer id1) {
//		this.id1 = id1;
//	}
//
//	public String getAtributo1() {
//		return atributo1;
//	}
//
//	public void setAtributo1(String atributo1) {
//		this.atributo1 = atributo1;
//	}
//
//	public String getAtributo2() {
//		return atributo2;
//	}
//
//	public void setAtributo2(String atributo2) {
//		this.atributo2 = atributo2;
//	}
//
//	public String getAtributo3() {
//		return atributo3;
//	}
//
//	public void setAtributo3(String atributo3) {
//		this.atributo3 = atributo3;
//	}
//
//	public String getAtributo4() {
//		return atributo4;
//	}
//
//	public void setAtributo4(String atributo4) {
//		this.atributo4 = atributo4;
//	}
//
//	public String getAtributo7() {
//		return atributo7;
//	}
//
//	public void setAtributo7(String atributo7) {
//		this.atributo7 = atributo7;
//	}
//
//}
