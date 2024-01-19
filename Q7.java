class Q7{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.print("Enter a number: ");
		int no = sc.nextInt();
		int n1 = no%10;
		System.out.print("The last digit is "+n1);
	}
}