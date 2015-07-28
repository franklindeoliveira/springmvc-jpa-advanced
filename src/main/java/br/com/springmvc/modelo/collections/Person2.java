//package br.com.springmvc.modelo.collections;
//
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.CollectionTable;
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
//@Entity
//public class Person2 {
//
//	@Id
//	@GeneratedValue
//	private Integer id;
//	private String name;
//	
//	@ElementCollection
//	@CollectionTable(name = "person_has_emails")
//	private Set<String> emails;
//
//	@ElementCollection(targetClass = CarBrands.class)
//	@Enumerated(EnumType.STRING)
//	private List<CarBrands> brands;
//
//	public Person2() {
//	}
//
//	public Person2(String name, Set<String> emails, List<CarBrands> brands) {
//		this.name = name;
//		this.emails = emails;
//		this.brands = brands;
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
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//}
