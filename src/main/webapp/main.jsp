<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/9
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <!-- meta data -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="referrer" content="never">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!--font-family-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- title of site -->
    <title>首页</title>
    <!--font-awesome.min.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/font-awesome.min.css">
    <!--linear icon css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/linearicons.css">
    <!--animate.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/animate.css">
    <!-- Icomoon Icon Fonts-->
    <link rel="stylesheet" href="<%=path%>/assets/css/icomoon.css">
    <!-- Magnific Popup -->
    <link rel="stylesheet" href="<%=path%>/assets/css/bootstrap-datepicker.min.css">
    <!--flaticon.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/flaticon.css">

    <link rel="stylesheet" href="<%=path%>/assets/css/magnific-popup.css">


    <!--slick.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/slick.css">
    <link rel="stylesheet" href="<%=path%>/assets/css/slick-theme.css">
    <!--bootstrap.min.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/bootstrap.min.css">
    <!-- bootsnav -->
    <link rel="stylesheet" href="<%=path%>/assets/css/bootsnav.css" >
    <!--style.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/style.css">
    <!--responsive.css-->
    <link rel="stylesheet" href="<%=path%>/assets/css/responsive.css">

    <link rel="stylesheet" href="<%=path%>/assets/css/changeimg.css">

    <link rel="stylesheet" href="<%=path%>/assets/css/reset.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <style>
        *{padding: 0px;margin: 0px;}
        #flash{width:1200px;height: 535px;margin: 0px auto;position: relative;float: left}
        #flash #play{width:1200px;height: 535px;list-style: none;position:absolute;top:0px;left:0px;}
        #flash #play li{display: none;position:absolute;top:0px;left:0px;}
        #flash #play li img{float: left;}
        #button{position: absolute;bottom:20px;left:470px;list-style: none;}
        #button li{margin-left: 10px;float: left;}
        #button li div{width:12px;height: 12px;background:#DDDDDD;border-radius: 6px;cursor: pointer;}
        #prev{width:40px;height:63px;background:url(images/beijing.png) 0px 0px;position: absolute;top:205px;left:10px;z-index: 1;}
        #next{width:40px;height:63px;background:url(images/beijing.png) -40px 0px;position: absolute;top:205px;right:10px;z-index: 1;}
        #prev:hover{background:url(images/beijing.png) 0px -62px;}
        #next:hover{background:url(images/beijing.png) -40px -62px;}
    </style>

    <script type="text/javascript" src="<%=path%>/js/script.js"></script>
    <script>
        function addsub() {
            var sname = document.getElementById("form-sname");
            var beginplace = document.getElementById("form-beginplace");
            var ssname = document.getElementById("sname");
            var bbeginplace = document.getElementById("beginplace");
            sname.value = ssname.value;
            beginplace.value = bbeginplace.value;
            var subform = document.getElementById("subform");
            subform.submit();
        }
        function sub(id) {
            if ("visitor" == "<%=(String)session.getAttribute("type")%>"){
                alert("请登录后再使用该功能！")
                window.location.href = "/travel/index.jsp";
            } else{
                var form = document.getElementById(id);
                form.submit();
            }
        }
    </script>
</head>

<body>
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->

<!--header-top start -->
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

</header><!--/.header-top-->
<!--header-top end -->

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
                        <li class=" scroll active"><a href="#home">首页</a></li>
                        <li class="scroll"><a href="#works">景点推荐</a></li>
                        <li class="scroll"><a href="#home">景点查询</a></li>
                        <li><a href="/travel/myorders.jsp">历史订单</a></li>
                    </ul><!--/.nav -->
                </div><!-- /.navbar-collapse -->
            </div><!--/.container-->
        </nav><!--/nav-->
        <!-- End Navigation -->
    </div><!--/.header-area-->
    <div class="clearfix"></div>

</section><!-- /.top-area-->
<!-- top-area End -->
<div class="head-photo-text">
    <div class="photo-content">
        <div id="flash">
            <div id="prev"></div>
            <div id="next"></div>
            <ul id="play">
                <li style="display: block;"><img src="<%=path%>/images/1.jpg" alt="" /></li>
                <li><img src="<%=path%>/images/2.jpg" alt="" /></li>
                <li><img src="<%=path%>/images/3.jpg" alt="" /></li>
                <li><img src="<%=path%>/images/4.jpg" alt="" /></li>
                <li><img src="<%=path%>/images/5.jpg" alt="" /></li>
                <li><img src="<%=path%>/images/6.jpg" alt="" /></li>
                <li><img src="<%=path%>/images/7.jpg" alt="" /></li>
                <li><img src="<%=path%>/images/8.jpg" alt="" /></li>
            </ul>
            <ul id="button">
                <li><div style="background: #A10000;"></div></li>
                <li><div></div></li>
                <li><div></div></li>
                <li><div></div></li>
                <li><div></div></li>
                <li><div></div></li>
                <li><div></div></li>
                <li><div></div></li>
            </ul>
        </div>
    </div>
    <div class="show-box">
        <div class="info-box">
            <ul class="tab-nav">
                <li id="li-1" class="li-nav li-nav-hover li-border">公告</li>
            </ul>
            <div id="box-1" style="display: block" class="hiddenBox">

                <a href="#">公告1****************************************</a>
                <a href="#">公告2****************************************</a>
                <a href="#">公告3****************************************</a>
                <a href="#">公告4****************************************</a>
            </div>

        </div>
    </div>
</div>




<!--welcome-hero start -->
<section id="home" class="welcome-hero">
    <div class="container">
        <div class="welcome-hero-txt">
            <h2>探索自然 <br>发现美好 </h2>
            <p>
                尽在旅游资源管理网
            </p>
        </div>
        <div class="welcome-hero-serch-box">
            <form action="/travel/getBusiness" name="subform" id="subform" method="post" hidden="hidden">
                <input type="text" id="form-sname" name="form-sname" value="">
                <input type="text" id="form-beginplace" name="form-beginplace" value="">
            </form>
            <div class="welcome-hero-form">
                <div class="single-welcome-hero-form">
                    <h3>出发地</h3>
                    <form>
                        <input id="beginplace" name="beginplace" type="text" placeholder="例: 南京" value=""/>
                    </form>
                    <div class="welcome-hero-form-icon">
                        <i class="flaticon-list-with-dots"></i>
                    </div>
                </div>
                <div class="single-welcome-hero-form">
                    <h3>目标景点</h3>
                    <form>
                        <input id="sname" name="sname" type="text" placeholder="例: 乐山大佛" value=""/>
                    </form>
                    <div class="welcome-hero-form-icon">
                        <i class="flaticon-list-with-dots"></i>
                    </div>
                </div>
            </div>
            <div class="welcome-hero-serch">
                <button class="welcome-hero-btn" onclick="addsub()">
                    search  <i data-feather="search"></i>
                </button>
            </div>
        </div>
    </div>

</section><!--/.welcome-hero-->
<!--welcome-hero end -->

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
                        <h2><a href="#">餐饮</a></h2>
                        <p>150 listings</p>
                    </div>
                </li>
                <li>
                    <div class="single-list-topics-content">
                        <div class="single-list-topics-icon">
                            <i class="flaticon-travel"></i>
                        </div>
                        <h2><a href="#">目的地</a></h2>
                        <p>214 listings</p>
                    </div>
                </li>
                <li>
                    <div class="single-list-topics-content">
                        <div class="single-list-topics-icon">
                            <i class="flaticon-building"></i>
                        </div>
                        <h2><a href="#">旅店住宿</a></h2>
                        <p>185 listings</p>
                    </div>
                </li>
                <li>
                    <div class="single-list-topics-content">
                        <div class="single-list-topics-icon">
                            <i class="flaticon-pills"></i>
                        </div>
                        <h2><a href="#">医疗保障</a></h2>
                        <p>200 listings</p>
                    </div>
                </li>
                <li>
                    <div class="single-list-topics-content">
                        <div class="single-list-topics-icon">
                            <i class="flaticon-transport"></i>
                        </div>
                        <h2><a href="#">出行方式</a></h2>
                        <p>120 listings</p>
                    </div>
                </li>
            </ul>
        </div>
    </div><!--/.container-->

</section><!--/.list-topics-->
<!--list-topics end-->

<!--works start -->
<section id="works" class="works">
    <div class="container">
        <div class="section-header">
            <h2>景点推荐</h2>
            <p>来次美好的旅行怎么样？</p>
        </div><!--/.section-header-->
        <div class="row">
            <c:if test="${not empty businesslist}">
                <c:forEach var="d" items="${businesslist}">
                    <form action="/travel/findonebusiness" name="${d.id}" hidden="hidden" method="post" id="${d.id}">
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

</section><!--/.works-->
<!--works end -->

<!--footer start-->
<footer id="footer"  class="footer">
    <div class="container">
        <div class="footer-menu">
            <div class="row">
                <div class="col-sm-3">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">旅游<span>资源</span></a>
                    </div><!--/.navbar-header-->
                </div>
                <div class="col-sm-9">
                    <ul class="footer-menu-item">
                        <li class="scroll"><a href="#works">how it works</a></li>
                        <li class="scroll"><a href="#home">explore</a></li>
                    </ul><!--/.nav -->
                </div>
            </div>
        </div>
    </div><!--/.container-->

    <div id="scroll-Top">
        <div class="return-to-top">
            <i class="fa fa-angle-up " id="scroll-top1" data-toggle="tooltip" data-placement="top" title="" data-original-title="Back to Top" aria-hidden="true"></i>
        </div>

    </div><!--/.scroll-Top-->

</footer><!--/.footer-->
<!--footer end-->

<!-- Include all js compiled plugins (below), or include individual files as needed -->

<script src="<%=path%>/assets/js/jquery.js"></script>

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

<!--Custom JS-->
<script src="<%=path%>/assets/js/custom.js"></script>

</body>
</html>
