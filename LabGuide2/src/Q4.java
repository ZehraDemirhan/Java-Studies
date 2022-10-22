import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter this year's article number:");
		
		int articleNumber=scanner.nextInt();
		
		System.out.println("Enter your salary");
	    double salary= scanner.nextDouble();
	    
	    int articleAmount=(int) (Math.random() * 6)+1;
	    int salaryRate = (int) (Math.random() * 5)+5;
	    
	    System.out.println("University announce this year wanted article amount: that is " + articleAmount );
		
		System.out.println("University announce this year salary increased percentage: that is " + salaryRate + "%");
		
		System.out.println("Your salary is " + calcSalary(articleNumber,salary,salaryRate,articleAmount));
		
	}
	
	static double calcSalary(int articleNo, double salary,double salaryRate,int articleAmount)
	{
		
		if( articleNo>=articleAmount )
		{
			salaryRate*=2;
			
		}
		return (salary+salary*salaryRate/100);
	}
	
	
	
	

}