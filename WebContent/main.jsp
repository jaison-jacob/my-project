<%@page import="studentwebapp.students"%>
<%@page import="studentwebapp.result"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STUDENTS WEB APP</title>
</head>
<body>
	<a href="index.html">STUDENTS WEB APP</a>
	<%
		result[] res = new result[1];
		res[0] = (result) request.getAttribute("res");
		if (res[0] != null) {
			if (res[0].gettotal() == 0) {
				out.println("<br>");
				out.println("ENTER VALID NAME");
			} else {
				out.println("<br>");
				out.println(res[0].getname() + " TOTAL MARK "
						+ res[0].gettotal());
				out.println("<br>");
				out.println(res[0].getname() + " AVG MARK"
						+ res[0].getavg());
				out.println("<br>");
				if (res[0].getresult() == true) {
					out.println(res[0].getname() + " IS PASS");
				} else {
					out.println(res[0].getname() + " IS FAIL");
				}
			}
		}
	%>




</body>
</html>