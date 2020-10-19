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


	private void initialize() {
		chatFrame = new JFrame();
		chatFrame.setBounds(100, 100, 655, 514);
		chatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chatFrame.getContentPane().setLayout(null);
		
		JLabel user_lb = new JLabel("��ü ������");
		user_lb.setBounds(25, 31, 102, 18);
		chatFrame.getContentPane().add(user_lb);
		//test �浹 �׽�Ʈ
		
		JList user_List = new JList();
		user_List.setBounds(25, 53, 86, 139);
		chatFrame.getContentPane().add(user_List);
		//test �浹 �׽�Ʈ
		
		JScrollPane scroll_pane = new JScrollPane();
		scroll_pane.setBounds(125, 31, 486, 389);
		chatFrame.getContentPane().add(scroll_pane);
		
		JTextField chatting_tf = new JTextField();
		scroll_pane.setViewportView(chatting_tf);
		chatting_tf.setColumns(10);
		
		//test �浹 �׽�Ʈ
		JTextField send_tf = new JTextField("�޼����� �Է��ϼ���");
		send_tf.setBounds(125, 431, 386, 24);
		chatFrame.getContentPane().add(send_tf);
		send_tf.setColumns(10);
		
		JButton btnsend = new JButton("����");
		btnsend.setBounds(518, 430, 92, 27);
		chatFrame.getContentPane().add(btnsend);
		
		//test �浹 �׽�Ʈ
	}
}
