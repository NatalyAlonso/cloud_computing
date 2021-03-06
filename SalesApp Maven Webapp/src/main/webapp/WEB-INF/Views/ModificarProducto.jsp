<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Modificar Productos</title>

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
    <!-- jQuery -->
    <script src="/resources/admin/js/jquery.js"></script>

</head>

<body>



<script>
    $(document).ready(function(){
        <c:if test="${not empty p}">
            $("#hiddenI").val("<c:out value='${p.id_producto}'/>");
            $("#formProductId2").submit();
        </c:if>
        $("#nombre").val("<c:out value='${producto.nombre}'/>");
        $("#precio").val("<c:out value='${producto.precio}'/>");
        $("#descripcion").val("<c:out value='${producto.descripcion}'/>");
        $("#cantidad").val("<c:out value='${producto.cantidad}'/>");
        $("#marca").val("<c:out value='${producto.marca}'/>");
        $("#color").val("<c:out value='${producto.color}'/>");
        $("#id_categoria_productos").val("<c:out value='${producto.id_categoria_productos}'/>");
        $("#genero").val("<c:out value='${producto.genero}'/>");
        $("#idProducto").val("<c:out value='${producto.id_producto}'/>")
        $("#idUpdate").val("<c:out value='${producto.id_producto}'/>")
        $("#idProducto").change(function(){
            $("#formProductId").submit();
        });
    });
</script>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <c:import url="menu-admin.jsp" />
        <!-- /.navbar-collapse -->
    </nav>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Modificar Productos
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-edit"></i> Editar
                        </li>
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="AgregarProducto">Agregar</a>
                        </li>
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="ConsultarProductos">Consultar</a>
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <label>Producto</label>
            <form action="cModificarProducto" method="post" id="formProductId">
                <select class="form-control" id="idProducto" name="idProducto">
                    <c:forEach var="producto" items="${productos}">
                        <option value="${producto.id_producto}">${producto.nombre}</option>
                    </c:forEach>
                </select>
            </form>
            <form action="cModificarProducto" method="post" id="formProductId2">
                <input type="hidden" id = "hiddenI" name="idProducto"/>
            </form>
            <br>
            <br>

            <div class="row">
                <div class="col-lg-6">

                    <form role="form">

                        <div class="form-group">
                            <label>Nombre del producto</label>
                            <input class="form-control">
                            <p class="help-block">Example Bufanda</p>
                        </div>

                        <div class="form-group">
                            <label>Precio</label>
                            <input class="form-control">
                            <p class="help-block">200</p>
                        </div>

                        <div class="form-group">
                            <label>Descripci&oacute;n</label>
                            <textarea class="form-control" rows="3"></textarea>
                        </div>

                        <div class="form-group">
                            <label>Marca</label>
                            <input class="form-control" type = "text" name="nombre">
                            <p class="help-block">Example Element</p>
                        </div>

                        <div class="form-group">
                            <label>Color</label>
                            <input class="form-control" type = "text" name="nombre">
                            <p class="help-block">Example Rojo</p>
                        </div>


                        <div class="form-group">
                            <label>Foto de Producto</label>
                            <div id='botonera'>
                                <input id="archivo" type="file" accept="image/*" name="imagen">
                                <input id="cancelar" type="button" value="Cancelar">
                            </div>
                        </div>

                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> Imagen</h3>
                            </div>
                            <div class="panel-body">
                                <div class="flot-chart">
                                    <div class="flot-chart-content" id="flot-bar-chart"></div>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label>G&eacute;nero</label>
                            <select class="form-control" name="id_categoria_productos">
                                <c:forEach var="producto" items="${productos}">
                                    <option value="${producto.genero}">${producto.genero}</option>
                                </c:forEach>
                            </select>
                        </div>



                        <div class="form-group">
                            <label>Categor&iacute;a</label>
                            <select class="form-control" name="id_categoria_productos">
                                <c:forEach var="categoria" items="${categorias}">
                                    <option value="${categoria.id_categoria_productos}">${categoria.nombre}</option>
                                </c:forEach>
                            </select>
                        </div>




                        <button type="submit" class="btn btn-default">Editar</button>
                    </form>

                </div>
            </div>
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

