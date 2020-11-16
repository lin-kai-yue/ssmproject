<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>　
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>

    <h3>查询所有的帐户</h3>
    <c:forEach items="${goodslist}" var="goods" begin="0" end ="0">
        <a href="Cartdetail/add?goods=${goods},uid=1" class="btn bg-olive btn-xs">详情</a>
        ${goods.goodsname}
    </c:forEach>
    ${account.name}



</body>
</html>
