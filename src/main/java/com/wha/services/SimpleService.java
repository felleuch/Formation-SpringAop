package com.wha.services;

public class SimpleService {
	
	private String name;
	private int id;
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printNameId() {
		System.out.println("SimpleService : Methode printNamleId() : Mon nom est "+name + "et mon id est "+id);
	}
	
	public void checkName() {
		if(name.length()<20) {
			throw new IllegalArgumentException();
		}
	}
	
	public void sayHello(String message) {
		System.out.println("Simple Service : Methode sayHello(): Hello !"+message);
	}

}
