<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Appointment</title>
</head>
<body>

<form action="AppointmentServlet" method="post">
Doctor <input type="text" form="doctor" name="doctor"><br><br>
Date  <input type="date" name="date" ><br><br>
No.of Slots  <input type="text" name="noOfSlots"><br><br>
Details  <input type="text" name="details" ><br><br>
Consultation Fee <input type="number" name="consultationFee"><br><br>
<button type="submit">Add</button>
</form>
</body>
</html>