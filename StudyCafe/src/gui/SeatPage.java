package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import database.DB;
import models.Member;
import models.Seat;

public class SeatPage extends DB {

	public JFrame seatFrame;
	public JButton btnCheckout = new JButton("퇴실하기");
	public JButton btnBack = new JButton("로그아웃");
	public JButton btnCharge = new JButton("시간충전");
	public JButton btnSales_m = new JButton("매출관리");
	public JButton btnFee_m = new JButton("요금관리");

	SeatPage() {
	}

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

		JPanel seatPanel = new JPanel(); // seatPanel
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
		btnSales_m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		seatPanel.add(btnSales_m);

		btnFee_m.setBounds(631, 463, 105, 60);
		btnFee_m.setVisible(false);
		btnFee_m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ChargeManage();
			}
		});
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

		JLabel labelUsername = new JLabel(member.getName() + "님");
		labelUsername.setBounds(57, 18, 62, 18);
		seatPanel.add(labelUsername);

		// btnseat
		JButton btnSeat1 = new JButton("1");
		btnSeat1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check_userseat(user_Id);
				if (flag1) {
					check_usertime(user_Id);
					if (flag1) {
						Seat seat = new Seat(1, user_Id);
						use_seat(seat);
						btnSeat1.setBackground(Color.red);
					} else {
						JOptionPane.showMessageDialog(null, "시간을 충전해주세요");
					}
				} else {
					JOptionPane.showMessageDialog(null, "이미 사용중인 좌석이 있습니다.");
				}

			}
		});
		btnSeat1.setBounds(106, 100, 50, 40);
		seatPanel.add(btnSeat1);

		JButton btnSeat2 = new JButton("2");
		btnSeat2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check_userseat(user_Id);
				if (flag1) {
					check_usertime(user_Id);
					if (flag1) {
						Seat seat = new Seat(2, user_Id);
						use_seat(seat);
						btnSeat1.setBackground(Color.red);
					} else {
						JOptionPane.showMessageDialog(null, "시간을 충전해주세요");
					}
				} else {
					JOptionPane.showMessageDialog(null, "이미 사용중인 좌석이 있습니다.");
				}
			}
		});
		btnSeat2.setBounds(106, 160, 50, 40);
		seatPanel.add(btnSeat2);

		JButton btnSeat3 = new JButton("3");
		btnSeat3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total_method();
			}
		});
		btnSeat3.setBounds(106, 215, 50, 40);
		seatPanel.add(btnSeat3);

		JButton btnSeat4 = new JButton("4");
		btnSeat4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check_userseat(user_Id);
				if (flag1) {
					check_usertime(user_Id);
					if (flag1) {
						Seat seat = new Seat(2, user_Id);
						use_seat(seat);
						btnSeat1.setBackground(Color.red);
						//시간 계산 후 
						//usertime ==0 or 퇴실하기 누르면 
						// update user_time
					} else {
						JOptionPane.showMessageDialog(null, "시간을 충전해주세요");
					}
				} else {
					JOptionPane.showMessageDialog(null, "이미 사용중인 좌석이 있습니다.");
				}
			}
		});
		btnSeat4.setBounds(106, 270, 50, 40);
		seatPanel.add(btnSeat4);

		JButton btnSeat5 = new JButton("5");
		btnSeat5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check_userseat(user_Id);
				if (flag1 != true) {
					JOptionPane.showMessageDialog(null, "이미 사용중인 좌석이 있습니다.");
				} else if (flag1) {

				} else {
					Seat seat = new Seat(2, user_Id);
					use_seat(seat);
					btnSeat1.setBackground(Color.red);

				}
			}
		});
		btnSeat5.setBounds(106, 325, 50, 40);
		seatPanel.add(btnSeat5);

		JButton btnSeat6 = new JButton("6");
		btnSeat6.setBounds(272, 100, 50, 40);
		seatPanel.add(btnSeat6);

		JButton btnSeat7 = new JButton("7");
		btnSeat7.setBounds(272, 160, 50, 40);
		seatPanel.add(btnSeat7);

		JButton btnSeat8 = new JButton("8");
		btnSeat8.setBounds(272, 215, 50, 40);
		seatPanel.add(btnSeat8);

		JButton btnSeat9 = new JButton("9");
		btnSeat9.setBounds(272, 270, 50, 40);
		seatPanel.add(btnSeat9);

		JButton btnSeat10 = new JButton("10");
		btnSeat10.setBounds(272, 325, 50, 40);
		seatPanel.add(btnSeat10);

		JButton btnSeat11 = new JButton("11");
		btnSeat11.setBounds(330, 100, 50, 40);
		seatPanel.add(btnSeat11);

		JButton btnSeat12 = new JButton("12");
		btnSeat12.setBounds(330, 160, 50, 40);
		seatPanel.add(btnSeat12);

		JButton btnSeat13 = new JButton("13");
		btnSeat13.setBounds(330, 215, 50, 40);
		seatPanel.add(btnSeat13);

		JButton btnSeat14 = new JButton("14");
		btnSeat14.setBounds(330, 270, 50, 40);
		seatPanel.add(btnSeat14);

		JButton btnSeat15 = new JButton("15");
		btnSeat15.setBounds(330, 325, 50, 40);
		seatPanel.add(btnSeat15);

		JButton btnSeat16 = new JButton("16");
		btnSeat16.setBounds(446, 100, 50, 40);
		seatPanel.add(btnSeat16);

		JButton btnSeat17 = new JButton("17");
		btnSeat17.setBounds(496, 100, 50, 40);
		seatPanel.add(btnSeat17);

		JButton btnSeat18 = new JButton("18");
		btnSeat18.setBounds(546, 100, 50, 40);
		seatPanel.add(btnSeat18);

		JButton btnSeat19 = new JButton("19");
		btnSeat19.setBounds(596, 100, 50, 40);
		seatPanel.add(btnSeat19);

		JButton btnSeat20 = new JButton("20");
		btnSeat20.setBounds(446, 160, 50, 40);
		seatPanel.add(btnSeat20);

		JButton btnSeat21 = new JButton("21");
		btnSeat21.setBounds(496, 160, 50, 40);
		seatPanel.add(btnSeat21);

		JButton btnSeat22 = new JButton("22");
		btnSeat22.setBounds(546, 160, 50, 40);
		seatPanel.add(btnSeat22);

		JButton btnSeat23 = new JButton("23");
		btnSeat23.setBounds(596, 160, 50, 40);
		seatPanel.add(btnSeat23);

		JButton btnSeat24 = new JButton("24");
		btnSeat24.setBounds(446, 270, 50, 40);
		seatPanel.add(btnSeat24);

		JButton btnSeat25 = new JButton("25");
		btnSeat25.setBounds(496, 270, 50, 40);
		seatPanel.add(btnSeat25);

		JButton btnSeat26 = new JButton("26");
		btnSeat26.setBounds(546, 270, 50, 40);
		seatPanel.add(btnSeat26);

		JButton btnSeat27 = new JButton("27");
		btnSeat27.setBounds(596, 270, 50, 40);
		seatPanel.add(btnSeat27);

		JButton btnSeat28 = new JButton("28");
		btnSeat28.setBounds(446, 325, 50, 40);
		seatPanel.add(btnSeat28);

		JButton btnSeat29 = new JButton("29");
		btnSeat29.setBounds(496, 325, 50, 40);
		seatPanel.add(btnSeat29);

		JButton btnSeat30 = new JButton("30");
		btnSeat30.setBounds(546, 325, 50, 40);
		seatPanel.add(btnSeat30);

		JButton btnSeat31 = new JButton("31");
		btnSeat31.setBounds(596, 325, 50, 40);
		seatPanel.add(btnSeat31);

	}

	public void total_method() {

	}
}
