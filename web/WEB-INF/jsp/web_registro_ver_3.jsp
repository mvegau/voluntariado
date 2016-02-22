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
            <section class="header-login hei-top">
                <div class="container">
                    <div class="logo">
                        <a href="?web_inicio"><img src="images/logo.png"/></a>
                    </div>
                    <div class="row">
                        <div class="col-xs-12 logindiv">
                            <div class="pull-left">
                                <h2 class="titulo-principal">REGISTRO DE VOLUNTARIOS</h2>
                            </div>
                            <div class="pull-right">
                                <div class="tit-derecha"><span>VER</span></div>
                            </div>
                        </div>
                    </div>
            </section>
            <section class="cont-white">
                <div class="container">
                    <form>
                        <div class="row">
                            <div class="col-xs-12 contenedor-input">
                                <div class="row top-row">
                                    <div class="col-xs-3 nopadding sprincipal steptitle">
                                        <span class="bluespan">3</span><span class="titulo-top">TERCER PASO</span>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="sub-tit-3">
                                        Motivos por los que deseo ser brigadista en voluntariado en emergencias y rehabilitación
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 nopadding">
                                        <div class="form-group winputall">
                                            <textarea class="form-control" rows="5" col="9"></textarea>
                                        </div>
                                    </div>
                                    <div class="col-xs-12 nopadding">
                                        <p>* Leer y aceptar los Terminos y Condiciones Legales para finalizar el registro.</p>
                                    </div>
                                </div>


                                <div class="row btnform-2">
                                    <div class="col-xs-12">
                                        <div class="col-xs-4"></div>
                                        <div class="col-xs-4 text-center">
                                            <button class="btn btn-default btn-terminos" onclick="parent.location = '?web_terminos_legales_ver'" type="button">TERMINOS Y CONDICIONES LEGALES</button>
                                        </div>
                                        <div class="col-xs-4"></div>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col-xs-12 nopadding">
                                        <div class="pull-left top-right">
                                            <a class="link-a" href="?web_registro_ver_2">  <span class="flecha"> <img src="images/slices2.png"><em>Anterior</em></span></a>
                                        </div>

                                    </div>
                                </div>
                                <div class="row btnform-2">
                                </div>

                            </div>
                        </div>
                    </form>
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
