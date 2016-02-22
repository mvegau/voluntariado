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

        <!--script>
            (function () {
                $('#pages').addClass('login');
            })();
        </script-->
    </head>

    <body background="images/fondo_1.png">
        <div id="pages">
            <section class="header-login">
                <div class="container">
                    <div class="logo">
                        <a href="index.htm"><img src="images/logo.png"/></a>
                    </div>
                    <div class="row">
                        <div class="col-xs-12 logindiv">
                            <div class="pull-right">
                                <form class="form-group login-inputs" id="loginForm" method="post" action="web_home_ver.htm" modelAttribute="usuarioBean">
                                    <div class="col-xs-5 nopadding rightinput">
                                        <input type="text" class="form-control in-login" id="username" name="username"/>
                                        <font color="red">${message}</font>
                                    </div>
                                    <div class="col-xs-5 nopadding">
                                        <input type="password" placeholder="Contraseña" class="form-control in-login" id="password" name="password"/>
                                        <a class="forgot-password" href="web_recuperar_contrasena.htm">
                                            <span class="link-blu">¿Olvidaste tu contraseña?</span>
                                        </a>
                                    </div>
                                    <div class="col-xs-2">
                                        <button onClick="" class="btn btn-default btn-blue"  type="submit">INGRESAR</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
            </section>


            <section class="cont-blue">
                <div class="container">
                    <div class="indicaciones">

                    </div>
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="col-xs-6">
                                <div class="cont-mensaje">
                                    <img src="images/titular.png">
                                    <div class="cont-mensaje-title">
                                        <h2>Pasos a seguir para ser voluntario:</h2>
                                        <ol class="indicaciones-lista">
                                            <li>REGISTRASE COMO POTULANTE</li>
                                            <li>LLEVAR EL CURSO</li>
                                            <li>ACTUALIZAR INFORMACIÓN Y MANTENERSE ALERTA</li>
                                        </ol>
                                    </div>
                                    <div class="cont-button">
                                        <button class="btn-orange">Descargar base registro VER</button>
                                    </div>
                                </div>
                            </div>
                            <div class="col-xs-6">
                                <div class="cont-form text-center">
                                    <div class="header-log">
                                        <span>REGÍSTRATE AHORA</span>
                                    </div>
                                    <div class="cont-not text-center">
                                        <div class="not1">
                                            <a href="web_registro_ver_1.htm"><span class="btn-blue-lg">VER</span></a>
                                            <div class="cont-text">
                                                <p>Voluntariado en Emergencia</p>
                                                <p> y Rehabilitación</p>
                                            </div>
                                        </div>
                                        <div class="linea">
                                        </div>
                                        <div class="not2">
                                            <a href="#"><span class="btn-gver">GRUPO VER</span></a>
                                            <div class="cont-text">
                                                <p>Voluntariado en Emergencia</p>
                                                <p> y Rehabilitación</p>
                                            </div>
                                        </div>
                                        <div class="linea">
                                        </div>
                                        <div class="not3">
                                            <a href="web_registro_sespad.htm"><span class="btn-sky">SESPAD</span></a>
                                            <div class="cont-text">
                                                <p>Servicio Escolar Solidario</p>
                                                <p>en Preparación y Atención de</p>
                                                <p>Desastres.</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <section class="footer">
                    <div class="container">
                        <footer class="logindiv">
                            <span class="small pull-left">Calle Ricardo Angulo Ramirez Nº 694. Urb corpac - San Isidrio Lima Peru Central Telefónica (51) 1 225-9898</span>
                            <span class="small pull-right">© 2016 indeci</span>
                        </footer>
                    </div>
                </section>
            </section>
        </div>
    </body>
</html>
