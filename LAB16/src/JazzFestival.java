import java.util.Scanner;

public class JazzFestival extends Festival implements FestivalInterface {

	private String musician;
	
	
	JazzFestival(){}
	
	public void getInput() {
		Scanner sc  =  new Scanner(System.in);
		super.getInput();
		System.out.println("Enter Musician:");
		musician = sc.nextLine();
		//addVat();
		
		
	}
	
	public void addVat() {
		ticketPrice = ticketPrice +  ticketPrice*25/100;
	}

	@Override
	public String toString() {
		return super.toString()+  "\nmusician = " + musician ;
	}
	
	public double getSale() {
		if(place.equalsIgnoreCase("Edremit"))
			return 12;
		return 7;
		
	}
	
	
}
