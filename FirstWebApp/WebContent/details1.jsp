<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="project1.Details" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!

Details de;

%>
<%
de=(Details)request.getAttribute("details");
%>

<body>
<style>
table{
padding-right:5px;
font-size:20;
color:blue;
}

</style>
<h1>Person Information</h1>
<table border="1">
	<tr>
	<th>Property</th>
	<th>Value</th>
	</tr>
	<tr>
	<td>Name</td>
	<td><%=de.getName() %></td>
	</tr>
	<tr>
	<td>Gender</td>
	<td><%=de.getGender()%></td>
	</tr>
	<tr>
	<td>Languages Known</td>
	<td><%=de.getLang() %></td>
	</tr>
	<tr>
	<td>Country</td>
	<td><%=de.getCountry() %></td>
	</tr>
	
</table>



</body>
</html>