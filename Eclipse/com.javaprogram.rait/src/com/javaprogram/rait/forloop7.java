package com.javaprogram.rait;

import java.util.Scanner;

public class forloop7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the power: ");
		int n2 = sc.nextInt();
		int res=1;
		
		for(int i=1; i<=n2; i++) {
			res *= n1;
		}
		System.out.print("Result: "+res);
	}
}

