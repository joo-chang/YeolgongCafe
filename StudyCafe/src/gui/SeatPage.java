package gui;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import database.DB;
import models.Member;

public class SeatPage extends DB {

	public JFrame seatFrame;
	public JButton btnCheckout = new JButton("퇴실하기");
	public JButton btnBack = new JButton("로그아웃");
	public JButton btnCharge = new JButton("시간충전");
	public JButton btnSales_m= new JButton("매출관리");
	public JButton btnFee_m= new JButton("요금관리");
	


	SeatPage() {}
	

	Member member = new Member();
	public SeatPage(String user_Id) {
		member = select_Name(user_Id);
		System.out.println(member.getName());
		System.out.println(user_Id);
		initialize(user_Id);
	}


	public void initialize(String user_Id) {
		seatFrame = new JFrame();
		seatFrame.setVisible(true);
		seatFrame.setBounds(100, 100, 800, 600);
		seatFrame.setLocationRelativeTo(null);
		seatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		seatFrame.getContentPane().setLayout(null);
		
		
		JPanel seatPanel = new JPanel(); //seatPanel
		seatPanel.setBounds(0, 0, 784, 561);
		seatFrame.getContentPane().add(seatPanel);
		seatPanel.setVisible(true);
		seatPanel.setLayout(null);
		
		btnCheckout.setBounds(44, 463, 105, 60);
		seatPanel.add(btnCheckout);
			
		JButton btnChat = new JButton("채팅하기");
		btnChat.setBounds(342, 463, 105, 60);
		seatPanel.add(btnChat);
		
		btnSales_m.setBounds(44, 463, 105, 60);
		btnSales_m.setVisible(false);
		seatPanel.add(btnSales_m);
		
		btnFee_m.setBounds(631, 463, 105, 60);
		btnFee_m.setVisible(false);
		seatPanel.add(btnFee_m);
		
		btnCharge.setBounds(631, 463, 105, 60);
		btnCharge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChargePage(user_Id);
			}
		});
		seatPanel.add(btnCharge);
		
		btnBack.setBounds(663, 12, 105, 30);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seatFrame.setVisible(false);
			}
		});
		seatPanel.add(btnBack);
		
	    JLabel labelText = new JLabel("좌석을 선택해주세요.");
	    labelText.setBounds(475, 16, 204, 23);
	    seatPanel.add(labelText);
		
		JLabel labelUsername = new JLabel(member.getName()+"님");
		labelUsername.setBounds(57, 18, 62, 18);
		seatPanel.add(labelUsername);
		
		//btnseat
		JButton btnSeat1 = new JButton("");
		btnSeat1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeat1.setBounds(56, 100, 29, 27);
		seatPanel.add(btnSeat1);
		
		JButton btnSeat2 = new JButton("");
		btnSeat2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeat2.setBounds(56,160, 29, 27);
		seatPanel.add(btnSeat2);
		
		JButton btnSeat3 = new JButton("");
		btnSeat3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeat3.setBounds(56,215, 29, 27);
		seatPanel.add(btnSeat3);
		
		JButton btnSeat4 = new JButton("");
		btnSeat4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeat4.setBounds(56,270, 29, 27);
		seatPanel.add(btnSeat4);
		
		JButton btnSeat5 = new JButton("");
		btnSeat5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeat5.setBounds(56,325, 29, 27);
		seatPanel.add(btnSeat5);
		
		JButton btnSeat6 = new JButton("");
		btnSeat6.setBounds(222, 100, 29, 27);
		seatPanel.add(btnSeat6);
		
		JButton btnSeat7 = new JButton("");
		btnSeat7.setBounds(222, 160, 29, 27);
		seatPanel.add(btnSeat7);
		
		JButton btnSeat8 = new JButton("");
		btnSeat8.setBounds(222, 215, 29, 27);
		seatPanel.add(btnSeat8);
		
		JButton btnSeat9 = new JButton("");
		btnSeat9.setBounds(222, 270, 29, 27);
		seatPanel.add(btnSeat9);
		
		JButton btnSeat10 = new JButton("");
		btnSeat10.setBounds(222, 325, 29, 27);
		seatPanel.add(btnSeat10);
		
		JButton btnSeat11 = new JButton("");
		btnSeat11.setBounds(265, 100, 29, 27);
		seatPanel.add(btnSeat11);
		
		JButton btnSeat12 = new JButton("");
		btnSeat12.setBounds(265, 160, 29, 27);
		seatPanel.add(btnSeat12);
		
		JButton btnSeat13 = new JButton("");
		btnSeat13.setBounds(265, 215, 29, 27);
		seatPanel.add(btnSeat13);
		
		JButton btnSeat14 = new JButton("");
		btnSeat14.setBounds(265, 270, 29, 27);
		seatPanel.add(btnSeat14);
		
		JButton btnSeat15 = new JButton("");
		btnSeat15.setBounds(265, 325, 29, 27);
		seatPanel.add(btnSeat15);
		
		JButton btnSeat16 = new JButton("");
		btnSeat16.setBounds(396, 100, 29, 27);
		seatPanel.add(btnSeat16);
		
		JButton btnSeat17 = new JButton("");
		btnSeat17.setBounds(441, 100, 29, 27);
		seatPanel.add(btnSeat17);
		
		JButton btnSeat18 = new JButton("");
		btnSeat18.setBounds(488, 100, 29, 27);
		seatPanel.add(btnSeat18);
		
		JButton btnSeat19 = new JButton("");
		btnSeat19.setBounds(537, 100, 29, 27);
		seatPanel.add(btnSeat19);
		
		JButton btnSeat20 = new JButton("");
		btnSeat20.setBounds(396, 160, 29, 27);
		seatPanel.add(btnSeat20);
		
		JButton btnSeat21 = new JButton("");
		btnSeat21.setBounds(441, 160, 29, 27);
		seatPanel.add(btnSeat21);
		
		JButton btnSeat22 = new JButton("");
		btnSeat22.setBounds(488, 160, 29, 27);
		seatPanel.add(btnSeat22);
		
		JButton btnSeat23 = new JButton("");
		btnSeat23.setBounds(537, 160, 29, 27);
		seatPanel.add(btnSeat23);
		
		JButton btnSeat24 = new JButton("");
		btnSeat24.setBounds(396, 270, 29, 27);
		seatPanel.add(btnSeat24);
		
		JButton btnSeat25 = new JButton("");
		btnSeat25.setBounds(441, 270, 29, 27);
		seatPanel.add(btnSeat25);
		
		JButton btnSeat26 = new JButton("");
		btnSeat26.setBounds(488, 270, 29, 27);
		seatPanel.add(btnSeat26);
		
		JButton btnSeat27 = new JButton("");
		btnSeat27.setBounds(537, 270, 29, 27);
		seatPanel.add(btnSeat27);
		
		JButton btnSeat28 = new JButton("");
		btnSeat28.setBounds(396, 325, 29, 27);
		seatPanel.add(btnSeat28);
		
		JButton btnSeat29 = new JButton("");
		btnSeat29.setBounds(441, 325, 29, 27);
		seatPanel.add(btnSeat29);
		
		JButton btnSeat30 = new JButton("");
		btnSeat30.setBounds(488, 325, 29, 27);
		seatPanel.add(btnSeat30);
		
		JButton btnSeat31 = new JButton("");
		btnSeat31.setBounds(537, 325, 29, 27);
		seatPanel.add(btnSeat31);
		
		JButton btnSeat32 = new JButton("");
		btnSeat32.setBounds(663, 100, 29, 27);
		seatPanel.add(btnSeat32);
		
		JButton btnSeat33 = new JButton("");
		btnSeat33.setBounds(663, 160, 29, 27);
		seatPanel.add(btnSeat33);
		
		JButton btnSeat34 = new JButton("");
		btnSeat34.setBounds(663, 215, 29, 27);
		seatPanel.add(btnSeat34);
		
		JButton btnSeat35 = new JButton("");
		btnSeat35.setBounds(663, 270, 29, 27);
		seatPanel.add(btnSeat35);
		
		JButton btnSeat36 = new JButton("");
		btnSeat36.setBounds(663, 325, 29, 27);
		seatPanel.add(btnSeat36);
		
		
	}
}
