package com.javaprogram.rait;

public class forloop2 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.println("\n");
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}