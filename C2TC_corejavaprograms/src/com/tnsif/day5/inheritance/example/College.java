package com.tnsif.day5.inheritance.example;

public class College {
	private String CollegeName;
	private String Location;
	public College() {
		this.CollegeName="IFET";
		this.Location="Villupuram";
	}
	public College(String CollegeName,String Location) {
		this.CollegeName=CollegeName;
		this.Location=Location;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "College [CollegeName=" + CollegeName + ", Location=" + Location + "]";
	}
	
}
