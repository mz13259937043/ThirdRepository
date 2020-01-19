<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="layui-col-xs12 layui-col-md12"
		style="background-color: #000000;">
		<ul class="layui-nav layui-col-md12">
			<li class="layui-nav-item" style="float: right; margin-right: 50px;">
				<a href="javascript:void(0);">退出<span class="layui-badge-dot"></span></a>
			</li>
			<li class="layui-nav-item" style="float: right; margin-right: 50px;">
				<a href="">2019年9月18日<span class="layui-badge-dot"></span></a>
			</li>
		</ul>
	</div>
	<div class="layui-col-xs12 layui-col-md12" style="text-align: center;">
		<!-- 记着，型号都是xs12、mod12 -->
		<ul class="layui-tab-title">
			<c:forEach var="powershow" items="${powerlist}">
				<li><a href="">sddd</a></li>
			</c:forEach>
		</ul>
	</div>
	<div class="layui-col-xs12 layui-col-md12">
		<div class="layui-col-xs3 layui-col-md3" style="height: 223px;">
			<div class="layui-circle"
				style="border: 2px solid #0000FF;; width: 150px; height: 150px; margin: 20px auto;">
			</div>
			<div class="layui-col-xs12 layui-col-md12"
				style="height: 40px; line-height: 40px; text-align: center;">
				<strong>${logname}</strong>
			</div>
		</div>
	</div>
</body>
</html>