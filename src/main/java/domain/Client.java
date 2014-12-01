package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Client {
	
	private String type;
	private newUser user;
	private String clientDateTime;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public newUser getUser() {
		return user;
	}
	public void setUser(newUser user) {
		this.user = user;
	}
	public String getClientDateTime() {
		return clientDateTime;
	}
	public void setClientDateTime(String clientDateTime) {
		this.clientDateTime = clientDateTime;
	}
	
	

}
