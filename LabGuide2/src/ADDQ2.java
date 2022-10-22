
import java.util.Scanner;

public class ADDQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Fahrenheit Equivalent from 0 to 50 Celsius");
		
		System.out.println("Degrees in Celsius Degrees in Fahrenheit\r\n"
				+ "------------------------------------------------");
		
		for ( int i=0;i<=50;i+=5)
		{
			System.out.printf("%2d    %.2f ",i,convertToFahrenheit(i));
			System.out.println();
			
			
			
		}
		
		System.out.println("\nCelsius Equivalent from 32 to 140 Fahrenheit");
		
		System.out.println("Degrees in Fahrenheit Degrees in Celsius\r\n"
				+ "------------------------------------------------\r\n"
				+ "");
		

		for ( int i=32;i<=140;i+=18)
		{
			System.out.printf("%3d    %3.2f ",i,convertToCelcius(i));
			System.out.println();
			
			
			
		}
		
		
		
	}
	
	static double convertToCelcius(double fahrenheit) {
		
		return ((fahrenheit-32)*5/9);
		
		
	}
	
	static double convertToFahrenheit(double celcius) {
		
		return (9*celcius/5+32);
		
		
	}
	

}
