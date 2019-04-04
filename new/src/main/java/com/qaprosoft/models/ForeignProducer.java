package com.qaprosoft.models;

public class ForeignProducer {
	private String city;
	private String name;
	private String rating;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "city: " + city + " name: " + name + " rating: " + rating;
	}
	


	
}
