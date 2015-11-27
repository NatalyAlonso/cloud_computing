<%--
  Created by IntelliJ IDEA.
  User: SalvadorDeJesusVicencioMedina
  Date: 22/11/15
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="index.html">SB Admin</a>
</div>
<!-- Top Menu Items -->
<ul class="nav navbar-right top-nav">
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${usuario.nombre} <b class="caret"></b></a>
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
                <a href="doCerrarSesion"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
            </li>
        </ul>
    </li>
</ul>
<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
<div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav side-nav">
        <li>
            <a href="agregarCliente.jsp"><i class="fa fa-fw fa-edit"></i> Usarios</a>
        </li>
        <li>
            <a href="agregarProducto.jsp"><i class="fa fa-fw fa-edit"></i> Productos</a>
        </li>
        <li>
            <a href=""><i class="fa fa-fw fa-table"></i> Entregas</a>
        </li>

        <li>
            <a href=""><i class="fa fa-fw fa-table"></i> Inventario</a>
        </li>

        <li>
            <a href=""><i class="fa fa-fw fa-table"></i> Pedidos</a>
        </li>

</div>