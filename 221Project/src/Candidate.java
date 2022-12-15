import java.util.ArrayList;
import java.util.HashMap;

public class Candidate extends Person implements AuditLog {
	private String name;
	private int id, score;
	private static int SIZE = 2;
	private int[] importantSolved = new  int[SIZE];
	private HashMap<Question,int[]> candidateActivity = new HashMap<>();
	
	
	
	
	Candidate(){}
	
	public Candidate(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		
	}
	
	public Candidate(String name, int id, int score) {
		super();
		this.name = name;
		this.score = score;
		this.id = id;	
		
	}
	
	public boolean checkId(int id) {
		if(this.id == id)
			return true;
		return false;
		
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", id=" + id + ", score=" + score + ", candidateActivity="
				+ candidateActivity + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}


	public String getInfo()
	{
		return "In this area you can solve questions in 3 different categories\n"
				+ "Hard, Medium, Easy which have sub categories that icncludes 35 questions in total";
	}
	
	public String displayActivity(){
		String res = "";
		for (Question  question : candidateActivity.keySet()) {
			res += question.getQuestionText();
			
			if(candidateActivity.get(question)[0] == 1 ) 
				res += "Is important";
			else if(candidateActivity.get(question)[0] == 0)
				res += "Is not important";
			if(candidateActivity.get(question)[1] == 1)
				res+= "  and answered correct";
			else if(candidateActivity.get(question)[1] == 0)
				res += " and solved incorrect ";
			
		}
		
		return res;
		
	}

	public HashMap<Question, int[]> getCandidateActivity() {
		return candidateActivity;
	}

	public String formtoWriteToFile()
	{
		return this.name +"%"+ this.id + "%" + this.score + "%" + "\n";
		
	}
	
	
	
	

}
