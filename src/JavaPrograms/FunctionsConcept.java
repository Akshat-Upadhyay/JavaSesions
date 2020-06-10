package JavaPrograms;

import java.util.ArrayList;

public class FunctionsConcept {

	//class methods- class properties:
	//1. Class methods
	//2  Class variables
	
	
	public static void main(String[] args) {//main is also a function
		//A method cannot be created inside another method
		//when ever u have to call class members, create an object of the class
	
		FunctionsConcept obj = new FunctionsConcept();
		obj.test();
		int sum=obj.add();
		System.out.println(sum);
		
		String trainerName=obj.getTrainername();
		System.out.println(trainerName +"from India" );
		
		
		String day[] = obj.getWeekDayNames();
		System.out.println(day[0]+ " " + day[1]);
		
		
		int div=obj.Division(2, 10);
		System.out.println(div);
		
		
		String name = obj.getCapitalname("India");
		System.out.println(name);
		
		
		ArrayList<String> ar= obj.getStudentList("Sep");
		System.out.println(ar);
		
		
		String s = obj.getHODName("CS");
		System.out.println(s);
}

	//three types of methods
	
	
	//1. no input & no return
	// void means function cannot return anything
	public void test()
	{
		System.out.println("Test Method");
		
	}
	
	//2. no input but some return
	
	public int add() {
		System.out.println("Add Method");
		
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public String getTrainername() {
		
		System.out.println("Get Trainer name");
		String name="Akshat";
		return name;
	}
	
	public String[] getWeekDayNames()
	{
		String day[] = new String[7];
		
		day[0] = "Monday";
		day[1] = "Tuesday";
		
		return day;
		
	}
	
	//3 some input and some return
	
	public int Division(int a , int b)
	{
		System.out.println("Divison method");
		int d= b/a;
		return d;
	}
	
	public String getCapitalname(String countryName) {
		
		if(countryName.equals("India"))
		{
			return "New Delhi";
		}
		else if(countryName.equals("US"))
		{
			return "DC";
		}
		else if(countryName.equals("Russia"))
		{
			return "Moscow";
		}
		else if(countryName.equals("Japan"))
		{
			return "Tokyo";
		}
		else
		{
			return "Capital not found";
		}
		
	}
	
	public ArrayList <String> getStudentList(String batchName)
	{
		ArrayList <String> studentList= new ArrayList<String>();
		
		if(batchName.equals("Sep"))
		{
			studentList.add("Joey");
			studentList.add("Monica");
			studentList.add("Rachel");
			studentList.add("Ross");
			studentList.add("Chandler");
		}
		else if(batchName.equals("Aug"))
				{
			studentList.add("hero");
			studentList.add("jack");
			
				}
		
		return studentList;
		
	}
	
	public String getHODName(String deptName)
	{
		if(deptName.equals("CS"))
		{
			return "Akshat";
		
	}
		else if(deptName.equals("EEE"))
		{
			return "Tom";
		
	}
		return null;
			 
	
}
}
