/**class E12

{
	public static void main(String args[])
	{
	float a=3.14f;
	System.out.println(a);
	}
}

 * 
 * E12.java:5: error: incompatible types: possible lossy conversion from double to float
        float a=3.14;
                ^
**/

/**class Main{
	public static void main(String args[])
	{
		float f=0.7f;
		if(f==0.7)
			System.out.println("Hello");
		else 
			System.out.println("HI");
	}
}

OUTPUT: HI 
**/

/**class Main{
	public static void main(String args[])
	{
		float f=0.7f;
		if(f==0.7f)
			System.out.println("Hello");
		else 
			System.out.println("HI");
	}
}

OUTPUT: Hello
**/

/**class EX11{
	public static void main(String[] args) {
		long l=7558627586;
		System.out.println(l);
	}
}

OUTPUT: E12.java:47: error: integer number too large
                long l=7558627586;
                       ^
**/