package models;

public class Payment {
	private int pay_nember;
	private String m_id;
	private int pay_day;
	private int time;
	
	public int getPay_nember() {
		return pay_nember;
	}
	public void setPay_nember(int pay_nember) {
		this.pay_nember = pay_nember;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public int getPay_day() {
		return pay_day;
	}
	public void setPay_day(int pay_day) {
		this.pay_day = pay_day;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public Payment(int pay_nember, String m_id, int pay_day, int time) {
		super();
		this.pay_nember = pay_nember;
		this.m_id = m_id;
		this.pay_day = pay_day;
		this.time = time;
	}
	
	

}
