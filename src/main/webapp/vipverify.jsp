<%@ page import="com.njust.travel.entity.Vip" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/16
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();
%>
<html>
<head>
    <title>会员信息审核</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>管理员界面</title>

    <link href="<%=path%>/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/datepicker3.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/adminmain.css" rel="stylesheet">
    <!-- bootstrap2环境使用 -->
    <link rel="stylesheet" href="<%=path%>/assets/css/b.page.css" type="text/css">
    <!-- bootstrap3环境使用 -->
    <link rel="stylesheet" href="<%=path%>/assets/css/b.page.bootstrap3.css" type="text/css">
    <!--[if lt IE 9]>
    <script src="<%=path%>/assets/js/html5shiv.min.js"></script>
    <script src="<%=path%>/assets/js/respond.min.js"></script>
    <![endif]-->
    <script src="<%=path%>/js/ajax.js"></script>
</head>
<body>

<div class="col-sm-9 col-lg-10 main">
    <div class="row">
        <ol class="breadcrumb">
            <li><a href="/travel/adminmain.jsp"><span class="glyphicon glyphicon-home"></span></a></li>
            <li class="active">审核</li>
        </ol>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">会员注册审核</h1>
        </div>
    </div><!--/.row-->

    <table class="bTable table table-striped table-bordered table-hover table-condensed">
        <thead>
        <tr>
            <th>用户名</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>身份证号</th>
            <th>邮箱</th>
            <th>电话</th>
            <th>是否通过</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${not empty viplist}">
            <c:forEach var="d" items="${viplist}">
                <tr class="<c:if test="${d.status == false}">error</c:if>" id="${d.id}">
                    <td>${d.username}</td>
                    <td>${d.name}</td>
                    <td>${d.sex}</td>
                    <td>${d.age}</td>
                    <td>${d.cid}</td>
                    <td>${d.email}</td>
                    <td>${d.tel}</td>
                    <td>
                        <button type="button"style="margin-left: 50px" onclick="saveVipId(${d.id})">√</button>
                        <button type="button"style="margin-left: 50px" onclick="deleteVipId(${d.id})">×</button>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
    <!-- 必须设置以下分页信息设置，否则插件将无法读取分页数据-->
    <!-- 隐藏内容设置后，在插件初始化时进行读取-->



</div><!--/.main-->

</body>
<script src="<%=path%>/assets/js/jquery-1.11.1.min.js"></script>
<script src="<%=path%>/assets/js/bootstrap.min.js"></script>
<script src="<%=path%>/assets/js/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="<%=path%>/assets/js/b.page.js" ></script>
<script>
    $('#calendar').datepicker({
    });

    !function ($) {
        $(document).on("click","ul.nav li.parent > a > span.icon", function(){
            $(this).find('em:first').toggleClass("glyphicon-minus");
        });
        $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
    }(window.jQuery);

    $(window).on('resize', function () {
        if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
    })
    $(window).on('resize', function () {
        if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
    })
    $('#page1').bPage({
        //分页目标链接
        url : $webroot + 'demo/manage/page',
        //读取页面设置的分页参数
        totalPage : $('#totalPage').val(),
        totalRow : $('#totalRow').val(),
        pageSize : $('#pageSize').val(),
        pageNumber : $('#pageNumber').val(),
        //自定义传递到服务端的参数
        params : function(){
            return {
                userName : 'zhangsan',
                age : 42
            };
        }
    });
</script>
</html>
