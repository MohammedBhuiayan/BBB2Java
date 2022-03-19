package com.FirstJava;

public class RreturnTypeMethod {
	
	int bal = 1000;
	
	public int getMoney() {
		int a = 250;
	//	System.out.println(a);
		
	return a;
	}
	
	public void deposit(int x) {
		RreturnTypeMethod obj = new RreturnTypeMethod();
		
		bal = bal+x+obj.getIncentive(x);
		
		System.out.println(bal);
	}
	
	public int getIncentive(int dep) {
		int incen = 0;
		if(dep>1000) {
			incen = 20;
		}
		if(dep<1000) {
			incen = 10;
		}
		return incen;
	}

	public static void main(String[] args) {
		RreturnTypeMethod obj = new RreturnTypeMethod();
		obj.getMoney();
		System.out.println(obj.getMoney());
	}

}
