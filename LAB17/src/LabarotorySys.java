import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LabarotorySys {

	public static ArrayList<Laboratory> arr = new ArrayList<>();
	public static int  size = 0;
	
	public static void readTxt(String fileInput) throws FileNotFoundException  {
		
		File file = new File(fileInput);
		Scanner input = null;
		Laboratory lab = null;
		String[] line;
		 //public Laboratory(String labName, String labMaintainer, int size, int renewYear)
		if(!file.exists()) {
			System.out.println("File does not exists!");
		}
		else {
			input = new Scanner(file);
			while(input.hasNext()) {
				
				line =input.nextLine().split(" ");
				lab = new Laboratory(line[0],line[3]+ " " +line[4],Integer.parseInt(line[1]),Integer.parseInt(line[2]));
			    arr.add(lab);
			    size++;
					
			    
			}
		}
		input.close();	
		
	}
	
	public static boolean addLaboratory(Laboratory lab) {
		
		for(Laboratory obj  : arr ) {
			if(obj.findLabName(lab.getLabName()))
				return false;
		}
		
		arr.add(lab);
		size++;
		return true;
		
	}
	
	public static Laboratory searchLaboratory(String labName)
	{
		
		for(Laboratory obj : arr) {
			if(obj.getLabName().equalsIgnoreCase(labName))
				return obj;
			
		}
		
		return null;
	}
	
	public static String display() {
		String res = ""; 
		for(Laboratory obj : arr) {
			res += obj.toString() + "\n";			
		}
		return res;
		
		
		
	}
	public static String[] getLabNames() {
		String []  res =  new String[size]; 
		int count = 0;
		for(Laboratory obj : arr) {
			res[count] =  obj.getLabName() + "\n";		
			count++;
		}
		return res;
		
		
	}

	public static ArrayList<Laboratory> getArr() {
		return arr;
	}

	
	
	
	
}
