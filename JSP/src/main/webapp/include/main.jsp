<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/22
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    头部信息<br>
    主题内容<br>
<%--    静态包含,file属性指定你要包含的jsp页面的路径--%>
    <%@ include file="/" %>
<jsp:include page="/">
    <jsp:param name="" value=""/>
</jsp:include>
<jsp:forward page=""></jsp:forward>

</body>
</html>
