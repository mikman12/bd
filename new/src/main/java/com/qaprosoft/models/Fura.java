package com.qaprosoft.models;

public class Fura {
	private Sto sto;
	private int weight;
	private int age;

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
	@Override
	public String toString() {
		return "sto: " + sto + " weight: " + weight + " age: " + age;
	}
}
