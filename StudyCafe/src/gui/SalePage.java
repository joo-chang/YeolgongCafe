package gui;

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
import javax.swing.table.DefaultTableModel;

import database.DB;
import models.Sale;

public class SalePage extends JFrame implements MouseListener, ActionListener {

   DB db = new DB();
   Vector heading;
   Vector v;
   DefaultTableModel model;
   JTable jTable;
   JScrollPane pane;
   JPanel panel;
   JButton btn;

   public SalePage() {
      initialize();
   }

   public void initialize() {

      Sale sale = new Sale();
      v = db.print_sale();
      System.out.println("v=" + v);
      heading = getColumn();

      model = new DefaultTableModel(v, heading);

      jTable = new JTable(model);
      pane = new JScrollPane(jTable);
      add(pane);

      setSize(800, 200);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }


   private Vector getColumn() {
      // TODO Auto-generated method stub
      Vector heading = new Vector();
      heading.add("결제일");
      heading.add("인증번호");
      heading.add("이름");
      heading.add("가격");
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