<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../js/jquery.js" />
<title>show me</title>

</head>
<body>

tests
	<table width="100%" border="0">
		<tr>
			<td width="60" height="40" align="right">用户名&nbsp;</td>
			<td><input type="text" value="" class="text2" name="name"
				id="userid" /></td>
		</tr>
		<tr>
			<td width="60" height="40" align="right">密&nbsp;&nbsp;码&nbsp;</td>
			<td><input type="password" value="" class="text2"
				name="password" id="userpassid" /></td>
		</tr>
	</table>
</body>

<script type="text/javascript">
	$(document).ready(function() {
		$.ajax({
			url : "/user/showMe",
			dataType : 'json',
			async : true,
			// data		:{'category':'油田机关处室'},
			success : function(data) {
				if (data.code == 0) {
					$("#userid").val(data.data.name);
					$("#userpassid").val(data.data.password);
				} else {
					alert(data.msg);
				}
			},
			error : function(data) {
				alert("fail");
			}
		});
	});
</script>
</html>