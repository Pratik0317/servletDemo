<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient</title>
</head>
<body>
	<h2>Patient</h2>
	<form action="PatientServlet" method="post">
		<label for="first-name">First Name:</label> <input type="text"
			id="first-name" name="first-name" required> <br>
		<br> <label for="last-name">Last Name:</label> <input type="text"
			id="last-name" name="last-name" required> <br>
		<br> <label for="gender">Gender:</label> <input type="radio"
			name="gender" id="male">M <input type="radio" name="gender"
			id="female">F <br>
		<br> <label for="phone">Phone:</label> <input type="tel"
			id="phone" name="phone" required> <br>
		<br> <label for="dob">Date of Birth:</label> <input type="date"
			id="dob" name="dob" required> <br>
		<br> <label for="marital-status">Marital Status:</label> <select
			id="marital-status" name="marital-status" required>
			<option value="single">Single</option>
			<option value="married">Married</option>
			<option value="divorced">Divorced</option>
			<option value="widowed">Widowed</option>
		</select> <br>
		<br> <label for="present-address">Present Address:</label>
		<textarea id="present-address" name="present-address" rows="3"
			required></textarea>
		<br>
		<br> <label for="communication-address">Communication
			Address:</label>
		<textarea id="communication-address" name="communication-address"
			rows="3" required></textarea>
		<br>
		<br> <label>Past Medical History:</label>
		<div class="checkbox-group">
			<label><input type="checkbox" name="medical-history"
				value="anemia"> Anemia</label> <label><input type="checkbox"
				name="medical-history" value="asthma"> Asthma</label> <label><input
				type="checkbox" name="medical-history" value="diabetes">
				Diabetes</label> <br> <label><input type="checkbox"
				name="medical-history" value="cancer"> Cancer</label> <label><input
				type="checkbox" name="medical-history" value="ulcer"> Ulcer</label>
			<label><input type="checkbox" name="medical-history"
				value="chickenpox"> Chickenpox</label> <br> <label><input
				type="checkbox" name="medical-history" value="other"> Other</label>
		</div>
		<br>
		<br> <label for="other-details">Other Details:</label>
		<textarea id="other-details" name="other-details" rows="4"></textarea>
		<br>
		<br>

		<button type="submit">Register</button>
	</form>
</body>
</html>