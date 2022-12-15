import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareLicense extends License {
	private String version;
	private int validtyDuration;
	private ArrayList<OperatingSystem> validOpsSys = new ArrayList<>();
	
	public SoftwareLicense() {}
	
	public SoftwareLicense(String version, int validtyDuration, ArrayList<OperatingSystem> validOpsSys) {
		super();
		this.version = version;
		this.validtyDuration = validtyDuration;
		this.validOpsSys = validOpsSys;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getValidtyDuration() {
		return validtyDuration;
	}

	public void setValidtyDuration(int validtyDuration) {
		this.validtyDuration = validtyDuration;
	}

	public ArrayList<OperatingSystem> getValidOpsSys() {
		return validOpsSys;
	}

	public void setValidOpsSys(ArrayList<OperatingSystem> validOpsSys) {
		this.validOpsSys = validOpsSys;
	}
	
	
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		int count;
		
		super.getInput();
		System.out.println("Enter version(v1/v2):");
		version = sc.nextLine();
		
		System.out.println("Enter validity duraiton:");
		validtyDuration = sc.nextInt();
		
		System.out.println("How many operating systyem will you add:");
		count = sc.nextInt();
		OperatingSystem obj;
		for(int i = 0; i < count ; i++) {
			
			obj = new OperatingSystem();
			obj.getInput();
			validOpsSys.add(obj);
			
			
		}
		
	
	}
	
	public String toString() {
		
		String arrayContent = "";
		
		for (OperatingSystem obj : validOpsSys) {
			arrayContent += obj.toString();
		}
		
		return super.toString()+ "\nVersion = " + version + "\nValidty Duration = " + validtyDuration + "\n  Valid Operating Systems:\n" + arrayContent ;
		
		
	}
	
	
	
	

}
