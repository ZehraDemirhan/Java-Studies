import java.util.Scanner;

public class OperatingSystem {
	private String name;
	private String version;
	
	public OperatingSystem(){};
	
	public OperatingSystem(String name, String version) {
		
		this.name = name;
		this.version = version;
	}
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name:");
		name = sc.nextLine();
		
		System.out.println("Enter version");
		version = sc.nextLine();
		
		
		
	}

	@Override
	public String toString() {
		return "OperatingSystem \nname = " + name + "\nVersion = " + version ;
	}
	
	
	
	

}
