<%@page import="com.mao.pro.model.Account"%>
<%@page import="com.mao.pro.utils.SessionUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./lib/layui-v2.5.5/layui/css/layui.css"
	media="all">
<title>Insert title here</title>
<script type="text/javascript" src="./lib/jquery-3.4.1.min.js"></script>
</head>
<body>

	<div class="layui-col-md12"
		style="border: 1px solid grey; float: left;">

		<form id="login" class="layui-form" action="index/login" method="post"
			style="display: blcok">
			<div class="layui-form-item"
				style="margin-left: 200px; margin-top: 30px;">
				<label>登陆</label> 
				
				用户名——<input type="text" name="username" value="${user.username}" required="required"></br> </br>
				密码——<input type="text" name="password" required="required"></br> </br> 
				<input type="submit" value="提交">
				<input type="button" value="注册" onclick="toggle('zc')">
			</div>
		</form>
		<form id="regist" class="layui-form" action="index/regist"
			method="post" style="display: none">
			<div class="layui-form-item" style="margin-left: 200px; margin-top: 30px;">
				<label>注册</label> 
				用户名——<input type="text" name="username"></br> </br>
				密码——<input type="password" name="password"></br> </br> 
				邮箱——<input type="text" name="email"></br> </br> 
				<input type="submit" value="提交">
				<input type="button" value="登陆" onclick="toggle('dl')">
			</div>
		</form>

	</div>

	<script>
		
	</script>

	<%-- <%Account user = session.getUserSession();%> --%>
	<script type="text/javascript">
		$(document).ready(function() {
			//vaildNotNull();
		});
		//验证非空
		function vaildNotNull() {
			var formLogin = $("#login");
			var formRegist = $("#regist");
			$.ajax({
				type : "get",
				url : "/programer/index/getLoginUser",
				//dataType:'json',
				async : true,
				success : function(data) {
					alert(data);
					if (data != null || data != undefined) {
						formRegist.attr("style", "display:block");
					} else {
						formLogin.attr("style", "display:block");
					}
				},
				error : function() {
					console.log("出错了")
				}
			})
			/* if(true){
				alert(formLogin.text());
				formLogin.attr("style","display:block");
			} */
		}
		function toggle(par){
			//点击注册，注册显示，登陆隐藏
			if(par == 'zc'){
				$("#regist").attr("style", "display:block")
				$("#login").attr("style", "display:none")
			}else{
				$("#login").attr("style", "display:block")
				$("#regist").attr("style", "display:none")
			}
		}
		
		
	</script>
</body>

</html>