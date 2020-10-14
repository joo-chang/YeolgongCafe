package gui;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import database.DB;
import models.Payment;
import models.Price;

public class ChargePage {
	static int fee;
	static int time;
	private JFrame chargeFrame;
	JLabel lblNewLabel_1_12_1 = new JLabel("�Ѱ� : "+fee+"��");
    Price price = new Price();
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
		db.select_Usertime(user_Id);
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
		
		JLabel lblNewLabel = new JLabel("�ð� ����");
		lblNewLabel.setBounds(0, 60, 784, 60);
		lblNewLabel.setFont(new Font("�޸տ�����", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		chargePanel.add(lblNewLabel);
		
		JLabel timeLabel2H = new JLabel("2 \uC2DC\uAC04");
		timeLabel2H.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel2H.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		timeLabel2H.setBounds(130, 150, 75, 30);
		chargePanel.add(timeLabel2H);
		
		JLabel timeLabel4H = new JLabel("4 \uC2DC\uAC04");
		timeLabel4H.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel4H.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		timeLabel4H.setBounds(130, 210, 75, 30);
		chargePanel.add(timeLabel4H);
		
		JLabel timeLabel6H = new JLabel("6 \uC2DC\uAC04");
		timeLabel6H.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel6H.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		timeLabel6H.setBounds(130, 270, 75, 30);
		chargePanel.add(timeLabel6H);
		
		JLabel timeLabel24H = new JLabel("24 \uC2DC\uAC04");
		timeLabel24H.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel24H.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		timeLabel24H.setBounds(130, 330, 75, 30);
		chargePanel.add(timeLabel24H);
		
		JLabel timeLabel30D = new JLabel("120 �ð�");
		timeLabel30D.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel30D.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		timeLabel30D.setBounds(120, 390, 100, 30);
		chargePanel.add(timeLabel30D);
		
		JLabel costLabel1 = new JLabel("3,000\uC6D0");
		costLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
		costLabel1.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		costLabel1.setBounds(274, 150, 100, 30);
		chargePanel.add(costLabel1);
		
		JLabel lblNewLabel_1_6 = new JLabel("5,000\uC6D0");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_6.setBounds(274, 210, 100, 30);
		chargePanel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("7,000\uC6D0");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_7.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_7.setBounds(274, 270, 100, 30);
		chargePanel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("25,000\uC6D0");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_8.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_8.setBounds(274, 330, 100, 30);
		chargePanel.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("110,000\uC6D0");
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_9.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_9.setBounds(274, 390, 100, 30);
		chargePanel.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel(db.name+"��");
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_10.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_10.setBounds(484, 229, 100, 30);
		chargePanel.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("���� �ð� : ");
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_11.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_11.setBounds(484, 299, 120, 30);
		chargePanel.add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_11_1 = new JLabel(db.user_time+"��");
		lblNewLabel_1_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11_1.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_11_1.setBounds(571, 299, 100, 30);
		chargePanel.add(lblNewLabel_1_11_1);
	
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("3000");
		rdbtnNewRadioButton.setBounds(382, 156, 21, 23);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()){
					fee=Integer.parseInt(rdbtnNewRadioButton.getText());
					lblNewLabel_1_12_1.setText("�Ѱ� : "+fee+"��");

		            price = db.select_price(120);

				}
			}
		});
		chargePanel.add(rdbtnNewRadioButton);
		
			
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("5000");
		rdbtnNewRadioButton_1.setBounds(382, 210, 21, 23);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()){
					fee=Integer.parseInt(rdbtnNewRadioButton_1.getText());
					lblNewLabel_1_12_1.setText("�Ѱ� : "+fee+"��");
				}
			}
		});
		chargePanel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("7000");
		rdbtnNewRadioButton_2.setBounds(382, 270, 21, 23);
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected()){
					fee=Integer.parseInt(rdbtnNewRadioButton_2.getText());
					lblNewLabel_1_12_1.setText("�Ѱ� : "+fee+"��");
				}
			}
		});
		chargePanel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("25000");
		rdbtnNewRadioButton_3.setBounds(382, 330, 21, 23);
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_3.isSelected()){
					fee=Integer.parseInt(rdbtnNewRadioButton_3.getText());
					lblNewLabel_1_12_1.setText("�Ѱ� : "+fee+"��");
				}
			}
		});
		chargePanel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("110000");
		rdbtnNewRadioButton_4.setBounds(382, 390, 21, 23);
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_4.isSelected()){
					fee=Integer.parseInt(rdbtnNewRadioButton_4.getText());
					lblNewLabel_1_12_1.setText("�Ѱ� : "+fee+"��");
				}
			}
		});
		chargePanel.add(rdbtnNewRadioButton_4);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		bg.add(rdbtnNewRadioButton_4);
		
		
		lblNewLabel_1_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_12_1.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_12_1.setBounds(460, 369, 180, 30);
		chargePanel.add(lblNewLabel_1_12_1);
		
		if(rdbtnNewRadioButton.isSelected()){
			fee=Integer.parseInt(rdbtnNewRadioButton.getText());
			System.out.println(fee);
		}else if( rdbtnNewRadioButton_1.isSelected()){
			fee=Integer.parseInt(rdbtnNewRadioButton_1.getText());
			lblNewLabel_1_12_1.getText();
		}else if( rdbtnNewRadioButton_2.isSelected()){
			fee=Integer.parseInt(rdbtnNewRadioButton_2.getText());
			lblNewLabel_1_12_1.getText();
		}else if( rdbtnNewRadioButton_3.isSelected()){
			fee=Integer.parseInt(rdbtnNewRadioButton_3.getText());
			lblNewLabel_1_12_1.getText();
		}else if( rdbtnNewRadioButton_4.isSelected()){
			fee=Integer.parseInt(rdbtnNewRadioButton_4.getText());
			lblNewLabel_1_12_1.getText();
		}
		
		JButton btnCancel = new JButton("���");
		btnCancel.setBounds(130, 454, 105, 27);
		btnCancel.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chargeFrame.setVisible(false);
			}
		});
		chargePanel.add(btnCancel);
	
		JButton btnPay = new JButton("�����ϱ�");
		btnPay.setBounds(505, 454, 170, 27);
		btnPay.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"�� �ݾ� : "+fee		
				+"        ���� �� ���� �ð� : "+(db.user_time+time)+"��"
				+"        ���� �Ͻðڽ��ϱ�?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
				if(result == JOptionPane.YES_OPTION) {//���� ���� ���
					price.getPrice();
					Payment payment = new Payment(1,db.Id,201,price.getTime());
					db.payment_Insert(payment);
				}
			}
		});
		chargePanel.add(btnPay);
		
	}
	}

	
