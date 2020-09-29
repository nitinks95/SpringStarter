<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="ISO-8859-1">
  <title>Landing Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <style>
  .fakeimg {
    height: 200px;
    background: #aaa;
  }
  </style>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
	 	 <ul class="navbar-nav">
			<li class="nav-item active">
		      	<a class="nav-link" href="#">X-Works</a>
		    </li>
		</ul>
	</nav>

	<div class="container-sm">
		<br>
 		<h3>From <span th:text="${sName}">name:</span>,&nbsp; 
 		<br>
 		Your message is 
 		<span th:text="${sMessage}">message</span>-</h3><br>
 		<p> message_id= <span th:text="${lId}"></span></p>
 		<br>
 	</div>
 	
 	<div class="bg-primary text-white text-center" style="margin-bottom:0">
	  	<p>Copyrights X-works 2020</p>
	</div>
	
</body>
</html>