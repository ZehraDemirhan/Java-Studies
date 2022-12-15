import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchFrame extends JFrame {

	private JPanel contentPane;
	LabFrame fr =  null;
	public JComboBox comboBox;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public SearchFrame(LabFrame frame) {
		fr =  frame;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lab Name:");
		lblNewLabel.setBounds(32, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setBounds(116, 28, 68, 22);
		contentPane.add(comboBox);
		
		
		JButton search = new JButton("Search");
	
		search.setBounds(222, 28, 89, 23);
		contentPane.add(search);
		
		JButton close = new JButton("Close");
		
		close.setBounds(321, 28, 89, 23);
		contentPane.add(close);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 83, 357, 167);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Laboratory obj = LabarotorySys.searchLaboratory((String)comboBox.getSelectedItem());
			
			textArea.setText(obj.toString());
				
				
			}
		});
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	
	
}
