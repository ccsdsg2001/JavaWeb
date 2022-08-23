<%@ page import="com.example.eljstl.person" %>
<%@ page import="java.sql.Array" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--    <% request.setAttribute("key", "1"); %>--%>

<%--    <%=request.getAttribute("key1")%>--%>
<%--    ${key}--%>

<%--    <% session.setAttribute(); %>--%>
<%--    <% application.setAttribute(); %>--%>
<%--    <% pageContext.setAttribute(); %>--%>
<% person person = new person();
person.setName("12");
person.setPhones(new String[]{"123","123"});
    ArrayList<Object> objects = new ArrayList<>();
    objects.add("nek");

    HashMap<Object, Object> ashMap = new HashMap<>();
    ashMap.put("123", 1);
%>


${123}
${person.name}
${person.phones[1]}
${person.ashmap.123}

${12 == 12}
${12 != 12}
${12 <= 12}
${12 >= 12}
${12 == 12 && 12 <11}
${12 == 12 || 12 <11}
${12 == 12 || not 12 <11}

${empty pageContext}
${empty  person}
${empty  "1"}
${empty  null}

${12 ==12 ? "huo":"nihjao"}

${map['a.a.a']}

</body>
</html>