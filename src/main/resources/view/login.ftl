<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录</title>

    <script src="${basePath}/statics/jquery/1.11.2/jquery.min.js"></script>

    <link rel="stylesheet" href="${basePath}/statics/login/style.css" type="text/css" />
</head>

<body>
<div id="container">
    <form action="${basePath}/login" method="post">
        <div class="login">LOGIN</div>
        <div class="username-text">Username:</div>
        <div class="password-text">Password:</div>
        <div class="username-field">
            <input type="text" name="username" id="username"/>
        </div>
        <div class="password-field">
            <input type="password" name="password" id="password"/>
        </div>
        <input type="checkbox" name="remember-me" id="remember-me"/><label for="remember-me">Remember me</label>
        <div class="forgot-usr-pwd">Forgot <a href="#">username</a> or <a href="#">password</a>?</div>
        <input type="submit" name="submit" value="GO"/>
    </form>
</div>
<div id="footer">
    备用登录页面
</div>
<script>
    var errorMsg = "${errorMsg?if_exists}";
    if (errorMsg != "") {
        alert(errorMsg);
    }
</script>
</body>
