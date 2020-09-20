import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SeatPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatPage window = new SeatPage();
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
	public SeatPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel SeatPanel = new JPanel();
		SeatPanel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(SeatPanel);
		SeatPanel.setVisible(true);
		SeatPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("\uCC44\uD305\uD558\uAE30");
		btnNewButton.setBounds(342, 463, 105, 60);
		SeatPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD1F4\uC2E4\uD558\uAE30");
		btnNewButton_1.setBounds(44, 463, 105, 60);
		SeatPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC2DC\uAC04\uCDA9\uC804");
		btnNewButton_2.setBounds(631, 463, 105, 60);
		SeatPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("뒤로가기");
		btnNewButton_3.setBounds(663, 12, 105, 30);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		SeatPanel.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("좌석을 선택해주세요.");
		lblNewLabel.setBounds(475, 16, 204, 23);
		SeatPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("사용자");
		lblNewLabel_1.setBounds(57, 18, 62, 18);
		SeatPanel.add(lblNewLabel_1);
		
		JLabel Nim = new JLabel("님");
		Nim.setBounds(107, 18, 62, 18);
		SeatPanel.add(Nim);
		
		//Seat
		JButton Seat1 = new JButton("");
		Seat1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Seat1.setBounds(56, 100, 29, 27);
		SeatPanel.add(Seat1);
		
		JButton Seat2 = new JButton("");
		Seat2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Seat2.setBounds(56,160, 29, 27);
		SeatPanel.add(Seat2);
		
		JButton Seat3 = new JButton("");
		Seat3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Seat3.setBounds(56,215, 29, 27);
		SeatPanel.add(Seat3);
		
		JButton Seat4 = new JButton("");
		Seat4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Seat4.setBounds(56,270, 29, 27);
		SeatPanel.add(Seat4);
		
		JButton Seat5 = new JButton("");
		Seat5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Seat5.setBounds(56,325, 29, 27);
		SeatPanel.add(Seat5);
		
		JButton button = new JButton("");
		button.setBounds(222, 100, 29, 27);
		SeatPanel.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(222, 160, 29, 27);
		SeatPanel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(222, 215, 29, 27);
		SeatPanel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(222, 270, 29, 27);
		SeatPanel.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(222, 325, 29, 27);
		SeatPanel.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(265, 100, 29, 27);
		SeatPanel.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(265, 160, 29, 27);
		SeatPanel.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(265, 215, 29, 27);
		SeatPanel.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBounds(265, 270, 29, 27);
		SeatPanel.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(265, 325, 29, 27);
		SeatPanel.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(396, 100, 29, 27);
		SeatPanel.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(441, 100, 29, 27);
		SeatPanel.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(488, 100, 29, 27);
		SeatPanel.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(537, 100, 29, 27);
		SeatPanel.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(396, 160, 29, 27);
		SeatPanel.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(441, 160, 29, 27);
		SeatPanel.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBounds(488, 160, 29, 27);
		SeatPanel.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(537, 160, 29, 27);
		SeatPanel.add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(396, 270, 29, 27);
		SeatPanel.add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBounds(441, 270, 29, 27);
		SeatPanel.add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBounds(488, 270, 29, 27);
		SeatPanel.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBounds(537, 270, 29, 27);
		SeatPanel.add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(396, 325, 29, 27);
		SeatPanel.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBounds(441, 325, 29, 27);
		SeatPanel.add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBounds(488, 325, 29, 27);
		SeatPanel.add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBounds(537, 325, 29, 27);
		SeatPanel.add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBounds(663, 100, 29, 27);
		SeatPanel.add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.setBounds(663, 160, 29, 27);
		SeatPanel.add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBounds(663, 215, 29, 27);
		SeatPanel.add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBounds(663, 270, 29, 27);
		SeatPanel.add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBounds(663, 325, 29, 27);
		SeatPanel.add(button_30);
		
		
	}
}
