package models;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex {

	private String name;
	private String id;
	private String password;
	private String email;
	private String birthday;
	
	
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

	public Ex(String name, String id, String password, String email, String birthday) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
		this.birthday = birthday;
	}



	

	

}
