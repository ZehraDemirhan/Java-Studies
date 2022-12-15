import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class HospitalMemberFrame extends JFrame {

	private JPanel contentPane;
	public JLabel pageNo;
	AddFrame addFrame  = new AddFrame(this, pageNo.getText());
    
    
     
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					HospitalMemberFrame frame = new HospitalMemberFrame();
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
	public HospitalMemberFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton display = new JButton("Display");
		
	
		display.setBounds(76, 36, 89, 23);
		contentPane.add(display);
		
		JButton add = new JButton("Add");
		
		
		add.setBounds(232, 36, 89, 23);
		contentPane.add(add);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 123, 283, 71);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
	    pageNo = new JLabel("New label");
		pageNo.setBounds(169, 236, 46, 14);
		contentPane.add(pageNo);
		pageNo.setText("1");
		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addFrame.setVisible(true);
				dispose();
				
			}
		});
		
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HospitalMemberSys.getHm().size() == 0)
					textArea.setText("No addition. Array List is empty");
				else
				textArea.setText(HospitalMemberSys.display());
				
			
			}
		});
	}
}
