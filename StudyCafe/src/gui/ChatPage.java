package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class ChatPage {

	private JFrame chatFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatPage window = new ChatPage();
					window.chatFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
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
		
		JLabel labelName = new JLabel("��ü ������");
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
		
		JTextField textSend = new JTextField("�޼����� �Է��ϼ���");
		textSend.setBounds(125, 431, 386, 24);
		chatFrame.getContentPane().add(textSend);
		textSend.setColumns(10);
		
		JButton btnSend = new JButton("����");
		btnSend.setBounds(518, 430, 92, 27);
		chatFrame.getContentPane().add(btnSend);
	}
}
