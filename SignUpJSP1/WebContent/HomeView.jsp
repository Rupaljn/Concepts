4<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align = 'center'> HomeView </h1>
<label> Welcome to home view page</label>
<%if(request.getAttribute("successMsg")!=null){ %>
<%String successMsg = (String) request.getAttribute("successMsg"); %>
<h1>
<%=successMsg %>
</h1>
<%} %>
<%if(request.getAttribute("errorMsg")!=null){ %>
<% String errorMsg = (String) request.getAttribute("errorMsg"); %>
<h1>
<%=errorMsg %>
</h1>
<%} %>


</body>
</html>