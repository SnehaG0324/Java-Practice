class Main{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a two digit number: ");
		int no = sc.nextInt();
		int n1 = no%10;
		int n2 = no/10;
		int res = n1+n2;
		System.out.println("The addition of the two digit number is "+res);
	}
}