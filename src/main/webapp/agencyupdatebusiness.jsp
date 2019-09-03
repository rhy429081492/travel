<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 42908
  Date: 2019/8/28
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title>景点信息修改</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>管理员界面</title>

    <link href="<%=path%>/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/datepicker3.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/adminmain.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="<%=path%>/assets/js/html5shiv.min.js"></script>
    <script src="<%=path%>/assets/js/respond.min.js"></script>
    <![endif]-->
    <script>
        function sub() {
            var form = document.getElementById('form');
            form.submit();
        }
    </script>
</head>
<body>
<div class="col-sm-9 col-lg-10 col-sm-offset-1 main">

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">景点信息上传</h1>
        </div>
    </div><!--/.row-->

    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">景点信息</div>
                <div class="panel-body">
                    <div class="col-md-12">
                        <form role="form" method="post" action="agency/updatebusiness" name="form" id="form" enctype="multipart/form-data">

                            <div class="form-group">
                                <label>业务名称</label>
                                <input class="form-control" placeholder="Placeholder" name="form-bname">
                            </div>

                            <div class="form-group">
                                <label>景点名称</label>
                                <input class="form-control" placeholder="Placeholder" name="form-sname">
                            </div>

                            <div class="form-group">
                                <label>开始日期</label>
                                <input class="form-control" placeholder="Placeholder" name="form-begintime">
                            </div>

                            <div class="form-group">
                                <label>结束日期</label>
                                <input class="form-control" placeholder="Placeholder" name="form-endtime">
                            </div>

                            <div class="form-group">
                                <label>价格</label>
                                <input class="form-control" placeholder="Placeholder" name="form-price">
                            </div>

                            <div class="form-group">
                                <label>规模</label>
                                <select class="form-control" name="form-scale">
                                    <option value="小">小</option>
                                    <option value="中">中</option>
                                    <option value="大">大</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label>总人数</label>
                                <input class="form-control" placeholder="Placeholder" name="form-nop">
                            </div>

                            <div class="form-group">
                                <label>出发地</label>
                                <input class="form-control" placeholder="Placeholder" name="form-beginplace">
                            </div>

                            <div class="form-group">
                                <label>交通工具</label>
                                <input class="form-control" placeholder="Placeholder" name="form-vehicle">
                            </div>

                            <div class="form-group">
                                <label>景点简介</label>
                                <textarea class="form-control" placeholder="Placeholder" rows="5" name="form-introduce"></textarea>
                            </div>

                            <div class="form-group">
                                <div><label>景点图片</label></div>

                                <div class="a-upload">
                                    <input type="file" name="form-file" id="form-file[0]">
                                    <p class="help-block">上传景点图片1</p>
                                </div>
                                <div class="a-upload">
                                    <input type="file" name="form-file" id="form-file[1]">
                                    <p class="help-block">上传景点图片2</p>
                                </div>
                                <div class="a-upload">
                                    <input type="file" name="form-file" id="form-file[2]">
                                    <p class="help-block">上传景点图片3</p>
                                </div>
                                <div class="a-upload">
                                    <input type="file" name="form-file" id="form-file[3]">
                                    <p class="help-block">上传景点图片4</p>
                                </div>
                                <div class="a-upload">
                                    <input type="file" name="form-file" id="form-file[4]">
                                    <p class="help-block">上传景点图片5</p>
                                </div>

                            </div>

                        </form>
                    </div>
                </div>
            </div><!-- /.col-->
        </div><!-- /.row -->
        <button type="button" style="float: right" class="btn" onclick="sub()">确认修改</button>
        <button type="button" style="float: right;margin-right: 10px" class="btn" onclick="window.location.href='/travel/agencymain.jsp'">返回主页</button>
    </div>
    <!--/.main-->

</div>

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


</script>
</html>
