<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/30
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String type = (String) session.getAttribute("type");
    if (type.equals("visitor")){
%>
    <script>
        alert("请注册后再进行尝试！");
        window.location.href="/travel/register.jsp";
    </script>
<%} else {%>
<script>
    function toOrderspage() {
        var form1 = document.getElementById("form1");
        form1.submit();
    }
</script>
    <body onload="toOrderspage()">
        <form action="vip/getOrders" method="post" name="form1" id="form1">
        </form>
    </body>
<%}%>
</html>
