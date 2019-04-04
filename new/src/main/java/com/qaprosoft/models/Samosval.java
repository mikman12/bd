package com.qaprosoft.models;

public class Samosval {
	private String model;
	private int weight;
	private int age;
	private Sto sto;

	public Sto getSto() {
		return sto;
	}

	public void setSto(Sto sto) {
		this.sto = sto;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "model: " + model + " weight: " + weight + " age: " + age;
	}
}
