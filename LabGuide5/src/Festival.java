
public class Festival {

	String FestivalName, type;
	double price;
	
	
	Festival ()
	{
		FestivalName = "No Festival Name";
		type = "No Type";
		price = 0;
		
		
	}
	
	Festival(String nameInput, String  typeInput, double priceInput )
	{
		
		FestivalName =  nameInput;
		type = typeInput;
		price = priceInput;
		
		
	}
	
	void display ()
	{
		
		System.out.println("\nFestival");
		System.out.println("Festival Name = " + this.FestivalName);
		System.out.println("Type = " + this.type);
		System.out.println("Price = " + this.price);
		
	}
	
	void calculateExtraPrice(String type)
	{
		if (Character.toUpperCase(type.charAt(0))=='C')
			this.price +=100;
		
		
	}
	

}
