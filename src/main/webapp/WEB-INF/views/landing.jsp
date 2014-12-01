<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"> 
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Socialize</title>
<link rel="stylesheet" href="resources/css/bootstrap.css" type="text/css"/>

</head>
<body bgcolor=#A7A9C2>
<table style="background-color:white;" width =100%>
<tr>
<td width=25% >
	<h2> Socialize</h2>
</td> 
<td width=35%></td>
<td width = 15% >
	<B> <a href ="">${user.userName }</a></B>
</td>
<td width = "15%"><a href = "/webclient/account">Profile</a></td>
<td width = "15%"><a href = "/webclient/getAllFriends">Friends</a></td>
<td width = "15%">
     <form method = POST action = "/webclient/addFriend">
		<input type="submit"  value="Add Friend"/>
	</form>
</td>    

<td width = 10% >
    <form method = POST action = "/webclient/logout">
		<input type="submit"  value="Log Out"/>
	</form>

</td>
</tr>
</table>

<div class="navbar">
     
              <div class="navbar-inner">
                <div class="container offset1">
                 <form class="navbar-form navbar-right" role="search">
 
    <input type="text" class="form-control" placeholder="Search">
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>
                </div>
              </div>
     <div> 
       
       <form class="navbar-form navbar-right" method = POST action = "/webclient/addFriend"> 
      <input type="text" name="friend_id" id="friend_id" placeholder="Friend id">  
       <input type="submit" value="Add Friend"/>
		
	
	</form> 
    </div>  
</div>

<div class="row">
<div class="span4 offset1">
 <div><I> What's on your mind?</I></div>
<form class="form-horizontal" method="post" action='createPost' name="postForm" id="post]Form">
					
						
							<textarea  rows="5" cols="140" name="p" id="p" title="p" ></textarea>
							<br>
							<label><input type="radio" name="postType" id="postType"  value="public"><b>Public</b></label>
							<label><input type="radio" name="postType" id="postType"  value="private"><b>Private</b></label>
						    <br>
							<button type="submit" class="btn btn-success">Post</button>
					
					 </form>
</div>
</div>


<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<!--<script src=  "http://code.jquery.com/jquery-1.10.1.min.js"></script>  -->
 <script src="resources/js/bootstrap.js" ></script>
</body>
</html>