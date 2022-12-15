
import java.util.Scanner;


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter worked hour:");
		
		int hour= in.nextInt();
		double salary;
		
		if(hour<=45)
		{
			salary=hour*9;
		}
		
		else {
			salary=220+(hour-45)*14;
			
		}
		
		System.out.println("Amount of the salary to be paid: "+salary+"$");

	}

}
