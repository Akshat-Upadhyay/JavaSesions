package JavaPrograms;

public class StringConcat {

	public static void main(String[] args) {
		
		int i=10;
		
		System.out.println(i);
		
		System.out.println(100+200);

		int age=25;
		System.out.println("Age of Tom is " +age);
		
		
		int foodBill=25;
		int cocktailBill=75;
		int total= foodBill+cocktailBill;
		
		System.out.println("Total Bill need to be paid :" +total);// + is the concatenation operator
		
		System.out.println("Total Bill need to be paid :" + foodBill+cocktailBill);
		
		System.out.println("Total Bill need to be paid :" + (foodBill+cocktailBill));
		
		
		int a=100;
		int b=200;
		String x= "Hello";
		String y="World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+x);
		System.out.println(a+x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		
		System.out.println("The sum of a and b is " +(a+b));
		
		System.out.println("The sum of a and b is " +a+b);

		
		
		
		byte B1=100;
		byte B2=25;
		byte diff= (byte) (B1-B2);	//int 75 -->Byte 75
		
		System.out.println(diff);
		
		System.out.println(B1-B2);
		
		
		short S1= 200;
		short S2= 300;
		
		short S3= (short) (S2-S1);
		
		System.out.println(S3);
		
		
		long L1=200;
		long L2= 400;
		
		long L3= L2-L1;
		
		System.out.println(L3);
		
		
		
		System.out.println("Hello " + "World");
		
		System.out.println(x+" "+y);

		








	}

}
