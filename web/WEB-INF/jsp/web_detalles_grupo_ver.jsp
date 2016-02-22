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
                        <div class="col-xs-12">
                            <div class="pull-left">
                                <h2 class="titulo-principal-interno">LISTA DE VOLUNTARIOS</h2>
                                <span class="text-span">VOLUNTARIO EN EMERGENCIAS Y REHABILITACIÓN</span>
                            </div>
                            <div class="pull-right login-ob">
                                <div class="div-login text-center">
                                    <div class="cont-login">
                                        <span class="tit-login text-uppercase">JORGE POMA GARCÉS</span>
                                        <a href="index.htm"><span class="close-sesion text-right">Cerrar Sesión</span></a>
                                    </div>
                                </div>
                            </div>
                            <div class="pull-right rlogin">
                                <div class="tit-derecha-1">
                                    <a href="web_home_sespad.htm" class="tab-a">
                                        <span>VER</span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
            </section>
            <section class="cont-white">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12 contenedor-input">
                            <div class="col-xs-12 nopadding  detail-container">
                                <div class="row top-row">
                                    <div class="col-xs-12 nopadding">
                                        <div class="pull-right sprincipal top-right">
                                            <button type="submit" class="btn btn-default btn-sky2">DESCARGAR ANEXO 5</button>
                                            <button type="submit" class="btn btn-default btn-orange-filtro">VALIDAR USUARIO</button>
                                        </div>
                                    </div>
                                    <div class="col-xs-12 nopadding">
                                        <div class="tit-filtro sub-tit-blue">DETALLES</div>
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-4 nopadding dis-blo">
                                            <span><b>José Carlos Barrantes Orosco</b></span>
                                            <span>Voluntario General</span>
                                            <span>Activado</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Fecha de registro</span>
                                            <span>05-01-2016</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Fecha de nacimiento : 10-01-1984</span>
                                            <span>Provincia de Lima</span>
                                            <span>Departamento de Lima</span>
                                        </div>
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-4 nopadding dis-blo">
                                            <span>No. Documento : 70587679</span>
                                            <span>Estudios / Profesion : Ingeniero</span>
                                            <span>Email : jbarrantes@gmail.com</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Teléfono : 342 5672</span>
                                            <span>Skype : jose.barrantes80</span>
                                            <span>Grupo Sanguineo : RH+</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Domicilio : Calle Andrómeda 1082</span>
                                            <span>Distrito de Chorrillos</span>
                                            <span>Gobierno regional de lima</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="row top-row">
                                    <div class="sub-tit-2-dis">
                                        Grupo VER
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-4 nopadding dis-blo">
                                            <span>Equipo Rojo</span>
                                            <span>Voluntario Participante</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Chile</span>
                                            <span>Teléfono : 2521326</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>ID : 4545</span>
                                            <span>www.equiporojo.com</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="row top-row">
                                    <div class="sub-tit-2-dis">
                                        Especialidad
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-4 nopadding dis-blo">
                                            <span>Bachiller</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Instituto Naval de Lima</span>
                                        </div>
                                        <div class="col-xs-4">
                                            <span>30 de Diciembre del 2013</span>
                                            <span class="pull-right sky-color"><a><em>descargar certificado</em></a></span>
                                        </div>
                                    </div>
                                </div>

                                <div class="row top-row">
                                    <div class="sub-tit-2-dis">
                                        Capacitación en gestión del riesgo (opcional)
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-4 nopadding dis-blo">
                                            <span>Curso de primeros auxilios</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Instituto Naval de Lima</span>
                                        </div>
                                        <div class="col-xs-4">
                                            <span>05 de Agosto del 2013</span>
                                            <span>50 horas</span>
                                            <span class="pull-right sky-color"><a><em>descargar certificado</em></a></span>
                                        </div>
                                    </div>
                                </div>

                                <div class="row top-row">
                                    <div class="sub-tit-2-dis">
                                        Experiencia como voluntario/a (opcional)
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-4 nopadding dis-blo">
                                            <span>Voluntarios de la cruz roja</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Lima</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>Jefe de Área</span>
                                            <span>Abril 2013 - Julio 2014</span>
                                        </div>
                                    </div>
                                </div>

                                <div class="row top-row">
                                    <div class="sub-tit-2-dis">
                                        Actividades Físicas
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-4 nopadding dis-blo">
                                            <span>Voluntarios de la cruz roja</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>3 veces a la semana</span>
                                        </div>
                                        <div class="col-xs-4 dis-blo">
                                            <span>8 horas diarias</span>
                                        </div>
                                    </div>
                                </div>

                                <div class="row top-row">
                                    <div class="sub-tit-2-dis">
                                        Motivos por los que deseo ser brigadista en voluntariado en emergencias y rehabilitación
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-12 salto nopadding dis-blo">
                                            <span>Personales</span>
                                        </div>
                                        <div class="col-xs-12 salto nopadding dis-blo">
                                            <span>Actividad 1</span>
                                        </div>
                                    </div>
                                </div>

                                <div class="row top-row">
                                    <div class="sub-tit-2-dis">
                                        Apreciación
                                    </div>
                                    <div class="col-xs-12 nopadding salto">
                                        <div class="col-xs-12 salto nopadding dis-blo">
                                            <span class="comentario-block">Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de</span>
                                        </div>
                                        <div class="col-xs-4 salto nopadding dis-blo">
                                            <span>Fecha : 06-01-2016</span>
                                            <span>Nombre y Apellido : Jorge Aspaza Goméz</span>
                                            <span>Cargo : Jefe de voluntarios</span>
                                        </div>
                                    </div>
                                </div>

                                <div class="row btnform-2">
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
