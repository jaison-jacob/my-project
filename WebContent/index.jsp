<%@page import="studentwebapp.students"%>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 
List<students> datas = new ArrayList<students>();
String name = request.getParameter("name");


int tamil =Integer.parseInt(request.getParameter("tamil"));
int english =Integer.parseInt(request.getParameter("english"));
int maths =Integer.parseInt(request.getParameter("maths"));
int science =Integer.parseInt(request.getParameter("science"));
int social =Integer.parseInt(request.getParameter("social"));


students data = new students(name,tamil,english,maths,science,social);




String newname = request.getParameter("searchname");
for(students stud:datas){
	if(newname.equalsIgnoreCase(stud.getname())){
		int total = stud.gettamil()+stud.getenglish()+stud.getmaths()+stud.getscience()+stud.getsocial();
		out.println("STUDENTS TOTAL MARK :"+" "+total);
		int avg = total/5;
		out.println("STUDENTS AVG MARK :"+" "+avg);
		if(stud.gettamil()<40 && stud.getenglish()<40 && stud.getmaths()<40 && stud.getscience()<40 && stud.getsocial()<40){
			out.println(stud.getname()+" "+"IS FAIL");
			
		}else{
			out.print(stud.getname()+" "+"IS PASS");
		}
		
	}
}


%>
</body>
</html>