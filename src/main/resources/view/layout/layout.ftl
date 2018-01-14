<#macro layout>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>layout测试</title>
    <#include "static.ftl">
</head>
<body>
<div id="header">
    <#include "navbar.ftl">
</div>
<div id="body">
    <#nested>
</div>

<script>
</script>
</body>
</html>
</#macro>