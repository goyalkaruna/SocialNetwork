package domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
    public User(){
        
    }
	public User( String firstName, String password, String lastName, String photoUrl){
		this.firstName = firstName;
		this.password = password;
		this.lastName = lastName;
		this.photoUrl= photoUrl;
		
	}
	private String id;

	private String userName;

	private String firstName;

	private String lastName;

	private String emailId;

	private String gender;
   
	//private UserState userState;  //active,inactive



	private String password;

	//private String salt;
	private String photoUrl;
	private Date createDate;
	private Date lastModifiedDate;
	

//	private String profilePicLink;   ///

//	private String profilePicThumbLink; ///

//	private int followersCount;

//	private int followingCount;

//	private Long serverCreateDate;

//	private Long serverModificationDate;



	private String[] deviceinfo;
//	private Long lastLogin;

	private String profileType; 
	


	public String getProfileType() {
		return profileType;
	}
	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public void setDeviceInfo(String[] Id)
	{
		this.deviceinfo=Id;
	}

	public String[] getDeviceInfo()
	{
		return this.deviceinfo;
	}
	public void setUserName(String user)
	{
		this.userName=user;
	}

	public String getUserName()
	{
		return this.userName;
	}
	
	public void setFirstName(String first)
	{
		this.firstName=first;
	}

	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setLastName(String last)
	{
		this.lastName=last;
	}

	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setEmailId(String mail)
	{
		this.emailId=mail;
	}

	public String getEmailId()
	{
		return this.emailId;
	}
	
	/*public void setGender(String gender)
	{
		this.gender=gender;
	}

	public String getGender()
	{
		return this.gender;
	}*/
	
	public void setPassword(String pass)
	{
		this.password=pass;
	}

	public String getPassword()
	{
		return this.password;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getDeviceinfo() {
		return deviceinfo;
	}

	public void setDeviceinfo(String[] deviceinfo) {
		this.deviceinfo = deviceinfo;
	}
	
	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

/*	public void setSalt(String salt)
	{
		this.salt=salt;
	}

	public String getSalt()
	{
		return this.salt;
	} 
	
	public void setServerCreateDate(Long var)
	{
		this.serverCreateDate=var;
	}

	public Long getServerCreateDate()
	{
		return this.serverCreateDate;
	}
	
	public void setServerModificationDate(Long var)
	{
		this.serverModificationDate=var;
	}

	public Long getServerModificationDate()
	{
		return this.serverModificationDate;
	} */
}

