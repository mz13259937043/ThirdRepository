<%@page import="sun.invoke.empty.Empty"%>
<%@page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
这里现在是啥都没有
<table height="200px" width="60%" border="1" cellspacing="0" align="center">
	<tr>
		<td>id</td>
		<td>姓名</td> 
		<td>年龄</td>
		<td>工资</td>
		<td colspan="2">操作</td> 
	</tr>	
	<%
		request.setCharacterEncoding("utf*8");
		response.setCharacterEncoding("utf-8");
		List<Emp> emps = Dbutil.search("select * from emp",Empty.class);
		for(int i=0;i<emps.size();i++){
			if(emps!=null){
				%>
	<tr>
	<%
		Emp e = emps.get(i);
		out.write("<td>"+e.getId()+"</td>");
		out.write("<td>"+e.getName()+"</td>");
		out.write("<td>"+e.getAge()+"</td>");
		out.write("<td>"+e.getSal()+"</td>");
		out.write("<td><a href='emp?action=delete&id="+e.getId()+"'>删除</a></td>");
		
	%>
			}
		}
	%>
</table>
</body>
</html>