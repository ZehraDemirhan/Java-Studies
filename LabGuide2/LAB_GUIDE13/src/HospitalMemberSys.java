import java.util.ArrayList;

public class HospitalMemberSys {

	private static ArrayList<HospitalMember> hm  = new ArrayList<>();
	
	public static boolean checkId(int id) {
		for (HospitalMember obj : hm) {
			if(obj.findId(id))
				return true;
			
		}
		return false;
	
	}
	
	public static boolean addHospitalMember(int id, String name, String dept) {
		
		if(checkId(id))
			return false;
		HospitalMember obj = new HospitalMember(id,name,dept);
		hm.add(obj);
		return true;
		
		
	}
	
	public static String display() {
		String result = "";
		
		for(HospitalMember obj : hm) {
			result += obj.toString();
		}
		
		return result;
	}
	
	public static ArrayList<HospitalMember> getHm(){
		return hm;
	}
	
}
