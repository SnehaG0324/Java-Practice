//Average of three numbers:
class Main{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		float avg = (n1+n2+n3)/3;
		System.out.println("The average of the 3 numbers is "+avg);
	}
}