package com.qaprosoft.models;

public class ProvidersOfDetails {
	private ForeignProducer foreignproducer;
	private NativeProducer nativeproducer;
	private String city;
	private String name;
	public ForeignProducer getForeignProducer() {
		return foreignproducer;
	}

	public void setForeignProducer(ForeignProducer foreignproducer) {
		this.foreignproducer = foreignproducer;
	}
	public NativeProducer getNativeProducer() {
		return nativeproducer;
	}

	public void setNativeProducer(NativeProducer nativeproducer) {
		this.nativeproducer = nativeproducer;
	}
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
	@Override
	public String toString() {
		return "city: " + city + " name: " + name;
	}
}
