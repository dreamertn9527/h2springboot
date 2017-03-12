<#assign base = request.contextPath />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="${base}/css/bootstrap.css" rel="stylesheet">
    <script src="${base}/js/jquery-3.1.1.min.js"></script>
    <script src="${base}/js/bootstrap.min.js"></script>
</head>
<body>
<table class="table table-striped">
    <thead>
    <tr>
        <th>组名称</th>
        <th>组编码</th>
    </tr>
    </thead>
    <tbody>
<#list userList as being>
    <tr>
        <td>${being.GROUP_NAME}</td>
        <td>${being.GROUP_ID}</td>
    </tr>
</#list>
    </tbody>
</table>
</body>
<script>
    $(function(){

    });
</script>
</html>