import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	private String name;
	private String id;
	private String password;
	private String email;
	private String birthday;
	private String phonenumber;
	
	
	BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	
	public Ex() throws IOException {
		System.out.println("이름");
		name=in.readLine();
		System.out.println("아이디");
		id=in.readLine();
		System.out.println("비밀번호");
		password=in.readLine();
		System.out.println("이메일");
		email=in.readLine();
		System.out.println("생년월일");
		birthday=in.readLine();
		System.out.println("핸드폰번호");
		phonenumber=in.readLine();
	
		
		
		
		
	}
	

}
