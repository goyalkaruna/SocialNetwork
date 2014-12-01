<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
<div class="navbar">
              <div class="navbar-inner">
                <div class="container offset1">
                 <form class="navbar-form navbar-right" role="search">
 
    <input type="text" class="form-control" placeholder="Search">
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>
                </div>
              </div>

</div>

<div class="row">
<div class="span4 offset1">
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