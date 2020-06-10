package JavaPrograms;

public class Login {
	
	
	//**************************************CONSTRUCTOR CONCEPT****************************************************
	
	String username;
	String password;
	String emailID;
	int otp;
	long mobilNumber;
	String facebookID;
	
	
	

//Constructor Overloading

	public Login(String emailID,  int otp) {
		super();
		this.emailID = emailID;
		this.otp = otp;
		
	}


	public Login(String username, String password, String emailID, int otp, long mobilNumber, String facebookID) {
		this.username = username;
		this.password = password;
		this.emailID = emailID;
		this.otp = otp;
		this.mobilNumber = mobilNumber;
		this.facebookID = facebookID;
	}


	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


public void doLogin()
{
	
	System.out.println("Login with " +emailID + " "+ otp);
}



	public static void main(String[] args) {
 
		
		//Login l1= new Login();//As we are providing constructor, java expect us to provide constructor with parameters.

		//System.out.println(l1.facebookID);
		
		Login l1= new Login("Test@gmail.com",123);
		l1.doLogin();
		
	}
	

}
