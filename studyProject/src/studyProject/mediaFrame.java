package studyProject;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class mediaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField clickField;
	private JTextField likeField;
	private JTextField subscriptionField;

	ImageIcon instagram = new ImageIcon("C:\\Users\\ZEHRA\\Downloads\\images\\images\\instagram.png");
    ImageIcon snapChat = new ImageIcon("C:\\Users\\ZEHRA\\Downloads\\images\\images\\snapchat.png");
    ImageIcon youtube = new ImageIcon("C:\\Users\\ZEHRA\\Downloads\\images\\images\\youtube.png");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mediaFrame frame = new mediaFrame();
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
	public mediaFrame() {
		setTitle("Media Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernameField = new JTextField();
		usernameField.setBounds(264, 8, 162, 20);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel username = new JLabel("User Name Surname:");
		username.setBounds(62, 11, 142, 14);
		contentPane.add(username);
		
		JLabel mediaSharing = new JLabel("Networks: ");
		mediaSharing.setBounds(62, 51, 117, 14);
		contentPane.add(mediaSharing);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setIcon(youtube);
		imageLabel.setBounds(264, 80, 149, 93);
		contentPane.add(imageLabel);
		
		JComboBox networksComboBox = new JComboBox();
		networksComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(networksComboBox.getSelectedItem().equals("YouTube"))
					imageLabel.setIcon(youtube);
				else if(networksComboBox.getSelectedItem().equals("Instagram"))
					imageLabel.setIcon(instagram);
				else if(networksComboBox.getSelectedItem().equals("SnapChat"))
					imageLabel.setIcon(snapChat);
				
					
			}
			
		});
		
		networksComboBox.setModel(new DefaultComboBoxModel(new String[]{"YouTube","SnapChat","Instagram"}));
		networksComboBox.setBounds(264, 47, 162, 22);
		contentPane.add(networksComboBox);
		
		JLabel clickLabel = new JLabel("Click:");
		clickLabel.setBounds(10, 201, 46, 14);
		contentPane.add(clickLabel);
		
		JLabel likeLabel = new JLabel("Like:");
		likeLabel.setBounds(142, 201, 46, 14);
		contentPane.add(likeLabel);
		
		JLabel susbsLabel = new JLabel("Subscription:");
		susbsLabel.setBounds(264, 201, 77, 14);
		contentPane.add(susbsLabel);
		
		clickField = new JTextField();
		clickField.setBounds(45, 198, 46, 20);
		contentPane.add(clickField);
		clickField.setColumns(10);
		
		likeField = new JTextField();
		likeField.setBounds(184, 198, 39, 20);
		contentPane.add(likeField);
		likeField.setColumns(10);
		
		subscriptionField = new JTextField();
		subscriptionField.setBounds(365, 198, 86, 20);
		contentPane.add(subscriptionField);
		subscriptionField.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate the User Earning");
		
		calculateButton.setBounds(71, 242, 342, 23);
		contentPane.add(calculateButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(62, 276, 364, 99);
		contentPane.add(textArea);
		
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = usernameField.getText();
				String network = (String) networksComboBox.getSelectedItem();
				double earning = Integer.parseInt(clickField.getText());
				textArea.setText(name + "\n****************\n" + "Media Sharing network: " + network  + "The User Earning " + earning );
				
				
			}
		});
		
		
		
		
	}
}
