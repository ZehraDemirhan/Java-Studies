import java.util.Scanner;

public class OrganizationMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		OrganizationSys.addOrganization();
		
		System.out.println("Here is the list of  Organizations");
		System.out.println(OrganizationSys.display());
		
		
		System.out.println("Calculate and display the price of all Organizations: ");
		OrganizationSys.calculatePrice();
		System.out.println(OrganizationSys.display());
		
		System.out.println("Enter id to delete");
		OrganizationSys.remove(sc.nextInt());
		
		System.out.println(OrganizationSys.display());
		
		
		
		
		

	}

}
