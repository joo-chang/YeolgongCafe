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
				new CreateAccount();
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
