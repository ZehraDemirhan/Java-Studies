import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CandidateTypesFrame extends JFrame {

	private JPanel contentPane;
	public ArrayList<Category> LocalcategoryObjects  = new ArrayList<>();
	CandidateCtegoriesFrame categoryFrameReferance =  null;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public CandidateTypesFrame(CandidateCtegoriesFrame fr) {
		categoryFrameReferance  = fr;
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Category Types");
		lblNewLabel.setBounds(0, 0, 0, 0);
		contentPane.add(lblNewLabel);
		
		JButton back = new JButton("Back");
	
		back.setBounds(10, 227, 89, 23);
		contentPane.add(back);
		
		JLabel debug = new JLabel("");
		debug.setBounds(136, 231, 232, 14);
		contentPane.add(debug);
		debug.setText(LocalcategoryObjects.size()+"");
		
		//JButton[] buttonArray = new JButton[LocalcategoryObjects.size()];
		
		for(int i = 0; i< LocalcategoryObjects.size() ; i++) {
		System.out.println("here");
		contentPane.add( new JButton(LocalcategoryObjects.get(i).getCategoryType()));
		
		}
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				categoryFrameReferance.setVisible(true);
				dispose();
				
			}
		});
		
	}

	public ArrayList<Category> getLocalcategoryObjects() {
		return LocalcategoryObjects;
	}

	public void setLocalcategoryObjects(ArrayList<Category> localcategoryObjects) {
		LocalcategoryObjects = localcategoryObjects;
	}
}
