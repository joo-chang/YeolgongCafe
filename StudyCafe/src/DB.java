import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
	private Connection conn; // 2. Connection 객체를 생성
	public DB() {
		String url="jdbc:mysql://localhost:3306/client_db?characterEncoding=UTF-8&serverTimezone=UTC";  
		String user="manager";
		String password="anyang605";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //1. Class.forNmae으로 Driver 연결
			conn=DriverManager.getConnection(url, user, password); //3. DriverManager으로 Connection멤버변수를 받아 연동
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		//	System.out.println("db연동 안 됨");
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
			
	public void select_EX() { //매출//
		try {
			Statement stm=conn.createStatement();
			String sql="select * from ex";
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				System.out.println("3이름 :" +rs.getString(1)+"  ID :"+rs.getString(2)+"  비밀번호 : "+rs.getString(3)+"  이메일  : "+rs.getString(4)+"  생년월일 : "+rs.getString(5)+"  핸드폰 번호  :"+rs.getString(6)); //추후에 추가
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void delete() { //회원정보 삭제
		
	}

}
