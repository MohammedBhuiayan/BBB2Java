package com.FirstJava;

public class NullPointerExplain {
	
	String a;
	
	public void getInt() {
		a = "Masuma";		
		System.out.println(a);
	}
	
	public void getSome() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		NullPointerExplain ne = new NullPointerExplain();
			ne.getInt();
			ne.getSome();
	}

}
