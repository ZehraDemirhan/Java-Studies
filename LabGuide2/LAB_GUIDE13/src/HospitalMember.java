
public class HospitalMember {

	private int id;
	private String nameSurname;
	private String dept;
	
	
	public HospitalMember(int id, String nameSurname, String dept) {
		super();
		this.id = id;
		this.nameSurname = nameSurname;
		this.dept = dept;
	}
	
	public boolean findId(int id) {
		if(id == this.id)
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "HospitalMember\nid = " + id + "\nnameSurname = " + nameSurname + "\ndept = " + dept ;
		
		
	}
	
	
	
	
	
}

