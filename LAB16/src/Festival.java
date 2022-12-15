import java.util.Scanner;

public abstract class Festival implements FestivalInterface {

	Scanner sc = new Scanner(System.in);
	protected String name, date, place;
	protected double ticketPrice;
	
	Festival(){}
	
	public void getInput() {
		
		System.out.println("Enter Festival Name:");
		name = sc.nextLine();
		
		System.out.println("Enter Festival Date:");
		date = sc.nextLine();
		
		System.out.println("Enter Festival Place:");
		place = sc.nextLine();
		
		System.out.println("Enter Festival Ticket Price:");
		ticketPrice = sc.nextDouble();
		
	}
	
	public String getName() {
		return name;
	}
	
	public abstract double getSale();

	@Override
	public String toString() {
		return "Festival\n name = " + name + "\ndate = " + date + "\nplace = " + place + "\nticketPrice = "
				+ ticketPrice ;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	
	
}
