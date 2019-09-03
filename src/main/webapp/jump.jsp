<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/28
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function x() {
            var form = document.getElementById('form');
            form.submit();
        }
    </script>
</head>
<body onload="x()">
    <form action="agency/showbusiness" method="post" id="form" name="form">
    </form>
</body>
</html>
