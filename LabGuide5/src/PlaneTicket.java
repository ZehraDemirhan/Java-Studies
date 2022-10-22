
public class PlaneTicket {

	String companyName, passengerName, flightDay;
	int passengerAge, flightNb ;
	double price;
	
	
	PlaneTicket()
	{
		companyName = "No Company Name";
		passengerName = "No Passenger Name";
		passengerAge = 0;
		flightNb = 0;
		flightDay = "No flight Day";
		price = 0;
		
	}
	
	PlaneTicket(String inputCompanyName, String InputPassengerName ,int inputAge , int inputNb ,String inputDay , double inputPrice )
	{
		companyName = inputCompanyName;
		passengerName = InputPassengerName;
		passengerAge = inputAge;
		flightNb = inputNb;
		flightDay = inputDay;
		price = inputPrice;
		
		
		
	}
	
	void display()
	{
		System.out.println("Plane Ticket\r\n"
				+ "Company Name = No" + this.companyName + "\n"
				+ "Passenger Name = " + this.passengerName + "\n"
				+ "Passenger Age = " + this.passengerAge + "\n"
				+ "Flight Nb = " + this.flightNb + "\n"
				+ "Flight Day = " + this.flightDay + "\n"
				+ "Price = " + this.price  + "\n"
				+ "");
		
	}
	
	void calculateDiscountedPrice(int age)
	{
		if (age > 60)
		{
			this.price = this.price- this.price*30/100;
			
		}
		else if(age <3)
		{
			this.price = this.price- this.price*75/100;
		}
	}
	
	void calculateBonusDiscount(String day)
	{
		if (day.equals("Tuesday") || day.equals("Thursday" ))
		{
			this.price = this.price- this.price*10/100;
		}
		
	}
	
	
}
