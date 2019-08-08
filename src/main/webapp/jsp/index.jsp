<%--
  Created by IntelliJ IDEA.
  User: yzf
  Date: 2019/8/8
  Time: 下午4:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>旅游平台首页</title>
</head>
<body>
    <%
        String username = String.valueOf(request.getAttribute("user"));
        if (username == "null"){
            %>
    <form action="" id="loginform" name="loginform" method="post">
        用户名：<input type="text" id="username" name="username"><br><br>
        密码：<input type="password" id="password" name="password"><br><br>
        <select name="type" id="type">
            <option value="0">管理员</option>
            <option value="1">会员</option>
            <option value="2">旅行社</option>
        </select><br><br>
        <input type="button" id="q" name="q" value="登录" onclick="x()">
    </form>
        <%
        } else {
        %>
                <table border="1">
                    <tr><td>用户名</td>
                        <th>
                            <%=
                               username
                            %>
                        </th>
                    </tr>
                </table>
        <%
        }
        %>
</body>
<script>
    function x() {
        var select = document.getElementById('type');
        var form = document.getElementById('loginform');
        if (select.value == '0'){
            form.action = 'admin/login'
        } else if (select.value == '1'){
            form.action = 'vip/login'
        } else{
            form.action = 'agency/login'
        }
        form.submit();
    }
</script>
</html>
