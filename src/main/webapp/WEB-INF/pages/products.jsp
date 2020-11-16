<%--
  Created by IntelliJ IDEA.
  User: 林小黑
  Date: 2020/6/22
  Time: 0:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>　
<html>
<head>
    <title>Products</title>
    <base href="<%=basePath%>">
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Custom Theme files -->
    <!--theme-style-->
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!--fonts-->
    <link href='https://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
    <!--//fonts-->
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event){
                event.preventDefault();
                $('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
            });
        });
    </script>
    <script>$(document).ready(function(c) {
        $('.alert-close').on('click', function(c){
            $('.message').fadeOut('slow', function(c){
                $('.message').remove();
            });
        });
    });
    </script>
    <script>$(document).ready(function(c) {
        $('.alert-close1').on('click', function(c){
            $('.message1').fadeOut('slow', function(c){
                $('.message1').remove();
            });
        });
    });
    </script>
</head>
<body>
<!--header-->
<div class="header">
    <div class="header-top">
        <div class="container">
            <div class="header-top-in">
                <div class="logo">
                    <a href="account/findAll?uid=${cartcount.uid}"><img src="images/logo.png" alt=" " ></a>
                </div>
                <div class="header-in">
                    <ul class="icon1 sub-icon1">
                        <li  ><a href="goods/findAll?uid=${cartcount.uid}">  查看所有商品</a></li>
                        <li  ><a href="account/findbyid?uid=${cartcount.uid}">  增加商品</a></li>
                        <li  ><a href="orders/findbyuid?uid=${cartcount.uid}">  我的订单</a></li>
                        <li ><a href="cartdetail/findCart?uid=${cartcount.uid}" > 购物车</a></li>
                        <li > <a href="checkout.html" >退出</a> </li>
                        <li><div class="cart">
                            <a href="#" class="cart-in"> </a>
                            <span>${cartcount.countid-1}</span>
                        </div>
                            <ul class="sub-icon1 list">
                                <h3>购物车(${cartcount.countid-1})</h3>
                                <div class="shopping_cart">
                                    <c:forEach items="${cartlist}" var="cart" >

                                        <div class="cart_box">
                                            <div class="list_img"><img src="${cart.pictersrc}" class="img-responsive" alt=""></div>
                                            <div class="list_desc"><h4><a href="#">${cart.goodsname}</a></h4>${cart.num} x<span class="actual">
                                                    ${cart.goodsprices}</span></div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </c:forEach>
                                </div>
                                <div class="total">
                                    <div class="total_left">总金额 : </div>
                                    <div class="total_right">￥${cartcount.summoney}</div>
                                    <div class="clearfix"> </div>
                                </div>
                                <div class="login_buttons">
                                    <%-- <div class="check_button"><a href="checkout.html">Check out</a></div>--%>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="clearfix"></div>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
    </div>
    <div class="header-bottom">
        <div class="container">
            <div class="h_menu4">
                <a class="toggleMenu" href="#">Menu</a>
                <ul class="nav">
                    <li class="active"><a href="account/findAll?uid=${cartcount.uid}"><i> </i>首页</a></li>
                    <li ><a href="goods/findbytype/?type=笔记本电脑&uid=${cartcount.uid}" >	笔记本电脑	</a>
                        <ul class="drop">
                            <li><a href="products.html">索尼(2)</a></li>
                            <li><a href="products.html">安卓(4)</a></li>
                            <li><a href="products.html">苹果(7)</a></li>
                            <li><a href="products.html">宏基(53)</a></li>
                            <li><a href="products.html">惠普(78)</a></li>
                            <li><a href="products.html">Intel(5)</a></li>
                        </ul>
                    </li>
                    <li><a href="goods/findbytype/?type=零件&uid=${cartcount.uid}" >零件</a></li>
                    <li><a href="goods/findbytype/?type=衣服服饰&uid=${cartcount.uid}" >衣服服饰</a></li>
                    <li><a href="goods/findbytype/?type=手机和平板&uid=${cartcount.uid}" >手机和平板</a></li>
                    <li><a href="goods/findbytype/?type=照相机&uid=${cartcount.uid}" > 照相机  </a></li>
                    <li><a href="goods/findbytype/?type=衣服服饰&uid=${cartcount.uid}" >衣服服饰 </a></li>

                </ul>
                <script type="text/javascript" src="js/nav.js"></script>
            </div>
        </div>
    </div>
    <div class="header-bottom-in">
        <div class="container">
            <div class="header-bottom-on">
                <p class="wel"><a href="#">欢迎来到购物网站</a></p>
                <div class="header-can">
                    <ul class="social-in">
                        <li><a href="#"><i> </i></a></li>
                        <li><a href="#"><i class="facebook"> </i></a></li>
                        <li><a href="#"><i class="twitter"> </i></a></li>
                        <li><a href="#"><i class="skype"> </i></a></li>
                    </ul>
                    <div class="down-top">
                        <select class="in-drop">
                            <option value="Dollars" class="in-of">美元</option>
                            <option value="Euro" class="in-of">欧元</option>
                            <option value="Yen" class="in-of">人民币</option>
                        </select>
                    </div>
                    <div class="search">
                        <form action="goods/likename?uid=${cartcount.uid}" method="post">
                            <input type="text" value="Search" name="name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '';}" >
                            <input type="submit" value="">
                        </form>
                    </div>

                    <div class="clearfix"> </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
</div>

<div class="container">
    <div class="products">
        <h2 class=" products-in">PRODUCTS</h2>
        <div class=" top-products">
            <c:forEach items="${typelist}" var="goods" >
            <div class="col-md-3 md-col">
                <div class="col-md" style="margin-bottom: 2em">
                    <a href="goods/findbygoodsid?goodsid=${goods.goodsid}&uid=${cartcount.uid}" class="compare-in"><img  src="${goods.pictersrc}" alt="" />
                        <div class="compare">
                            <span>进入购买页面</span>

                        </div>
                    </a>
                    <div class="top-content">
                        <h5><a href="single.html">${goods.goodsname}</a></h5>
                        <div class="white">
                            <a href="cartdetail/add?id=${account.id}&goodsid=${goods.goodsid}" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入我的购物车</a>
                            <p class="dollar"><span class="in-dollar">￥</span><span>${goods.goodsprices}</span></p>
                            <div class="clearfix"></div>
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>
        </div>


    </div>
</div>
<!---->
<div class="footer">
    <div class="footer-top">
        <div class="container">
            <div class="col-md-4 footer-in">
                <h4><i> </i>Suspendisse sed</h4>
                <p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
            </div>
            <div class="col-md-4 footer-in">
                <h4><i class="cross"> </i>Suspendisse sed</h4>
                <p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
            </div>
            <div class="col-md-4 footer-in">
                <h4><i class="down"> </i>Suspendisse sed</h4>
                <p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <!---->
    <div class="footer-middle">
        <div class="container">
            <div class="footer-middle-in">
                <h6>About us</h6>
                <p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>
            </div>
            <div class="footer-middle-in">
                <h6>Information</h6>
                <ul>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Delivery Information</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                    <li><a href="#">Terms & Conditions</a></li>
                </ul>
            </div>
            <div class="footer-middle-in">
                <h6>Customer Service</h6>
                <ul>
                    <li><a href="contact.html">Contact Us</a></li>
                    <li><a href="#">Returns</a></li>
                    <li><a href="#">Site Map</a></li>
                </ul>
            </div>
            <div class="footer-middle-in">
                <h6>My Account</h6>
                <ul>
                    <li><a href="account.html">My Account</a></li>
                    <li><a href="#">Order History</a></li>
                    <li><a href="wishlist.html">Wish List</a></li>
                    <li><a href="#">Newsletter</a></li>
                </ul>
            </div>
            <div class="footer-middle-in">
                <h6>Extras</h6>
                <ul>
                    <li><a href="#">Brands</a></li>
                    <li><a href="#">Gift Vouchers</a></li>
                    <li><a href="#">Affiliates</a></li>
                    <li><a href="#">Specials</a></li>
                </ul>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <p class="footer-class">Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.php.cn/" target="_blank" title="php中文网">php中文网</a> - Collect from <a href="http://www.php.cn/" title="网页模板" target="_blank">网页模板</a></p>
    <script type="text/javascript">
        $(document).ready(function() {
            /*
            var defaults = {
                  containerID: 'toTop', // fading element id
                containerHoverID: 'toTopHover', // fading element hover id
                scrollSpeed: 1200,
                easingType: 'linear'
             };
            */

            $().UItoTop({ easingType: 'easeOutQuart' });

        });
    </script>
    <a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

</div>
</body>
</html>