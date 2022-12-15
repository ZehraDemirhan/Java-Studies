package studyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInfoFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField surnameField;
	ButtonGroup bt = new ButtonGroup();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInfoFrame frame = new StudentInfoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentInfoFrame() {
		setTitle("LG4  - Q2");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Name:");
		
		lblNewLabel.setBounds(25, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Surname:");
		lblNewLabel_1.setBounds(25, 48, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		nameField = new JTextField();
		nameField.setBounds(96, 20, 86, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		surnameField = new JTextField();
		surnameField.setBounds(106, 46, 58, 17);
		contentPane.add(surnameField);
		surnameField.setColumns(10);
		
		JButton submitbtn = new JButton("SUBMIT");
	
		submitbtn.setBounds(280, 19, 89, 23);
		contentPane.add(submitbtn);
		
		JLabel lblNewLabel_2 = new JLabel("Status:");
		lblNewLabel_2.setBounds(40, 108, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton allowed = new JRadioButton("Allowed");
		allowed.setBounds(133, 104, 109, 23);
		allowed.setSelected(true);
		bt.add(allowed);
		contentPane.add(allowed);
		
		JRadioButton notallowed = new JRadioButton("Not Allowed");
		notallowed.setBounds(280, 104, 109, 23);
		bt.add(notallowed);
		contentPane.add(notallowed);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 133, 339, 106);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 414, 250);
		panel.setBorder(new TitledBorder(null,"Student Information", TitledBorder.LEADING, TitledBorder.TOP,null,null));
		contentPane.add(panel);
		
		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String surname = surnameField.getText();
				boolean status = allowed.isSelected();
				textArea.setText("STUDENT INFORMATION\n************\n"+ name +" " + surname+ " is " + status);
				
			}
		});
	}
	
	
}
