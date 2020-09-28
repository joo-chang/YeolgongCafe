
public class Member {
	private String name;
	private String id;
	private String pw;
	private String birth;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Member(String name, String id, String pw, String birth, String email) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.email = email;
	}
	
}
