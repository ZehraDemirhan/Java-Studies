import java.util.Scanner;

public class FestivalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many festival do you want to join:");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++)
		{
			FestivalSys.addFestival();
			
		}
		
		System.out.println("All festivals are added!");
		
		System.out.println("Enter Festival Name to search:");
		sc.skip("\\R");
		System.out.println(FestivalSys.getSelectedFestival(sc.nextLine()));
		
		System.out.println("Enter Festival Name to delete: ");
		FestivalSys.removeFestival(sc.nextLine());
		
		System.out.println(FestivalSys.getAllFestival());
		
		
		
		
	}

}
