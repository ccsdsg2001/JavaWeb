<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/8/23
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <% request.setAttribute("key1", "re");
    application.setAttribute("key1", "app");
    %>
${pageScope}
${requestScope.key1}
${applicationScope.key1}

${pageContext.servletConfig}
协议：${pageContext.request.scheme}
服务器ip：${pageContext.request.serverName}

端口号：${pageContext.request.serverPort}

获取工程路径：${pageContext.request.contextPath}

获取请求方法：${pageContext.request.method}

客户端IP：${pageContext.request.remoteHost}
会话id：${pageContext.session.id}
<br>------<br>
${param}
${paramValues}
    <br>
${header}
<%--${header[User-Agent]}--%>

${cookie}
<br>
${initParam.username}

    <br>------------------------------------------<br>

    保存之前:${requestScope.abc}<br>
<c:set scope="request" var="abc" value="abc123"/>
保存之后:${requestScope.abc}

<hr>
<c:if test="${12 ==12}">
    <h1>dad</h1>
</c:if>
<br>------------------------------------------------------------------------
    多路判断
    <%  request.setAttribute("height", 1); %>
<c:choose>
    <c:when test="${requestScope.height>190}">
        <h2>ju</h2>
    </c:when>

<%--    <c:when test="${requestScope.height<190}">--%>
<%--        <h2>ju1</h2>--%>
<%--    </c:when>--%>
<%--    <c:when test="${requestScope.height=190}">--%>
<%--        <h2>ju3</h2>--%>
<%--    </c:when>--%>
    <c:otherwise>
        <c:choose>
            <c:when test="${requestScope.height>12}">
            dasd
        </c:when></c:choose>

    </c:otherwise>
</c:choose>


<br>---------------------------------foreach
<c:forEach begin="1" end="10" var="i">
    遍历1到10 ${i}
</c:forEach>
<hr>
<% request.setAttribute("arr", new String[]{"123","Dasdas"}); %>
<c:forEach items="${requestScope.arr}" var="sc">
    ${sc}
</c:forEach>

<hr>
<% Map<String, Object> stringObjectMap = new HashMap<>();
stringObjectMap.put("KEY1","123");
stringObjectMap.put("KEY2","1323");
request.setAttribute("map", stringObjectMap);%>

<c:forEach begin="1" end="2" items="${requestScope.map}" var="entry" varStatus="ssta">
    ${entry.key}<br>
 ${ssta.current}
 ${ssta.index}
 ${ssta.count}
 ${ssta.first}
 ${ssta.last}
 ${ssta.end}
 ${ssta.begin}
 ${ssta.step}
</c:forEach>
</body>
</html>
