package com.FirstJava;

public class Exception {
	
	

	public static void main(String[] args) {
		
		int[] a = new int[30];
		a[0] = 10;
		a[1] = 20;
		a[31] = 30;
		
		final int x = 0;
		System.out.println(x);
		
		int y = 0;
		System.out.println(y);		

		try {
			int z = x/y;
		}
		
		catch (ArrayIndexOutOfBoundsException t){
			System.out.println("Exception is handled");
		}	
		
		finally {
			System.out.println("Must run");
		}
		
	}	
}
