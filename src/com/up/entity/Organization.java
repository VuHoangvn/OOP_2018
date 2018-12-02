package com.up.entity;

public class Organization extends Entity{
	private String headerOffice;
	private int faxNumber;
	
	public Organization(int id, String label, String description, InfoExtraction infoExtracted,
					String headerOffice, int faxNumber) {
		super(id, label, description, infoExtracted);
		setHeaderOffice(headerOffice);
		setFaxNumber(faxNumber);
	}

	public String getHeaderOffice() {
		return headerOffice;
	}
	public void setHeaderOffice(String headerOffice) {
		this.headerOffice = headerOffice;
	}
	public int getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(int faxNumber) {
		this.faxNumber = faxNumber;
	}
	
}
