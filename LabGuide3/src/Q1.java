import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		do {
			choice = menu();
			
			switch(choice)
			{
			case 'A':
				double num1, num2;
				
				System.out.println("Enter two double numbers\r\n");
				num1=scanner.nextDouble();
				
				num2=scanner.nextDouble();
				
				System.out.println(fracPart(num1) + "+" + fracPart(num2)+ "=" + (fracPart(num1)+fracPart(num2)));
				break;
			
			
			case 'B':
				System.out.println("Enter a double number\r\n");
				double number;
				number = scanner.nextDouble();
				System.out.println("The number " + number + " is converted to the decimial " + roundNum(number));
				
			}
			
			
			
			
		}while(choice !='C');
		
		

		
		
	}
	
	static char menu() {
		System.out.println("MENU\r\n"
				+ "*******************************\r\n"
				+ "A. Add fractional parts of two numbers\r\n"
				+ "B. Convert a double number to decimal\r\n"
				+ "C. QUIT");
		Scanner scanner = new Scanner(System.in);
		char input;
		char choice;
		
		do {
			System.out.println("Enter yor choice:");
			input=scanner.next().charAt(0);
			choice=Character.toUpperCase(input);
		
				
		}while(choice!='A' && choice!='B' && choice!='C');
		
		return(choice);
		
		
		
		
	}
	
	static double fracPart(double num)
	{
		int intPart;
		intPart= (int) num;
		
		return(num-intPart);
	
	
		
	}
	static int roundNum(double num)
	{
	
		
		if(fracPart(num) >= 0.5)
		{
			return (int)(num+1);
			
		};
		return (int)(num);
		
		
	}

	
	
}
