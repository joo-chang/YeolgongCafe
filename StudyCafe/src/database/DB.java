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
import models.Sale;

public class DB {
	private Connection conn; // 2. Connection 객체를 생성
	public boolean flag = false;
	public boolean flag1 = false;
	public boolean confirm = false;
	public String confirm_number;

	public DB() {
		String url = "jdbc:mysql://localhost:3306/studycafe?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "studycafe";
		String password = "tntjr123emd";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. Class.forNmae으로 Driver 연결
			conn = DriverManager.getConnection(url, user, password); // 3. DriverManager으로 Connection멤버변수를 받아 연동
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// Insert 영역

	public void member_Insert(Member member) {
		String sql = "insert into members values(?,?,?,?,?)";
		try {
			PreparedStatement pmt = conn.prepareStatement(sql);
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

	public void payment_Insert(Payment payment) {

		String sql = "insert into payment(m_id,time)values(?,?)"; // (생략) 결제번호 (자동생성), id, pay_day,time
		try {
			PreparedStatement pmt = conn.prepareStatement(sql);
			pmt.setString(1, payment.getM_id());
			pmt.setInt(2, payment.getTime());// 외래키..?db.Id처럼..

			pmt.executeUpdate();
			pmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void confirmation_Insert(Confirmation confirmation) {
		String sql = "insert into confirmation values(?, ? ,?)";
		try {
			PreparedStatement pmt = conn.prepareStatement(sql);
			pmt.setString(1, confirmation.getConfirm_number()); // 인증번호 변경해야함
			pmt.setString(2, confirmation.getM_id());
			pmt.setInt(3, confirmation.getUser_time());
			pmt.executeUpdate();
			pmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Select 영역

	public void select_Member() { // 매출
		try {
			Statement stm = conn.createStatement();
			String sql = "select * from members";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				System.out.println("이름 :" + rs.getString(1) + "  ID :" + rs.getString(2) + "  비밀번호 : " + rs.getString(3)
						+ "  이메일  : " + rs.getString(4) + "  생년월일 : " + rs.getString(5)); // 추후에 추가
			}
			rs.close();
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Member check(String id, String passwd) { // 아이디랑 비밀번호가 일치하는가 - 로그인할때
		Member member = new Member();
		try {
			Statement stm = conn.createStatement();
			String sql = "select * from members";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				if (rs.getString(2).equals(id) && rs.getString(3).equals(passwd)) {
					member.setId(rs.getString(2));
					flag1 = true;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return member;
	}

	public Member select_Name(String id) { // 아이디 검색해서 이름 가져오기
		Member member = new Member();
		try {
			Statement stm = conn.createStatement();

			String sql = "select * from members";

			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				if (rs.getString(2).equals(id)) {
					member.setName(rs.getString(1));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return member;
	}

	public Confirmation select_Usertime(String id) { // 아이디 검색해서 이름 가져오기 - confirmation에 있는 튜플 사용할때
		Confirmation confirmation = new Confirmation();
		try {
			Statement stm = conn.createStatement();
			String sql = "select * from confirmation";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString(2).equals(id)) {
					confirmation.setUser_time(rs.getInt(3));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return confirmation;
	}

	public void joincheck(String id) { // 중복체크 (회원가입)
		try {
			String sql = "select * from members";
			PreparedStatement pmt = conn.prepareStatement(sql);
			ResultSet rs = pmt.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString(2).equals(id)) {
					flag1 = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void c_joincheck(String id) { // 중복체크 confirmation에 해당 id가 존재하는가
		try {
			String sql = "select * from confirmation";
			PreparedStatement pmt = conn.prepareStatement(sql);
			ResultSet rs = pmt.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString(2).equals(id)) {
					flag1 = true;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void confirmation_Update(Confirmation confirmation) {
		String sql = "update confirmation set user_time = ? where m_id= ?";
		try {
			PreparedStatement pmt = conn.prepareStatement(sql);
			pmt.setInt(1, confirmation.getUser_time());
			pmt.setString(2, confirmation.getM_id());
			pmt.executeUpdate();
			pmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
	}

	public Price select_price(int num) {
		Price s_price = new Price();
		try {
			Statement stm = conn.createStatement();
			String sql = "select * from price";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				if (Integer.parseInt(rs.getString(1)) == num) {
					s_price.setTime(rs.getInt(1));
					s_price.setPrice(rs.getInt(2));
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return s_price;

	}

	public Confirmation select_Confirm_n(String id) { // 아이디 검색해서 confirm_number확인시켜주기
		Confirmation confirmation = new Confirmation();
		try {
			Statement stm = conn.createStatement();
			String sql = "select * from confirmation";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString(2).equals(id)) {
					confirmation.setConfirm_number(rs.getString(1));
					confirm_number = confirmation.getConfirm_number();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return confirmation;
	}

	public boolean confirm_check(String confirm_number) { // 입장하기 체크
		try {
			Statement stm = conn.createStatement();
			String sql = "select * from confirmation";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString(1).equals(confirm_number)) {
					confirm = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return confirm;
	}

	public Sale print_sale() {
		Sale sale = new Sale();
		try {

			String sql = "select  DATE_FORMAT(payment.pay_day, '%Y-%m-%d') as 결제일, payment.m_id as 회원 ,payment.time, price.price as 결제금액 \r\n"
					+ "from payment,price,members\r\n"
					+ "where payment.time=price.time and members.id =payment.m_id \r\n" + "order by payment.pay_day";
			PreparedStatement pmt = conn.prepareStatement(sql);
			ResultSet rs = pmt.executeQuery(sql);
			while (rs.next()) {
				sale.setPayday(rs.getString(1));
				sale.setConfirm_number(rs.getString(2));
				sale.setM_id(rs.getString(3));
				sale.setPrice(rs.getString(4));
				rs.close();
				pmt.close();

				System.out.println("사용중아님");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sale;
	}

}
