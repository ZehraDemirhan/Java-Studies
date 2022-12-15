import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminInfoFrame extends JFrame {

	private JPanel contentPane;
	AdminToolsFrame adminToolsReferenceFrame; // Going Up 
	public JLabel info;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public AdminInfoFrame(AdminToolsFrame fr) {
		adminToolsReferenceFrame = fr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    info = new JLabel("New label");
		info.setBounds(37, 22, 237, 133);
		contentPane.add(info);
		
		JButton back = new JButton("OK");
		
		back.setBounds(116, 166, 62, 23);
		contentPane.add(back);
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});

	}

	public JLabel getInfo() {
		return info;
	}

	
	
}
