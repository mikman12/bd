package com.qaprosoft.models;

public class Sto {
	private String name;
	private int age;
	private int experience;
	private ProvidersOfDetails providersofdetails;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ProvidersOfDetails getProvidersOfDetails() {
		return providersofdetails;
	}

	public void setProvidersOfDetails(ProvidersOfDetails providersofdetails) {
		this.providersofdetails = providersofdetails;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "name: " + name + " experience: " + experience + " age: " + age;
	}
}
