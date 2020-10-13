package gui;

import java.awt.EventQueue;
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

public class CreateAccountPage {

   private JFrame creatAccountFrame;
   boolean duplicate = false;
   /**
    * Launch the application.
    */

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               CreateAccountPage window = new CreateAccountPage();
               window.creatAccountFrame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public CreateAccountPage() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
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

      JLabel labelName = new JLabel("�̸�");
      labelName.setBounds(262, 103, 111, 35);
      creatAccountFrame.getContentPane().add(labelName);
      createAccountPanel.add(labelName);

      JLabel labelId = new JLabel("I D");
      labelId.setBounds(262, 169, 62, 18);
      creatAccountFrame.getContentPane().add(labelId);
      createAccountPanel.add(labelId);

      JLabel labelPassword = new JLabel("Password");
      labelPassword.setBounds(262, 229, 98, 18);
      createAccountPanel.add(labelPassword);

      JLabel labelBirth = new JLabel("�������");
      labelBirth.setBounds(262, 289, 62, 18);
      createAccountPanel.add(labelBirth);

      JLabel labelEmail = new JLabel("email");
      labelEmail.setBounds(262, 345, 98, 18);
      createAccountPanel.add(labelEmail);

      JLabel labelAccount = new JLabel("ȸ������");
      labelAccount.setFont(new Font("�޸տ�����", Font.PLAIN, 30));
      labelAccount.setHorizontalAlignment(SwingConstants.CENTER);
      labelAccount.setBounds(303, 34, 168, 44);
      createAccountPanel.add(labelAccount);

      JTextField textName = new JTextField();
      textName.setBounds(355, 108, 116, 24);
      createAccountPanel.add(textName);
      textName.setColumns(10);

      JTextField textId = new JTextField();
      textId.setBounds(355, 166, 116, 24);
      createAccountPanel.add(textId);
      textId.setColumns(10);

      JButton btnIdCheck = new JButton("�ߺ�Ȯ��");
      btnIdCheck.setBounds(493, 165, 105, 27);
      createAccountPanel.add(btnIdCheck);
      btnIdCheck.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            DB db = new DB();
            db.joincheck(textId.getText());
            duplicate = true;
            if (db.flag1) {
               JOptionPane.showMessageDialog(null, "�̹� ���ԵǾ� �ִ� ID�Դϴ�.");
            } else {
               JOptionPane.showMessageDialog(null, "���� ������ ID�Դϴ�.");
            }
         }
      });

      JPasswordField textPassword = new JPasswordField();
      textPassword.setBounds(355, 226, 116, 24);
      createAccountPanel.add(textPassword);
      textPassword.setColumns(10);

      JTextField textBirth = new JTextField();
      textBirth.setBounds(355, 286, 116, 24);
      createAccountPanel.add(textBirth);
      textBirth.setColumns(10);

      JTextField textEmail = new JTextField();
      textEmail.setBounds(355, 342, 167, 24);
      createAccountPanel.add(textEmail);
      textEmail.setColumns(10);

      JButton btnJoin = new JButton("�����ϱ�");
      btnJoin.setBounds(417, 411, 105, 27);
      createAccountPanel.add(btnJoin);
      btnJoin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            DB db = new DB();

            if (textName.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "�̸��� �Է����ּ���.");
            } else if (textId.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���.");
            } else if (textPassword.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ּ���.");
            } else if (textBirth.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "������ �Է����ּ���.");
            } else if (textEmail.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "�̸����� �Է����ּ���.");
            } else {
               db.joincheck(textId.getText());
               if (db.flag1) {
                  JOptionPane.showMessageDialog(null, "���̵� �ߺ� Ȯ���� ���ּ���.");
               } else if(!duplicate){
                  JOptionPane.showMessageDialog(null, "���̵�  �ߺ� Ȯ���� ���ּ���.");
               }else {
                  Member member = new Member(textName.getText(), textId.getText(), textPassword.getText(),
                        textBirth.getText(), textEmail.getText());
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