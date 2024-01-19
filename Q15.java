//Find total marks and percentage:
class Main{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the marks of five subjects out of 100: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		int n5=sc.nextInt();
		int total = n1+n2+n3+n4+n5;
		float per = (total/5);
		System.out.println("The total marks are: "+total);
		System.out.println("The percentage is "+per);
	}
}