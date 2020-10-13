package gui;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import database.DB;

public class LoginPage {

	private JFrame loginFrame;
	JTextField textId = new JTextField();
	JPasswordField textPassword = new JPasswordField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.loginFrame.setVisible(true);
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

		loginFrame = new JFrame();
		loginFrame.setBounds(100, 100, 800, 600);
		loginFrame.setVisible(true);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);

		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 784, 561);
		loginFrame.getContentPane().add(loginPanel);
		loginPanel.setVisible(true);
		loginPanel.setLayout(null);

		JLabel labeltext = new JLabel("열공 스터디 카페");
		labeltext.setFont(new Font("휴먼엑스포", Font.PLAIN, 40));
		labeltext.setHorizontalAlignment(SwingConstants.CENTER);
		labeltext.setBounds(200, 80, 400, 60);
		loginPanel.add(labeltext);

		JLabel labelId = new JLabel("I D");
		labelId.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		labelId.setHorizontalAlignment(SwingConstants.CENTER);
		labelId.setBounds(159, 208, 97, 29);
		loginPanel.add(labelId);

		textId.setBounds(295, 208, 178, 30);
		loginPanel.add(textId);
		textId.setColumns(10);

		textPassword.setColumns(10);
		textPassword.setBounds(295, 268, 178, 30);
		loginPanel.add(textPassword);

		JLabel labelPassword = new JLabel("Password");
		labelPassword.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelPassword.setBounds(159, 269, 97, 27);
		loginPanel.add(labelPassword);

		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(300, 342, 105, 27);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame.setVisible(false);
			}
		});
		
		JLabel check = new JLabel("가입하지 않은 아이디이거나, 잘못된 비밀번호입니다.");
		check.setFont(new Font("휴먼엑스포", Font.PLAIN, 15));
		check.setHorizontalAlignment(SwingConstants.CENTER);
		check.setBounds(245, 305, 400, 30);
		check.setVisible(false);
		loginPanel.add(check);
		
		loginPanel.add(btnCancel);
		JButton btnLogin = new JButton("로그인");
		btnLogin.setFont(new Font("휴먼엑스포", Font.PLAIN, 17));
		btnLogin.setBounds(512, 208, 117, 90);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB db = new DB();
				db.check(textId.getText(),textPassword.getText());
				
				if(db.flag) {
					System.out.println("로그인 성공");
					SeatPage seatpage = new SeatPage(db.name);
					if(textId.getText().equals("admin")&&textPassword.getText().equals("tntjr123emd")) {
						seatpage.btnCheckout.setVisible(false);
						seatpage.btnCharge.setVisible(false);
						seatpage.btnFee_m.setVisible(true);
						seatpage.btnSales_m.setVisible(true);
					}
					loginFrame.setVisible(false);
				}else {
					check.setVisible(true);
					
					System.out.println("로그인 실패");
				}
				
				
			}
		});
		loginPanel.add(btnLogin);
	}
}