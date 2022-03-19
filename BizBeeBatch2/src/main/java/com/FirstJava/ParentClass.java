package com.FirstJava;

public final class ParentClass extends GrandFather{
	
	public void getName() {
		System.out.println("I am the parent.");
	}
	private void getAddress() {
		System.out.println("I live in USA.");
	}
	public void getContact() {
		ParentClass pc = new ParentClass();
		pc.getAddress();
		System.out.println("Do not contact.");
	}

}
