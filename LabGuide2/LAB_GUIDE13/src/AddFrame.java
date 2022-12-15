import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddFrame extends JFrame {

	private JPanel contentPane;
	public JTextField idField;
	public JTextField nameField;
	public JTextField deptField;
	HospitalMemberFrame nf = null;
	JLabel pageNumber;
	//public JButton pageno;
	

	/**
	 * Launch the application.
	 */
	public void clean() {
		idField.setText("");
		nameField.setText("");
		deptField.setText("");
	}

	/**
	 * Create the frame.
	 */
	public AddFrame(HospitalMemberFrame fr , String name) {
		nf = fr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton addbtn = new JButton("Add");
	
		
		addbtn.setBounds(65, 216, 89, 23);
		contentPane.add(addbtn);
		
		JButton closebtn = new JButton("Close");
	
		closebtn.setBounds(252, 216, 89, 23);
		contentPane.add(closebtn);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(47, 33, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name Surname:");
		lblNewLabel_1.setBounds(47, 75, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dept:");
		lblNewLabel_2.setBounds(47, 136, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		idField = new JTextField();
		idField.setBounds(194, 30, 147, 20);
		contentPane.add(idField);
		idField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setBounds(194, 72, 147, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		deptField = new JTextField();
		deptField.setBounds(194, 133, 147, 20);
		contentPane.add(deptField);
		deptField.setColumns(10);
		
		JLabel message = new JLabel("New label");
		message.setBounds(47, 173, 294, 14);
		contentPane.add(message);
		message.setText("");
		
	    pageNumber = new JLabel("New label");
		pageNumber.setBounds(164, 236, 46, 14);
		contentPane.add(pageNumber);
		pageNumber.setText(name);
		
		
		
		
		
		
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HospitalMemberSys.checkId(Integer.parseInt(idField.getText())))
					message.setText("Cannot add!! Already Exists");
				else {
				HospitalMemberSys.addHospitalMember(Integer.parseInt(idField.getText()), nameField.getText(), deptField.getText());
				message.setText("Member Added");
				}
			}
		});
	
			
		
	
		
		closebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(true);
				dispose();
			}
			
		});
		
	}
}
		
