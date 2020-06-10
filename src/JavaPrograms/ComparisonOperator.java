package JavaPrograms;

public class ComparisonOperator {

	public static void main(String[] args) {

		
		int a=200;
		int b=200;
		
		
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("B is greater");
		}
		
		
		if(a==b)//'==' is comparison operator AND '=' is assignment operator
		{
			System.out.println("Both are equal");
			
		}
		
		if(a>=b)
		{
			
			System.out.println("A is greater than or equal to b");
		}
		
		//>,<,>=,<=, ==,!=
		
		
		
//		//dead code
//		
//		if(false)
//		{
//			
//			System.out.println("listing");
//		}
//		
		
		// Not a dead code
		boolean t=false;
		if(t)
		{
			
			System.out.println("listing");
		}
		
		
		//WAP to find the greatest number(given three numbers)
		
		int x=500;
		int y=800;
		int z=300;
		
		//|| is the OR operator
		
		if(x>y && x>z)//&& is also known as short circuit operator(AND operator) 
		{
			System.out.println("X is greatest");
			
		}
		
		else if(y>z)
		{
			System.out.println("Y is greatest");
		}
		else
			System.out.println("Z is greatest");
		
	}

}
