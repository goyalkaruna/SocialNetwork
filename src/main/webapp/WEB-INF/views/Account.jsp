<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Welcome screen</title>
<link rel="stylesheet" href="resources/css/bootstrap.css" type="text/css"/>
</head>
<body bgcolor=white>
	
<div class="navbar">
     <div class="navbar-inner">
            <div class="container offset1">
              <form class="navbar-form navbar-right" role="search">
                 <input type="text" class="form-control" placeholder="Search">
                 <button type="submit" class="btn btn-default">Submit</button>
             </form>
             
            </div>
             <div class="container offset2">
            <B> <a href ="">${user.userName }</a></B>
            </div>
             <div class="container offset3">
              <form method = POST action = "/webclient/logout">
		<input type="submit"  value="Log Out"/>
	</form>
	</div>
     </div>
</div>
 <img width=10% height=10% src="/images/${user.photoUrl}" />
<form method = POST action = "/webclient/changephoto" enctype="multipart/form-data">
	<input type = "file"   placeholder = "Your photo :)" name = "Photo"/> <br/>
	<input type = "submit" placeholder = "change photo" value = "change photo"/>
</form>

<h3>
You can change your password in here:
</h3>
<form method = POST action = "/webclient/changepassword">
	<input type="hidden"     name="changePassword" value="1"/>
	<input type="password"   name="oldPassword" placeholder="your old password"/><br/>
	<input type="password"   name="newPassword" placeholder="your new password"/><br/>
	<input type="submit" value="Change password"/>
</form>


<form method = POST action = "/webclient/updateChanges">
<table style="width: 100%">
<tr> <td width ="50%"> <b> User Id </b> </td> <td>${user.id }</td> </tr>
<tr> <td width ="50%"> <b> UserName </b> </td> <td><input name="newUserName" value="${user.userName }"/> </td> </tr>
<tr> <td width ="50%"> <b> Last Name </b> </td> <td><input name="newLastName"  value="${user.lastName }"/> </td> </tr>
<tr> <td width ="50%"> <b> First Name </b> </td> <td><input name="newFirstName" value="${user.firstName }"/> </td> </tr>
<tr> <td width ="50%"> <b> Profile Type </b> </td>
<td><label><input type="radio" name="profileType" id="profileType"  value="public"><b>Public</b></label>
    <label><input type="radio" name="profileType" id="profileType"  value="private"><b>Private</b></label></td></tr>
<tr> <td width ="50%"> <b> Last Modified on </b> </td> <td> ${user.lastModifiedDate } </td> </tr>
<tr> <td width ="50%"> <b> Account Creation Date </b> </td> <td> ${user.createDate } </td> </tr>
<tr> <td width ="50%"></td><td width ="20%"><input type="submit" value="Update Changes"/></td></tr>
</table> 
</form>
   

</body>
</html>