<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
   		<div class="row justify-content-center">
<div class="col-md-6">
<div class="card">
<header class="card-header">
	
	<h4 class="card-title mt-2">Sign up</h4>
</header>
<article class="card-body">
<div class="alert alert-danger" role="alert">
 <form:errors path="student.*"></form:errors>
</div>
<form action="handleform" method="post">
	<div class="form-row">
		<div class="col form-group">
			<label>Name </label>   
		  	<input type="text" class="form-control" placeholder="" name="name">
		</div>
		</div>
		
		<div class="form-row">
		<div class="col form-group">
			<label>Id </label>   
		  	<input type="text" class="form-control" placeholder="" name="id">
		</div>
		</div>
		
<!-- 		<div class="form-row">	 -->
<!-- 	<div class="col form-group"> -->
<!-- 		<label>Dob</label> -->
<!-- 		<input type="text" class="form-control" placeholder="dd/MM/yyyy" name="dob"> -->
<!-- 	</div> form-group end.// -->
<!-- 	</div> -->
	
	<div class="form-row">	
	<div class="col form-group ">
		  <label>Course</label>
		  <select id="inputState" class="form-control" name="course">
		    <option> Choose...</option>
		      <option>java</option>
		      <option>php</option>
		      <option>c++</option>
		      <option>pyhen</option>
		  </select>
		</div> <!-- form-group end.// -->
	</div>
	
		<div class="form-row">
	<div class="col form-group">
			<label class="form-check form-check-inline">
		  <input class="form-check-input" type="radio" name="gender" value="Male">
		  <span class="form-check-label"> Male </span>
		</label>
		<label class="form-check form-check-inline">
		  <input class="form-check-input" type="radio" name="gender" value="Female">
		  <span class="form-check-label"> Female</span>
		</label>
	</div> <!-- form-group end.// -->
	</div>
		
	<div class="form-row">	
	<div class="col form-group ">
		  <label>Type</label>
		  <select id="inputState" class="form-control" name="type">
		  
		      <option value="old">old</option>
		      <option value="new">new</option>
		     
		  </select>
		</div> <!-- form-group end.// -->
	</div>
	
	
	<div class="form-row">	
	<div class="col form-group ">
	<label>Address</label>
	<div>
	<input type="text" class="form-control" placeholder="Enter street" name="address.street">
	</div>
	<div>
	<input type="text" class="form-control" placeholder="Enter city" name="address.city">
	</div>
	</div>
	</div>
	
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> submit  </button>
    </div> <!-- form-group// -->      
                                           
</form>
</article> <!-- card-body end .// -->

</div> <!-- card.// -->
</div> <!-- col.//-->

</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>