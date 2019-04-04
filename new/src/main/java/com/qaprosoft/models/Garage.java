package com.qaprosoft.models;

public class Garage {
	private String address;
	private String size;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "address: " + address + " size: " + size;
	}

	
	
}
