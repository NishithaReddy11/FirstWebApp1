<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="project1.Details1" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%!

Details1 de;

%>
<%
de=(Details1)request.getAttribute("details");
%>
<%
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
PreparedStatement ps=conn.prepareStatement("insert into details values(?,?,?)");
ps.setString(1,de.getName());
ps.setString(2,de.getGender());
ps.setString(3,de.getCountry());
if(ps.executeUpdate()>0)
{
	out.println("Values inserted");
}

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
	<td>Country</td>
	<td><%=de.getCountry() %></td>
	</tr>
	
</table>



</body>
</html>