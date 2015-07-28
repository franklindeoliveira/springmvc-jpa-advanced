//package br.com.springmvc.modelo.id;
//
//import java.io.Serializable;
//
//public class IdCompostoComplexoID implements Serializable {
//	
//	private static final long serialVersionUID = 3446823838275026452L;
//	
//	private Integer id;
//	private Integer id2;
//
//	public IdCompostoComplexoID() {}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public Integer getId2() {
//		return id2;
//	}
//
//	public void setId2(Integer id2) {
//		this.id2 = id2;
//	}
//	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((id2 == null) ? 0 : id2.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		IdCompostoComplexoID other = (IdCompostoComplexoID) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (id2 == null) {
//			if (other.id2 != null)
//				return false;
//		} else if (!id2.equals(other.id2))
//			return false;
//		return true;
//	}
//
//
//}
