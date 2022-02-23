package com.example.demo;

import java.util.Objects;

public class MyClassRoom{
	
	String family ;
	int mamber ;
	String nature;
	String big ; 
	String small ;
	
		public MyClassRoom(String family, int mamber, String nature, String big, String small) {
			super();
			this.family = family;
			this.mamber = mamber;
			this.nature = nature;
			this.big = big;
			this.small = small;
		}
	
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClassRoom other = (MyClassRoom) obj;
		return Objects.equals(big, other.big) && Objects.equals(family, other.family) && mamber == other.mamber
				&& Objects.equals(nature, other.nature) && Objects.equals(small, other.small);
	}
	@Override
	public String toString() {
		return "MyClassRoom [family=" + family + ", mamber=" + mamber + ", nature=" + nature + ", big=" + big
				+ ", small=" + small + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public int getMamber() {
		return mamber;
	}
	public void setMamber(int mamber) {
		this.mamber = mamber;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getBig() {
		return big;
	}
	public void setBig(String big) {
		this.big = big;
	}
	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	
	
	

}






