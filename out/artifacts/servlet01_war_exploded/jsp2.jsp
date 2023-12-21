<%@ page import="com.bjpowernode.javaweb.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsptest2</title>
</head>
<body>
<%
    User user = new User("zhangsan",30);
    request.setAttribute("us",user);
%>

${us.age}


</body>
</html>
