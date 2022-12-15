import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizMain {
	public static ArrayList<Category> categoryArray = new ArrayList<>();
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// TODO Auto-generated method stub
			
			QuizMainFrame mainFrame = new  QuizMainFrame();
			
			Category category = new Category();
			File fileToRead = new File("categories.txt");
			Scanner fileScanner = new Scanner(fileToRead);
			int i= 0;
			while(i != 2) {
			try {
				category.readFromFile("categories.txt");
				categoryArray.add(category);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			
			}
			
			System.out.println(categoryArray);
			mainFrame.setVisible(true);
			

	}

}
