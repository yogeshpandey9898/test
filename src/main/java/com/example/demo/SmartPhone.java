package com.example.demo;

import java.util.Objects;

public class SmartPhone {
	
	
	String  iphone;
	String   display ;
	int rate;
	int  ram;
	String operatingSystem;
	
	public SmartPhone(String iphone, String display, int rate, int ram, String operatingSystem) {
		super();
		this.iphone = iphone;
		this.display = display;
		this.rate = rate;
		this.ram = ram;
		this.operatingSystem = operatingSystem;
	
	}
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(display, iphone, operatingSystem, ram, rate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SmartPhone other = (SmartPhone) obj;
		return Objects.equals(display, other.display) && Objects.equals(iphone, other.iphone)
				&& Objects.equals(operatingSystem, other.operatingSystem) && ram == other.ram && rate == other.rate;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	public String getIphone() {
		return iphone;
	}
	public void setIphone(String iphone) {
		this.iphone = iphone;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}







	public static SmartPhone get(int smartPhoneIMEI) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
