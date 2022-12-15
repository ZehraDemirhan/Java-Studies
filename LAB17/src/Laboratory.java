
public class Laboratory {

	private String labName, labMaintainer;
	private int size, renewYear;
	
	public Laboratory(String labName, String labMaintainer, int size, int renewYear) {
		super();
		this.labName = labName;
		this.labMaintainer = labMaintainer;
		this.size = size;
		this.renewYear = renewYear;
	}

	public boolean findLabName(String name) {
		if(this.labName.equalsIgnoreCase(name))
			return true;
		return false;
		
		
	}
	
	@Override
	public String toString() {
		return "Laboratory \nlabName = " + labName + "\nlabMaintainer = " +labMaintainer + "\nsize = " + size + "\nrenewYear = "
				+ renewYear + "\n" ;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLabMaintainer() {
		return labMaintainer;
	}

	public void setLabMaintainer(String labMaintainer) {
		this.labMaintainer = labMaintainer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getRenewYear() {
		return renewYear;
	}

	public void setRenewYear(int renewYear) {
		this.renewYear = renewYear;
	}
	
	
	
}
