<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/30
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title>历史订单</title>
    <link rel="stylesheet" href="<%=path%>/assets/css/ordershow.css">
    <!--bootstrap.min.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/bootstrap.min.css">

    <link href="<%=path%>/assets/css/font-awesome.min.css" rel="stylesheet">
    <!-- bootstrap2环境使用 -->
    <link rel="stylesheet" href="<%=path%>/assets/css/b.page.css" type="text/css">
    <!-- bootstrap3环境使用 -->
    <link rel="stylesheet" href="<%=path%>/assets/css/b.page.bootstrap3.css" type="text/css">
    <script>
        function getorder(id) {
            var form = document.getElementById("form");
            var orderid = document.getElementById("orderid");
            orderid.value = id;
            form.submit();
        }
    </script>
</head>
<body>
<!-- top-area Start -->
<section class="top-area">
    <div class="header-area">
        <!-- Start Navigation -->
        <nav class="navbar navbar-default bootsnav  navbar-sticky navbar-scrollspy"  data-minus-value-desktop="70" data-minus-value-mobile="55" data-speed="1000">

            <div class="container">

                <!-- Start Header Navigation -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-menu">
                        <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand" href="#">旅游<span>资源</span></a>

                </div><!--/.navbar-header-->
                <!-- End Header Navigation -->

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse menu-ui-design" id="navbar-menu">
                    <ul class="nav navbar-nav navbar-right" data-in="fadeInDown" data-out="fadeOutUp">
                        <li><a href="/travel/main.jsp">返回首页</a></li>
                        <li><a href="#">历史订单</a></li>

                    </ul><!--/.nav -->
                </div><!-- /.navbar-collapse -->
            </div><!--/.container-->
        </nav><!--/nav-->
        <!-- End Navigation -->
    </div><!--/.header-area-->
    <div class="clearfix"></div>
</section><!-- /.top-area-->
<!-- top-area End -->
<div class="totop">

    <div class="col-md-8 col-md-offset-2 colorchange css1">
        <h1><a class="h1-left"></a>订单记录</h1>
        <form id="form" name="form" action="/travel/findoneorder" method="post" hidden="hidden">
            <input type="text" id="orderid" name="orderid" value="">
        </form>
        <table class="bTable table table-striped table-bordered table-hover table-condensed">
            <thead>
            <tr>
                <th>订单号</th>
                <th>订单日期</th>
                <th>订单详情</th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${not empty orderlist}">
            <c:forEach var="d" items="${orderlist}">
                <tr>
                    <td>${d.id}</td>
                    <td>${d.date}</td>
                    <td>
                        <input type="button" onclick="getorder(${d.id})" value="查看详情">
                    </td>
                </tr>
            </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
