package com.tnsif.entityassignment;

public class Product {
	private int Productid;
	private String Productname;
	public int getProductid() {
		return Productid;
	}
	public void setProductid(int productid) {
		Productid = productid;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	private String Price;
	@Override
	public String toString() {
		return "Product [Productid=" + Productid + ", Productname=" + Productname + ", Price=" + Price + "]";
	}
	
}
