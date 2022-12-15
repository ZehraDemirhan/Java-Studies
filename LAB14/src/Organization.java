import java.util.Scanner;
public class Organization {
	private int organizationId;
	private String companyName;
	private String ownerName;
	private double price;
	private int duration;
	
	public Organization() {
		
	}
	
	
	public Organization(int organizationId, String companyName, String ownerName, double price, int duration) {
		super();
		this.organizationId = organizationId;
		this.companyName = companyName;
		this.ownerName = ownerName;
		this.price = price;
		this.duration = duration;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void calculate(double hourlyPrice) {
		price = duration * hourlyPrice / 60;
	}
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter company name:");
		companyName = sc.nextLine();
		
		
		System.out.println("Enter owner name:");
		ownerName = sc.nextLine();
		//sc.skip("\\R");
		
		System.out.println("Enter the organization duration:");
		duration = sc.nextInt();
		
		
	}


	@Override
	public String toString() {
		return "Organization [organizationId=" + organizationId + ", companyName=" + companyName + ", ownerName="
				+ ownerName + ", price=" + price + ", duration=" + duration + "]";
	}
	
	
}
