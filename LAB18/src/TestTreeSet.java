import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter CTIS courses:");
		Set<String> treeSet = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		String info ;
		do {
			info = sc.nextLine();
			treeSet.add(info);
				
		}while(!info.equalsIgnoreCase("STOP"));
		
		System.out.println(treeSet);

	}

}
