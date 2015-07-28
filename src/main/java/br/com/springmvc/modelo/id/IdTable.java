//package br.com.springmvc.modelo.id;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.TableGenerator;
//
//@Entity
//@Table(name = "id_table")
//@TableGenerator(name = IdTable.IDS_TABLE_NAME, 
//				table = "tabela_de_ids", 
//				pkColumnName = "tabela", 
//				pkColumnValue = "idtable_id", 
//				valueColumnName = "id_atual")
//public class IdTable {
//
//	public static final String IDS_TABLE_NAME = "TABELA_DE_IDS";
//
//	public IdTable() {
//	}
//
//	@Id
//    @GeneratedValue(strategy = GenerationType.TABLE,
//                    generator = IDS_TABLE_NAME)
//	private Integer id;
//
//	private String atributo;
//
//	public IdTable(String atributo) {
//		this.atributo = atributo;
//	}
//
//	public IdTable(Integer id, String atributo) {
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
