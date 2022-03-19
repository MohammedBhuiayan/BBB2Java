package com.FirstJava;

public class Calculator {
	int x, y;
	int c;
	
	Calculator(int i, int j){
		this.x=i;
		this.y=j;
		System.out.println("I am the cons");
	}

	public void add() {
		c = x+y;		
		System.out.println(c);
	}
	
	public void sub() {
		c = y-x;		
		System.out.println(c);
	}
	
	public void mul() {
		c = y*x;
		System.out.println(c);
	}
	
	public void div() {
		double c = (double)x/y;
		System.out.println(c);
	}
	
	void some() {
		System.out.println("How are you?");
	}

	public static void main(String[] args) {	
		Calculator obj = new Calculator(10,20);
		obj.add();
		obj.sub();
	}

}
