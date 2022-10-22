import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		int filledBefore=0;
		int size=10;
		int[] array = new int[10];
		do
		{
			choice = menu();
			
			switch(choice)
			{
			case 1:
			    initialize(array);
			    System.out.println("All elements are initialized with zero");
				break;
				
			case 2:
				if(filledBefore != 1)
				{
				size = fillArray(array,scanner);
				filledBefore = 1;
				
				}
				break;
				
			case 3:
				displayArray(array, size);
				break;
				
			case 4:
				int value;
				System.out.println("Enter the value will be searched:");
				value = scanner.nextInt();
				int index;
				index = findPos(array, size ,value);
				if (index == -1)
				{
					System.out.println("The array does NOT contain the number!");
					
				}
				else {
					System.out.println("Position of the value is: " + index);
				}
				
				
			default:
				System.out.println("\nExited!");
				
				
				
				
				
			
			
			
			
			}
			
			
		}while(choice != 5);
		

	}
	
	static int menu()
	{
		Scanner scanner = new  Scanner(System.in);
		int[] array = new int[10];

		System.out.println(" \nMENU\r\n"
				+ "1. Initialize array\r\n"
				+ "2. Input array elements\r\n"
				+ "3. Output array elements\r\n"
				+ "4. Search a value\r\n"
				+ "5. Exit program");
		
		int choice;
		
		do {
			
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			
			
		} while(choice>5 || choice <1);
		
		return(choice);
	
		
		
		
	}
	
	static void initialize (int[] array)
	{		
		for (int i = 0; i < 10; i++) {
			array[i] = 0;
		}
		 
	}
	
	static int fillArray(int[] array, Scanner scanner)
	{		
		int i = 0;
		int toFill;
	
		System.out.println("Enter the elements of the array:");
		do
		{
		
			toFill= scanner.nextInt();
			array[i]=toFill;
			
			i++;
			
		}while(toFill !=0 && i <10);
		
		
		return(i);
		
		
	}
	
	static void displayArray( int [] array, int size)
	{
		for (int i=0; i<size; i++)
		{
			System.out.printf("%d ",array[i]);
			
		}
		
		
	}
	
	static int findPos(int [] array, int size, int value)
	{
		for (int i=0 ; i <= size ; i++)
		{
			if(array[i]== value) 
			{
				return(i);
			}
		}
		return(-1);
		
	}
	
	
	
}
