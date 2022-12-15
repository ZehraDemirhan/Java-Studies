import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question {

	private static final int  OPTION_SIZE = 3;
	private String questionText, questionAnswer;
	private String[] questionOptions =  new String[OPTION_SIZE];
	private static int  LineCount = 0;
	
	public Question(){};
	



	public void readFromFile(String filename) throws IOException {
		
		String line = Files.readAllLines(Paths.get(filename)).get(LineCount);
		String content[] = line.split(",");
		this.questionText = content[0];
		this.questionAnswer = content[1];
		this.questionOptions = content[2].split("%");
		LineCount++;
			
	}

	@Override
	public String toString() {
		String res = questionText + " ?\n";
		//for (String option : questionOptions)
		
		return res;
				
	}
	

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}


	
	public String[] getQuestionOptions() {
		return questionOptions;
	}

	
	
	
	
	
	
	
}
