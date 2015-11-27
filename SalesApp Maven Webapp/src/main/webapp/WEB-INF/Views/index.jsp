<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<script src="/resources/clientes/js/jquery.js"></script>
	<title>E-Shopper</title>
    <link href="/resources/clientes/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/clientes/css/font-awesome.min.css" rel="stylesheet">
    <link href="/resources/clientes/css/prettyPhoto.css" rel="stylesheet">
    <link href="/resources/clientes/css/price-range.css" rel="stylesheet">
    <link href="/resources/clientes/css/animate.css" rel="stylesheet">
	<link href="/resources/clientes/css/main.css" rel="stylesheet">
	<link href="/resources/clientes/css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="/resources/clientes/js/html5shiv.js"></script>
    <script src="/resources/clientes/js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="/resources/clientes/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/clientes/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/clientes/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/clientes/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/clientes/images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>


	<header id="header"><!--header-->
		<c:import url="menu-shop.jsp" />
	</header><!--/header-->

	
	<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>E</span>-SHOPPER</h1>
									<h2>Cat&aacute;logo Oto&ntilde;o - Invierno 2015</h2>
									<p>Encuentra lo que buscas en nuestro cat&aacute;logo Oto&ntilde;o-Invierno 2015</p>
								</div>
								<div class="col-sm-6">
									<img src="/resources/clientes/images/home/girl1.jpg" class="girl img-responsive" alt="" />
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
                                    <h1><span>E</span>-SHOPPER</h1>
									<h2>Precios Incre&iacute;bles</h2>
									<p>Solo con nosotros entra ya!! No puedes perderte nuestras rabajas</p>
                                    <p>Tenemos precios de miedo</p>
								</div>
								<div class="col-sm-6">
									<img src="/resources/clientes/images/home/girl2.jpg" class="girl img-responsive" alt="" />
									<img src="/resources/clientes/images/home/pricing.png"  class="pricing" alt="" />
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
                                    <h1><span>E</span>-SHOPPER</h1>
                                    <p>Encuentra con nosotros el regalo perfecto para esta navidad</p>
								</div>
								<div class="col-sm-6">
									<img src="/resources/clientes/images/home/girl3.jpg" class="girl img-responsive" alt="" />
								</div>
							</div>
						</div>
						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</section><!--/slider-->
	
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="left-sidebar">
						<h2>Category</h2>
						<div class="panel-group category-products" id="accordian"><!--category-productsr-->

							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a data-toggle="collapse" data-parent="#accordian" href="#mens">
											<span class="badge pull-right"><i class="fa fa-plus"></i></span>
											G&eacute;nero
										</a>
									</h4>
								</div>
								<div id="mens" class="panel-collapse collapse">
									<div class="panel-body">
										<ul>
											<li><a href="shop">Men</a></li>
											<li><a href="shopW">Women</a></li>
										</ul>
									</div>
								</div>
							</div>
						</div><!--/category-products-->
					
						<!--/brands_products-->
						
						<!--/price-range-->
						
						<div class="shipping text-center"><!--shipping-->
							<img src="/resources/clientes/images/home/shipping.jpg" alt="" />
						</div><!--/shipping-->
					
					</div> 
				</div>
				
				<div class="col-sm-9 padding-right">
					<div class="features_items"><!--features_items-->
						<h2 class="title text-center">Features Items</h2>
						<c:forEach var="producto" items="${productos}">
							<div class="col-sm-4">
								<div class="product-image-wrapper">
									<div class="single-products">
											<div class="productinfo text-center">
												<img src="/getImagen?productId=${producto.id_producto}" alt="" />
												<h2>$${producto.precio}</h2>
												<p>${producto.nombre}</p>
												<a href="javascript:addToCar(${producto.id_producto})" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											<div class="product-overlay">
												<div class="overlay-content">
													<p><strong>Marca: </strong>${producto.marca}</p>
													<p><strong>Color: </strong>${producto.color}</p>
													<p><strong>Descripci&oacute;n: </strong>${producto.descripcion}</p>
													<h2>$${producto.precio}</h2>
													<p>${producto.nombre}</p>
													<a href="javascript:addToCar(${producto.id_producto})" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
												</div>
											</div>
									</div>
								</div>
							</div>
						</c:forEach>

					</div><!--features_items-->
					
					<div class="category-tab"><!--category-tab-->
						<div class="col-sm-12">
							<ul class="nav nav-tabs">
								<c:forEach var="categoria" items="${categorias}">
									<c:if test="${categoria.id_categoria_productos == 1}">
										<li class="active" ><a  href="#${categoria.nombre}" data-toggle="tab">${categoria.nombre}</a></li>
									</c:if>
									<c:if test="${categoria.id_categoria_productos != 1}">
										<li><a id="uno" href="#${categoria.nombre}" data-toggle="tab">${categoria.nombre}</a></li>
									</c:if>
								</c:forEach>
							</ul>

						</div>

						<div class="tab-content">
							<c:forEach var="pro" items="${categorias}">
							<div class="tab-pane fade active in" id="${pro.nombre}">
								<c:forEach var="producto" items="${productos}">
									<c:set var="categoriaIndex" value = "${producto.id_categoria_productos}"/>
									<c:set var="loquesea" value = "${pro.nombre}"/>
									<c:if test="${categorias[categoriaIndex-1].nombre eq loquesea}">

								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="/resources/clientes/images/home/P_once.jpg" alt="" />
												<h2>$${producto.precio}</h2>
												<p>${producto.nombre}</p>
												<a href="javascript:addToCar(${producto.id_producto})" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
									</c:if>
								</c:forEach>
							</div>
							</c:forEach>
						</div><!--/category-tab-->
						<script>
							$(document).ready(function() {
								$('#uno').click();
							});

						</script>
					<!--/recommended_items-->
				</div>
			</div>
		</div>
		</div>
	</section>
	
	<footer id="footer"><!--Footer-->
		<div class="footer-top">
			<div class="container">
			</div>
		</div> 
		
		<div class="footer-widget">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Service</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Contact Us</a></li>
								<li><a href="#">Order Status</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Quick Shop</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="shop">Men</a></li>
								<li><a href="shopW">Women</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Policies</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Terms of Use</a></li>
								<li><a href="#">Privecy Policy</a></li>
								<li><a href="#">Refund Policy</a></li>
								<li><a href="#">Billing System</a></li>
								<li><a href="#">Ticket System</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>About Shopper</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Company Information</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3 col-sm-offset-1">
						<div class="single-widget">
							<h2>About Shopper</h2>
							<form action="#" class="searchform">
								<input type="text" placeholder="Your email address" />
								<button type="submit" class="btn btn-default"><i class="fa fa-arrow-circle-o-right"></i></button>
								<p>Get the most recent updates from <br />our site and be updated your self...</p>
							</form>
						</div>
					</div>
					
				</div>
			</div>
		</div>
		
		<div class="footer-bottom">
			<div class="container">
				<div class="row">
					<p class="pull-left">Copyright �� 2015 E-SHOPPER Inc. All rights reserved.</p>
				</div>
			</div>
		</div>
		
	</footer><!--/Footer-->
	<script src="/resources/clientes/js/bootstrap.min.js"></script>
	<script src="/resources/clientes/js/jquery.scrollUp.min.js"></script>
	<script src="/resources/clientes/js/price-range.js"></script>
    <script src="/resources/clientes/js/jquery.prettyPhoto.js"></script>
    <script src="/resources/clientes/js/main.js"></script>

	<script>
		function addToCar(id_producto){
			$.ajax({
					"url" : "doAddToCart",
					"async" : true,
					"data" : {
						"id_producto": id_producto
					},
					success : function() {
						alert("Agregado exitosamente");
					},
					error : function() {
							alert("error");
					}
			});
		}
	</script>
</body>
</html>
