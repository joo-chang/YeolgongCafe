package models;

public class Confirmation {
	private int confirm_number;
	private String m_id;
	private int user_time;
	
	public int getConfirm_number() {
		return confirm_number;
	}
	public void setConfirm_number(int confirm_number) {
		this.confirm_number = confirm_number;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public int getUser_time() {
		return user_time;
	}
	public void setUser_time(int user_time) {
		this.user_time = user_time;
	}
	public Confirmation(){
		
	}

	public Confirmation(int confirm_number, String m_id, int user_time) {
		super();
		this.confirm_number=confirm_number;
		this.m_id = m_id;
		this.user_time = user_time;
	}
	
}
