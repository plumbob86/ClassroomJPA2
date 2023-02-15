<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Classrooms</title>
</head>
<body>
	<form>
	<h1>Classrooms</h1>
	<table>
		<c:forEach items="${requestScope.allItems}" var="currentitem">
			<tr>
				<td><input type="radio" name="id" value="${currentitem.id}"></td>
				<td>${currentitem.classroomNumber}</td>
				<td>${currentitem.teacherName}</td>
			</tr>
			<h1>Students</h1>
			<c:forEach items="${currentitem.students}" var="students">
						<tr>
							<td><input type="radio" name="id" value="${currentitem.id}"></td>
							<td>${students.name}</td>
						</tr>
					</c:forEach>
		</c:forEach>
	</table>
	</form>
</body>
</html>