<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/22
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
这是html
  <%! private Integer id;
      private static Map map;
      static {
        HashMap<Object, Object> ma = new HashMap<>();
      }

      public int avc(){
        return 1;
      }
  %>

<%= 12%>
<%= 12.12%>
<%= "你好"%>
<%--<%= ma%>--%>输出对象


 <% int i =12;
 if( i==12){
   System.out.println("123");
 }%>

<% for(int j=0;j<10;j++){
  System.out.println("k");
}%>

<% String username=request.getParameter("username");
%>


<%
    // 往四个域中都分别保存了数据
    pageContext.setAttribute("key", "pageContext");
    request.setAttribute("key", "request");
    session.setAttribute("key", "session");
    application.setAttribute("key", "application");
%>

</body>
</html>
