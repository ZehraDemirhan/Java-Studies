
public class PlaneTicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlaneTicket ticket1 =  new PlaneTicket();
		PlaneTicket ticket2 = new PlaneTicket("Pegasus","Burcu Liman",2,1234543,"Monday", 123.5);
		PlaneTicket ticket3 = new PlaneTicket("Turkish Airlines","Ibrahim Usta"
				,65,643242,"Tuesday", 340.6);
		
		ticket1.display();
		ticket2.display();
		ticket3.display();
		
		ticket2.calculateDiscountedPrice(ticket2.passengerAge);
		ticket3.calculateDiscountedPrice(ticket3.passengerAge);
		
		ticket2.calculateBonusDiscount(ticket2.flightDay);
		ticket3.calculateBonusDiscount(ticket3.flightDay);
		
		System.out.println("Price of the flights after discounts  if any:");
		System.out.println("Flight nb with " + ticket2.flightNb + " should pay " + ticket2.price);
		;
		
		System.out.println("Flight nb with " + ticket3.flightNb + " should pay " + ticket3.price);
		;
		
	}

}
