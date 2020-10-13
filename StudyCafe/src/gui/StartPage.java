package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


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

		JLabel titleLabel = new JLabel("열공 스터디 카페");
		titleLabel.setBounds(200, 80, 400, 60);
		titleLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 40));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		startPanel.add(titleLabel);

		JButton btnLogin = new JButton("로그인");
		btnLogin.setBounds(250, 200, 300, 50);
		btnLogin.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginPage();
			}
		});
		startPanel.add(btnLogin);

		JButton btnAccount = new JButton("회원가입");
		btnAccount.setBounds(250, 270, 300, 50);
		btnAccount.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
		btnAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateAccountPage();
			}
		});
		startPanel.add(btnAccount);

		JButton btnEnter = new JButton("입장하기");
		btnEnter.setBounds(250, 340, 300, 50);
		btnEnter.setFont(new Font("휴먼엑스포", Font.PLAIN, 16));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int accept = Integer.parseInt(JOptionPane.showInputDialog("인증 번호를 입력하세요."));
				if(accept==1234) {
					JOptionPane.showMessageDialog(null,"문이 열립니다.");	
				}else JOptionPane.showMessageDialog(null,"인증번호가 틀리거나 유효하지 않습니다.");	
			}
		});
		startPanel.add(btnEnter);

	}
}
