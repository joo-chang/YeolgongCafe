package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import database.DB;
import models.Member;

import javax.swing.JButton;

public class CreateAccountPage extends DB {

	private JFrame creatAccountFrame;
	boolean duplicate = false;

	public CreateAccountPage() {
		initialize();
	}

	private void initialize() {
		creatAccountFrame = new JFrame();
		creatAccountFrame.setVisible(true);
		creatAccountFrame.setBounds(100, 100, 800, 600);
		creatAccountFrame.setLocationRelativeTo(null);
		creatAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		creatAccountFrame.getContentPane().setLayout(null);

		// createAccountPanel
		JPanel createAccountPanel = new JPanel();
		createAccountPanel.setBounds(0, 0, 784, 561);
		creatAccountFrame.getContentPane().add(createAccountPanel);
		createAccountPanel.setVisible(true);
		createAccountPanel.setLayout(null);

		JLabel name_lb = new JLabel("이름");
		name_lb.setBounds(262, 103, 111, 35);
		creatAccountFrame.getContentPane().add(name_lb);
		createAccountPanel.add(name_lb);

		JLabel id_lb = new JLabel("I D");
		id_lb.setBounds(262, 169, 62, 18);
		creatAccountFrame.getContentPane().add(id_lb);
		createAccountPanel.add(id_lb);

		JLabel password_lb = new JLabel("Password");
		password_lb.setBounds(262, 229, 98, 18);
		createAccountPanel.add(password_lb);

		JLabel birth_lb = new JLabel("생년월일");
		birth_lb.setBounds(262, 289, 62, 18);
		createAccountPanel.add(birth_lb);

		JLabel email_lb = new JLabel("email");
		email_lb.setBounds(262, 345, 98, 18);
		createAccountPanel.add(email_lb);
		
		JLabel phone_lb = new JLabel("phone");
		phone_lb.setBounds(262, 400, 98, 18);
		createAccountPanel.add(phone_lb);

		JLabel account_lb = new JLabel("회원가입");
		account_lb.setFont(new Font("휴먼엑스포", Font.PLAIN, 30));
		account_lb.setHorizontalAlignment(SwingConstants.CENTER);
		account_lb.setBounds(303, 34, 168, 44);
		createAccountPanel.add(account_lb);

		JTextField name_tf = new JTextField();
		name_tf.setBounds(355, 108, 116, 24);
		createAccountPanel.add(name_tf);
		name_tf.setColumns(10);

		JTextField id_tf = new JTextField();
		id_tf.setBounds(355, 166, 116, 24);
		createAccountPanel.add(id_tf);
		id_tf.setColumns(10);

		JButton btnIdCheck = new JButton("중복확인");
		btnIdCheck.setBounds(493, 165, 105, 27);
		createAccountPanel.add(btnIdCheck);
		btnIdCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				joincheck(id_tf.getText());
				duplicate = true;
				if (flag1) {
					JOptionPane.showMessageDialog(null, "이미 가입되어 있는 ID입니다.");
				} else {
					JOptionPane.showMessageDialog(null, "가입 가능한 ID입니다.");
				}
			}
		});

		JPasswordField password_pf = new JPasswordField();
		password_pf.setBounds(355, 226, 116, 24);
		createAccountPanel.add(password_pf);
		password_pf.setColumns(10);

		JTextField birth_tf = new JTextField();
		birth_tf.setBounds(355, 286, 116, 24);
		createAccountPanel.add(birth_tf);
		birth_tf.setColumns(10);

		JTextField email_tf = new JTextField();
		email_tf.setBounds(355, 342, 167, 24);
		createAccountPanel.add(email_tf);
		email_tf.setColumns(10);
		
		JTextField phone_tf = new JTextField();
		phone_tf.setBounds(355, 400, 167, 24);
		createAccountPanel.add(phone_tf);
		phone_tf.setColumns(10);

		JButton btnJoin = new JButton("가입하기");
		btnJoin.setBounds(417, 460, 105, 27);
		createAccountPanel.add(btnJoin);
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB db = new DB();

				if (name_tf.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요.");
				} else if (id_tf.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
				} else if (password_pf.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
				} else if (birth_tf.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "생일을 입력해주세요.");
				} else if (email_tf.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이메일을 입력해주세요.");
				} else if (phone_tf.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "핸드폰 번호를 입력해주세요.");
				} else {
					db.joincheck(id_tf.getText());
					if (db.flag1) {
						JOptionPane.showMessageDialog(null, "아이디 중복 확인을 해주세요.");
					} else if (!duplicate) {
						JOptionPane.showMessageDialog(null, "아이디  중복 확인을 해주세요.");
					} else {
						Member member = new Member(name_tf.getText(), id_tf.getText(), password_pf.getText(),
								birth_tf.getText(), email_tf.getText(),phone_tf.getText());
						db.member_Insert(member);
						JOptionPane.showMessageDialog(null, "회원 가입이 완료되었습니다.");
						creatAccountFrame.setVisible(false);
					}
				}
			}
		});

		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(255, 460, 105, 27);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creatAccountFrame.setVisible(false);

			}
		});
		createAccountPanel.add(btnCancel);
	}

}