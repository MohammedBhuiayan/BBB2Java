package com.FirstJava;

public class Conditions {
	
	public void ifElseCondition(int a) {		
		if(a<40) {
			System.out.println("This is not up to the mark");
		}
		else if(a>100) {
			System.out.println("Above and beyond");
		}
		else {
			System.out.println("It can be passed");
		}
	}
	
	public void switchGate(int code) {		
		switch(code) {
		case 001: System.out.println("Study hard!");				
		break;
		case 002: System.out.println("Teach hard!");
		break;
		case 003: System.out.println("Maintain well!");
		break;		
		default : System.out.println("Get out of here...!");
				  System.out.println("Someone unknown is trying to enter..");
		}

	}

}
