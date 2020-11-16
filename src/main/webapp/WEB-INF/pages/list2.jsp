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
    <%--<a href="cartdetail/add?id=1&goodsid=2" >测试查询</a>
   &lt;%&ndash; <a href="account/findPassword?name=929000967&password=123" >测试查询</a>&ndash;%&gt;
    <c:forEach items="${goodslist}" var="goods" begin="0" end ="0">
       &lt;%&ndash; ${goods.goodsname}
        ${goods.goodsprices}&ndash;%&gt;
        ${account.name}
        ${goods}
        <a href="cartdetail/add?id=${account.id}&goodsid=${goods.id}" >测试查询</a>
    </c:forEach>--%>
    <c:forEach items="${ordersList}" var="orderslist" >
        ${orderslist}

    </c:forEach>
    ${cartcount.uid}
   <%-- ${account.name}--%>
   <%-- <a href="Cartdetail/add?id=${account.id}&goods=${goods}" >测试查询</a>--%>


</body>
</html>
