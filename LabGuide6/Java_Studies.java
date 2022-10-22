
public class Radioc {

	private String name, type;
	 private double frequency;
	
	Radioc()
	{
		name = "Pal Fm";
		type = "Nostalgia";
		frequency = 92.4 ;
		
	}
	
	Radioc (String nameInput)
	{
		name = nameInput;
	}
	

	Radioc (String nameInput , double frequencyInput)
	{
		name = nameInput;
		frequency = frequencyInput;
	}
	
	
	
	 Radioc(String nameInput, String typeInput , double frequencyInput)
	{
	
		name = nameInput;
		type = typeInput;
		frequency = frequencyInput;
		
		
	}
	
	 void display(){
		 System.out.println("Name: " + this.name);
		 System.out.println("Frequency: " + this.frequency);
		 System.out.println("Type: " + this.type);
		 
		
		 
		 
	 }
	
	 
	 double getFrequency()
	 {
		 return this.frequency;
				 
	 }
	 
	 
	 void setFrequecny(double toSet)
	 {
		 frequency = toSet;
		 
	 }
	 
	
	
	
}