<%--
  Created by IntelliJ IDEA.
  User: SalvadorDeJesusVicencioMedina
  Date: 23/11/15
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" import="java.sql.*" pageEncoding="US-ASCII"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Inventario</title>

    <!-- Bootstrap Core CSS -->
    <link href="/resources/admin/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/resources/admin/css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/resources/admin/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <c:import url="menu-admin.jsp" />
    </nav>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Inventario
                    </h1>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-6">
                    <div class="table-responsive">
                        <table class="table table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>Producto</th>
                                <th>Cantidad</th>
                                <th>Cantidad Reservada</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>Blusa</td>
                                <td>1265</td>
                                <td>1110</td>
                            </tr>
                            <tr>
                                <td>Camisa</td>
                                <td>261</td>
                                <td>100</td>
                            </tr>
                            <tr>
                                <td>Pantalon de Mezclilla</td>
                                <td>665</td>
                                <td>300</td>
                            </tr>
                            <tr>
                                <td>Chamarra</td>
                                <td>9516</td>
                                <td>1345</td>
                            </tr>
                            <tr>
                                <td>Bufanda</td>
                                <td>23</td>
                                <td>11</td>
                            </tr>
                            <tr>
                                <td>Playera</td>
                                <td>421</td>
                                <td>111</td>
                            </tr>
                            <tr>
                                <td>Playera Polo</td>
                                <td>1233</td>
                                <td>1000</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

            <!-- /.row -->


            <!-- /.row -->

        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="/resources/admin/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="/resources/admin/js/bootstrap.min.js"></script>

</body>

</html>
