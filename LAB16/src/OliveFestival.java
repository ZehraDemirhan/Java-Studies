import java.util.Scanner;

public class OliveFestival extends Festival implements FestivalInterface {
	private String programCoordinator;
	
	OliveFestival(){}
	public void getInput() {
		Scanner sc  =  new Scanner(System.in);
		super.getInput();
		System.out.println("Enter Program Coordinator:");
		programCoordinator = sc.nextLine();
		
		
	}
	
	public void addVat() {
		ticketPrice = ticketPrice +  ticketPrice*8/100;
	}
	
	public double getSale() {
		if(place.equalsIgnoreCase("Wynton Marsalis"))
			return 50;
		return 25;
		
	}
}
