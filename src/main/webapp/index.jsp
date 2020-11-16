<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>%>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>

    <script>
        $(function(){
            $("#btn").click(function(){
                alert("hello btn");
                // 发送ajax请求
           /*     $.ajax({
                    // 编写json格式，设置属性和值
                    url:"account/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"name":"369","password":"963"}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.name);
                        alert(data.password);
                    }
                });*/

            });
        });



    </script>
</head>
<body>
<jsp:forward page="login.jsp"></jsp:forward>
    <a href="goods/findAll" >测试查询</a>

    <form action="account/findPassword" method="post" >
        姓名：<input type="text" name="name" /><br/>
        密码：<input type="text" name="password" /><br/>
        <input type="submit" value="查询"/><br/>
    </form>

    <h3>测试包</h3>

    <form action="account/save" method="post">
        姓名：<input type="text" name="name" /><br/>
        金额：<input type="text" name="password" /><br/>
        <input type="submit" value="保存"/><br/>
    </form>
    <form action="orders/findbyuid" method="post">
       uid：<input type="text" name="uid" /><br/>
        <input type="submit" value="保存"/><br/>
    </form>
    <button id="btn">发送ajax的请求</button>
    <form action="goods/fileupload" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" /><br/>
        <input type="submit" value="上传" />
    </form>
</body>
</html>
