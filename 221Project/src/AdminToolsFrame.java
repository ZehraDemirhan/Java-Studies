import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AdminToolsFrame extends JFrame {

	private JPanel contentPane;
	AdminMainFrame mainFrameReference = null; //Going Up 
	AdminInfoFrame adminInfo = new AdminInfoFrame(this); //Going down

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public AdminToolsFrame(AdminMainFrame fr) {
		mainFrameReference = fr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back = new JButton("Back");
		
		back.setBounds(10, 381, 89, 23);
		contentPane.add(back);
		
		JButton addCandidate = new JButton("Add Candidate");
		addCandidate.setBounds(72, 51, 255, 23);
		contentPane.add(addCandidate);
		
		JButton removeCandidate = new JButton("Remove Candidate");
		removeCandidate.setBounds(72, 102, 252, 23);
		contentPane.add(removeCandidate);
		
		JButton searchCandidate = new JButton("Search Candidate");
		searchCandidate.setBounds(72, 164, 255, 23);
		contentPane.add(searchCandidate);
		
		JButton update = new JButton("Update Candidate");
		update.setBounds(73, 216, 254, 23);
		contentPane.add(update);
		
		JButton display = new JButton("Display Candidates");
		display.setBounds(72, 266, 255, 23);
		contentPane.add(display);
		
		JButton calculateScore = new JButton("Calculate Score");
		calculateScore.setBounds(72, 327, 255, 23);
		contentPane.add(calculateScore);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(388, 56, 279, 348);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton info = new JButton("Info");
		
		info.setBounds(243, 381, 89, 23);
		contentPane.add(info);
		
		JButton SaveChanges = new JButton("Save Changes");
		SaveChanges.setBounds(126, 445, 128, 23);
		contentPane.add(SaveChanges);
		
		JButton readCurrentCandidates = new JButton("Read Candidates");
		readCurrentCandidates.setBounds(10, 11, 89, 23);
		contentPane.add(readCurrentCandidates);
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrameReference.setVisible(true);
				dispose();
			}
		});
		
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Person adminObj = new Admin();
				adminInfo.getInfo().setText(adminObj.getInfo());
				adminInfo.setVisible(true);
				
				
				
			}
		});
	}
}
