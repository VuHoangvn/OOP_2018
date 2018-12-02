package com.up.generate;

import java.util.ArrayList;
import  com.up.entity.*;

public class GenPerson implements IGenEntity{
	ArrayList<Person> person_list = new ArrayList<Person>();
	
	public void getList(GenInfoExtract ginfo ) {
		int id;
		String label;
		String description;
		String position;
		String address;
		int telNumber;
		
//		for(int i;;) {
//			person_list.add(new Person(id, label, description, ginfo.info_list.get(i),
//					 position, address, telNumber));
//		}
	}
}
