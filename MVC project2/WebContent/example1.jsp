<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.css" rel="stylesheet"  type="text/css"> 
  <script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.js"></script>	
<title>Insert title here</title>
</head>
<body>

<div class="container">
  <h1>My First Bootstrap Page</h1>
  <p>This part is inside a .container class.</p> 
  <p>The .container class provides a responsive fixed width container.</p>
  <p>Resize the browser window to see that its width (max-width) will change at different breakpoints.</p>
</div>


<div class="container-fluid">
  <h1>My First Bootstrap Page</h1>
  <p>This part is inside a .container-fluid class.</p>
  <p>The .container-fluid class provides a full width container, spanning the entire width of the viewport.</p>           
</div>


<div class="container pt-3">
  <h1>My First Bootstrap Page</h1>
  <p>This container has a top padding of 16 pixels (.pt-3).</p>
  <p>Try to remove the .pt-3 class to see the difference.</p>
</div>

</body>
</html>