package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import database.DB;
import models.Member;

import javax.swing.JButton;

public class CreateAccountPage extends DB{

   private JFrame creatAccountFrame;
   boolean duplicate = false;
 
   public CreateAccountPage() {
      initialize();
   }

   private void initialize() {
      creatAccountFrame = new JFrame();
      creatAccountFrame.setVisible(true);
      creatAccountFrame.setBounds(100, 100, 800, 600);
      creatAccountFrame.setLocationRelativeTo(null);
      creatAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      creatAccountFrame.getContentPane().setLayout(null);

      // createAccountPanel
      JPanel createAccountPanel = new JPanel();
      createAccountPanel.setBounds(0, 0, 784, 561);
      creatAccountFrame.getContentPane().add(createAccountPanel);
      createAccountPanel.setVisible(true);
      createAccountPanel.setLayout(null);

      JLabel name_lb = new JLabel("�̸�");
      name_lb.setBounds(262, 103, 111, 35);
      creatAccountFrame.getContentPane().add(name_lb);
      createAccountPanel.add(name_lb);

      JLabel id_lb = new JLabel("I D");
      id_lb.setBounds(262, 169, 62, 18);
      creatAccountFrame.getContentPane().add(id_lb);
      createAccountPanel.add(id_lb);

      JLabel password_lb = new JLabel("Password");
      password_lb.setBounds(262, 229, 98, 18);
      createAccountPanel.add(password_lb);

      JLabel birth_lb = new JLabel("�������");
      birth_lb.setBounds(262, 289, 62, 18);
      createAccountPanel.add(birth_lb);

      JLabel email_lb = new JLabel("email");
      email_lb.setBounds(262, 345, 98, 18);
      createAccountPanel.add(email_lb);

      JLabel account_lb = new JLabel("ȸ������");
      account_lb.setFont(new Font("�޸տ�����", Font.PLAIN, 30));
      account_lb.setHorizontalAlignment(SwingConstants.CENTER);
      account_lb.setBounds(303, 34, 168, 44);
      createAccountPanel.add(account_lb);

      JTextField name_tf = new JTextField();
      name_tf.setBounds(355, 108, 116, 24);
      createAccountPanel.add(name_tf);
      name_tf.setColumns(10);

      JTextField id_tf = new JTextField();
      id_tf.setBounds(355, 166, 116, 24);
      createAccountPanel.add(id_tf);
      id_tf.setColumns(10);

      JButton btnIdCheck = new JButton("�ߺ�Ȯ��");
      btnIdCheck.setBounds(493, 165, 105, 27);
      createAccountPanel.add(btnIdCheck);
      btnIdCheck.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            joincheck(id_tf.getText());
            duplicate = true;
            if (flag1) {
               JOptionPane.showMessageDialog(null, "�̹� ���ԵǾ� �ִ� ID�Դϴ�.");
            } else {
               JOptionPane.showMessageDialog(null, "���� ������ ID�Դϴ�.");
            }
         }
      });

      JPasswordField password_pf = new JPasswordField();
      password_pf.setBounds(355, 226, 116, 24);
      createAccountPanel.add(password_pf);
      password_pf.setColumns(10);

      JTextField birth_tf = new JTextField();
      birth_tf.setBounds(355, 286, 116, 24);
      createAccountPanel.add(birth_tf);
      birth_tf.setColumns(10);

      JTextField email_tf = new JTextField();
      email_tf.setBounds(355, 342, 167, 24);
      createAccountPanel.add(email_tf);
      email_tf.setColumns(10);

      JButton btnJoin = new JButton("�����ϱ�");
      btnJoin.setBounds(417, 411, 105, 27);
      createAccountPanel.add(btnJoin);
      btnJoin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            DB db = new DB();

            if (name_tf.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "�̸��� �Է����ּ���.");
            } else if (id_tf.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���.");
            } else if (password_pf.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ּ���.");
            } else if (birth_tf.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "������ �Է����ּ���.");
            } else if (email_tf.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "�̸����� �Է����ּ���.");
            } else {
               db.joincheck(id_tf.getText());
               if (db.flag1) {
                  JOptionPane.showMessageDialog(null, "���̵� �ߺ� Ȯ���� ���ּ���.");
               } else if(!duplicate){
                  JOptionPane.showMessageDialog(null, "���̵�  �ߺ� Ȯ���� ���ּ���.");
               }else {
                  Member member = new Member(name_tf.getText(), id_tf.getText(), password_pf.getText(),
                        birth_tf.getText(), email_tf.getText());
                  db.member_Insert(member);
                  JOptionPane.showMessageDialog(null, "ȸ�� ������ �Ϸ�Ǿ����ϴ�.");
                  creatAccountFrame.setVisible(false);
               }
            }
         }
      });

      JButton btnCancel = new JButton("���");
      btnCancel.setBounds(255, 411, 105, 27);
      btnCancel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            creatAccountFrame.setVisible(false);

         }
      });
      createAccountPanel.add(btnCancel);
   }

}