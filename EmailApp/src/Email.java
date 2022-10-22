
import java.util.Scanner;
public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	
	//Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email created: "+this.firstName + " "+ this.lastName);
		
		//Call a method asking for the department- return the department
		this.department=setDepartment();
		System.out.println("Department is: "+department);
	}
	
	private String setDepartment()
	{
		System.out.println("Enter the department:\n1 for sales\n2 for development\n3 for accounting \n0 for none\n:");
		Scanner in =new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice==1)
		{return "sales";}else if (depChoice==2) {return "dev";}
		else if(depChoice==3) {return 	"acct";}
		else {return ""; }
		
		
	}
	
	
	
	
	
	//Ask for the department 
	
	
	//Generate a random Password 
	
	//Set the mailbox capacity
	
	
	//Change the password
	

}
