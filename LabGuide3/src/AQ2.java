
import java.util.Scanner;


public class AQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		int choice;
		do {
			choice = menu(scanner);
			switch(choice)
			{
			case 1:
				int num1, num2;
				System.out.println("Enter first Number: ");
				num1 = scanner.nextInt();
				
				System.out.println("Enter second Number: ");
				num2=scanner.nextInt();
				if(isRelPrime(num1,num2) == 1)
				{
					System.out.println("Relatively prime numbers");
					
				}
				
				else 
					System.out.println("NOT relatively prime");
				
				break;
			
			
			case 2:
				int number;
				System.out.println("Enter a number:");
				number = scanner.nextInt();
				if(isPerfect(number)==1)
				{
					System.out.println("Perfect Number");
					
				}
				else System.out.println("NOT perfect Number");
				break;
				
			default: System.out.println("Exited!");
			}
			
			
			
		}while( choice != 3);
		
		

	}
	
	static int menu(Scanner scanner)
	{
		int choice;
		System.out.println("Menu\r\n"
				+ "1. Is Relatively Prime\r\n"
				+ "2. Is Perfect\r\n"
				+ "3. Exit");
		
		do {
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			
		}while (choice >3 || choice < 1);
		
		return (choice);
		
	}
	
	static int isRelPrime(int num1, int num2)
	{
		for(int i = 2 ; i <= Math.min(num1,num2);i++)
		{
			if( num1 % i == 0 && num2 % i ==0)
			{
				System.out.println(i);
				return(0);
			}
			
		}
		
		return(1);
			
		
	}
	
	static int isPerfect(int number)
	{
		int sum=1;
		for(int i = 2 ; i < number ; i++)
		{
			if( number % i ==0  )
				sum += i;
		}
		
		if ( sum == number)
			return(1);
		
		return(0);
		
	}
	

}
