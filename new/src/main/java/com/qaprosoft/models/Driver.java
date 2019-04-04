package com.qaprosoft.models;

public class Driver {
	private Warehouse warehouse;
	private Sto sto;
	private Garage garage;
	private Pogruzchik pogruzchik;
	private Samosval samosval;
	private Fura fura;
	private String name;
	private String surname;
	private int age;
	private int experience;

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Sto getSto() {
		return sto;
	}

	public void setSto(Sto sto) {
		this.sto = sto;
	}

	public Garage getGarage() {
		return garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	public Pogruzchik getPogruzchik() {
		return pogruzchik;
	}

	public void setPogruzchik(Pogruzchik pogruzchik) {
		this.pogruzchik = pogruzchik;
	}

	public Samosval getSamosval() {
		return samosval;
	}

	public void setSamosval(Samosval samosval) {
		this.samosval = samosval;
	}

	public Fura getFura() {
		return fura;
	}

	public void setFura(Fura fura) {
		this.fura = fura;
	}

	public String name() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String surname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int age() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int expetience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "age: " + age + " experience: " + experience + " name: " + name + " surname: " + surname;
	}
}