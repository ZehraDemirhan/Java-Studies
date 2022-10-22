
import java.util.Scanner;

public class ADDQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int count=0;
		int member=0;
		double totalSalary=0;
		do {
		String[] idAndSalary;
		boolean isExit= true;
		
		do {
		
		System.out.println("Enter ID and salary of a worker: ");
		
		String idAndSalaryStr = scanner.nextLine();
		idAndSalary = idAndSalaryStr.split(" ");
		
		if (idAndSalary.length <=1)
			{System.out.println("Wrong input! Enter salary and id ");
			
			isExit=false;
	
			}
		}while(!isExit);
			
		String id = idAndSalary[0];
		double salary = Double.parseDouble(idAndSalary[1]);
		
		System.out.println("Is the worker a member of the savement box (Y for yes, N for no): ");
	 	
	    String input = scanner.nextLine();
	    
	    char isMember=' ';
	    
	    if(input.length()!=0)
	    	isMember=input.charAt(0);
	    
	    System.out.println("Worker ID: " + id);
	    if(salary < 1500)
	    {
	    	salary+=salary*12.5/100;
	    	
	    }
	    else 
	    	salary+=salary*11/100;
	    
	    if(isMember=='y')
	    	{salary-=13*salary/100;
	    	totalSalary+=13*salary/100;
	    	member++;
	    	
	    	}
	    
	    System.out.printf("New Salary: %.2f  TL \n\n",salary);
	  
	    count++;
	   	    
		}while(count<5);
	    
		System.out.println(member + " workers are member of the savement box.");
		System.out.printf("%.2f TL has been saved in the box ",totalSalary);
		
		scanner.close();
		
	}

}
