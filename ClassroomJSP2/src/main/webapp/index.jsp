<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Classroom Info:</h1>
	<form action="persistClassroom"method="post">
	Classroom Number:
	<input type= "text" name="classroomNumber" size="10">
	Teacher Name:
	<input type= "text" name="teacherName" size="100">
	Max Students:
	<input type= "text" name="maxStudents" size="10">
	<input type= "submit" value="Persist">
	</form>
	<h1></h1>
	<h1>Enter Student Info:</h1>
	<form action="persistStudent"method="post">
	Student Name:
	<input type= "text" name="name" size="100">
	Classroom ID:
	<input type= "text" name="classroomId" size="10">
	<input type= "submit" value="Persist">
	</form>
	<a href="showAllClassrooms">View the complete list</a>
</body>
</html>