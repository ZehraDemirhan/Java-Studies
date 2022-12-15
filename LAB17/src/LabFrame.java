import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class LabFrame extends JFrame {

	private JPanel contentPane;
	AddFrame addF =  new AddFrame(this);
	SearchFrame searchF = new SearchFrame(this);
	
	public void fillComboBox() {
		
		searchF.getComboBox().setModel(new DefaultComboBoxModel(LabarotorySys.getLabNames()));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabFrame frame = new LabFrame();
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
	public LabFrame() {
		setTitle("Laboratory Frame");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lab Info:");
		lblNewLabel.setBounds(56, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton readFile = new JButton("Read File");
		
		readFile.setBounds(335, 81, 89, 23);
		contentPane.add(readFile);
		
		JButton Add = new JButton("Add");
	
		Add.setBounds(335, 143, 89, 23);
		contentPane.add(Add);
		
		JButton Search = new JButton("Search");
	
		Search.setBounds(335, 177, 89, 23);
		contentPane.add(Search);
		
		JButton Display = new JButton("Display");
	
		Display.setBounds(335, 211, 89, 23);
		contentPane.add(Display);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 94, 282, 420);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		readFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LabarotorySys.readTxt("labs.txt");
					textArea.setText("File is read");
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(LabarotorySys.display());
			}
		});
		
		
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addF.setVisible(true);
				//dispose();
				
			}
		});
		
		
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillComboBox();
				searchF.setVisible(true);
				
			}
		});
	}
	
	
}
