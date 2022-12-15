
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the company type (C/c) Catering (M/m) Medical:") ;
		
		char option='\0';
		
		Scanner scanner= new Scanner(System.in);
		
		char option1=scanner.next().charAt(0);
		option=Character.toUpperCase(option1);
		double sales;
		double income;
		
		
		switch(option)
		{
		case 'C':
			System.out.println("Enter the sales of the company:");
			sales= scanner.nextDouble();
			if(sales<50000)
			{
				income=350+sales*14/100;
				
			}
			else {income=375+16*sales/100;}
			
			System.out.println("Income of the company is :"+income+"$");
			break;
		case 'M':
			System.out.println("Enter the sales of the company:");
			sales= scanner.nextDouble();
			if(sales<30000)
			{
				income=300+sales*9/100;
				
			}
			else {income=325+12*sales/100;}
			System.out.println("Income of the company is :"+income+"$");
			break;
			
			
		default: 
			System.out.println("Invalid company type!");
			
			
		
		}
		
		
		
		

		
		
	}

}
