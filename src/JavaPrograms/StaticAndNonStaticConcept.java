package JavaPrograms;

public class StaticAndNonStaticConcept {

	String name;
	static int age;
	
	
	//Object cannot hold any static variable and static method.
	
	//Static method and variable will be stored inside the stack memory.
	
	public static void main(String[] args) {
		
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		//1. How to call static method and variables
		
		//-->

	}
	
	
	public void search()
	{
		System.out.println("Search Method");
	}
	
	public static void getName()
	{
		System.out.println("Get Name Method");
	}

}
