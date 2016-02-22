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
                        <a href="?web_inicio"><img src="images/logo.png" /></a>
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
                            <div class="col-xs-12 contenedor-input register-container">
                                <div class="row top-row">
                                    <div class="col-xs-3 nopadding sprincipal steptitle">
                                        <span class="bluespan">1</span>
                                        <span class="titulo-top">PRIMER PASO</span>
                                    </div>
                                    <div class="pull-right sprincipal top-right stepbtn">
                                        <button class="btn btn-default btn-orange" type="submit">ANEXO 5</button>
                                        <div class="div-subti min-letter">
                                            <a class="link-a" href="#"><span class="text-center">Descarge el anexo para adjuntarlo <br>(opcional, sólo para menores de edad)</span></a>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="sub-tit-2">
                                        Datos Generales
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="row">
                                        <div class="col-xs-12 nopadding">
                                            <div class="col-xs-4 nopadding shijo">
                                                <div class="form-group winput">
                                                    <select class="select2">
                                                        <option>Pais</option>
                                                        <option>OPCION1</option>
                                                        <option>OPCION2</option>
                                                        <option>OPCION3</option>
                                                        <option>OPCION4</option>
                                                        <option>OPCION5</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xs-12 nopadding">
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="hiden">Departamento</label>
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
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="hiden">Provincia</label>
                                                <select class="select2">
                                                    <option>Provincia</option>
                                                    <option>OPCION1</option>
                                                    <option>OPCION2</option>
                                                    <option>OPCION3</option>
                                                    <option>OPCION4</option>
                                                    <option>OPCION5</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="hiden">Distrito</label>
                                                <select class="select2">
                                                    <option>Distrito</option>
                                                    <option>OPCION1</option>
                                                    <option>OPCION2</option>
                                                    <option>OPCION3</option>
                                                    <option>OPCION4</option>
                                                    <option>OPCION5</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Nombres</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-xs-8 nopadding">
                                        <div class="form-group winputall">
                                            <label>Apellidos</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label class="block-label">Fecha de nacimiento</label>
                                            <div class="col-xs-4 nopadding wauto">
                                                <input type="text" placeholder="" class="form-control datepicker">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label class="block-label">Tipo de documento</label>
                                            <div class="col-xs-4 nopadding shijo">
                                                <div class="form-group winput">
                                                    <select class="select2">
                                                        <option></option>
                                                        <option>PASAPORTE</option>
                                                        <option>OPCION2</option>
                                                        <option>OPCION3</option>
                                                        <option>OPCION4</option>
                                                        <option>OPCION5</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Número de documento</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label class="block-label">Profesión</label>
                                            <select class="select2">
                                                <option>Elegir especialidad</option>
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
                                            <label>Domicilio</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Teléfono</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Email</label>
                                            <input type="email" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Skype</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label class="hiden">Texto Texto</label>
                                            <select class="select2">
                                                <option>Grupo sanguíneo</option>
                                                <option>OPCION1</option>
                                                <option>OPCION2</option>
                                                <option>OPCION3</option>
                                                <option>OPCION4</option>
                                                <option>OPCION5</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label>Gobierno regional/local/entidad (opcional)</label>
                                            <select class="select2">
                                                <option></option>
                                                <option>OPCION1</option>
                                                <option>OPCION2</option>
                                                <option>OPCION3</option>
                                                <option>OPCION4</option>
                                                <option>OPCION5</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="pull-right sprincipal dtop">
                                        <div class="btn btn-modalsmall plomo btn-uploader-container-up">
                                            <input type="file" class="btn-upload-product-picture up">
                                            <span class="btn-uploader-text btn btn-default btn-sky2">ADJUNTAR ANEXO 5</span>
                                            <span class="nombre-archivo-up"></span>
                                        </div>
                                    </div>

                                    <div class="pull-right sprincipal dtop">
                                        <div class="btn btn-modalsmall plomo btn-uploader-container-up">
                                            <input type="file" class="btn-upload-product-picture up">
                                            <span class="btn-uploader-text btn btn-default btn-sky2">ADJUNTAR ANTECEDENTES PENALES</span>
                                            <span class="nombre-archivo-up"></span>
                                        </div>
                                    </div>
                                </div>


                                <div class="row btnform-2">
                                    <div class="col-xs-12 nopadding">
                                        <div class="pull-right top-right">
                                            <a href="?web_registro_ver_2" class="link-a"><span class="flecha-right"><em>Siguiente</em> <img src="images/slices1.png"></span></a>
                                        </div>
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
