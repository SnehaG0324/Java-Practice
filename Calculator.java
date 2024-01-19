//fully qualified class name
//Calculator
class Calculator{
	final double pi=3.142;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	public void areaOfCircle(){
		System.out.println("Enter the radius of the circle= ");
		int a1=sc.nextInt();
		double area1=pi*a1*a1;
		System.out.println("Area of Circle is "+area1);
	}

	public void circumOfCircle(){
		System.out.println("Enter the radius of the circle= ");
		int a2=sc.nextInt();
		double cir=2*pi*a2;
		System.out.println("The circumference of circle is "+cir);
	}

	public void areaOfRectangle(){
		System.out.println("Enter the length of the rectangle= ");
		int len=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle= ");
		int bre=sc.nextInt();
		double area2 = len*bre;
		System.out.println("The area of rectangle is "+area2);
	}

	public void volOfSphere(){
		System.out.println("Enter the radius= ");		
		int r=sc.nextInt();
		double vol1=pi*r*r*r*(4/3);
		System.out.println("The volume of sphere is "+vol1);
	}

	public void areaOfSphere(){
		System.out.println("Enter the radius= ");		
		int r2= sc.nextInt();
		double area3=4*pi*r2*r2;
		System.out.println("The area of sphere is "+area3);
	}

	public void areaOfSquare(){
		System.out.println("Enter the length of the side= ");
		int s=sc.nextInt();
		double area4=s*s;
		System.out.println("The area of square is "+area4);
	}

	public void areaOfRight(){
	    System.out.println("Enter the base of the Triangle= ");
		int base=sc.nextInt();
		System.out.println("Enter the height of the Triangle= ");
        int height= sc.nextInt();
		double area5=0.5*base*height;
		System.out.println("The area of Right angle Triangle is "+area5);
	}

	public void areaOfEqui(){
    	System.out.println("Enter the length of the side= ");
		int r4=sc.nextInt();
		double area6= 0.866*r4*r4;
		System.out.println("The area of Equlateral Triangle is "+area6);
	}

	public void periOfRec(){
		System.out.println("Enter the lenght of the rectangle= ");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle= ");
		int breadth=sc.nextInt();
		double peri=2*(length+breadth);
		System.out.println("The perimeter of Rectangle is "+peri);
	}
	 public void areaOfTri(){
	    System.out.println("Enter the base of the Triangle= ");
		int base2=sc.nextInt();
		System.out.println("Enter the height of the Triangle= ");
        int height2= sc.nextInt();
		double area7=0.5*base2*height2;
		System.out.println("The area of Right angle Triangle is "+area7);
	 }
}

class MyJava{
	public static void main(String args[]){
		Calculator obj = new Calculator();
	    java.util.Scanner sc =new java.util.Scanner (System.in);
	    while(true){
	    	System.out.println("1. Area of Circle");
	    	System.out.println("2. Circumference of Circle");
	    	System.out.println("3. Area of Rectangle");
	    	System.out.println("4. Volume of Sphere");
	    	System.out.println("5. Area of Shere");
	    	System.out.println("6. Area of Square");
	    	System.out.println("7. Area of Right Angle Triangle");
	    	System.out.println("8. Area of Equilateral Triangle");
	    	System.out.println("9. Perimeter of Rectangle");
	    	System.out.println("10. Area of Triangle");
	    	System.out.println("11. EXIT");
	    	int ch = sc.nextInt();
	    	if (ch==1){
	    		obj.areaOfCircle();
	    	}
	        else if (ch==2){
	        	obj.circumOfCircle();
	        }
	        else if (ch==3){
	        	obj.areaOfRectangle();
	        }
	        else if (ch==4){
	        	obj.volOfSphere();
	        }
	        else if (ch==5){
	        	obj.areaOfSphere();
	        }
	        else if (ch==6){
	        	obj.areaOfSquare();
	        }
	        else if (ch==7){
	        	obj.areaOfRight();
	        }
	        else if (ch==8){
	        	obj.areaOfEqui();
	        }
	        else if (ch==9){
	        	obj.periOfRec();
	        }
	        else if (ch==10){
	        	obj.areaOfTri();
	        }
	        else {
	        	System.exit(0);
	        }
	    }
	}
}