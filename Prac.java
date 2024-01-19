class Main{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner (System.in);
		System.out.println("Enter a five digit number: ");
		int no=sc.nextInt();
		int n1=no%10;
		int n2=no/10000;
		int res=n1+n2;
		System.out.println("Result: "+res);
	}
}