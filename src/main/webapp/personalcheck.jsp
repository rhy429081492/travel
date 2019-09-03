<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/27
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Boolean flag = (Boolean) request.getAttribute("flag");
    if (flag){
%>
<script>
    alert("修改成功");
    window.location = "/travel/main.jsp";
</script>
<%} else {%>
<script>
    alert("修改失败");
    window.location = "/travel/main.jsp";
</script>
<%}%>
</body>
</html>
