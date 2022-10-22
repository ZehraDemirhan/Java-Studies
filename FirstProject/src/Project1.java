
//the program contains the main method and the max method in the example
//the main method is just like any other method except that is involved by the JVM to start the program
import java.util.Scanner;
public class Project1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		
		double radius,area;
		
		//an already existing constant
	//	final double PI=3.1416;
		
		//create a scanner object 
		
		Scanner input= new Scanner(System.in);
		
		//prompt the user to enter an input
		
		System.out.println("Enter a number for radius:");
		radius=input.nextDouble();
		
		//compute the area;
		
		area=radius*radius*Math.PI;
		
		//display the result
		System.out.println("The area of the circle is: "+area);
		
		
		
		
	

	}

}
