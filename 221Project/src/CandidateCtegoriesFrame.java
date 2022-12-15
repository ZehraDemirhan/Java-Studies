import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CandidateCtegoriesFrame extends JFrame {

	private JPanel contentPane;
	CandidateMainFrame candidateMainFrameReferance = null; //going up
	ArrayList<Category> categoriesToSend = new ArrayList<>();
	CandidateTypesFrame typeFrame = new CandidateTypesFrame(this);//going down
	CandidateInfoFrame infoFrame = new CandidateInfoFrame(this); //going down

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public CandidateCtegoriesFrame(CandidateMainFrame fr) {
		
		candidateMainFrameReferance = fr;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Categories");
		lblNewLabel.setBounds(178, 30, 79, 14);
		contentPane.add(lblNewLabel);
		
		JButton Hard = new JButton("Hard");
	
		Hard.setBounds(168, 79, 89, 61);
		contentPane.add(Hard);
		
		JButton medium = new JButton("Medium");
		
		medium.setBounds(168, 161, 89, 61);
		contentPane.add(medium);
		
		JButton easy = new JButton("Easy");
	
		easy.setBounds(168, 249, 89, 56);
		contentPane.add(easy);
		
		JButton back = new JButton("Back");
		
		back.setBounds(10, 358, 89, 23);
		contentPane.add(back);
		
		JButton info = new JButton("Info");
	
		info.setBounds(322, 358, 89, 23);
		contentPane.add(info);
		
		Hard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Category obj : QuizMain.categoryArray) {
					System.out.println(obj.toString());
					if(obj.getCategoryLevel().equalsIgnoreCase("hard"))
						categoriesToSend.add(obj);
					
				}
				typeFrame.setLocalcategoryObjects(categoriesToSend);
			
				typeFrame.revalidate();
				typeFrame.repaint();
				
				typeFrame.setVisible(true);
				
			}
		});
		
		medium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Category obj : QuizMain.categoryArray) {
					if(obj.getCategoryLevel().equalsIgnoreCase("medium"))
						categoriesToSend.add(obj);
					
				}
				typeFrame.setLocalcategoryObjects(categoriesToSend);
				typeFrame.setVisible(true);
				
			
			}
		});
		
		easy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Category obj : QuizMain.categoryArray) {
					if(obj.getCategoryLevel().equalsIgnoreCase("easy"))
						categoriesToSend.add(obj);
					
				}
				typeFrame.setLocalcategoryObjects(categoriesToSend);
				typeFrame.setVisible(true);
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				candidateMainFrameReferance.setVisible(true);
				dispose();
			}
		});
		
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFrame.setVisible(true);
					
			}
		});
	}
}
