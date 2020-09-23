import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class CreateAccount {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
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
	public CreateAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel CreateAccountPanel = new JPanel(); 
		CreateAccountPanel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(CreateAccountPanel);
		CreateAccountPanel.setVisible(true);
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
				frame.setVisible(false);
			
			}
		});
		CreateAccountPanel.add(btnNewButton_2);
	}

}
