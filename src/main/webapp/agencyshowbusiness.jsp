<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/28
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>旅行业务</title>
    <link href="<%=path%>/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
    <link href="<%=path%>/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/agencymain.css" rel="stylesheet">
    <script>
        function sub(id) {
            if ("visitor" == "<%=(String)session.getAttribute("type")%>"){
                alert("请登录后再使用该功能！")
                window.location.href = "/travel/index.jsp";
            } else{
                var form = document.getElementById(id);
                form.submit();
            }
        }
        function jump() {
            if ("agency" == "<%=(String)session.getAttribute("type")%>"){
                window.location.href = "/travel/agencymain.jsp";
            } else{
                window.location.href = "/travel/main.jsp";
            }
        }
    </script>
</head>
<body>

<header class="header-top" >
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#"><span>旅行</span>业务</a>
                <div class="toptoright"> <a href="javascript:void(0);" onclick="jump()" class="setwordcolor">返回主页</a></div>
            </div>
        </div>
    </nav>
</header>

<section id="works" class="works">
    <div class="container">
        <div class="row">

            <c:if test="${not empty businesslist}">
                <c:forEach var="d" items="${businesslist}">
                    <form action="/travel/agency/findonebusiness" name="${d.id}" hidden="hidden" method="post" id="${d.id}">
                        <input type="text" value="${d.id}" hidden="hidden" name="businessid" id="businessid">
                    </form>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <a href="javascript:void(0);" onclick="sub(${d.id})" class="fh5co-card-item image-popup">
                            <figure>
                                <div class="overlay"><i class="ti-plus"></i></div>
                                <img src="/travel/scenic/${d.p1}" alt="Image" class="img-responsive">
                            </figure>
                            <div class="fh5co-text">
                                <h2>${d.scenicname}</h2>
                                <p>${d.name}</p>
                            </div>
                        </a>
                    </div>
                </c:forEach>
            </c:if>

        </div>
    </div><!--/.container-->
</section>
</body>
</html>
