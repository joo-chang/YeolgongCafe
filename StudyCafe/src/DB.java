import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
	private Connection conn; // 2. Connection ��ü�� ����
	public DB() {
		String url="jdbc:mysql://localhost:3306/client_db?characterEncoding=UTF-8&serverTimezone=UTC";  
		String user="manager";
		String password="anyang605";
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
		String sql ="insert into ex values(?,?,?,?,?,?)";
		//String sql ="insert into member values(?,?,?,?)";
		try {
			PreparedStatement pmt =conn.prepareStatement(sql);
			pmt.setString(1,x.getName());
			pmt.setString(2, x.getId());
			pmt.setString(3, x.getPassword());
			pmt.setString(4, x.getEmail());
			pmt.setString(5,x.getBirthday());
			pmt.setString(6, x.getPhonenumber());
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
				System.out.println("3�̸� :" +rs.getString(1)+"  ID :"+rs.getString(2)+"  ��й�ȣ : "+rs.getString(3)+"  �̸���  : "+rs.getString(4)+"  ������� : "+rs.getString(5)+"  �ڵ��� ��ȣ  :"+rs.getString(6)); //���Ŀ� �߰�
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void delete() { //ȸ������ ����
		
	}

}
