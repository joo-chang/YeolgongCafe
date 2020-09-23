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

public class StartPage2 {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage2 window = new StartPage2();
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
	public StartPage2() {
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
			
		JPanel panel = new JPanel(); //main
		JPanel CreateAccountPanel = new JPanel(); //Account
	
		
		//회원가입 gui
		CreateAccountPanel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(CreateAccountPanel);
		CreateAccountPanel.setVisible(false);
		CreateAccountPanel.setLayout(null);
		
		JLabel Accountname = new JLabel("이름");
		Accountname.setBounds(262, 103, 111, 35);
		frame.getContentPane().add(Accountname);
		CreateAccountPanel.add(Accountname);
		
		JLabel AccountId = new JLabel("I D");
		AccountId.setBounds(262, 169, 62, 18);
		frame.getContentPane().add(AccountId);
		CreateAccountPanel.add(AccountId);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(262, 229, 98, 18);
		CreateAccountPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("생년월일");
		lblNewLabel_3.setBounds(262, 289, 62, 18);
		CreateAccountPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("핸드폰 번호");
		lblNewLabel_4.setBounds(262, 345, 98, 18);
		CreateAccountPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("회원가입");
		lblNewLabel_5.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(303, 34, 168, 44);
		CreateAccountPanel.add(lblNewLabel_5);
		
		JTextField textField_6 = new JTextField();
		textField_6.setBounds(355, 108, 116, 24);
		CreateAccountPanel.add(textField_6);
		textField_6.setColumns(10);
		
		JTextField textField_7 = new JTextField();
		textField_7.setBounds(355, 166, 116, 24);
		CreateAccountPanel.add(textField_7);
		textField_7.setColumns(10);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(355, 226, 116, 24);
		CreateAccountPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(355, 286, 116, 24);
		CreateAccountPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(355, 342, 167, 24);
		CreateAccountPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("중복확인"); 
		btnNewButton_3.setBounds(493, 165, 105, 27);
		CreateAccountPanel.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("가입하기");
		btnNewButton_1.setBounds(417, 411, 105, 27);
		CreateAccountPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("취소");
		btnNewButton_2.setBounds(255, 411, 105, 27);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccountPanel.setVisible(false);
				panel.setVisible(true);
			
			}
		});
		CreateAccountPanel.add(btnNewButton_2);
		
		//메인gui
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel titleLabel = new JLabel("열공 스터디 카페");
		titleLabel.setBounds(200, 80, 400, 60);
		titleLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 40));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(titleLabel);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(250, 200, 300, 50);
		btnLogin.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginPage();
			}
		});
		panel.add(btnLogin);
		
		
		JButton btnJoin = new JButton("회원가입");
		btnJoin.setBounds(250, 270, 300, 50);
		btnJoin.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				CreateAccountPanel.setVisible(true);
			}
		});
		panel.add(btnJoin);
		
		
		JButton btnEnter = new JButton("입장하기");
		btnEnter.setBounds(250, 340, 300, 50);
		btnEnter.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SeatPage();
				
			}
		});
		panel.add(btnEnter);
		
		
		
	}
}// 수정 내용
