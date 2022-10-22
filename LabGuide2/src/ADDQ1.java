import java.util.Scanner;
public class ADDQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int year = 2018;
		int firstDay ;
		for(int i = 0; i < 4; i++)
		{	
			System.out.println("Enter first day of year " + ( year + i ) + ":");
			firstDay = scanner.nextInt();
			
			drawCalendar(year+i , firstDay);
			
			
		}
		

	}
	
	static void drawCalendar(int year, int firstDay)
	{
		
		System.out.println("CALENDAR OF  JANUARY " + year );
		
		System.out.println("SUN MON TUE WED THU FRI SAT\r\n"
				+ "---------------------------");
	
	
		for(int i=0; i<firstDay-1 ;i++ )
			{
			
			System.out.print("    ");
			
			}
		
		for(int k = 1 ; k <= 31 ; k++ )
		{
			
			System.out.printf( "%3d ",k );
			if((k + firstDay - 1 ) % 7 == 0 )
				
			  {System.out.println("\n");}
			
		}	
		
		System.out.println("\n\n");
		
		
	}

}
