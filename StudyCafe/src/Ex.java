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
		System.out.println("�̸�");
		name=in.readLine();
		System.out.println("���̵�");
		id=in.readLine();
		System.out.println("��й�ȣ");
		password=in.readLine();
		System.out.println("�̸���");
		email=in.readLine();
		System.out.println("�������");
		birthday=in.readLine();
		System.out.println("�ڵ�����ȣ");
		phonenumber=in.readLine();
	
		
		
		
		
	}
	

}
