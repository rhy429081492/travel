<%@ page import="com.njust.travel.entity.Vip" %>
<%@ page import="com.njust.travel.entity.Agency" %><%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/21
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">

    <link href="assets/css/styleforuserinfo.css" rel="stylesheet" type="text/css" media="all" />
    <!-- bootstrap2环境使用 -->
    <link rel="stylesheet" href="assets/css/b.page.css" type="text/css">
    <!-- bootstrap3环境使用 -->
    <link rel="stylesheet" href="assets/css/b.page.bootstrap3.css" type="text/css">
    <script>
        function x1() {
            var form1 = document.getElementById("form1");
            form1.action = "/travel/updatevipinfo";
            form1.submit();
        }
        function x2() {
            var form2 = document.getElementById("form2");
            form2.action = "/travel/updateagencyinfo";
            form2.submit();
        }
    </script>
</head>
<body class="bgimg">
<!-- about -->
<!--header-top start -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#"><span>用户</span>信息页</a>
        </div>
        <div class="toptoright"> <a href="index.jsp"class="setwordcolor">退出登录</a></div>
    </div><!-- /.container-fluid -->
</nav>
<!--header-top end -->
<%
    String user = (String) session.getAttribute("user");
    String type = (String) session.getAttribute("type");
    if (type.equals("visitor")) {
%>
    <script>
        alert("请登录后尝试！");
        window.location.href="/travel/index.jsp";
    </script>
<%
    }
    else if (type.equals("admin")){
%>
<div class="totop" id="about">
    <div class="form-bottom col-md-6 col-md-offset-3 form-box colorchange css1">
        <form role="form" action="#" method="post" class="" id="form0">
            <h1><a class="h1-left"></a>个人信息修改</h1>
            <div class="form-group">
                用户名:<input type="text" name="form-username" placeholder="用户名" class="form-username form-control" id="form-username" readonly="readonly" value="<%=user%>">
            </div>
            <div class="form-group">
                账户类型:<input type="text" name="form-type" placeholder="账户类型" class="form-password form-control" id="form-type" readonly="readonly" value="管理员">
            </div>
            <button type="button" class="btn" onclick="window.location.href='adminmain.jsp'">返回主页</button>
        </form>
    </div>
</div>
<%}else if (type.equals("vip")){
    Vip vip = (Vip) session.getAttribute("vip");
%>
<div class="totop" id="about">
    <div class="form-bottom col-md-6 col-md-offset-3 form-box colorchange css1">
        <form role="form" action="#" method="post" class="" id="form1">
            <h1><a class="h1-left"></a>个人信息修改</h1>
            <div class="form-group">
                <input type="text" name="form-username" placeholder="用户名" class="form-username form-control" id="form-nickname" readonly="readonly" value="<%=vip.getUsername()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-age" placeholder="年龄" class="form-password form-control" id="form-age" value="<%=vip.getAge()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-sex" placeholder="性别" class="form-password form-control" id="form-sex" value="<%=vip.getSex()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-cid" placeholder="身份证号码" class="form-password form-control" id="form-cid" value="<%=vip.getCid()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-tel" placeholder="联系电话" class="form-password form-control" id="form-tel" value="<%=vip.getTel()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-mail" placeholder="邮箱地址" class="form-password form-control" id="form-mail" value="<%=vip.getEmail()%>">
            </div>

            <button type="button" class="btn" onclick="x1()">确认修改</button>
            <button type="button" class="btn" onclick="window.location.href='main.jsp'">返回主页</button>
        </form>
    </div>
</div>
<%}else if (type.equals("agency")){
    Agency agency = (Agency)session.getAttribute("agency");
%>
<div class="totop" id="about">
    <div class="form-bottom col-md-6 col-md-offset-3 form-box colorchange css1">
        <form role="form" action="#" method="post" class="" id="form2">
            <h1><a class="h1-left"></a>个人信息修改</h1>
            <div class="form-group">
                <input type="text" name="form-username" placeholder="用户名" class="form-username form-control" id="form-username1" readonly="readonly" value="<%=agency.getUsername()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-aname" placeholder="旅行社名" class="form-password form-control" id="form-aname" value="<%=agency.getAgencyname()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-pname" placeholder="法人姓名" class="form-password form-control" id="form-pname" value="<%=agency.getName()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-cid" placeholder="法人身份证号码" class="form-password form-control" id="form-cid1" value="<%=agency.getCid()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-tel" placeholder="联系电话" class="form-password form-control" id="form-tel1" value="<%=agency.getTel()%>">
            </div>
            <div class="form-group">
                <input type="text" name="form-mail" placeholder="邮箱地址" class="form-password form-control" id="form-mail1" value="<%=agency.getEmail()%>">
            </div>
            <div class="form-group">
                <a href="<%="/travel/licence/"+agency.getLicencesite()%>" class="form-password form-control" readonly="readonly">营业执照</a>
            </div>

            <button type="button" class="btn" onclick="x2()">确认修改</button>
            <button type="button" class="btn" onclick="window.location.href='agencymain.jsp'">返回主页</button>
        </form>
    </div>
</div>
<%}%>
<!-- //about-bottom -->

</body>
</html>

