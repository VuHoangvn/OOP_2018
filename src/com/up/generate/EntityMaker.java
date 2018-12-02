package com.up.generate;

public class EntityMaker {
	private IGenEntity persons = new GenPerson();
	private GenInfoExtract gen_info = new GenInfoExtract();
	
	public void makePerson() {
		persons.getList(gen_info);
	}
	
	public void make() {
}
}
