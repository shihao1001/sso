<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../js/jquery.js" > 
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sso登录</title>
</head>
<body>


  <div>
	<form id="loginForm" action="${ pageContext.request.contextPath }/user/login">

		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="name" id="userid" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="password" id="userpassid" /></td>
			</tr>
			<tr>	
				<td><input type="submit" /></td>
			</tr>
			<input type="input" name="appId" value="${param.appId }" />
			<input type="input" name="desUrl" value="${param.desUrl }" />
			
		</table>

	</form>
</div>
</body>


</html>