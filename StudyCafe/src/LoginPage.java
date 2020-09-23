import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class LoginPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel loginPanel = new JPanel(); 
		loginPanel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(loginPanel);
		loginPanel.setVisible(true);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿­°ø ½ºÅÍµð Ä«Æä");
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(200, 80, 400, 60);
		loginPanel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("·Î±×ÀÎ");
		btnNewButton.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 17));
		btnNewButton.setBounds(512, 208, 117, 90);
		loginPanel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("I D");
		lblNewLabel_1.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(159, 208, 97, 29);
		loginPanel.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(295, 208, 178, 30);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(295, 268, 178, 30);
		loginPanel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 15));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(159, 269, 97, 27);
		loginPanel.add(lblNewLabel_1_1);
		
		JButton btnNewButton_22 = new JButton("Ãë¼Ò");
		btnNewButton_22.setBounds(300, 321, 105, 27);
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			
			
			}
		});
		loginPanel.add(btnNewButton_22);
	}
}
