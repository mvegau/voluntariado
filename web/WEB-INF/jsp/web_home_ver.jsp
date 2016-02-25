<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<!--[if IE 9]>
<html lang="es" class="no-js lt-ie10">
<![endif]-->
<!--[if IE 8]>
<html lang="es" class="no-js lt-ie9">
<![endif]-->
<html lang="es" class="no-js">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta property="og:title" content="">
        <meta property="og:description" content="">
        <meta property="og:url" content="">
        <meta property="og:image" content="images/imagen.jpg">

        <link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico">
        <title>INDECI</title>
        <link href='https://fonts.googleapis.com/css?family=Roboto:400,700,500,300,100' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <link type="text/css" rel="stylesheet" href="css/datepicker.min.css">
        <link type="text/css" rel="stylesheet" href="css/select2.css">
        <link type="text/css" rel="stylesheet" href="css/blue.css">
        <link type="text/css" rel="stylesheet" href="css/bootstrap-multiselect.css">
        <link type="text/css" rel="stylesheet" href="css/enscroll.css">

        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/select2.js"></script>
        <script src="js/icheck.js"></script>
        <script src="js/jquery.placeholder.min.js"></script>
        <script src="js/bootstrap-multiselect.js"></script>
        <script src="js/enscroll-0.6.0.min.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script src="js/funciones.js"></script>
    </head>

    <body>
        <div id="pages">
            <section class="header-login-interno hei-top">
                <div class="container">
                    <div class="logo">
                        <a href="index.htm"><img src="images/logo.png" /></a>
                    </div>
                    <div class="row">
                        <form method="get" action="web_home_ver.htm" modelAttribute="usuarioBean">
                            <div class="col-xs-12">
                                <div class="pull-left">
                                    <h2 class="titulo-principal-interno">LISTA DE VOLUNTARIOS</h2>
                                    <span class="text-span">VOLUNTARIO EN EMERGENCIAS Y REHABILITACIÓN</span>
                                </div>
                                <div class="pull-right login-ob">
                                    <div class="div-login">
                                        <div class="cont-login pull-right">
                                            <span class="tit-login text-uppercase">${usuarioBean.nombre}</span>
                                            <a href="index.htm"><span class="close-sesion text-right">Cerrar Sesión</span></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="pull-right rlogin">
                                    <div class="tit-derecha-1">
                                        <a href="web_home_ver.htm" class="tab-a">
                                            <span>VER</span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
            </section>
            <section class="cont-white">
                <div class="container icheck-container">
                    <div class="row">
                        <div class="col-xs-12 contenedor-input">
                            <div class="nopadding filters-container">
                                <div class="row top-row tit-filtro">FILTROS</div>
                                <ul class="ul-filtro">
                                    <li class="ul-titulo black">Voluntarios</li>
                                    <li>
                                        <span>General</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                    <li>
                                        <span>Especializado</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                </ul>
                                <div class="raya"></div>
                                <ul class="ul-filtro-top">
                                    <li class="ul-titulo black">Profesión</li>
                                </ul>
                                <div class="scrollbox">
                                    <ul class="ul-filtro">
                                        <li>
                                            <span>Medicina</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Ingenieria</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Policia</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Otros</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Otros</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Otros</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Otros</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Otros</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Otros</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Otros</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <div class="raya"></div>

                                <ul class="ul-filtro">
                                    <li class="ul-titulo black">Edad</li>
                                    <li>
                                        <span>18 - 25</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                    <li>
                                        <span>25 - 35</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                    <li>
                                        <span>35 - 60</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                    <li>
                                        <span>60 a más</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                </ul>
                                <div class="raya"></div>
                                <ul class="ul-filtro-top">
                                    <li class="ul-titulo black">Región</li>
                                </ul>
                                <div class="scrollbox">
                                    <ul class="ul-filtro">
                                        <li>
                                            <span>Lima</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Arequipa</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Piura</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Cusco</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Cusco</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Cusco</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Cusco</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Cusco</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                        <li>
                                            <span>Cusco</span>
                                            <div class="check-r">
                                                <input type="checkbox" value="">
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <div class="raya"></div>

                                <ul class="ul-filtro">
                                    <li class="ul-titulo black">Estado</li>
                                    <li>
                                        <span>Registrado</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                    <li>
                                        <span>Invalido</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                    <li>
                                        <span>Validado</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                    <li>
                                        <span>Alertado</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                    <li>
                                        <span>Activado</span>
                                        <div class="check-r">
                                            <input type="checkbox" value="">
                                        </div>
                                    </li>
                                </ul>

                                <br>
                                <div class="cont-boton">
                                    <button class="btn btn-default btn-filtrar" type="submit">APLICAR FILTROS</button>
                                </div>

                            </div>

                            <div class="data-container check-all-childrens-1">

                                <form class="row top-row">
                                    <div class="pull-left">
                                        <div class="fbusqueda">
                                            <input type="text" class="form-control in-login in-filtro" placeholder="">
                                        </div>
                                        <div class="alerta">
                                            <input type="checkbox" class="check-all" data-check="1">
                                            <a><span>Seleccionar Todos</span></a>
                                        </div>
                                        <div class="alerta" data-target="#alerta" data-toggle="modal">
                                            <img src="images/slices_campana.png">
                                            <a><span>Alertar</span></a>
                                        </div>
                                    </div>
                                    <div class="pull-right sprincipal top-right">
                                        <button type="button" data-toggle="modal" data-target="#exportar-reporte" class="btn btn-default btn-orange">EXPORTAR REPORTE</button>
                                    </div>
                                </form>

                                <table class="table inde-tabla text-center">
                                    <thead>
                                        <tr>
                                            <th class="wthe"></th>
                                            <th class="text-center">NOMBRES</th>
                                            <th class="text-center min-wi">APELLIDOS</th>
                                            <th class="text-center">ESTADO</th>
                                            <th class="text-center">NACIMIENTO</th>
                                            <th class="text-center">PROFESIÓN</th>
                                            <th class="text-center">REGIÓN</th>
                                            <th class="text-center">TIPO</th>
                                            <th class="text-center">DETALLES</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${voluntariosBean}" var="ls">
                                            <tr> 
                                                <td class="bs-checkbox-1 "> <input type="checkbox" value=""></td>
                                                <td>${ls.nombres}</td>
                                                <td>${ls.apellidos}</td>
                                                <td>${ls.indHabilitado}</td>
                                                <td>${ls.fecNacimiento}</td>
                                                <td>${ls.volProfesion.ideProfesion}</td>
                                                <td>${ls.volProvincia.codProvincia}</td>
                                                <td>${ls.volTipvolun.ideTipovoluntario}</td>
                                                <td> <a href="web_detalles_ver_2.htm" class="ver-detalle"></a></td>
                                                </td>
                                                <td class="op-deshabilitar"><span class="habilitado">Deshabilitar</span></td>
                                                    
                                            </tr>
                                                
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>

                            <div class="row btnform-2">
                                <div class="col-xs-12">
                                    <div class="pull-right top-right">
                                        <span class="paginado">
                                            <em>1-20 de 50 </em><a href="web_detalles_ver_2.htm" class="link-a"><img src="images/slices1.png"></span></a>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>

                <section class="footer-interno">
                    <div class="container">
                        <footer class="logindiv">
                            <span class="small pull-right">© 2015 indeci</span>
                        </footer>
                    </div>
                </section>
            </section>

        </div>
    </body>
</html>
