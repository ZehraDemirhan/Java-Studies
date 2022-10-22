
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		double avg;
		int[] array = new int[5];
		System.out.println("Enter 5 integer numbers:");
		
		double sum = 0 ;
		for(int i=0 ; i<5 ; i++ )
		{
			array[i] = scanner.nextInt();
			sum += array[i];
			
		}
		
		avg = sum /5 ;
		
		System.out.printf("Average of the numbers: %.2f ",avg );
		
		System.out.println("index number diff. to avg\r\n"
				+ "----- ------ ------------\n");
		
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.printf("%5d %5d %4.2f\n",i ,array[i], array[i]-avg);
			
		}
	}

}
