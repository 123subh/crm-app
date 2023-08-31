<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print Bill</title>
</head>
<body>
<h2>Print Bill</h2>
<pre>
	First Name	: ${bill.firstName}<br/>
	Last Name	: ${bill.lastName}<br/>
	E-Mail		: ${bill.email}<br/>
	Mobile 		: ${bill.mobile}<br/>
	Model		: ${bill.model}<br/>
	Amount		: ${bill.amount}<br/>
</pre>
	<form action="print">
		<input type="button" value="Print" onclick="window.print()"/>
	</form>
</body>
</html>