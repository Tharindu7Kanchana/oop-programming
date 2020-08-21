package com.week4.q1;

public class person {
	String name;
	String address;
	person(String name,String address){
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return this.name + " " + this.address;
	}
}
