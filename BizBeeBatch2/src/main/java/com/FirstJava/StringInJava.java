package com.FirstJava;

public class StringInJava {

	public static void main(String[] args) {
		// Find out the number of alphabets in a string
		//Malayalam
		
		int a = 10;
		int b = 20;
		
		String conA = String.valueOf(a);
		String conB = String.valueOf(b);
		
		String name = "100";
		int x = Integer.valueOf(name);
		System.out.println(x);
		
		System.out.println(a+b);
		System.out.println(conA+conB);
		
				
		String country = "konok";
		System.out.println(country);
		System.out.println(country.length());
		
	//	ClassName obj = new ClassName();
		StringBuilder sb = new StringBuilder(country);

		String rev = sb.reverse().toString();
		System.out.println(rev);
		
		if(country.equalsIgnoreCase(rev)) {
			System.out.println("It is a pallindrome.");
		}
		else {
			System.out.println("Not a one.");
		}
		
		System.out.println();
		
		String[] pcs = country.split(" ");
		System.out.println(pcs.length);	
		
		String lower = country.toLowerCase();
		int counter = 0;
		for(int i=0; i<lower.length(); i++) {
			if(lower.charAt(i)=='f') {
				//counter = counter+1;
				counter++;
			}
		}
	System.out.println(counter);
	}
}
