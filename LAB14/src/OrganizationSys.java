import java.util.ArrayList;
import java.util.Scanner;

public class OrganizationSys {

	public static ArrayList<Organization> org = new ArrayList<>();
	
		public static boolean checkId(int id){
			for( Organization obj : org ) {
				if( obj.getOrganizationId() == id) {
					return true;
					
				}
			
		}
		return false;
		
	}
		
		public static void addOrganization(){
			
			Organization event;
			Scanner sc = new Scanner(System.in);
			String check;
			do {
			event =  new Organization();
			System.out.println("\n\nDo you want to add an organization (Y/N):");
			
			check = sc.nextLine();
			
			if(check.equalsIgnoreCase("Y")) {

			System.out.println("Enter the organization Id:");
			
			int id = sc.nextInt();
		
			while(checkId(id)){
				
				System.out.println("Enter the organization Id:");
				id = sc.nextInt();
				
			}
			event.setOrganizationId(id);
			event.getInput();
			org.add(event);
			}
			sc.skip("\\R");
			}while(check.equalsIgnoreCase("Y"));
			
			
			
			
			
		}
		
		public static boolean remove(int id) {
			
			for( Organization obj : org) {
				if( obj.getOrganizationId() == id) {
					org.remove(obj);
					return true;
					
				}
			}
			return false;
			
		}
		
		public static void calculatePrice() {
			Scanner sc = new Scanner(System.in);
			int i = 1;
			for(Organization obj : org) {
				System.out.println("Enter hourly price of " + i + ". organization:");
				i++;
				obj.calculate(sc.nextDouble());
				
			}
			
		}
		
		public static String display() {
			
			String res = "";
			for(Organization obj : org) {
				res += obj.toString();
				
			}
			
			return res;
			
		}
		
		
		
		
}
