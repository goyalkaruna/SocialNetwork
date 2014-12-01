package com.x.webclient;

import java.lang.Object;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import domain.Client;
import domain.ResponseType1;
import domain.User;
import domain.newUser;


/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home()  {
		
		return "index";
	
       /* logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	    RestTemplate restTemplate = new RestTemplate();
	        Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
	        System.out.println("Name:    " + page.getName());
	        System.out.println("About:   " + page.getAbout());
	        System.out.println("Phone:   " + page.getPhone());
	        System.out.println("Website: " + page.getWebsite()); */
	}
	
	
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST , produces="application/json")
	public @ResponseBody
	Client register(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
		Client client=new Client();
	//	RestTemplate rt=new RestTemplate();
		
		newUser user = new newUser();
		String userName=request.getParameter("userName");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String emailId=request.getParameter("email");
		//String[] devinfo = (["1234"]);
		System.out.println(userName);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(password);
		//System.out.println(gender);
		System.out.println(emailId);
		
	    user.setUserName(userName);
	    user.setFirstName(firstName);
	    user.setLastName(lastName);
	    user.setPassword(password);
	    user.setEmailId(emailId);
	    //user.setDeviceinfo(["1234"]);
	//    user.setGender(gender);
	    
	    client.setType("728");
	    client.setUser(user);
	   client.setClientDateTime("20148989");
	   System.out.println("client"+client);
	   ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
	   String json = ow.writeValueAsString(client);
	   
	    System.out.println("json"+json.toString());
		
	 /*  HttpHeaders header=new HttpHeaders();
	    header.setContentType(MediaType.APPLICATION_JSON); 
	    
	    HttpEntity entity= new HttpEntity("json",header);
	    
	    
	   // ResponseEntity<String> res=rt.exchange("http://humm.elasticbeanstalk.com/auth/register", HttpMethod.POST,entity, String.class); 
	    
	    ResponseType1 r = rt.postForObject("http://humm.elasticbeanstalk.com/auth/register",entity , ResponseType1.class); */
		
	    DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost(
			"http://humm.elasticbeanstalk.com/auth/register");
		
		StringEntity input = new StringEntity(json.toString());
		input.setContentType("application/json");
		postRequest.setEntity(input);
 
		HttpResponse resp = httpClient.execute(postRequest);
		BufferedReader br = new BufferedReader( new InputStreamReader((resp.getEntity().getContent())));

       String output;
       System.out.println("Output from Server .... \n");
       while ((output = br.readLine()) != null) {
	System.out.println(output);
}
	    
	    return null;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST , produces="application/json")
	public 
	String login(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String responseUrl = "";
		 HttpSession session = request.getSession(true);
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		System.out.println(userName);
		System.out.println(password);
		System.out.println("request object"+request);
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
/*		JSONObject jo=new JSONObject();
	jo.put("type", "902");
	jo.put("j_username", userName);
	jo.put("j_password", password); */
	session.setAttribute("user", user);
	System.out.println("Session element"+session.getAttribute("userName"));
	DefaultHttpClient httpClient = new DefaultHttpClient();
	HttpPost postRequest = new HttpPost(
		"http://humm.elasticbeanstalk.com/auth/login");
	

	StringEntity input = new StringEntity("{\"type\":700,\"j_username\":\""+userName+"\",\"j_password\":\""+password+"\",\"lastLogin\":\"102014\"}");
	input.setContentType("application/json");
	postRequest.setEntity(input);
try{
	HttpResponse resp = httpClient.execute(postRequest);
	BufferedReader br = new BufferedReader( new InputStreamReader((resp.getEntity().getContent())));
	String words[]=new String[10];
	
	String output;
   System.out.println("Output from Server .... \n");
  
   while ((output = br.readLine()) != null) {

		System.out.println("output "+output);
   
		words=output.split(",");
   
		String targetx = (words[1]);
		String targetx1 = (words[3]);
		String user_id = targetx1.split(":")[2];
		String targetx2 = (words[4]);
		
		String username = targetx2.split(":")[1];
		
		String targetx3 = (words[5]);
		String firstname1 = targetx3.split(":")[1];
		String firstname = firstname1.replace("\"", "");
		String targetx4 = (words[6]);
		String lastname1 = targetx4.split(":")[1];
		String lastname = lastname1.replace("\"", "");
		String targetx7 = (words[12]);
		String profileType1 = targetx7.split(":")[1];
		String profileType = profileType1.replace("\"", "");
		String targetx5 = (words[16]);
		String createdate = targetx5.split(":")[1];
		String targetx6 = (words[17]);
		String lastmodified = targetx6.split(":")[1];
		System.out.println("variables :- "+user_id + "   " + username + "  "+firstname + " "+lastname +" "+createdate +" "+ lastmodified+" "+profileType);
		System.out.println("targetx"+targetx);
		System.out.println("targetx1"+targetx1);
		
        
		System.out.println("Dates rendering starts");
		 DateFormat df2 = new SimpleDateFormat("yyyyMMddHHmmSS");
		 Date d2 = df2.parse(createdate);
		DateFormat df1 = new SimpleDateFormat("yyyyMMddHHmmSS");
		 Date d1 = df1.parse(lastmodified);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		//user.setId(user_id);
		user.setCreateDate(d2);
		 user.setLastModifiedDate(d1);
		 user.setProfileType(profileType);
		if (targetx.contains("200")){
		responseUrl= "landing";
		//session.setAttribute("user", user);
		}
		else{
			responseUrl ="index";
			//session.removeAttribute("user");
		}
}	   
}catch(Exception e){
	System.out.println("inside catch for login");
}finally{
	System.out.println("in finally block");
}
return responseUrl;
}	
	
	@RequestMapping(value = "/updateChanges", method = RequestMethod.POST , produces="application/json")
	public
	String updateChanges(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
		String userName=request.getParameter("newUserName");
		String firstName=request.getParameter("newFirstName");
		String lastName=request.getParameter("newLastName");
		String profileType=request.getParameter("profileType");
		System.out.println("updated changes"+userName +" "+firstName + "  "+lastName+" "+profileType);
		return ("Account");
	
	}
	@RequestMapping(value = "/landing", method = RequestMethod.GET , produces="application/json")
	public
	String landing(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
	  HttpSession session = request.getSession(true);
	  session.getAttribute("userName");
	  System.out.println("username"+session.getAttribute("userName"));
	  return "landing";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/logout") 
	public
	String logout (HttpServletRequest request) {
		 HttpSession session = request.getSession(true);
         session.removeAttribute("userName");
		System.out.println("user lgged out");
		return "index";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/account")
	public String account () {
		return "Account";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/changepassword")
	String changePassword (HttpServletRequest request, @RequestParam String oldPassword, @RequestParam String newPassword) {
		User user = ((User) request.getSession().getAttribute("user"));
		if (user.getPassword().equals(oldPassword))
		if (user != null) {
			System.out.println("Set new password: " + newPassword);
			user.setPassword(newPassword);
			request.getSession().setAttribute("password", newPassword );
			System.out.println("new passowrd"+ newPassword);
		}
		return "Account";
	}
	
	@RequestMapping(value = "/getAllFriends", method = RequestMethod.GET , produces="application/json")
	public 
	String getAllFriends(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost(
			"http://humm.elasticbeanstalk.com/app/getAllFriends");
		 String output;
        System.out.println("Getting all friends............................. ");
		StringEntity input = new StringEntity("{\"type\":908}");
		input.setContentType("application/json");
		
		postRequest.setEntity(input);		
		try{
			HttpResponse resp = httpClient.execute(postRequest);
			BufferedReader br = new BufferedReader( new InputStreamReader((resp.getEntity().getContent())));
			while ((output = br.readLine()) != null) {
			
			System.out.println("output "+output);
			
			
		}
		}
		catch(Exception e){
			System.out.println("exception in getallfriends");
		}
		return ("friends");
	}
	
	@RequestMapping(value = "/addFriend", method = RequestMethod.POST , produces="application/json")
	public 
	String addFriend(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		Client client = new Client();
		User user = new User();
		String friendid = request.getParameter("friend_id");
	    System.out.println("friend id"+friendid);
		user.setId(friendid);
		client.setType("911");
	    //client.setUser(user);
	   client.setClientDateTime("now()");
	   
	   ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
	   String json = ow.writeValueAsString(client);
	   
	    System.out.println(json.toString());
		
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost(
			"http://humm.elasticbeanstalk.com/app/addFriend");
		 String output;
        System.out.println("Add a friend ............................. ");
		StringEntity input = new StringEntity(json.toString());
		input.setContentType("application/json");
		postRequest.setEntity(input);	
		System.out.println("adding friend . before try."+input);
		try{
			HttpResponse resp = httpClient.execute(postRequest);
			System.out.println("response from db "+resp);
			BufferedReader br = new BufferedReader( new InputStreamReader((resp.getEntity().getContent())));
			System.out.println("in try in addFriend"+br.readLine());
			//while ((output = br.readLine()) != null) {
			output= br.readLine() ;
			System.out.println("output "+output);	
			
			//}
			}catch(Exception e){
				
			}
			return ("friends");
	}
}

