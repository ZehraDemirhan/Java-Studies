import java.util.ArrayList;
import java.util.Scanner;

public class LicenseSys {
	
	private static ArrayList<License> arr = new ArrayList<>();
	
	public static boolean isLicenseExists(int id) {
		for(License obj : arr) {
			if(obj.id == id)
				return true;
		
		}
		return false;
		
	}
	
	public static void addLicense() {
		Scanner sc = new Scanner(System.in);
		String type;
		System.out.println("Which type of License do you want to take (Driver/Software/Stop)?");
		type = sc.nextLine();
		
		while(!type.equalsIgnoreCase("stop")){
			
			if(type.equalsIgnoreCase("Driver")) {
				DriverLicense license = new DriverLicense();
				license.getInput();
				if(!isLicenseExists(license.getId()))
				arr.add(license);
				else System.out.println("License Id already exists!!");
			}
			else if(type.equalsIgnoreCase("Software")) {
				SoftwareLicense license = new SoftwareLicense();
				license.getInput();
				if(!isLicenseExists(license.getId()))
				arr.add(license);
				else System.out.println("License Id already exists!!");
				
			}
			
			System.out.println("Which type of License do you want to take (Driver/Software/Stop)?");
			type = sc.nextLine();
			
			
		}
		
		
		
		
		
	}
	
	public static boolean removeLicense(int id) {
		
		for(License obj : arr) {
			if(obj.id == id) {
				arr.remove(obj);
				return true;
			}
			
		}
		return false;
		
		
	}
	
	public static License searchLicense(int id) {
	
		for(License obj : arr) {
			if(obj.id == id) {
				
				return obj;
			}
			
		}
		return null;
		
	}
	
	public static String  display(){
		String  content = "";
		
		for(License obj : arr) {
			content += obj.toString();
			
		}
		
		return content;
		
		
		
	}
	
	public static  void calculateFee() {
		
		for(License obj : arr) {
			if (obj instanceof DriverLicense) {
				switch(((DriverLicense) obj).getType()) {
				case "A" : obj.setFee(200);
				break;
				
				case "B" : obj.setFee(300);
				break;
				
				case "C" : obj.setFee(500);
				break;
				
				}
				if(((DriverLicense) obj).getTestScore() > 60)
					obj.setFee(obj.getFee()-obj.getFee()*7/100);
				
				
			}
			else if(obj instanceof SoftwareLicense) {
				switch(((SoftwareLicense) obj).getVersion()) {
				case "v1" : obj.setFee(200);
				break;
				
				case "v2" : obj.setFee(300);
				break;
				
				}
			}
			
		}
		
		
	}
	
	
	

}
