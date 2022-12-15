import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddFrame extends JFrame {

	
	private JPanel contentPane;
	LabFrame fr = null;
	private JTextField labName;
	private JTextField size;
	private JTextField renewYear;
	private JTextField maintainer;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public AddFrame(LabFrame frame) {
		
		fr =  frame;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton add = new JButton("Add");
		
		add.setBounds(29, 235, 89, 23);
		contentPane.add(add);
		
		JButton close = new JButton("Close");
		
		close.setBounds(173, 235, 89, 23);
		contentPane.add(close);
		
		labName = new JTextField();
		labName.setBounds(134, 30, 128, 20);
		contentPane.add(labName);
		labName.setColumns(10);
		
		size = new JTextField();
		size.setBounds(134, 76, 128, 20);
		contentPane.add(size);
		size.setColumns(10);
		
		renewYear = new JTextField();
		renewYear.setBounds(134, 123, 128, 20);
		contentPane.add(renewYear);
		renewYear.setColumns(10);
		
		maintainer = new JTextField();
		maintainer.setBounds(134, 177, 128, 20);
		contentPane.add(maintainer);
		maintainer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Lab Name:");
		lblNewLabel.setBounds(29, 33, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Size:");
		lblNewLabel_1.setBounds(29, 79, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Renew Year:");
		lblNewLabel_2.setBounds(29, 126, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lab Maintainer:");
		lblNewLabel_3.setBounds(29, 180, 78, 14);
		contentPane.add(lblNewLabel_3);
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Laboratory lab = new Laboratory(labName.getText(), maintainer.getText(),Integer.parseInt(size.getText()), Integer.parseInt(renewYear.getText()));
				LabarotorySys.addLaboratory(lab);
			}
		});
	}
}
