package domain;

public class newUser {
 
	private String userName;

	private String firstName;

	private String lastName;

	private String password;
	
	private String emailId;
	
	private String[] deviceinfo;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getDeviceinfo() {
		return deviceinfo;
	}

	public void setDeviceinfo(String[] deviceinfo) {
		this.deviceinfo = deviceinfo;
	}
	
	
}
