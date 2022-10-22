
public class RadioMain_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Radio radioObject = new Radio();
		
		radioObject.initialize();
		
		System.out.println("\nName:" + radioObject.name);
		System.out.println("Type:" + radioObject.type);
		System.out.println("Frequency:" + radioObject.frequency);
	}

}
