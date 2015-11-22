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

    <title>Agregar</title>

    <!-- Bootstrap Core CSS -->
    <link href="" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/resources/admin/csssb-admin.css" rel="stylesheet">

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
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="../BackEnd/index.html">SB Admin</a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                <ul class="dropdown-menu message-dropdown">
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>
                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>
                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-preview">
                        <a href="#">
                            <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>John Smith</strong>
                                    </h5>
                                    <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                    <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                </div>
                            </div>
                        </a>
                    </li>
                    <li class="message-footer">
                        <a href="#">Read All New Messages</a>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                <ul class="dropdown-menu alert-dropdown">
                    <li>
                        <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                    </li>
                    <li>
                        <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#">View All</a>
                    </li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                    </li>
                </ul>
            </li>
        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li>
                    <a href="../BackEnd/index.html"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                </li>
                <li>
                    <a href="../BackEnd/charts.html"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
                </li>
                <li>
                    <a href="../BackEnd/tables.html"><i class="fa fa-fw fa-table"></i> Tables</a>
                </li>
                <li class="active">
                    <a href="../BackEnd/forms.html"><i class="fa fa-fw fa-edit"></i> Clientes</a>
                </li>
                <li>
                    <a href="../BackEnd/bootstrap-elements.html"><i class="fa fa-fw fa-desktop"></i> Bootstrap Elements</a>
                </li>
                <li>
                    <a href="../BackEnd/bootstrap-grid.html"><i class="fa fa-fw fa-wrench"></i> Bootstrap Grid</a>
                </li>
                <li>
                    <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Dropdown <i class="fa fa-fw fa-caret-down"></i></a>
                    <ul id="demo" class="collapse">
                        <li>
                            <a href="#">Dropdown Item</a>
                        </li>
                        <li>
                            <a href="#">Dropdown Item</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="../BackEnd/blank-page.html"><i class="fa fa-fw fa-file"></i> Blank Page</a>
                </li>
                <li>
                    <a href="../BackEnd/index-rtl.html"><i class="fa fa-fw fa-dashboard"></i> RTL Dashboard</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Agregar Clientes
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-edit"></i> Agregar
                        </li>
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="ModificarCliente.jsp">Editar</a>
                        </li>
                        <li>
                            <i class="fa fa-dashboard"></i>  <a href="ConsultarCliente.jsp">Consultar</a>
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-6">

                    <form role="form">

                        <div class="form-group">
                            <label>Nombre</label>
                            <input class="form-control">
                            <p class="help-block">Example Salvador</p>
                        </div>

                        <div class="form-group">
                            <label>Apellido Paterno</label>
                            <input class="form-control">
                            <p class="help-block">Example Vicencio</p>
                        </div>

                        <div class="form-group">
                            <label>Apellido Materno</label>
                            <input class="form-control">
                            <p class="help-block">Example Medina</p>
                        </div>

                        <div class="form-group">
                            <label>Email</label>
                            <input class="form-control">
                            <p class="help-block">chavachuii@gmail.com</p>
                        </div>

                        <div class="form-group">
                            <label>Nombre de Usuario</label>
                            <input class="form-control">
                            <p class="help-block">Example ChavaChuii</p>
                        </div>

                        <div class="form-group">
                            <label>Contrase&ntilde;a</label>
                            <input class="form-control">
                            <p class="help-block">Example HolaCaradeBola</p>
                        </div>

                        <div class="form-group">
                            <label>Foto de Perfil</label>
                            <input type="file">
                        </div>



                        <div class="form-group">
                            <label>Rol</label>
                            <select class="form-control">
                                <option>Administrador</option>
                                <option>Cliente</option>
                            </select>
                        </div>



                        <button type="submit" class="btn btn-default">Submit Button</button>
                        <button type="reset" class="btn btn-default">Reset Button</button>

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

