package com.FirstJava;

public class OverLoading {
	
	public void getName() {
		System.out.println("My name");
	}
	
	public void getName(String x) {
		System.out.println("My name is "+x);
	}
	
	public void getName(int s) {
		
	}
	
	public void getName(String a, String b) {
		
	}

	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.getName(10);

	}

}
