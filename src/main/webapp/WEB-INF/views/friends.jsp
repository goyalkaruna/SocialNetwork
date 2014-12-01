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
<td width = 15%"><a href = "/webclient/getAllFriends">Friends</a></td>
<td width = 15%"><a href = "/webclient/account">My Account </a></td>
<td width = 10% >
    <form method = POST action = "/webclient/logout">
		<input type="submit"  value="Log Out"/>
	</form>

</td>
</tr>
</table>
<a href = "/webclient/addFriend">Add Friend </a>
</body>
</html>