import java.util.Scanner;

public class DriverLicense extends License{
	
	private String type;
	private double testScore ;
	
	public DriverLicense() {}
	
	public DriverLicense(String type, double testScore) {
		super();
		this.type = type;
		this.testScore = testScore;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTestScore() {
		return testScore;
	}

	public void setTestScore(double testScore) {
		this.testScore = testScore;
	}
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		
		super.getInput();
		
		System.out.println("Enter license type:");
		type = sc.nextLine();
		
		System.out.println("Enter the test score:");
		testScore = sc.nextDouble();
		
		
	}

	@Override
	public String toString() {
		return "DriverLicense " + super.toString() + "\nType = " + type + "\nTest Score = " + testScore ;
	}
	
	
	
	
	
	

}
