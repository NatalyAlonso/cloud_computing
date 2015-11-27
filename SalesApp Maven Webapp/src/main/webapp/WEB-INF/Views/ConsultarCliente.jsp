<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" import="java.util.*" import="java.sql.*" pageEncoding="US-ASCII"%>
<%
/*conexion sera nuestra conexion a la bd*/
Connection conexion=null;

String mensaje="";

/*parametros para la conexion*/
String driver = "org.gjt.mm.mysql.Driver";
String dbName = "my_database";
String dbUserName = "root";
String dbPassword = "";
String url = "jdbc:mysql://localhost:3306/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";
String usuario = "root";
String clave = "";
/*procedimiento de la conexion*/
try{
Class.forName(driver);
conexion = DriverManager.getConnection(url,usuario,clave);

/*guardando la conexion en la session*/
session.setAttribute("conexion",conexion);

mensaje="conectado";
if(conexion.isClosed()){
mensaje="desconectado";
}

} catch (Exception ex){
mensaje=ex.toString();
}


%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Consultar</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/admin/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/admin/css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="resources/admin/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

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
        <!-- Brand and toggle get grouped for better mobile display -->
        <c:import url="menu-shop.jsp" />
        <!-- /.navbar-collapse -->
    </nav>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Consultar Clientes
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-edit"></i> Consultar
                        </li>
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="agregarCliente">Agregar</a>
                        </li>
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="modificarCliente">Editar</a>
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-6">

                    <form role="form">

                        <fieldset disabled>

                            <div class="form-group">
                                <label for="disabledSelect">Nombre</label>
                                <input class="form-control" id="disabledInput" type="text" placeholder="Disabled input" disabled>
                            </div>

                            <div class="form-group">
                                <label for="disabledSelect">Apellido Paterno</label>
                                <input class="form-control" id="disabledInput" type="text" placeholder="Disabled input" disabled>
                            </div>

                            <div class="form-group">
                                <label for="disabledSelect">Apellido Materno</label>
                                <input class="form-control" id="disabledInput" type="text" placeholder="Disabled input" disabled>
                            </div>

                            <div class="form-group">
                                <label for="disabledSelect">Email</label>
                                <input class="form-control" id="disabledInput" type="text" placeholder="Disabled input" disabled>
                            </div>

                            <div class="form-group">
                                <label for="disabledSelect">Nombre de Usuario</label>
                                <input class="form-control" id="disabledInput" type="text" placeholder="Disabled input" disabled>
                            </div>

                            <div class="form-group">
                                <label for="disabledSelect">Contrase&ntilde;a</label>
                                <input class="form-control" id="disabledInput" type="text" placeholder="Disabled input" disabled>
                            </div>


                            <div class="form-group">
                                <label for="disabledSelect">Rol</label>
                                <select id="disabledSelect" class="form-control">
                                    <option>Disabled select</option>
                                </select>
                            </div>

                        </fieldset>



                        <button type="submit" class="btn btn-default">Derecha</button>
                        <button type="reset" class="btn btn-default">Izquierda</button>

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
<script src="resources/admin/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="resources/admin/js/bootstrap.min.js"></script>

</body>

</html>
