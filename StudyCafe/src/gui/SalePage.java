package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import database.DB;
import models.Sale;
import javax.swing.JLabel;

public class SalePage extends JFrame implements MouseListener, ActionListener {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private static final char[] Date = null;
   DB db = new DB();
   Sale sale = new Sale();
   Vector heading;
   Vector v;
   DefaultTableModel model;
   JTable jTable;
   JScrollPane pane;
   JButton btn, btn1, btn2, btn3;

   JPanel panel;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;

   public SalePage() {
      super("����ǥ");
      initialize();
   }
   

   public void initialize() {
      model = new DefaultTableModel(v, heading);
      getContentPane().setLayout(null);
      setBounds(100, 100, 800, 600);
      setLocationRelativeTo(null);

      jTable = new JTable(model);
      pane = new JScrollPane(jTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

      JPanel panel = new JPanel(); // ��ũ���г�
      jTable.setPreferredSize(new Dimension(600, 600));
      panel.add(pane);
      panel.setBounds(0, 0, 782, 462);
      getContentPane().add(panel);

      JPanel jp_btn = new JPanel(); // ��ư �г�
      jp_btn.setBounds(0, 474, 782, 79);

      JButton btnNewButton = new JButton("��ü ����");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
        	 v=db.print_sale();
        	 System.out.println("v="+v);
        	 heading=getColumn();
        	 initialize();
         }
      });
      btnNewButton.setBounds(14, 600, 105, 44);
      jp_btn.add(btnNewButton);

      JButton button = new JButton("���� �Ѹ���");
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 v =db.print_sale_sum();
        	 System.out.println("v="+v);
        	 heading=getColumn_sum();
        	 initialize();
         }
      });
      button.setBounds(133, 600, 105, 44);
      jp_btn.add(button);

      getContentPane().add(panel);

      textField_3 = new JTextField();
      jp_btn.add(textField_3);
      textField_3.setColumns(10);

      JLabel lblNewLabel = new JLabel("��");
      jp_btn.add(lblNewLabel);

      textField_4 = new JTextField();
      jp_btn.add(textField_4);
      textField_4.setColumns(10);

      JLabel lblNewLabel_1 = new JLabel("��");
      jp_btn.add(lblNewLabel_1);

      textField_5 = new JTextField();
      jp_btn.add(textField_5);
      textField_5.setColumns(10);

      JLabel lblNewLabel_2 = new JLabel("��");
      jp_btn.add(lblNewLabel_2);
      
     

      JButton btnNewButton_1 = new JButton("�˻�");
      btnNewButton_1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	 String Date=textField_3.getText()+"-"+textField_4.getText()+"-"+textField_5.getText();
        	 System.out.println(Date);
         	 v=db.print_sale_byDate(Date);
         	 System.out.println("v="+v);
         	 heading=getColumn();
         	 initialize();
          }
       });
      jp_btn.add(btnNewButton_1);
      

      getContentPane().add(jp_btn);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }

   private Vector getColumn() {

      // TODO Auto-generated method stub
      Vector heading = new Vector();
      heading.add("������");
      heading.add("������ȣ");
      heading.add("�̸�");
      heading.add("����");
      return heading;
   }

   private Vector getColumn_sum() {
      // TODO Auto-generated method stub
      Vector heading = new Vector();
      heading.add("������");
      heading.add("�Ѹ���");
      return heading;
   }

   public static void main(String[] args) {
      new SalePage();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mouseClicked(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mousePressed(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub

   }
}