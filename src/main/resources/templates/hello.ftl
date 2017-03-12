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
        <th>书籍名称</th>
        <th>书籍地址</th>
    </tr>
    </thead>
    <tbody>
<#list userList as being>
    <tr>
        <td>${being.book_name}</td>
        <td><a href="${being.book_path}">${being.book_path}</a></td>
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