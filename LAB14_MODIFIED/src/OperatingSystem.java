
public class OperatingSystem {

	private String name;
	private String version;
	
	public OperatingSystem(){};
	
	public OperatingSystem(String name, String version) {
		
		this.name = name;
		this.version = version;
	}
	
	
	@Override
	public String toString() {
		return "OperatingSystem \nname = " + name + "\nVersion = " + version ;
	}
	
}
