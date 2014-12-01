<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>Mini Social</title>
<link rel="stylesheet" href="resources/css/bootstrap.css" type="text/css"/>

</head>
<body>
<div class="container">
<h1><center><font color="blue">Socialize</font></center></h1>
<div class="navbar">
              <div class="navbar-inner">
                <div class="container">
                  <ul class="nav">
                    <li class="active"><center><a href="#">Welcome To Socialize</a></center></li>
                    
                  </ul>
                </div>
              </div>
              
              
<div class="row">
<div class="left-block">
   <div class="block-fluid">
			<div class="span6">
				<fieldset>
				<form class="form-horizontal" method="post" action='register' name="signupForm" id="signupForm">
				<div class="control-group">
						<label class="control-label"><font size=4 face="verdana" color="blue">Sign Up</font></label>
					</div>
					<div class="control-group">
						<label class="control-label">User Name</label>
						<div class="controls">
							<input type="text" name="userName" id="userName" title="User Name" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">First Name</label>
						<div class="controls">
							<input type="text" name="firstName" id="firstName" title="First Name" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Last Name</label>
						<div class="controls">
							<input type="text" name="lastName" id="lastName" title="Last Name" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Password</label>
						<div class="controls">
							<input type="password" name="password" id="password" title="password" value="">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Gender</label>
						<div class="controls">
							<label><input type="radio" name="gender" id="gender" title="gender" value="male">Male</label>
							<label><input type="radio" name="gender" id="gender" title="gender" value="female">Female</label>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Email</label>
						<div class="controls">
							<input type="text" name="email" id="email" title="Email" value="">
						</div>
					</div>
					<div class="form-actions">
						<button type="submit" class="btn btn-success">Submit</button>
						
					</div>
				</form>
				</fieldset>
			</div>
		</div>
		</div>
		
		<div class="right-block">
		<div class="block-fluid">
		<div class="span6">
		
<fieldset>
    <form class="form-horizontal" method="post" action='login' name="loginForm" id="loginForm">
<div class="control-group">
						<label class="control-label"><font size=4 face="verdana" color="blue">Login</font></label>
					</div>
					<div class="control-group">
						<label class="control-label">User Name</label>
						<div class="controls">
							<input type="text" name="userName" id="userName" title="User Name" value="">
						</div>
					
					</div>
					<div class="control-group">
						<label class="control-label">Password</label>
						<div class="controls">
							<input type="password" name="password" id="password" title="password" value="">
						</div>
					</div>
					
					<div class="form-actions">
						<button type="submit" class="btn btn-success">Login</button>
						
					</div>
        
    </form>

		</fieldset>
		</div>
		</div>
             
              
              </div>
            </div>
</div>

</div>
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<!--<script src=  "http://code.jquery.com/jquery-1.10.1.min.js"></script>  -->
 <script src="resources/js/bootstrap.js" ></script>
</body>
</html>

