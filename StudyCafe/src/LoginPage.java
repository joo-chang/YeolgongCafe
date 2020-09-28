import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPage {

	private JFrame loginFrame;
	JTextField textId = new JTextField();
	JTextField textPassword = new JPasswordField();
	/**
	 * Launch the application.
	 */
	ArrayList<Member> members = new ArrayList<>(); 
	
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
		members.add(new Member("������", "admin","admin", "991025","admin@admin"));
		members.add(new Member("������", "dbsdud1025","dkssud12", "991025","dbsdud1025@naver.com"));
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
		
		JLabel labeltext = new JLabel("���� ���͵� ī��");
		labeltext.setFont(new Font("�޸տ�����", Font.PLAIN, 40));
		labeltext.setHorizontalAlignment(SwingConstants.CENTER);
		labeltext.setBounds(200, 80, 400, 60);
		loginPanel.add(labeltext);
		
		JButton btnLogin = new JButton("�α���");
		btnLogin.setFont(new Font("�޸տ�����", Font.PLAIN, 17));
		btnLogin.setBounds(512, 208, 117, 90);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame.setVisible(false);
				
			    Member member = FindById(textId.getText());
				if (textPassword.getText().equals(member.getPw())) {
					new SeatPage();				
				}
			}
		});
		loginPanel.add(btnLogin);
		
		JLabel labelId = new JLabel("I D");
		labelId.setFont(new Font("�޸տ�����", Font.PLAIN, 15));
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
		labelPassword.setFont(new Font("�޸տ�����", Font.PLAIN, 15));
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelPassword.setBounds(159, 269, 97, 27);
		loginPanel.add(labelPassword);
		
		JButton btnCancel = new JButton("���");
		btnCancel.setBounds(300, 321, 105, 27);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame.setVisible(false);
			
			
			}
		});
		loginPanel.add(btnCancel);
	}
	private Member FindById(String id) {
        for(Member member : members) {
            if(member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }
}
