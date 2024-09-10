<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Specialization</title>
</head>
<body>
	<div class="container">
		<form action="SpecializationServlet" method="post">
			<h1>Specialization</h1>
			<div class="input-box">
				Code: <input type="text" name="code">
			</div>
			<br>
			<br>
			<div class="input-box">
				Name: <input type="text" name="name">
			</div>
			<br>
			<br>
			<div class="input-textArea">
				Note:
				<textarea rows="5" cols="20"></textarea>
			</div>
			
			<br><br>
			<button type="submit" >submit</button>

		</form>
	</div>
</body>
</html>