<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>注册</title>

    <link rel="stylesheet" href="<%=path%>/assets/css/common.css">
</head>
<body>
<div id="tab">
    <ul class="tab_menu">
        <li class="selected">游客注册</li>
        <li>旅行社注册</li>
    </ul>
    <div class="tab_box">
        <!-- 游客注册开始 -->
        <div>
            <div class="stu_error_box"></div>
            <form action="vip/register" method="post" class="stu_login_error">
                <div id="username">
                    <label>用户名</label>
                    <input id="user" name="user" type="text"/>
                </div>
                <div id="pwd">
                    <label>密&nbsp;&nbsp;&nbsp;码</label>
                    <input id="password" name="password" type="password"/>
                </div>
                <div id="username1">
                    <label>姓&nbsp;&nbsp;&nbsp;名</label>
                    <input id="name" name="name" type="text" />
                </div>
                <div id="gender">
                    <label>性&nbsp;&nbsp;&nbsp;别</label>
                    <input id="sex" name="sex" type="text"/>
                </div>
                <div id="age">
                    <label>年   龄</label>
                    <input id="page" name="page" type="text"/>
                </div>
                <div id="cid">
                    <label>身份证</label>
                    <input id="pcid" name="pcid" type="text"/>
                </div>
                <div id="email">
                    <label>邮&nbsp;&nbsp;&nbsp;箱</label>
                    <input id="pemail" name="pemail" type="text"/>
                </div>
                <div id="tel">
                    <label>电&nbsp;&nbsp;&nbsp;话</label>
                    <input id="ptel" name="ptel" type="text"/>
                </div>

                <div id="reg1">
                    <button type="submit">注册</button>
                </div>
            </form>
        </div>
        <div class="hide">
            <div class="tea_error_box"></div>
            <form action="agency/register" method="post" class="tea_login_error" enctype="multipart/form-data">
                <div id="username2">
                    <label>旅行社</label>
                    <input id="agencyname" name="agencyname" type="text"/>
                </div>
                <div id="username3">
                    <label>用户名</label>
                    <input id="auser" name="auser" type="text"/>
                </div>
                <div id="pwd2">
                    <label>密&nbsp;&nbsp;&nbsp;码</label>
                    <input id="apassword" name="apassword" type="password"/>
                </div>
                <div id="username4">
                    <label>法&nbsp;&nbsp;&nbsp;人</label>
                    <input id="apname" name="apname" type="text" />
                </div>
                <div id="cid2">
                    <label>身份证</label>
                    <input id="apcid" name="apcid" type="text"/>
                </div>
                <div id="email2">
                    <label>邮&nbsp;&nbsp;&nbsp;箱</label>
                    <input id="aemail" name="aemail" type="text"/>
                </div>
                <div id="tel2">
                    <label>电&nbsp;&nbsp;&nbsp;话</label>
                    <input id="atel" name="atel" type="text"/>
                </div>
                <div>
                    <label>文件选择：</label>
                    <input type="file" id="licence" name="licence" class="form-control"  value="选择文件" accept="">
                </div>
                <div id="reg2">
                    <button type="submit">注册</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>

<script src="<%=path%>/assets/js/jquery.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        var $tab_li = $('#tab ul li');
        $tab_li.hover(function(){
            $(this).addClass('selected').siblings().removeClass('selected');
            var index = $tab_li.index(this);
            $('div.tab_box > div').eq(index).show().siblings().hide();
        });
    });
</script>

</html>