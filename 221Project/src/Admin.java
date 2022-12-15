import java.util.HashMap;

public class Admin extends Person implements AuditLog {

	private static final int ADMIN_ID = 22003159;
	private static final String ADMIN_PASS = "1111";
	private HashMap<String,Candidate> adminActivity = new HashMap<>();
	
	Admin(){}

	public HashMap<String, Candidate> getAdminActivity() {
		return adminActivity;
	}

	public void setAdminActivity(HashMap<String, Candidate> adminActivity) {
		this.adminActivity = adminActivity;
	}

	public static int getAdminId() {
		return ADMIN_ID;
	}

	public static String getAdminPass() {
		return ADMIN_PASS;
	}

	@Override
	public String toString() {
		return "Admin [adminActivity=" + adminActivity + "]";
	}
	public String getInfo() {
		return "You entered as an admin now you can\n do Candidate addition, deletion,search ,\n update ,display opearations as the admin";
		
	}
	public String displayActivity() {
		String res = "";
		for(String obj : adminActivity.keySet()) {
			res+= obj + "\n" + adminActivity.get(obj) + "\n";
			
		}
		return res;
		
	}
}
