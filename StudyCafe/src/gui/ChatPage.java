package gui;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ChatPage {

	private JFrame chatFrame;

	public ChatPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		chatFrame = new JFrame();
		chatFrame.setBounds(100, 100, 655, 514);
		chatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chatFrame.getContentPane().setLayout(null);
		
		JLabel labelName = new JLabel("전체 접속자");
		labelName.setBounds(25, 31, 102, 18);
		chatFrame.getContentPane().add(labelName);
		
		JList list = new JList();
		list.setBounds(25, 53, 86, 139);
		chatFrame.getContentPane().add(list);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(125, 31, 486, 389);
		chatFrame.getContentPane().add(scrollPane);
		
		JTextField textChattingScreen = new JTextField();
		scrollPane.setViewportView(textChattingScreen);
		textChattingScreen.setColumns(10);
		
		JTextField textSend = new JTextField("메세지를 입력하세요");
		textSend.setBounds(125, 431, 386, 24);
		chatFrame.getContentPane().add(textSend);
		textSend.setColumns(10);
		
		JButton btnSend = new JButton("전송");
		btnSend.setBounds(518, 430, 92, 27);
		chatFrame.getContentPane().add(btnSend);
	}
}
