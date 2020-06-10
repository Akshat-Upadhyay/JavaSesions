package JavaPrograms;

public class User {
	
	
	//**************************************CONSTRUCTOR CONCEPT****************************************************
	
	

	//class variable
	String name;
	int age;
	int userID;
	char gender;
	boolean isActive;
	static int wheels;
	
	
	
	//Constructor: construct an object.constrcut with class variables
	//Constructor name will be same as class name.
	//Constructor is used to define and construct the object with the help of variables
	//constructor will never return anything. We will never write return statement
	//Constructor is used to define class variables
	//We can use static variable inside a constructor
	//Constructor cannot be static because it is used to initialize an object
	//constructor is used to initialize an object
	
	//two types of constructor
	//1. default constructor
	//2. Parameterized constructor
	
	
	//syntax
	
	public User()//default constructor
	{
		System.out.println("Zero parameter constrcutor");
		
	}
	
	public User(int i)//1 Parameter constructor-->Constructor overloading
	{
		
		System.out.println("one paramter constructor" +i);
		
	}
	
	public User(int i, String p)
	{
		
		System.out.println("Two param C " +i + " " +p );
	}
	
	
	// create a constructor with all class variables
	
	public User(String name, int age, int userID, char gender, boolean isActive)// these names are local variables
	{
		this.name=name;// this is used to access class variable inside a constructor(this.classvariable=local variable)
		//name=name1;
		this.age=age;
		this.userID=userID;
		this.gender=gender;
		this.isActive=isActive;
		
		
	}
	
	
	//When ever we have to give local variable to class variable,use THIS keyword
	
	
	
	public User(String name, int age, int userID, int wheels) {
	
		this.name = name;
		this.age = age;
		this.userID = userID;
		this.wheels=wheels;
	}

	public static void main(String[] args) {

		
//		//1. First way of giving the values
//		User U1= new User();
//		U1.name="Akshat";
//		
//		User U2= new User();
//		U2.name="Tom";
//		

		User u1= new User();
		User u2= new User(10);
		User u3= new User(100, "Akshat");

		User us1= new User("Akshat",29,101,'M',true);
		//System.out.println(us1.name);
		User us2= new User("Jack",29,102,'M',true);

		User us3= new User("Natelie",29,103,'F',false);
		
		
		System.out.println(us1.name+ " " + us1.isActive);

		User us4= new User("Tally",29,104,4);
		System.out.println(us4.name);
		System.out.println(us4.wheels);

		
	}

}
