<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <% request.setAttribute("key", "1"); %>

    <%=request.getAttribute("key1")%>
    ${key}

    <% session.setAttribute(); %>
    <% application.setAttribute(); %>
    <% pageContext.setAttribute(); %>







</body>
</html>