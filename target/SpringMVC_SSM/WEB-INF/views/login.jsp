<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息界面</title>
</head>
<body>
<div style="padding-left: 10px;">
    <div class="panel panel-default">
        <div class="panel-heading" style="font-size: 18px;">用户信息</div>
        <table class="table" style="text-align: center;">
            <thead>
            <tr style="text-align: center;">
                <th style="width: 45px;">编号</th>
                <th style="width: 75px;">书名</th>
                <th style="width: 75px;">号码</th>
                <th style="width: 145px;">详细信息</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${currentUser.bookId }</td>
                <td>${currentUser.name}</td>
                <td>${currentUser.number }</td>
                <td>${currentUser.detail }</td>

            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>