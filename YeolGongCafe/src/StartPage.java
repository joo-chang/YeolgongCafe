import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StartPage {

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
					StartPage window = new StartPage();
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
	public StartPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setVisible(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(loginPanel);
		loginPanel.setVisible(false);
		loginPanel.setLayout(null);
		

		
		
		JLabel lblNewLabel = new JLabel("\uC5F4\uACF5 \uC2A4\uD130\uB514 \uCE74\uD398");
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(200, 80, 400, 60);
		loginPanel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB85C \uADF8 \uC778");
		btnNewButton.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 17));
		btnNewButton.setBounds(512, 208, 117, 90);
		loginPanel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("I D");
		lblNewLabel_1.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(159, 208, 97, 29);
		loginPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(295, 208, 178, 30);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(295, 268, 178, 30);
		loginPanel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 15));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(159, 269, 97, 27);
		loginPanel.add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel titleLabel = new JLabel("\uC5F4\uACF5 \uC2A4\uD130\uB514 \uCE74\uD398");
		titleLabel.setBounds(200, 80, 400, 60);
		titleLabel.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 40));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titleLabel);
		
		JButton btnLogin = new JButton("\uB85C \uADF8 \uC778");
		btnLogin.setBounds(250, 200, 300, 50);
		btnLogin.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				loginPanel.setVisible(true);
			}
		});
		panel.add(btnLogin);
		
		
		JButton btnJoin = new JButton("\uD68C \uC6D0 \uAC00 \uC785");
		btnJoin.setBounds(250, 270, 300, 50);
		btnJoin.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 16));
		panel.add(btnJoin);
		
		JButton btnEnter = new JButton("\uC785 \uC7A5 \uD558 \uAE30");
		btnEnter.setBounds(250, 340, 300, 50);
		btnEnter.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 16));
		panel.add(btnEnter);
		
		JButton btnChat = new JButton("\uAD00 \uB9AC \uC790 \uCC44 \uD305");
		btnChat.setBounds(250, 410, 300, 50);
		btnChat.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 16));
		panel.add(btnChat);
	}
}// ¼öÁ¤ ³»¿ë
