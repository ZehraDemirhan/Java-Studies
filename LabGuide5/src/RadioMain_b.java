
public class RadioMain_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Radiob r1 = new Radiob();
		 Radiob r2 = new Radiob("Power FM", "Pop", 104.8);
		 Radiob r3 = new Radiob("NRK", "Jazz", 82.5);
		 Radiob r4 = new Radiob("Joy FM", "Pop", 75.8);
		 
		 System.out.println("\nName: " + r2.name);
		 System.out.println("Frequency: " + r2.frequency);
		 System.out.println("Type: " + r2.type);
		 
		 
		 System.out.println("\nName: " + r3.name);
		 System.out.println("Frequency: " + r3.frequency);
		 System.out.println("Type: " + r3.type);
		 
		 
		 System.out.println("\nName: " + r4.name);
		 System.out.println("Frequency: " + r4.frequency);
		 System.out.println("Type: " + r4.type);
		 
		 

		 r1.frequency = 68.9;
		 System.out.println("\nThe new frequency of the radio object 1 is :" + r1.frequency);
		
		
	}

}
