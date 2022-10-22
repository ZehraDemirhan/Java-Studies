
public class FestivalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Festival object1 = new Festival();
		Festival object2 = new Festival("Jazz Festival","C",200.5);
		Festival object3 = new Festival("Coffee Festival","O", 40.6);
		
		
		
		object1.display();
		object2.display();
		object3.display();
		
		
		object2.calculateExtraPrice(object2.type);
		object3.calculateExtraPrice(object3.type);
		
		System.out.println("\nPrice of festival after adding extra prices – if any:\r\n"
			 );
		System.out.println(object2.FestivalName + " costs " + object2.price);
		System.out.println(object3.FestivalName + " costs " + object3.price);

	}

}
