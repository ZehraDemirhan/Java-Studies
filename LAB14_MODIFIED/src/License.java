
public abstract class License {

	protected int id;
	protected  String nameSurname ;
	protected  String institution;
	protected double fee;
	
	
public License(){
		
	}
	
	public License(int id, String nameSurname, String institution) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.institution = institution;
		
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
	
	
	public String toString() {
		return "id = " + id + "\nName Surname = " + nameSurname + "\nInstitution = " + institution + "\nFee = " + fee;
	}
	
	public abstract void calculateCost();
}
