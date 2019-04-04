package com.qaprosoft.models;

public class Pogruzchik {
	private RepairCompany repaircompany;
	private int age;
	private String model;

	public RepairCompany getRepairCompany() {
		return repaircompany;
	}

	public void setRepairCompany(RepairCompany repaircompany) {
		this.repaircompany = repaircompany;
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
		return "age: " + age + " model: " + model;
	}
}
