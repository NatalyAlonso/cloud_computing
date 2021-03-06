<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
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
	<script src="/resources/clientes/js/jquery.js"></script>
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

	<section id="cart_items">
		<div class="container">
			<div class="breadcrumbs">
				<ol class="breadcrumb">
				  <li><a href="#">Home</a></li>
				  <li class="active">Shopping Cart</li>
				</ol>
			</div>
			<div class="table-responsive cart_info">
				<table class="table table-condensed">
					<thead>
						<tr class="cart_menu">
							<td class="image">Item</td>
							<td class="description"></td>
							<td class="price">Price</td>
							<td class="quantity">Quantity</td>
							<td class="total">Total</td>
							<td></td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="product" items="${cart_products}">
							<tr>
								<input class="ids_producto" type="hidden" value="${product.id_producto}">
								<td class="cart_product">
									<a href=""><img src="/resources/clientes/images/cart/one.png" alt=""></a>
								</td>
								<td class="cart_description">
									<h4><a href="">${product.nombre}</a></h4>
									<p>${product.descripcion}</p>
								</td>
								<td class="cart_price" id="precio${product.id_producto}">
									${product.precio}
								</td>
								<td class="cart_quantity">
									<div class="cart_quantity_button">
										<a class="cart_quantity_up" href="javascript:aumentarCantidad(${product.id_producto})"> + </a>
											<input type="hidden" id="qty_max${product.id_producto}" value="${product.cantidad_disponible}">
											<input class="cart_quantity_input" type="text" name="quantity" value="1" autocomplete="off" size="2" id="qty${product.id_producto}">
										<a class="cart_quantity_down" href="javascript:disminuirCantidad(${product.id_producto})"> - </a>
									</div>
								</td>
								<td class="cart_total">
									<p class="cart_total_price" id="total${product.id_producto}">${product.precio}</p>
								</td>
								<td class="cart_delete">
									<a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<form action="doCheckout" method="POST" id="formPedido">
					<input type="hidden" name="idscheckout" id="idscheckout">
					<input type="hidden" name="cantidades" id="cantidades">
				</form>
			</div>
		</div>
	</section> <!--/#cart_items-->

	<section id="do_action">
		<div class="container">
			<div class="heading">
				<h3>What would you like to do next?</h3>
				<p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="total_area">
						<ul>
							<li>Sub Total <span id="sub_total">$59</span></li>
							<li>IVA <span id="IVA">$2</span></li>
							<li>Total <span id="total">$61</span></li>
						</ul>
							<a class="btn btn-default check_out" href="javascript:doCheckout()">Check Out</a>
					</div>
				</div>
			</div>
		</div>
	</section><!--/#do_action-->

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
								<li><a href="">Contact Us</a></li>
								<li><a href="">Order Status</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Quick Shop</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">Mens</a></li>
								<li><a href="">Womens</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Policies</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">Terms of Use</a></li>
								<li><a href="">Privecy Policy</a></li>
								<li><a href="">Refund Policy</a></li>
								<li><a href="">Billing System</a></li>
								<li><a href="">Ticket System</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>About Shopper</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">Company Information</a></li>
								<li><a href="">Copyright</a></li>
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
					<p class="pull-left">Copyright © 2015 E-SHOPPER Inc. All rights reserved.</p>
				</div>
			</div>
		</div>
		
	</footer><!--/Footer-->
	<script src="/resources/clientes/js/jquery.js"></script>
	<script src="/resources/clientes/js/bootstrap.min.js"></script>
	<script src="/resources/clientes/js/jquery.scrollUp.min.js"></script>
    <script src="/resources/clientes/js/jquery.prettyPhoto.js"></script>
    <script src="/resources/clientes/js/main.js"></script>

	<script>
		$( document ).ready(function() {
			calcular_total();
		});

		function calcular_total(){
			var sub_total = 0;
			var precios = new Array();
			var ids_productos;
			$( ".cart_total_price" ).each(function( index ) {
				 precios.push($( this ).text());
			});
			for(var i = 0; i < precios.length; i++){
				sub_total += parseInt(precios[i]);
			}
			var iva = parseFloat(sub_total) * .16;
			var total = parseInt(iva)+parseInt(sub_total);
			$("#sub_total").text(sub_total);
			$("#IVA").text(iva);
			$("#total").text(total);
		}
		function aumentarCantidad(id_producto){
			var qty = parseInt($("#qty"+id_producto).val());
			var qty_max = parseInt($("#qty_max"+id_producto).val());
			if (qty < qty_max) {
				qty++;
				$("#qty" + id_producto).val(qty);
				var precio = parseInt($("#precio" + id_producto).text());
				var sub_total = qty * precio;
				$("#total" + id_producto).text(sub_total);
				calcular_total();
			}
		}
		function disminuirCantidad(id_producto){
			var qty = parseInt($("#qty"+id_producto).val());
			if (qty > 0) {
				qty--;
				$("#qty" + id_producto).val(qty);
				var precio = parseInt($("#precio" + id_producto).text());
				var sub_total = qty * precio;
				$("#total" + id_producto).text(sub_total);
				calcular_total();
			}
		}
		function doCheckout(){
			var ids = "";
			var cant = "";
			var sep = "";
			$( ".ids_producto" ).each(function( index ) {
				ids += sep+$( this ).val();
				sep=",";
			});
			sep = "";
			$( ".cart_quantity_input" ).each(function( index ) {
				cant += sep+$( this ).val();
				sep=",";
			});
			$("#idscheckout").val(ids);
			$("#cantidades").val(cant);
			alert($("#idscheckout").val());
			$("#formPedido").submit();


		}


	</script>

</body>
</html>
