import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CandidateSys {
	
	private static ArrayList<Candidate> candidateArray = new ArrayList<>();
	
	
	public static void readCurrentCandidates(String filename) throws FileNotFoundException //reads the data from the file
	{
		File candidatesToRead = new File(filename);
		Scanner fileScanner = new Scanner(candidatesToRead);
		while(fileScanner.hasNext()) {
			String[] content = fileScanner.nextLine().split("%");
			candidateArray.add(new Candidate(content[0], Integer.parseInt(content[1]), Integer.parseInt(content[2])));
		}
		fileScanner.close();
		
	}
	public static void addCandidate(String name, int id) {
		for(Candidate obj : candidateArray) {
			if(obj.checkId(id))
				return;
		}
		Candidate newObj =  new Candidate(name,id);
		candidateArray.add(newObj);
		
	}
	public static boolean removeCandidate(int id)
	{
		for(Candidate obj : candidateArray) {
			if(obj.checkId(id)) {
				candidateArray.remove(obj);
				return true;
			}
			
			
		}
		return false;
		
	}
	
	public static Candidate searchCandidate(int id) {
		for(Candidate obj : candidateArray) {
			if(obj.checkId(id))
				return obj;
			
		}
		return null;
	}
	
	public static boolean updateCandidate(String name , int id , int score ){
		for(Candidate obj : candidateArray) {
			if(obj.checkId(id)) {
				obj.setId(id);
				obj.setScore(score);
				obj.setName(name);
				return true;
				
			}
			
		}
		return false;
		
	}
	
	public static String displayCandidates(){
		String res  = "";
		for(Candidate obj : candidateArray) {
			res+= obj.toString();
			
		}
		return res;
		
	}
	
	public  static int calculateScore(int id) {
		
		for(Candidate obj : candidateArray) {
			int score = 0;
			if(obj.checkId(id)){
				for(int[] arr : obj.getCandidateActivity().values()) {
					score += arr[1];
				}
				return score;
			}
		
			
		}
		return -1;		
	}
	
	public static void saveChanges(String filename) throws FileNotFoundException {//Writes data to file
		PrintWriter pw = new PrintWriter(filename);

		for(Candidate obj : candidateArray) {
			pw.print(obj.formtoWriteToFile());
		
		}	
	}
	
	

}
