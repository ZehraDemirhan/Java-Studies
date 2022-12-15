import java.util.ArrayList;
import java.util.Scanner;

public class LicenceSys {
private static ArrayList<License> arr = new ArrayList<>();
	
	public static boolean isLicenseExists(int id) {
		for(License obj : arr) {
			if(obj.id == id)
				return true;
		
		}
		return false;
		
	}
	
	public static void addDriverLicense() {
		
		
			
			
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
	

}
