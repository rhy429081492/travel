<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/27
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>旅行社主页</title>
    <link href="<%=path%>/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
    <link href="<%=path%>/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/agencymain.css" rel="stylesheet">
</head>
<body>
<header class="header-top" >
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#"><span>旅行社</span>主页</a>
                <a class="navbar-brand" href="/travel/getPersonal">我的信息</a>
            </div>
            <div class="toptoright"> <a href="/travel/index.jsp" class="setwordcolor">退出登录</a></div>
        </div>
    </nav>
</header>

<!--list-topics start -->
<section id="list-topics" class="list-topics">
    <div class="smallcontainer">
        <div class="list-topics-content">
            <ul>
                <li>
                    <div class="single-list-topics-content">
                        <div class="single-list-topics-icon">
                            <i class="flaticon-restaurant"></i>
                        </div>
                        <h2><a href="/travel/jump.jsp">我的业务</a></h2>
                    </div>
                </li>
                <li>
                    <div class="single-list-topics-content">
                        <div class="single-list-topics-icon">
                            <i class="flaticon-restaurant"></i>
                        </div>
                        <h2><a href="/travel/agencyupdatebusiness.jsp">业务上传</a></h2>
                    </div>
                </li>


            </ul>
        </div>
    </div>
</section>
</body>
</html>
