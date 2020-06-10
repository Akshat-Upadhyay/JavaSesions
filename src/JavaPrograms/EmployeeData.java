package JavaPrograms;

public class EmployeeData {
	
	public String name;
	public int iD;
	public int age;
	public String dept;
	private int salary;
	
	public void getEmployeeName()
	{
		System.out.println("Get Employee Name");
		getEmployeeBonus();
		
	}
	
	private void getEmployeeBonus()
	{
		System.out.println("Get Employee Bonus");
		
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	
	}

	public EmployeeData(String name, int iD, int age, String dept, int salary) {
		this.name = name;
		this.iD = iD;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}

	public static void main(String[] args) {

		EmployeeData e1= new EmployeeData("Tom",102,25,"IT",91000);
		
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
		e1.getEmployeeBonus();
		e1.getEmployeeName();
		
		
	}

}
