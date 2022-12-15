import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField numerator;
	private JTextField denominator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		numerator = new JTextField();
		numerator.setBounds(141, 29, 86, 20);
		contentPane.add(numerator);
		numerator.setColumns(10);
		
		denominator = new JTextField();
		denominator.setBounds(141, 77, 86, 20);
		contentPane.add(denominator);
		denominator.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Numerator:");
		lblNewLabel.setBounds(10, 32, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Denomiator:");
		lblNewLabel_1.setBounds(10, 80, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result:");
		lblNewLabel_2.setBounds(33, 143, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(141, 127, 215, 123);
		contentPane.add(textArea);
		
		JButton calculate = new JButton("Calculate");
	
		calculate.setBounds(10, 166, 89, 23);
		contentPane.add(calculate);
		
		JButton clear = new JButton("Clear");
	
		clear.setBounds(10, 214, 89, 23);
		contentPane.add(clear);
		
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("" + Calculate.calculate(Double.parseDouble(numerator.getText()), Double.parseDouble(denominator.getText())));
			}
		});
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
	}
}
