package com.FirstJava;

public class StaticKeyWord {
	
	public StaticKeyWord(){
		System.out.println("I am the constructor...");
	}
	
	static int bal = 500;
	static int x = 10;
	static int y = 30;
	
	public static void mahbuba() {
		System.out.println("I am the static method...");
		int z = x+y;
	}
	
	void deposit(int a) {
		bal = bal + a;
		System.out.println("New balance after deposit : "+bal);
			int j =x+y;	
		}
	
	public void withdraw(int b) {
		bal = bal - b;
		System.out.println("New balace after withdrawal : "+bal);
		}

	public static void main(String[] args) {
		StaticKeyWord obj = new StaticKeyWord();
		obj.mahbuba();
		StaticKeyWord.mahbuba();
		
	}

}
