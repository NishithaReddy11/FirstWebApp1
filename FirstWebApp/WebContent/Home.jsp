<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
.cc{
color:red;

}
</style>
<div class="cc">
<h3>Date/Time=<%=new Date() %>></h3>
<h2>Cube= <%=session.getAttribute("cube")%> </h2>
</div>
</body>
</html>