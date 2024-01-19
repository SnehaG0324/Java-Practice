//Reverse of a 4 digits number:
class Main{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a 4 digits number: ");
		int no = sc.nextInt();
		int n1 = no%10;//4
		int no2 = no/10;//123
		int n2 = no2%10; //3
		int no3 = no2/10;//12
		int n3 = no3%10; //2
		int n4 = no3/10; //1
		System.out.print("The reverse of the given number is "+n1+n2+n3+n4);
	}
}