package database;
import java.sql.Statement;
import models.Ex;
import models.Payment;
import models.Price;
import models.SEAT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
	private Connection conn; // 2. Connection 객체를 생성
	public boolean flag = false;
	public boolean flag1  = false;
	public String name ;
	public DB() {
		String url="jdbc:mysql://localhost:3306/studycafe?characterEncoding=UTF-8&serverTimezone=UTC";  
		String user="studycafe";
		String password="tntjr123emd";
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
			
	public void select_EX() { //매출//
		try {
			Statement stm=conn.createStatement();
			String sql="select * from ex";
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("이름 :" +rs.getString(1)+"  ID :"+rs.getString(2)+"  비밀번호 : "+rs.getString(3)+"  이메일  : "+rs.getString(4)+"  생년월일 : "+rs.getString(5)); //추후에 추가
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

	public void payment(Payment payment,Ex ex,Price price) { 
		String sql ="insert into payment values(?:?:?)"; // (생략) 결제번호 (자동생성), id, pay_day,time
		try {
			PreparedStatement pmt =conn.prepareStatement(sql);
			pmt.setString(1,ex.getId() );
			pmt.setString(2, payment.getToday());
			pmt.setInt(3, price.getTime());
			pmt.executeUpdate();
			pmt.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//
		}
	}
}
