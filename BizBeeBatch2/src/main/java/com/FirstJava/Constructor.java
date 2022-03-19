package com.FirstJava;

public class Constructor {
	
	Constructor(int a){
		
	}
	
	Constructor(String name){
		System.out.println("My name is "+ name);
	}
	
	Constructor() {
		System.out.println("I am the constructor...");
	}
	
	public void method() {
		System.out.println("I am the method,...");
	}

	public static void main(String[] args) {
		
		Constructor con = new Constructor();
		
		Constructor obj = new Constructor("Mohammed");

	}

}
