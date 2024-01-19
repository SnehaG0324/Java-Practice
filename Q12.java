//Swap using third variable:
class Main{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("Enter the second number: ");
		int y = sc.nextInt();
		System.out.println("The numbers before swapping are "+x+" and "+y);
		int t = x;
		x = y;
		y = t;
		System.out.println("The numbers after swapping are "+x+" and "+y);
	}
}