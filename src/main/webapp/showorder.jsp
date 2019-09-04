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
                        <li><a href="#">订单详情</a></li>

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
        <h1><a class="h1-left"></a>订单详情</h1>
        <form role="form" method="post" action="/travel/vip/updateorder">
            <div class="form-group">
                <label>订单号</label>
                <input id="orderid" name="orderid" class="form-control" type="text" readonly="readonly" value="${order.id}">
            </div>
            <div class="form-group">
                <label>订单日期</label>
                <input id="orderdate" name="orderdate" class="form-control" type="text" readonly="readonly" value="${order.date}">
            </div>
            <div class="form-group">
                <label>评论等级</label>
                <select class="form-control" id="level" name="level">
                    <option value="4">优</option>
                    <option value="3">良</option>
                    <option value="2">中</option>
                    <option value="1">差</option>
                </select>
            </div>
            <div class="form-group">
                <label>评论内容</label>
                <textarea class="form-control" rows="5" name="discuss" id="discuss">${order.discuss}</textarea>
            </div>
            <div class="form-group">
                <input class="form-control" type="submit" value="提交">
            </div>
        </form>
    </div>
</div>

</body>
</html>