package com.up.entity;

public class Person extends Entity{	
	public Person(int id, String label, String description, InfoExtraction infoExtracted,
			String position, String address, int telNumber) {
		super(id, label, description, infoExtracted);
		this.position = position;
		this.address = address;
		this.telNumber = telNumber;
	}
	private String position;
	private String address;
	private int telNumber;
		

	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(int telNumber) {
		this.telNumber = telNumber;
	}
	
}
