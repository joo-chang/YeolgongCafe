import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ChargePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChargePage frame = new ChargePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChargePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("�ð� ����");
		lblNewLabel.setBounds(0, 60, 784, 60);
		lblNewLabel.setFont(new Font("�޸տ�����", Font.PLAIN, 40));
		contentPane.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("2 \uC2DC\uAC04");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(130, 150, 75, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("4 \uC2DC\uAC04");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(130, 210, 75, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("6 \uC2DC\uAC04");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(130, 270, 75, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("24 \uC2DC\uAC04");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(130, 330, 75, 30);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("30 \uC77C\uAD8C");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(130, 390, 75, 30);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("3,000\uC6D0");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_5.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_5.setBounds(274, 150, 100, 30);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("5,000\uC6D0");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_6.setBounds(274, 210, 100, 30);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("7,000\uC6D0");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_7.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_7.setBounds(274, 270, 100, 30);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("29,000\uC6D0");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_8.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_8.setBounds(274, 330, 100, 30);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("180,000\uC6D0");
		lblNewLabel_1_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_9.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_9.setBounds(274, 390, 100, 30);
		contentPane.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("\uBC15\uC8FC\uCC3D \uB2D8");
		lblNewLabel_1_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_10.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_10.setBounds(484, 229, 100, 30);
		contentPane.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_11.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_11.setBounds(484, 299, 100, 30);
		contentPane.add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_12 = new JLabel("\uCD1D \uACC4");
		lblNewLabel_1_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_12.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_12.setBounds(484, 369, 75, 30);
		contentPane.add(lblNewLabel_1_12);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton();
		rdbtnNewRadioButton.setBounds(382, 156, 21, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton();
		rdbtnNewRadioButton_1.setBounds(382, 210, 21, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton();
		rdbtnNewRadioButton_2.setBounds(382, 270, 21, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton();
		rdbtnNewRadioButton_3.setBounds(382, 330, 21, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton();
		rdbtnNewRadioButton_4.setBounds(382, 390, 21, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JLabel lblNewLabel_1_11_1 = new JLabel("00 : 00");
		lblNewLabel_1_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11_1.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_11_1.setBounds(571, 299, 100, 30);
		contentPane.add(lblNewLabel_1_11_1);
		
		JLabel lblNewLabel_1_12_1 = new JLabel("10,000 \uC6D0");
		lblNewLabel_1_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_12_1.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		lblNewLabel_1_12_1.setBounds(571, 369, 100, 30);
		contentPane.add(lblNewLabel_1_12_1);
		
		JButton btnCancel = new JButton("���");
		btnCancel.setBounds(130, 454, 105, 27);
		btnCancel.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);

			}
		});
		contentPane.add(btnCancel);

		JButton btnPay = new JButton("�����ϱ�");
		btnPay.setBounds(535, 454, 105, 27);
		btnPay.setFont(new Font("���� ���� M", Font.PLAIN, 20));
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);

			}
		});
		contentPane.add(btnPay);
	}
}
