import java.util.Scanner;
public class License {
	protected int id;
	protected  String nameSurname ;
	protected  String institution;
	protected double fee;

	public License(){
		
	}
	
	public License(int id, String nameSurname, String institution, double fee) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.institution = institution;
		this.fee = fee;
	}
	
	public boolean checkId(int id) {
		
		if(this.id == id)
			return true;
		return false;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id:");
		
		id = sc.nextInt();
		
		System.out.println("Enter the name surname:");
		nameSurname = sc.nextLine();
		
		System.out.println("Enter the institution:");
		institution = sc.nextLine();
		
	}

	@Override
	public String toString() {
		return "id = " + id + "\nName Surname = " + nameSurname + "\nInstitution = " + institution + "\nFee = " + fee;
	}
	
	
	
	
	
	
	

}
