package studyProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myFrame extends JFrame {

	private JPanel contentPane;
	private JTextField infoText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFrame frame = new myFrame();
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
	public myFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(292, 123, 5, 16);
		contentPane.add(textArea);
		
		JButton Previous = new JButton("Previous");
		
		Previous.setBounds(65, 70, 89, 23);
		contentPane.add(Previous);
		
		JButton Next = new JButton("Next");
		
		Next.setBounds(235, 70, 89, 23);
		contentPane.add(Next);
		
		JLabel Info = new JLabel("INFO:");
		Info.setBounds(89, 144, 46, 14);
		contentPane.add(Info);
		
		infoText = new JTextField();
		infoText.setBounds(159, 141, 183, 20);
		contentPane.add(infoText);
		infoText.setColumns(10);
		
		Previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoText.setText("PREVIOUS Button is clicked");
			}
		});
		
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoText.setText("NEXT button is clicked");
			}
		});
	}
}
