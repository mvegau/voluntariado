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
                    <form method="post" action="web_registro_ver_2.htm" modelAttribute="voluntarioBean" commandName="voluntarioBean">
                        <div class="row">
                            <div class="col-xs-12 contenedor-input register-container">
                                <div class="row top-row">
                                    <div class="col-xs-3 nopadding sprincipal steptitle">
                                        <span class="bluespan">2</span>
                                        <span class="titulo-top">SEGUNDO PASO</span>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="sub-tit-2">
                                        Especialidad (opcional)
                                        <div class="pull-right ob">
                                            <a class="btn-add-especialidad-a">
                                                <img src="images/slices_mas.png">
                                                <span class="btn-add-cursos"><em> Agregar más</em></span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label>Grado académico</label>
                                            <select class="select2">
                                                <option></option>
                                                <option>Opcion1</option>
                                                <option>Opcion2</option>
                                                <option>Opcion3</option>
                                                <option>Opcion4</option>
                                                <option>Opcion5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label>Institución</label>
                                            <select class="select2">
                                                <option>UNIVERSIDAD CATOLICA</option>
                                                <option>IPP</option>
                                                <option>SAN MARCOS</option>
                                                <option>IPAD</option>
                                                <option>IDAD</option>
                                                <option>OPCION5</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label class="hiden">Otros</label>
                                            <input type="text" class="form-control" placeholder="otros">
                                        </div>
                                    </div>
                                    <div class="clearfix">

                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Año en que culminó</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label class="hiden">Adjuntar</label>
                                            <div>
                                                <span class="nombre-archivo"></span>
                                                <div class="btn btn-modalsmall plomo btn-uploader-container">
                                                    <input type="file" class="btn-upload-product-picture one-in">
                                                    <span class="btn-uploader-text"><em>Adjuntar certificado de especialización</em></span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row" id="especialidad">
                                    <div class="sub-tit-3">
                                        Capacitación en gestión del riesgo (opcional)
                                        <div class="pull-right ob">
                                            <a class="btn-add-cursos-a">
                                                <img src="images/slices_mas.png">
                                                <span class="btn-add-cursos"><em> Agregar más</em></span>
                                            </a>
                                        </div>
                                    </div>
                                    <span>Detalles del curso de capacitación en gestión del riesgo de desastres que ha realizado :</span>
                                </div>
                                <br>
                                <div class="padre">
                                    <div class="row">
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label>Curso</label>
                                                <select class="select2">
                                                    <option></option>
                                                    <option>Opcion1</option>
                                                    <option>Opcion2</option>
                                                    <option>Opcion3</option>
                                                    <option>Opcion4</option>
                                                    <option>Opcion5</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label>Institución (Seleccionar)</label>
                                                <select class="select2">
                                                    <option></option>
                                                    <option>Opcion1</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="block-label hiden">Otros</label>
                                                <input type="text" placeholder="Otros" class="form-control">
                                            </div>
                                        </div>
                                        <div class="clearfix"></div>
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="block-label">Fecha</label>
                                                <input type="text" placeholder="" class="form-control datepicker">
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label>Duración de horas</label>
                                                <input type="text" class="form-control" placeholder="">
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label class="hiden">Adjuntar</label>
                                                <div>
                                                    <span class="nombre-archivo"></span>
                                                    <div class="btn btn-modalsmall plomo btn-uploader-container">
                                                        <input type="file" class="btn-upload-product-picture one-in">
                                                        <span class="btn-uploader-text"><em>Adjuntar certificado de capacitación</em></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="row" id="cont-info">
                                    <div class="sub-tit-3">
                                        Experiencia como voluntario/a (opcional)
                                        <div class="pull-right ob">
                                            <a class="btn-add-experiencia-a link-a">
                                                <img src="images/slices_mas.png">
                                                <span class="btn-add-experiencia"><em> Agregar más</em></span>
                                            </a>
                                        </div>
                                    </div>
                                    <br>
                                    <span>Institución de voluntarios/as a lo que pertenece o a pertenecido :</span>
                                </div>
                                <div>
                                    <div class="row">
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label>Institución ( seleccionar )</label>
                                                <select class="select2">
                                                    <option></option>
                                                    <option>Opcion2</option>
                                                    <option>Opcion3</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label class="hiden">otros</label>
                                                <input type="text" placeholder="Otros" class="form-control">
                                            </div>
                                        </div>
                                        <div class="clearfix"></div>
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label>Ciudad</label>
                                                <select class="select2 col-xs-2">
                                                    <option></option>
                                                    <option>lima</option>
                                                    <option>opcion1</option>
                                                    <option>opcion2</option>
                                                    <option>opcion3</option>
                                                    <option>opcion4</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label>Cargo</label>
                                                <select class="select2">
                                                    <option></option>
                                                    <option>Opcion1</option>
                                                    <option>Opcion2</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label>Tiempo</label>
                                                <input type="text" class="form-control" placeholder="">
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="row div-experiencia">
                                    <div class="sub-tit-3">
                                        Deportes o actividades físicas (opcional)
                                        <div class="pull-right ob">
                                            <a class="btn-add-actividades-a link-a">
                                                <img src="images/slices_mas.png">
                                                <span class="btn-add-experiencia"><em> Agregar más</em></span>
                                            </a>
                                        </div>
                                    </div>
                                    <span>Actividades que ha realizado o realiza :</span>
                                </div>

                                <div>

                                    <div class="row">
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label>Disciplina deportiva</label>
                                                <select class="select2">
                                                    <option></option>
                                                    <option>opcion1</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label>Intensidad por semana (en horas)</label>
                                                <input type="text" class="form-control" placeholder="">
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label>Tiempo de práctica (en meses)</label>
                                                <input type="text" class="form-control" placeholder="">
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="row btnform-2 div-actividades">
                                    <div class="col-xs-12 nopadding">
                                        <div class="pull-left top-right">
                                            <!--a class="link-a" href="web_registro_ver_1.htm"> <span class="flecha"> <img src="images/slices2.png"><em>Anterior</em></span></a-->
                                            <form action="web_registro_ver_2.html" method="get">
                                                <a href="#" onclick="document.forms[0].submit();return false;"><span class="flecha"> <img src="images/slices2.png"><em>Anterior</em></span></a>
                                            </form>
                                        </div>
                                        <div class="pull-right top-right">
                                            <!--a class="link-a" href="web_registro_ver_3.htm"><span class="flecha-right"><em>Siguiente</em> <img src="images/slices1.png"></span></a-->
                                            <form action="web_registro_ver_2.html" method="post">
                                                <a href="#" onclick="document.forms[0].submit();return false;"><span class="flecha-right"><em>Siguiente</em> <img src="images/slices1.png"></span></a>
                                            </form>
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
