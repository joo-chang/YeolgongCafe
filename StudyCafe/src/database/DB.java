package database;
import java.sql.Statement;
import models.Ex;
import models.SEAT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
	private Connection conn; // 2. Connection ��ü�� ����
	public boolean flag = false;
	public boolean flag1  = false;
	public String name ;
	public DB() {
		String url="jdbc:mysql://localhost:3306/studycafe?characterEncoding=UTF-8&serverTimezone=UTC";  
		String user="studycafe";
		String password="tntjr123emd";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //1. Class.forNmae���� Driver ����
			conn=DriverManager.getConnection(url, user, password); //3. DriverManager���� Connection��������� �޾� ����
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		//	System.out.println("db���� �� ��");
			e.printStackTrace();
		}
	}
	public void insert(Ex x) {
		String sql ="insert into ex values(?,?,?,?,?)";
		try {
			PreparedStatement pmt =conn.prepareStatement(sql);
			pmt.setString(1, x.getName());
			pmt.setString(2, x.getId());
			pmt.setString(3, x.getPassword());
			pmt.setString(4, x.getBirthday());
			pmt.setString(5, x.getEmail());
			pmt.executeUpdate();
			pmt.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insert2(SEAT seat) {
		String sql ="insert into ex values(?:?)";
		try {
			PreparedStatement pmt =conn.prepareStatement(sql);
			pmt.setInt(1,seat.getSeatnumber());
			pmt.setInt(2, seat.getPosition());
			pmt.executeUpdate();
			pmt.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	public void select_EX() { //����//
		try {
			Statement stm=conn.createStatement();
			String sql="select * from ex";
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("�̸� :" +rs.getString(1)+"  ID :"+rs.getString(2)+"  ��й�ȣ : "+rs.getString(3)+"  �̸���  : "+rs.getString(4)+"  ������� : "+rs.getString(5)); //���Ŀ� �߰�
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void check(String id,String passwd) {
		try {
			Statement stm;
			stm = conn.createStatement();
			String sql = "select * from ex";
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
				if(rs.getString(2).equals(id)&&rs.getString(3).equals(passwd)) {
					name = rs.getString(1);
					flag = true;	
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void joincheck(String id) {
		try {
			String sql="select * from ex";
			PreparedStatement pmt = conn.prepareStatement(sql);
			ResultSet rs=pmt.executeQuery(sql);		
		while(rs.next()) {
			if(rs.getString(2).equals(id)) {
				flag1 = true;
			}
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void delete() { //ȸ������ ����
		
	}
}
