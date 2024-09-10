<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doctor</title>
</head>
<body>

	<form action="DoctorServlet" method="post">
		<h1>Doctor</h1>
		Name: <input type="text" name="name" required> <br> <br>
		EmailId: <input type="text" name="emailId"> <br> <br>
		Specialization: <input type="text" name="specialization"> <br>
		<br> Address: <input type="text" name="address"> <br>
		<br> Mobile: <input type="text" name="mobile"> <br>
		<br>
		<label for="gender">Gender:</label> male <input type="radio"
			name="gender" value="male"> female <input type="radio"
			name="gender" value="female"><br> <br> Note:
		<textarea rows="5" cols="20" name="note">></textarea>
		<br> <br> Photo: <input type="file" name="photo"
			accept="image/*"> <br> <br>
		<button type="submit">Create</button>
	</form>
</body>
</html>