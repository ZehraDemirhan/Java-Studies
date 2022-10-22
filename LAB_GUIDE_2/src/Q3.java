
import java.util.Scanner;
import java.lang.*;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = input.nextInt();
		final double price=109.99;
		
	
		System.out.println("Disabilty?");
		
		char disabilty=input.next().charAt(0);
		
		double ticketPayment;
		
		switch(disabilty)
		{
		case 'y':
			ticketPayment=price-(price*34/100);
			if(age<=12)
				ticketPayment=ticketPayment-(ticketPayment*12/100);
			
			else if(age >=65)
				ticketPayment=ticketPayment-(ticketPayment*25/100);
			System.out.println("Ticket payment: "+ticketPayment+" TL");
			break;
			
		
			
		case 'n':
			ticketPayment=price;
			if(age<=12)
				ticketPayment=ticketPayment-(ticketPayment*12/100);
			
			else if(age >=65)
				ticketPayment=ticketPayment-(ticketPayment*25/100);
			System.out.println("Ticket payment: "+ticketPayment+" TL");
			
			break;
			
			
			
		
		default:System.out.println("Invalid answer!");
		
		  System.exit(0);
		
		}
		
		System.out.println("Enter baggage weight:");
		double baggage= input.nextDouble();
		if(baggage>25)
			System.out.println("Your baggage weight exceeds the limit with "+(baggage-25)+"kg, \nplease pay "+(baggage-25)*12);
		
		else 
			System.out.println("No need for extra payment for baggage");
		
		
		
		

	}

}
