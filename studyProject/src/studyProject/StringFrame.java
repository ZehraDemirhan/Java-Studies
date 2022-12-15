package studyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StringFrame extends JFrame {

	private JPanel contentPane;
	private JTextField to;
	private JTextField from;
	private JTextField firstStr;
	private JTextField secondStr;
	private String newStr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StringFrame frame = new StringFrame();
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
	public StringFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Concatenate");
		
		btnNewButton.setBounds(22, 121, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Find Length");
		
		btnNewButton_1.setBounds(175, 121, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Replace");
		
		btnNewButton_2.setBounds(289, 121, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Replace Word");
		
		btnNewButton_3.setBounds(408, 121, 112, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SubString");
		
		btnNewButton_4.setBounds(175, 169, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Upper Case");
	
		btnNewButton_5.setBounds(289, 169, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Lowe Case");
		
		btnNewButton_6.setBounds(431, 169, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JLabel FromLabel = new JLabel("From:");
		FromLabel.setBounds(10, 173, 38, 14);
		contentPane.add(FromLabel);
		
		JLabel ToLabel = new JLabel("To:");
		ToLabel.setBounds(82, 173, 38, 14);
		contentPane.add(ToLabel);
		
		to = new JTextField();
		to.setBounds(113, 170, 21, 20);
		contentPane.add(to);
		to.setColumns(10);
		
		from = new JTextField();
		from.setBounds(51, 170, 21, 20);
		contentPane.add(from);
		from.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(39, 209, 452, 104);
		contentPane.add(textArea);
		
		firstStr = new JTextField();
		firstStr.setBounds(130, 11, 338, 20);
		contentPane.add(firstStr);
		firstStr.setColumns(10);
		
		secondStr = new JTextField();
		secondStr.setBounds(130, 49, 334, 20);
		contentPane.add(secondStr);
		secondStr.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First String:");
		lblNewLabel.setBounds(22, 14, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second String:");
		lblNewLabel_1.setBounds(22, 52, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 newStr = firstStr.getText() + secondStr.getText();
				textArea.setText(newStr);
					
				
			}
			
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText( "" + newStr.length());
				
			
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newStr = newStr.replace(firstStr.getText().charAt(0), secondStr.getText().charAt(0));
				textArea.setText(newStr);
				
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newStr = newStr.replaceAll(firstStr.getText(), secondStr.getText());
				textArea.setText(newStr);
				
			}
		});
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newStr = newStr.substring(Integer.parseInt(from.getText()),Integer.parseInt(to.getText()));
				textArea.setText(newStr);
				
				
			}
		});
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newStr = newStr.toUpperCase();
				textArea.setText(newStr);
			}
		});
		
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newStr = newStr.toLowerCase();
				textArea.setText(newStr);
			}
		});
		
	}

}
