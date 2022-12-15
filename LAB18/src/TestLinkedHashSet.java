import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Set<String> linkedSet = new LinkedHashSet<>();
		File file = new File("input.txt");
		Scanner fileScanner = new Scanner(file);
		while(fileScanner.hasNext()) {
			linkedSet.add(fileScanner.nextLine());
			
		}
	
		System.out.println(linkedSet);
		

	}
	
	

}
