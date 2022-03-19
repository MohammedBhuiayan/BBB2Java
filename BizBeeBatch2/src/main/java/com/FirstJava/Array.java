package com.FirstJava;

import java.util.Arrays;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {	
	
		int sum = 500;
		
		double ave = (double)500/12;
		
		System.out.println(ave);
		System.out.println();
		
		int[] sale = {-60, 100, 150, 50, 40, -70, 100, 500, 400, 80};
		
		System.out.println(sale.length);
		int Jameel = 0;
		for(int i=0; i<sale.length; i++) {
			if(sale[i]<Jameel) {
				Jameel=sale[i];
			}
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}		
		System.out.println(Jameel);
		
		int[][] a = new int[3][5];
		
/*		for(int i=0; i<sale.length; i++) {
			System.out.print(sale[i] + " ");
		}
		System.out.println();
		Arrays.sort(sale);
		for(int i=0; i<sale.length; i++) {
			System.out.print(sale[i]+ " ");
		}	
*/			
	}

}
