
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrayList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Enter number (0 to stop):");
		num = scanner.nextInt();		
		
		while(num !=0 )
		{
			arrayList.addInteger(num);
			System.out.println("Enter number (0 to stop):");
			num = scanner.nextInt();		
			
		}
		
		
		System.out.println("Popped number:" + arrayList.pop());
		System.out.println("\n");
		System.out.println("Popped number:" + arrayList.pop());
		System.out.println("\n");
		System.out.println("Popped number:" + arrayList.pop());
		System.out.println("\n");
		
	
		
		System.out.println("\n Current Array: " + arrayList.toString());
		
		
		System.out.println("Removed element : " + arrayList.remove(2));
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList.remove(2));
		System.out.println(arrayList.remove(3));
		
		arrayList.insert(3,123);
		System.out.println(arrayList.toString());
		System.out.println(arrayList.findElementbyIndex(10));
		System.out.println(arrayList.find(123));
	
		
		scanner.close();
		
	}

}
