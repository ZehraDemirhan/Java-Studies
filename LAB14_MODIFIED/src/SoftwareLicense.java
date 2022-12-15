import java.util.ArrayList;

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
	
public String toString() {
		
		String arrayContent = "";
		
		for (OperatingSystem obj : validOpsSys) {
			arrayContent += obj.toString();
		}
		
		return super.toString()+ "\nVersion = " + version + "\nValidty Duration = " + validtyDuration + "\n  Valid Operating Systems:\n" + arrayContent ;
		
		
	}

public void calculateCost() {
	fee = validOpsSys.size() * 100;
	
	
	
}



}
