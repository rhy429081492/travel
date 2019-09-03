<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/6/19
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath();%>
<html>
<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>登录页</title>

  <!-- CSS -->
  <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
  <link rel="stylesheet" href="<%=path%>/assets/css/bootstrap.min.css">
  <link rel="stylesheet" href="<%=path%>/assets/css/font-awesome.min.css">
  <link rel="stylesheet" href="<%=path%>/assets/css/form-elements.css">
  <link rel="stylesheet" href="<%=path%>/assets/css/styleforindex.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Favicon and touch icons -->
  <link rel="shortcut icon" href="assets/ico/favicon.png">
  <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=path%>/assets/ico/apple-touch-icon-144-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=path%>/assets/ico/apple-touch-icon-114-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=path%>/assets/ico/apple-touch-icon-72-precomposed.png">
  <link rel="apple-touch-icon-precomposed" href="<%=path%>/assets/ico/apple-touch-icon-57-precomposed.png">

  <script>
    function x() {
      var form1 = document.getElementById('form1');
      var type = document.getElementById('type');
      if (type.value == '0'){
        form1.action = 'admin/login';
      } else if (type.value == '1'){
        form1.action = 'vip/login';
      } else {
        form1.action = 'agency/login';
      }
      form1.submit();
    }
  </script>
</head>

<body>

<!-- Top content -->
<div class="top-content">

  <div class="inner-bg">
    <div class="container">
      <div class="row">
        <div class="col-sm-8 col-sm-offset-2 text">
          <h1><strong>欢迎访问</strong> NJUST旅游平台</h1>
          <div class="description">
            <p>
             您可以查询最新景点信息及旅社路线情况 <a href="#"><strong>NJUST旅游平台</strong></a>将为您提供最新的消息!
            </p>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-6 col-sm-offset-3 form-box">
          <div class="form-top">
            <div class="form-top-left">
              <h3>网站登录</h3>
              <p>输入用户名及密码进行登录:</p>
            </div>
            <div class="form-top-right">
              <i class="fa fa-key"></i>
            </div>
          </div>
          <div class="form-bottom">
            <form role="form" id="form1" name="form1" method="post" class="login-form">
              <div class="form-group">
                <label class="sr-only" for="username">用户名</label>
                <input type="text" name="username" placeholder="用户名..." class="username form-control" id="username">
              </div>
              <div class="form-group">
                <label class="sr-only" for="password">密码</label>
                <input type="password" name="password" placeholder="密码..." class="password form-control" id="password">
              </div>
              <div class="form-group">
                <label class="sr-only" for="type">用户类型</label>
                <select id="type" name="type" class="type form-control">
                  <option value="0">管理员</option>
                  <option value="1">会员</option>
                  <option value="2">旅行社</option>
                </select>
              </div>
              <div class="form-group">
                <button id="bu1" name="bu1" type="button" class="btn" onclick="x()">确认登录</button>
              </div>
            </form>
            <div class="form_reg_btn">
              <span>没有帐号？</span>
              <a href="register.jsp" style="margin-right:265px;">马上注册</a>
              <a href="">忘记密码?</a>
            </div>
            <div class="form_reg_btn">
              <span>不想注册？</span>
              <a href="/travel/visit" style="margin-right:265px;">游客入口</a>
            </div>
            <div class="form_forget_btn">

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>


<!-- Javascript -->
<script src="<%=path%>/assets/js/jquery-1.11.1.min.js"></script>
<script src="<%=path%>/assets/js/bootstrap.min.js"></script>
<script src="<%=path%>/assets/js/jquery.backstretch.min.js"></script>
<script src="<%=path%>/assets/js/scripts.js"></script>

<!--[if lt IE 10]>
<script src="<%=path%>/assets/js/placeholder.js"></script>
<![endif]-->

</body>
</html>
