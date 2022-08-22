<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/22
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <% for(int i=1;i<=9;i++){
      for(int j=1;j<=i;j++){
                %>
          <% =i+"x" +j+"="+(i*j)%>
  <%
      }
  }
  %>
<% ArrayList<Object> objects = new ArrayList<>();;
%>
</body>
</html>
