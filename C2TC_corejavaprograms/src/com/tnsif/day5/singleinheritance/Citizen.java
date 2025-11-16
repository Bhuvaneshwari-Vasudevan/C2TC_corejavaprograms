package com.tnsif.day5.singleinheritance;

public class Citizen {
	private String name;
	private String aadharNo;
	private String address;
	private long phoneno;
	
	public Citizen() {
		System.out.println("Citizen object created");
	}
	public Citizen(String name, String aadharNo, String address, long phoneno) {
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phoneno=" + phoneno + "]";
	}
	
}
