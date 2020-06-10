package JavaPrograms;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeData e1= new EmployeeData("Shahid",103,30,"Finance",3000);	
		
		System.out.println(e1.name);
		e1.getEmployeeName();
		
		e1.setSalary(1000);
		int d=e1.getSalary();
		System.out.println(d);
		
		
	}

}
