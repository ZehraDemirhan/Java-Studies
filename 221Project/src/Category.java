import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Category {
	
	private String CategoryLevel, CategoryType,CategoryName;
	private ArrayList<Question> questions ;
	private static final int QUESTION_COUNT = 5;
	private static int  CategoryCount = 0;
	
	Category(){}

	public Category(String categoryLevel, String categoryType, String categoryName, ArrayList<Question> questions) {
		super();
		CategoryLevel = categoryLevel;
		CategoryType = categoryType;
		CategoryName = categoryName;
		this.questions = questions;
	}

	public String getCategoryLevel() {
		return CategoryLevel;
	}

	public void setCategoryLevel(String categoryLevel) {
		CategoryLevel = categoryLevel;
	}

	public String getCategoryType() {
		return CategoryType;
	}

	public void setCategoryType(String categoryType) {
		CategoryType = categoryType;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	
	public void readFromFile(String filename) throws IOException {
		
		  questions = new ArrayList<>();
		  String line = Files.readAllLines(Paths.get(filename)).get(CategoryCount);
		  String[] categoryContent = line.split(",");
			
			this.CategoryLevel = categoryContent[0];
			this.CategoryType = categoryContent[1];
			this.CategoryName = categoryContent[2];
			
			for(int i = 0; i < QUESTION_COUNT; i++) {
				Question question = new Question();
				question.readFromFile("questions.txt");
				questions.add(question);
			
				//System.out.println(question.toString());
			}
			CategoryCount++;
			//System.out.println(this.toString());
	
			
			
		
		}

	@Override
	public String toString() {
		return "Category [CategoryLevel=" + CategoryLevel + ", CategoryType=" + CategoryType + ", CategoryName="
				+ CategoryName + ", questions=" + questions + "]";
	}
		
		
	

	

	

	
	
	
	

}
