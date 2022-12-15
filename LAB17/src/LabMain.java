import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LabMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String labName = "labs.txt";
		String name, LabMaintainer;
		int size, renewYear;
		
		try {
		LabarotorySys.readTxt(labName);
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found");
		}
		
		System.out.println(LabarotorySys.display());
		
		
		//LabarotorySys.display();
		
		System.out.println("Want to add new lab ? ");
		if(sc.nextLine().equalsIgnoreCase("y")){
			System.out.println("Enter the name of the lab:");
			name = sc.nextLine();
			
			System.out.println("Enter the size of the lab:");
			size = sc.nextInt();
			
			System.out.println("Enter the renew year:");
			renewYear = sc.nextInt();
			
			sc.skip("\\R");
			
			System.out.println("Enter the Laboratory maintainer: ");
			LabMaintainer = sc.nextLine();
			
			Laboratory lab = new Laboratory(name, LabMaintainer, size , renewYear);
			if(LabarotorySys.addLaboratory(lab)) {
				System.out.println("The laboratory added to the system");
			}
			
		
			
		}
		
		System.out.println(LabarotorySys.getLabNames());

		System.out.println("Enter a Laboratory name to search");
		
		Laboratory search = LabarotorySys.searchLaboratory(sc.nextLine());
		System.out.println(search.toString());
		
		
	}

}
