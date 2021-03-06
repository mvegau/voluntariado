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
                        <a href="index.htm"><img src="images/logo.png" /></a>
                    </div>
                    <div class="row">
                        <div class="col-xs-12 logindiv">
                            <div class="pull-left">
                                <h2 class="titulo-principal">RESPUESTA DE DISPONIBILIDAD</h2>
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
                            <div class="col-xs-12 contenedor-input icheck-container register-container">
                                <div class="row">
                                    <div class="col-xs-12 contendedor-text-list">
                                        <div class="col-xs-6">
                                            <div class="col-xs-4">
                                                <span><b>Nombre del evento :</b></span>
                                            </div>
                                            <div class="col-xs-4">
                                                <span>Sismo</span>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="col-xs-4">
                                                <span><b>Ubicación :</b></span>
                                            </div>
                                            <div class="col-xs-4">
                                                <span>Arequipa</span>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="col-xs-4">
                                                <span><b>Fecha de inicio :</b></span>
                                            </div>
                                            <div class="col-xs-4">
                                                <span>20 - 09 - 16</span>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="col-xs-4">
                                                <span><b>Fecha de fin :</b></span>
                                            </div>
                                            <div class="col-xs-4">
                                                <span>20 - 09 - 16</span>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="col-xs-4">
                                                <span><b>Descripción :</b></span>
                                            </div>
                                            <div class="col-xs-8">
                                                <span>Sismo en la ciudad de Arequipa de 6.5 grados</span>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="col-xs-4">
                                                <span><b>Equipamento :</b></span>
                                            </div>
                                            <div class="col-xs-8">
                                                <span>Mochila de supervivencia</span>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="col-xs-4">
                                                <span><b>Vacunas vigentees :</b></span>
                                            </div>
                                            <div class="col-xs-8">
                                                <span>Epatites A, Sarampión, Polio</span>
                                            </div>
                                        </div>
                                    </div>
                                    <hr class="separador">
                                    <div class="col-xs-12 nopadding">
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="hiden">Tipo de Documento</label>
                                                <select class="select2">
                                                    <option>Departamento</option>
                                                    <option>OPCION1</option>
                                                    <option>OPCION2</option>
                                                    <option>OPCION3</option>
                                                    <option>OPCION4</option>
                                                    <option>OPCION5</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label>Numero de documento</label>
                                                <input type="text" placeholder="" class="form-control">
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label class="hiden">Fechas disponibles </label>
                                                <input type="text" placeholder="Fechas disponibles" class="form-control datepicker">
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="pull-left sprincipal dtop">
                                        <div class="check-div check-top">
                                            <input type="checkbox" value="">
                                            <span>No estoy disponible</span>
                                        </div>
                                    </div>
                                    <div class="pull-right sprincipal dtop">
                                        <div class="btn btn-modalsmall plomo btn-uploader-container-up">
                                            <input type="file" class="btn-upload-product-picture up">
                                            <span class="btn-uploader-text btn btn-default btn-sky2">CARGAR FORMATO PDF</span>
                                            <span class="nombre-archivo-up"></span>
                                        </div>
                                    </div>

                                    <div class="pull-right sprincipal dtop">
                                        <a class="descargar-pdf grey">
                                            <em>Descargar formato PDF</em>
                                        </a>
                                    </div>
                                </div>


                                <div class="row btnform-2">
                                    <div class="col-xs-12 nopadding text-center">
                                        <button type="submit" class="btn btn-default btn-enviar">ENVIAR</button>
                                    </div>
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
