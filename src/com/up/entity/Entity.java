package com.up.entity;

public class Entity {
	private int id;
	private String label;
	private String description;
	private InfoExtraction infoExtracted;

	public Entity(int id, String label, String description, InfoExtraction infoExtracted) {
		super();
		setId(id);
		setLabel(label);
		setDescription(description);
		setInfoExtracted(infoExtracted);
	}
	
	public InfoExtraction getInfoExtracted() {
		return infoExtracted;
	}

	public void setInfoExtracted(InfoExtraction infoExtracted) {
		this.infoExtracted = infoExtracted;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
