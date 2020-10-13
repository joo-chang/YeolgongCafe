package gui;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import database.DB;

public class ChargePage {

	private JFrame chargeFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChargePage window = new ChargePage();
					window.chargeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	ChargePage(){
		
	}
	DB db= new DB();
	public ChargePage(String user_Id) {
		db.select_Name(user_Id);
		initialize(user_Id);
	}
	
	private void initialize(String user_Id) {
		
		chargeFrame = new JFrame();
		chargeFrame.setBounds(100, 100, 800, 600);
		chargeFrame.setVisible(true);
		chargeFrame.setLocationRelativeTo(null);
		chargeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chargeFrame.getContentPane().setLayout(null);
		
		JPanel chargePanel = new JPanel();
		chargePanel.setBounds(0, 0, 784, 561);
		chargeFrame.getContentPane().add(chargePanel);
		chargePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("시간 충전");
		lblNewLabel.setBounds(0, 60, 784, 60);
		lblNewLabel.setFont(new Font("휴먼엑스포", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chargePanel.add(lblNewLabel);
		
		JLabel timeLabel2H = new JLabel("2 \uC2DC\uAC04");
		timeLabel2H.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel2H.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		timeLabel2H.setBounds(130, 150, 75, 30);
		chargePanel.add(timeLabel2H);
		
		JLabel timeLabel4H = new JLabel("4 \uC2DC\uAC04");
		timeLabel4H.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel4H.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		timeLabel4H.setBounds(130, 210, 75, 30);
		chargePanel.add(timeLabel4H);
		
		JLabel timeLabel6H = new JLabel("6 \uC2DC\uAC04");
		timeLabel6H.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel6H.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		timeLabel6H.setBounds(130, 270, 75, 30);
		chargePanel.add(timeLabel6H);
		
		JLabel timeLabel24H = new JLabel("24 \uC2DC\uAC04");
		timeLabel24H.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel24H.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		timeLabel24H.setBounds(130, 330, 75, 30);
		chargePanel.add(timeLabel24H);
		
		JLabel timeLabel30D = new JLabel("30 \uC77C\uAD8C");
		timeLabel30D.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel30D.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		timeLabel30D.setBounds(130, 390, 75, 30);
		chargePanel.add(timeLabel30D);
		
		JLabel costLabel1 = new JLabel("3,000\uC6D0");
		costLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		costLabel1.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		costLabel1.setBounds(274, 150, 100, 30);
		chargePanel.add(costLabel1);
		
		JLabel lblNewLabel_1_6 = new JLabel("5,000\uC6D0");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_6.setBounds(274, 210, 100, 30);
		chargePanel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("7,000\uC6D0");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_7.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_7.setBounds(274, 270, 100, 30);
		chargePanel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("29,000\uC6D0");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_8.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_8.setBounds(274, 330, 100, 30);
		chargePanel.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("180,000\uC6D0");
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_9.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_9.setBounds(274, 390, 100, 30);
		chargePanel.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel(db.name+"님");
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_10.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_10.setBounds(484, 229, 100, 30);
		chargePanel.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_11.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_11.setBounds(484, 299, 100, 30);
		chargePanel.add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_12 = new JLabel("\uCD1D \uACC4");
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_12.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_12.setBounds(484, 369, 75, 30);
		chargePanel.add(lblNewLabel_1_12);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton();
		rdbtnNewRadioButton.setBounds(382, 156, 21, 23);
		chargePanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton();
		rdbtnNewRadioButton_1.setBounds(382, 210, 21, 23);
		chargePanel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton();
		rdbtnNewRadioButton_2.setBounds(382, 270, 21, 23);
		chargePanel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton();
		rdbtnNewRadioButton_3.setBounds(382, 330, 21, 23);
		chargePanel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton();
		rdbtnNewRadioButton_4.setBounds(382, 390, 21, 23);
		chargePanel.add(rdbtnNewRadioButton_4);
		
		JLabel lblNewLabel_1_11_1 = new JLabel("00 : 00");
		lblNewLabel_1_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11_1.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_11_1.setBounds(571, 299, 100, 30);
		chargePanel.add(lblNewLabel_1_11_1);
		
		JLabel lblNewLabel_1_12_1 = new JLabel("10,000 \uC6D0");
		lblNewLabel_1_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_12_1.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		lblNewLabel_1_12_1.setBounds(571, 369, 100, 30);
		chargePanel.add(lblNewLabel_1_12_1);
		
		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(130, 454, 105, 27);
		btnCancel.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chargeFrame.setVisible(false);
			}
		});
		chargePanel.add(btnCancel);

		JButton btnPay = new JButton("결제하기");
		btnPay.setBounds(505, 454, 170, 27);
		btnPay.setFont(new Font("한컴 백제 M", Font.PLAIN, 20));
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chargePanel.setVisible(false);

			}
		});
		chargePanel.add(btnPay);
	}
	}
