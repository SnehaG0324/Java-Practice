package online_shopping_system;

import java.util.Scanner;

public class cart {

	String items;
	
	public static void add(String items) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of the list: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements of the list: ");
		int[] arr = new int[n];
		
		System.out.println(arr+" these items are added to your list.");
	}
	
	public static void remove(String items) {
		String[] items1 = {"chips", "soap", "butter", "vegetables", "oil"}; 
		
		System.out.println("Your items are "+items1);
		
		
	}
}
