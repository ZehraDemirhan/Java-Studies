
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int choice;
		int count=0;
		double total=0;
		boolean isExit=true;
		
		do {
			System.out.println("TRAFFIC PENALTY PAYMENTS\r\n"
					+ "------------------------\r\n"
					+ "1. Speed Limit Violation\r\n"
					+ "2. Red Light Violation\r\n"
					+ "3. Parking Violation\r\n"
					+ "4. EXIT");
			System.out.println("Enter the penalty article no:");
			choice=scanner.nextInt();
			int penalty;
		
			switch(choice)
			{
			case 1:
				penalty=598;
				break;
			case 2:
				penalty=314;
				break;
				
			case 3:
				penalty=144;
			
				break;
				
			case 4:
				isExit=false;
			default:
				penalty=0;
			
			}
			
			char deadline;
		
			if(isExit)
			
			{	System.out.println("Payment before deadline?");
			deadline=scanner.next().charAt(0);
			
			if(deadline=='y')
			{
				penalty = penalty- (penalty*25/100);
				
				count++;
				
				System.out.println("Payment amount: "+ penalty+" TL");
			}
		
			
				
				
				
		
			
			total+=penalty;
			}
			
			
		}while(choice!=4 && isExit);
		
		System.out.println("Peanlty totals "+total);
		System.out.println(count+" people paid the penalty before the deadline");
		
	}
	

}
