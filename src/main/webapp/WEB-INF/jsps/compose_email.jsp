<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose email</title>
</head>
<body>
<h2>Compose Email</h2>
	<form action="composeEmail" method="post">
		<pre>
			To	${email}<input type="hidden" value="${email}" name="to"/><br/>
			Subject	<input type="text" name="sub"/><br/>
			<textarea name="body" cols="70" rows="30"></textarea><br/>
			<input type="submit" value="Send Email"/>
		</pre>
	</form>
</body>
</html>