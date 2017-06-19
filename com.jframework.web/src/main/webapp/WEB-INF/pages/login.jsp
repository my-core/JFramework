<%--
  Created by IntelliJ IDEA.
  User: yangliangbin
  Date: 2016/9/12
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="lib.jsp" %>
</head>
<body class="gray-bg">
    <form action="/user/login" method="post" commandName="user" role="form">
        <div class="middle-box text-center loginscreen  animated fadeInDown" >
            <div>
                <div>
                    <h1 class="logo-name" style="font-size:88px;">FreeMvc</h1>
                </div>
                <h3>欢迎使用 FreeMvc内容管理平台</h3>
                <div class="m-t">
                    <div class="form-group">
                        <input id="UserName" name="UserName" type="text" v="admin" class="form-control" required="required">
                    </div>
                    <div class="form-group">
                        <input id="Password" name="Password" type="password" class="form-control" required="required">
                    </div>
                    <button id="btn_login" type="submit" class="btn btn-primary block full-width m-b">登 录</button>
                    <p style="color:red;">${msg}</p>
                    <p class="text-muted text-center">
                        power by 石头小神
                    </p>
                </div>
            </div>
        </div>
    </form>
</body>
</html>