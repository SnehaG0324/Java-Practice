//Sum of 3 digits number:
class Main{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a 3 digit number: ");
		int no = sc.nextInt();
		int n1=no%10;
		int n2=no/10;
		int n3=n2%10;
		int n4=n2/10;
		int res=n1+n3+n4;
		System.out.print("The sum of 3 digits number is "+res);
	}
}