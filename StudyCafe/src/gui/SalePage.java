package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.DB;
import models.Sale;

public class SalePage extends JFrame {

   DB db = new DB();
   Sale sale = new Sale();
   JFrame frame = new JFrame("���� Ȯ�� ");
   JPanel panel = new JPanel();
   JLabel lblCount;
   public DefaultTableModel model;
   String[] heading = { "��������", "ȸ���̸�", "�����ð�", "�ݾ�" };
   String[][] data = new String[0][0];
   JTable table = new JTable(data, heading);

   
   public SalePage() {
   
      initialize();
      sale = db.print_sale();
   }

   public void initialize() {
      setBounds(200, 200, 500, 500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
//      model.addRow(sale);
//      model = new DefaultTableModel(,heading);
      table = new JTable(model);
      JScrollPane scrollPane = new JScrollPane(table);
      lblCount = new JLabel("�Ǽ� :0");
      add("Center",scrollPane);
      add("South",lblCount);
   }
   public static void main(String[] args) {
      new SalePage();
   }


}