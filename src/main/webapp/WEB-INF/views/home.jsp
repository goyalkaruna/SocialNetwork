<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css" />
                <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
                <script src="http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js"></script>
</head>
 <body>
           <div data-role="page" class="" id="mainPage">
            <div data-role="header" class="">
                <h1>Mini Social</h1>
            </div>
            
          <div>
          <h2>Sign Up</h2>
          <script>  
        function doAjaxPost() {  
      
    	var username = $('#name').val();  
    	var firstname= $('#firstname').val();
    	var lastname= $('#lastname').val();
    	var password= $('#password').val();
    	var gender = $('#gender').val();  
    	var email = $('#email').val();   
  
    	alert(username + firstname +lastname +password + gender + email);
    	
   	    $.ajax({  
        type : "POST",   
        url : "/auth/register",   
        data : "name=" + name + "&firstname=" + firstname + "&lastname=" + lastname + "&password=" + password +
        "&gender=" + gender + "&email=" + email ,  
       // success : function(response) {  
      //  alert(response);   
      //  },  
        error : function(e) {  
        alert('Error: ' + e);   
        }  
        });  
      }  
      </script>  
       <div id="form">  
   <form method="post">  
    <table>  
     <tr>  
      <td>UserName :</td>  
      <td><input type="text" id="name" /></td>  
     </tr>  
     <tr>  
      <td>FirstName :</td>  
      <td><input type="text" id="firstname" /></td>  
     </tr> 
     <tr>  
      <td>LastName :</td>  
      <td><input type="text" id="lastname" /></td>  
     </tr> 
     <tr>  
      <td>Password :</td>  
      <td><input type="password" id="password" /></td>  
     </tr> 
     <tr></tr>
     <tr>  
      <td>Gender :</td>  
      <td><input type="radio" id="gender" value="male" /> Male   
       <input type="radio" id="gender" value="female" /> Female</td>  
     </tr>  
     <tr></tr>
     <tr>  
      <td>Email :</td>  
      <td><input type="text" id="email" /></td>  
     </tr>  
     <tr>  
      <td> </td>  
      <td><input type="button" value="Save" onclick="doAjaxPost();" />  
      </td>  
     </tr>  
    </table>  
   </form>  
  </div>  
          </div>  
          </div>
            
            
            
        <!--     <div data-role="content" class="">
                <form method="post" modelAttribute="createProfile">
                    <div data-role="fieldcontain">
                        <label for="firstname">First Name</label>
                        <input type="text" name="firstname" id="firstname" data-clear-btn="true" value="" placeholder="Enter first name here">
                            </div>
                    <div data-role="fieldcontain">
                        <label for="lastname">Last Name</label>
                        <input type="text" name="lastname" id="lastname" data-clear-btn="true" value="" placeholder="Enter last name here">
                            </div>
                </form>
            </div>
        </div> -->
        
        
        
        
    </body>
</html>
