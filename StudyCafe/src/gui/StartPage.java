package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


public class StartPage {

	private JFrame startFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage window = new StartPage();
					window.startFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 */
	public StartPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		startFrame = new JFrame();
		startFrame.setBounds(100, 100, 800, 600);
		startFrame.setVisible(false);
		startFrame.setLocationRelativeTo(null);
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startFrame.getContentPane().setLayout(null);

		JPanel startPanel = new JPanel(); // startPanel

		startPanel.setBounds(0, 0, 784, 561);
		startFrame.getContentPane().add(startPanel);
		startPanel.setLayout(null);

		JLabel titleLabel = new JLabel("¿­°ø ½ºÅÍµð Ä«Æä");
		titleLabel.setBounds(200, 80, 400, 60);
		titleLabel.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 40));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		startPanel.add(titleLabel);

		JButton btnLogin = new JButton("·Î±×ÀÎ");
		btnLogin.setBounds(250, 200, 300, 50);
		btnLogin.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginPage();
			}
		});
		startPanel.add(btnLogin);

		JButton btnAccount = new JButton("È¸¿ø°¡ÀÔ");
		btnAccount.setBounds(250, 270, 300, 50);
		btnAccount.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 16));
		btnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateAccountPage();
			}
		});
		startPanel.add(btnAccount);

		JButton btnEnter = new JButton("ÀÔÀåÇÏ±â");
		btnEnter.setBounds(250, 340, 300, 50);
		btnEnter.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 16));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		startPanel.add(btnEnter);

	}
}
