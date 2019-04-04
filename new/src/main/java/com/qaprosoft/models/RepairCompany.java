package com.qaprosoft.models;

public class RepairCompany {
	private ProvidersOfDetails providersofdetails;
	private int age;
	private String city;
	private String rating;
	private String name;
	
	public ProvidersOfDetails getProvidersOfDetails() {
		return providersofdetails;
	}

	public void setProvidersOfDetails (ProvidersOfDetails providersofdetails) {
		this.providersofdetails = providersofdetails;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "age: " + age + " city: " + city + " rating: " + rating + " name: " + name;
	}
}
