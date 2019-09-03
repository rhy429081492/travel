<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/30
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <!-- meta data -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="referrer" content="never">

    <title>旅游信息</title>

    <!--linear icon css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/linearicons.css">

    <!-- Magnific Popup -->
    <link rel="stylesheet" href="<%=path%>/assets/css/bootstrap-datepicker.min.css">

    <!--bootstrap.min.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/bootstrap.min.css">
    <!-- bootsnav -->
    <link rel="stylesheet" href="<%=path%>/assets/css/bootsnav.css" >
    <!--style.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/styleforattractionsinfo.css">
    <!--responsive.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/responsive.css">
    <script>
        function sub() {
            var form = document.getElementById("form");
            form.submit();
        }
    </script>
</head>
<body>
<header id="header-top" class="header-top">
    <ul>
        <li>
            <div class="header-top-left">
                <ul>
                    <li class="select-opt">
                        <a href="#"><span class="lnr lnr-magnifier"></span></a>
                    </li>
                </ul>
            </div>
        </li>
        <li class="head-responsive-right pull-right">
            <div class="header-top-right">
                <ul>
                    <li class="header-top-contact">
                        <a href="/travel/getPersonal">个人信息</a>
                    </li>
                    <li class="header-top-contact">
                        <a href="/travel/index.jsp">登录</a>
                    </li>
                    <li class="header-top-contact">
                        <a href="/travel/register.jsp">注册</a>
                    </li>
                </ul>
            </div>
        </li>
    </ul>

</header>
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
                    <a class="navbar-brand" href="index.html">旅游<span>资源</span></a>

                </div><!--/.navbar-header-->
                <!-- End Header Navigation -->

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse menu-ui-design" id="navbar-menu">
                    <ul class="nav navbar-nav navbar-right" data-in="fadeInDown" data-out="fadeOutUp">
                        <li><a href="main.jsp">回到首页</a></li>
                        <li class="scroll"><a href="#introduct">景点信息</a></li>
                        <li class="scroll"><a href="#comment">用户评论</a></li>
                        <li class="scroll"><a href="#order">用户预约</a></li>
                    </ul><!--/.nav -->
                </div><!-- /.navbar-collapse -->
            </div><!--/.container-->
        </nav><!--/nav-->
        <!-- End Navigation -->
    </div><!--/.header-area-->
    <div class="clearfix"></div>

</section>
<section id="introduct">
    <form id="form" name="form" action="/travel/vip/order" method="post" hidden="hidden">
        <input type="text" id="businessid" name="businessid" value="${businessinfo.id}">
    </form>
    <div class="container" id="Box1">
        <h1 class="h1"><a class="h1-left"></a>景点信息</h1>
        <c:if test="${not empty businessinfo.p1}">
            <div class="attraction-photo">
                <img src="/travel/scenic/${businessinfo.p1}">
            </div>
        </c:if>
        <c:if test="${not empty businessinfo.p2}">
            <div class="attraction-photo">
                <img src="/travel/scenic/${businessinfo.p2}">
            </div>
        </c:if>
        <c:if test="${not empty businessinfo.p3}">
            <div class="attraction-photo">
                <img src="/travel/scenic/${businessinfo.p3}">
            </div>
        </c:if>
        <c:if test="${not empty businessinfo.p4}">
            <div class="attraction-photo">
                <img src="/travel/scenic/${businessinfo.p4}">
            </div>
        </c:if>
        <c:if test="${not empty businessinfo.p5}">
            <div class="attraction-photo">
                <img src="/travel/scenic/${businessinfo.p5}">
            </div>
        </c:if>
        <div class="attraction-text">
            <h3>${businessinfo.scenicname}</h3>
            <p>${businessinfo.introduce}</p>
        </div>
    </div>
</section>
<section id="comment">

    <div class="container" id="Box4">
        <h1 class="h1"><a class="h1-left"></a>用户评论</h1>

        <c:if test="${not empty orders}">
            <c:forEach var="d" items="${orders}">
                <div class="comment-box">
                    <div class="comment-text">
                        <h3>评价等级：${d.level}</h3>
                    </div>
                    <div class="comment-text">
                        <h3>用户编号：${d.vipid}</h3>
                        <p>用户评论：${d.discuss}</p>
                    </div>
                </div>
            </c:forEach>
        </c:if>

    </div>
</section>
<section id="order">
    <div class="container" id="Box3">
        <h1 class="h1"><a class="h1-left"></a>旅行预约</h1>
        <div>
            <button class="welcome-hero-btn" onclick="sub()">预约</button>
        </div>
    </div>
</section>

<script type="text/jscript" language="javascript">
    var clickClass = "";
    var moveClass = "";
    var clickTR ;
    var moveTR ;
    function Move(me)
    {
        if (clickTR != me)
        {
            if (moveTR != me)
            {
                moveClass = me.className;
                moveTR = me;
                me.className = "css_TR_move";
                //alert("a");
            }
        }
    }

    function Out(me)
    {
        if (clickTR != me)
        {
            moveTR = null;
            me.className = moveClass;
        }
    }
    function Ck(me,dataID)
    {
        if (clickTR != me)
        {
            if (clickTR)
            {
                clickTR.className = clickClass;
            }
            clickTR = me;
            clickClass = moveClass;
        }
        //alert("您选择的记录ID：" + dataID);
        me.className = "css_TR_CK";
    }
</script>
<!-- Include all js compiled plugins (below), or include individual files as needed -->

<script src="<%=path%>/assets/js/jquery.js"></script>

<!--modernizr.min.js-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js"></script>

<!--bootstrap.min.js-->
<script src="<%=path%>/assets/js/bootstrap.min.js"></script>

<!-- bootsnav js -->
<script src="<%=path%>/assets/js/bootsnav.js"></script>

<!--feather.min.js-->
<script  src="<%=path%>/assets/js/feather.min.js"></script>

<!-- counter js -->
<script src="<%=path%>/assets/js/jquery.counterup.min.js"></script>
<script src="<%=path%>/assets/js/waypoints.min.js"></script>

<!--slick.min.js-->
<script src="<%=path%>/assets/js/slick.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>

<!--Custom JS-->
<script src="<%=path%>/assets/js/custom.js"></script>
</body>
</html>
