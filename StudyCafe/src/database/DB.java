package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.Confirmation;
import models.Member;
import models.Payment;
import models.Price;

public class DB {
	private Connection conn; // 2. Connection 객체를 생성
	public boolean flag = false;
	public boolean flag1  = false;
	public DB() {
		String url="jdbc:mysql://localhost:3306/studycafe?characterEncoding=UTF-8&serverTimezone=UTC";  
		String user="studycafe";
		String password="tntjr123emd";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //1. Class.forNmae으로 Driver 연결
			conn=DriverManager.getConnection(url, user, password); //3. DriverManager으로 Connection멤버변수를 받아 연동
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public void member_Insert(Member member) {
		String sql ="insert into members values(?,?,?,?,?)";
		try {
			PreparedStatement pmt =conn.prepareStatement(sql);
			pmt.setString(1, member.getName());
			pmt.setString(2, member.getId());
			pmt.setString(3, member.getPassword());
			pmt.setString(4, member.getBirthday());
			pmt.setString(5, member.getEmail());
			pmt.executeUpdate();
			pmt.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select_Member() { //매출
		try {
			Statement stm=conn.createStatement();
			String sql="select * from members";
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("이름 :" +rs.getString(1)+"  ID :"+rs.getString(2)+"  비밀번호 : "+rs.getString(3)+"  이메일  : "+rs.getString(4)+"  생년월일 : "+rs.getString(5)); //추후에 추가
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Member check(String id,String passwd) { //아이디랑 비밀번호가 일치하는가
		Member member = new Member();
		try {
			Statement stm=conn.createStatement();
			String sql = "select * from members";
			ResultSet rs = stm.executeQuery(sql);

			while(rs.next()) {
				if(rs.getString(2).equals(id)&&rs.getString(3).equals(passwd)) {
					member.setId(rs.getString(2));
					flag = true;	
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return member;
	}
	public Member select_Name(String id) { //아이디 검색해서 이름 가져오기
		Member member = new Member();
	      try {
	         Statement stm=conn.createStatement();

	         String sql = "select * from members";

	         ResultSet rs = stm.executeQuery(sql);

	         while(rs.next()) {
	            if(rs.getString(2).equals(id)) {
	               member.setName(rs.getString(1));
	            }
	         }
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      
	      return member;
	   }
	public Confirmation select_Usertime(String id) { //아이디 검색해서 이름 가져오기
		Confirmation confirmation = new Confirmation();
		try {
			Statement stm=conn.createStatement();
			String sql = "select * from confirmation";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
	            if(rs.getString(2).equals(id)) {
	            	confirmation.setUser_time(rs.getInt(3));
	            }	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return confirmation;
	}
	public void joincheck(String id) { //중복체크
		try {
			String sql="select * from members";
			PreparedStatement pmt = conn.prepareStatement(sql);
			ResultSet rs=pmt.executeQuery(sql);		
		while(rs.next()) {
			if(rs.getString(2).equals(id)) {
				flag1 = true;
			}
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	public void c_joincheck(String id) { //중복체크
		try {
			String sql="select * from confirmation";
			PreparedStatement pmt = conn.prepareStatement(sql);
			ResultSet rs=pmt.executeQuery(sql);		
		while(rs.next()) {
			if(rs.getString(2).equals(id)) {
				flag1 = true;
			}
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	public void confirmation_Update(Confirmation confirmation) {
		String sql ="update confirmation set user_time = ? where m_id= ?"; 
		try {
			PreparedStatement pmt =conn.prepareStatement(sql);
			pmt.setInt(1, confirmation.getUser_time());
			pmt.setString(2, confirmation.getM_id());
			pmt.executeUpdate();
			pmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	public void confirmation_Insert(Confirmation confirmation) {
		String sql ="insert into confirmation values(?, ? ,?)"; 
		try {
			PreparedStatement pmt =conn.prepareStatement(sql);
			pmt.setInt(1, 1234); //인증번호 변경해야함
			pmt.setString(2, confirmation.getM_id());
			pmt.setInt(3, confirmation.getUser_time());
			pmt.executeUpdate();
			pmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	public void payment_Insert(Payment payment) { 

		String sql ="insert into payment(m_id,time)values(?,?)"; // (생략) 결제번호 (자동생성), id, pay_day,time
		try {
			PreparedStatement pmt =conn.prepareStatement(sql);
			pmt.setString(1,payment.getM_id() );
			pmt.setInt(2, payment.getTime());//외래키..?db.Id처럼..

			pmt.executeUpdate();
			pmt.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//
		}
	}
	 public Price select_price(int num) {
	      Price s_price = new Price();
	      try {
	         Statement stm = conn.createStatement();
	         String sql = "select * from price";
	         ResultSet rs = stm.executeQuery(sql);
	         
	         while (rs.next()) {
	            if(Integer.parseInt(rs.getString(1))== num) {
	               s_price.setTime(rs.getInt(1));
	               s_price.setPrice(rs.getInt(2));
	            }

	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      return s_price;

	   }
}
