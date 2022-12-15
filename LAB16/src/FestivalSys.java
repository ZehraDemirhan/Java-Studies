import java.util.ArrayList;
import java.util.Scanner;

public class FestivalSys {
	
	public static ArrayList<Festival> festList = new ArrayList<>();
	 
	public static void addFestival() {
		Scanner sc = new Scanner(System.in);
		String type;
		System.out.println("Enter type of festival:");
		type= sc.nextLine();
		
		
		
		if(type.equalsIgnoreCase("Jazz")) {
			
			JazzFestival jazzObj = new JazzFestival();
			jazzObj.getInput();
			jazzObj.addVat();
			//jazzObj.setTicketPrice(jazzObj.getTicketPrice() -  jazzObj.getSale()*jazzObj.getTicketPrice()/100);
			
			festList.add(jazzObj);
			
		}
		
		else if(type.equalsIgnoreCase("Olive")) {
			
			OliveFestival oliveObj = new OliveFestival();
			oliveObj.getInput();
			oliveObj.addVat();
			//oliveObj.setTicketPrice(oliveObj.getTicketPrice() -  oliveObj.getSale()*oliveObj.getTicketPrice()/100);
			festList.add(oliveObj);
			
			
		}
		
		
		
	}
	
	public static boolean removeFestival(String name) {
		
		for(Festival obj : festList) {
			if(obj.getName().equalsIgnoreCase(name))
			{	festList.remove(obj);
					return true;
					}
		}
		return false;
	}
	
	public static String getAllFestival() {
		
		String res = "" ;
		for(Festival obj : festList) {
			res += obj.toString();
		}
		return res;
	}
	
	public static String getSelectedFestival(String name) {
		for(Festival obj : festList) {
			if(obj.getName().equalsIgnoreCase(name))
			{	
					return "Sale = " + obj.getSale() + obj.toString();
			}
		}
		return "Does not exists" ;
		
		
	}
	
	

}
