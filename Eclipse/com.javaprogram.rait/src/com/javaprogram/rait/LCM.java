package com.javaprogram.rait;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int lcm;
		
		lcm = (n1>n2)? n1:n2;
		
		while(true) {
			if(lcm%n1 == 0 && lcm%n2 == 0) {
				System.out.println("The lcm of "+n1+" and "+n2+" is "+lcm);
				break;
			}
			++lcm;
		}
	}
}
