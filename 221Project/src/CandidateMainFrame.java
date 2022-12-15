import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CandidateMainFrame extends JFrame {
	
	QuizMainFrame quizMainFrameReferance = null;//going up
	CandidateCtegoriesFrame categoryFrame = new CandidateCtegoriesFrame(this); //going down
	
	private JPanel contentPane;
	private JTextField textField;
	private JButton back;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public CandidateMainFrame(QuizMainFrame fr) {
		quizMainFrameReferance =  fr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to QUIZZY Pick a Nickname:");
		lblNewLabel.setBounds(113, 63, 217, 62);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
	
		textField.setBounds(127, 154, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		back = new JButton("Back");
	
		back.setBounds(10, 227, 89, 23);
		contentPane.add(back);
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				categoryFrame.setVisible(true);
				dispose();
				
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quizMainFrameReferance.setVisible(true);
				dispose();
			}
		});
	}
}
