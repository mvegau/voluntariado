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
                        <a href="index.htm"><img src="images/logo.png"/></a>
                    </div>
                    <div class="row">
                        <div class="col-xs-12 logindiv">
                            <div class="pull-left">
                                <h2 class="titulo-principal">REGISTRO DE VOLUNTARIOS</h2>
                            </div>
                            <div class="pull-right">
                                <div class="tit-derecha"><span>SESPAD</span></div>
                            </div>
                        </div>
                    </div>
            </section>
            <section class="cont-white">
                <div class="container">
                    <form>
                        <div class="row">
                            <div class="col-xs-12 contenedor-input register-container">
                                <div class="row orange-filters">
                                    <div class="col-xs-3 nopadding sprincipal">
                                        <select class="form-control select2">
                                            <option>DRE</option>
                                            <option>OPCION1</option>
                                            <option>OPCION2</option>
                                            <option>OPCION3</option>
                                            <option>OPCION4</option>
                                            <option>OPCION5</option>
                                        </select>
                                        <div class="div-subti">
                                            <span>Educacion regional de educacion</span>
                                        </div>
                                    </div>
                                    <div class="col-xs-3 sprincipal">
                                        <select class="form-control select2 sprincipal">
                                            <option>UGEL</option>
                                            <option>OPCION1</option>
                                            <option>OPCION2</option>
                                            <option>OPCION3</option>
                                            <option>OPCION4</option>
                                            <option>OPCION5</option>
                                        </select>
                                        <div class="div-subti">
                                            <span class="text-center">Unidad de Gestión Educativa Local</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="sub-tit">
                                        Institución educativa
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12 nopadding">
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <select class="form-control select2">
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
                                                <select class="form-control select2">
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
                                                <select class="form-control select2">
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
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label>Institución Educativa (Seleccionar)</label>
                                            <select class="form-control select2">
                                                <option>Meliton Carbajal</option>
                                                <option>María Parado de Bellido</option>
                                                <option>Ricardo Palma</option>
                                                <option>Alfonso Ugarte</option>
                                                <option>San Francisco de Asis</option>
                                                <option>Niño Heroe</option>
                                                <option>Meliton Carbajal</option>
                                                <option>María Parado de Bellido</option>
                                                <option>Ricardo Palma</option>
                                                <option>Alfonso Ugarte</option>
                                                <option>San Francisco de Asis</option>
                                                <option>Niño Heroe</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label class="hiden">otros</label>
                                            <input type="text" class="form-control" placeholder="otros">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Dirección de la IIEE</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding winput">
                                        <div class="form-group">
                                            <label for="">Fax IIEE (opcional)</label>
                                            <input type="text" class="form-control" id="campoError">
                                            <span class="control-label"></span>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Director de la IIEE</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Teléfono de la IIEE</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="sub-tit">
                                        Docente responsable
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
                                            <label>Tipo de documento</label>
                                            <select class="form-control select2">
                                                <option>DNI</option>
                                                <option>PASAPPORTE</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Numero de documento</label>
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
                                    <div class="col-xs-8 nopadding">
                                        <div class="form-group winputall">
                                            <label>Dirección</label>
                                            <input type="text" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Email</label>
                                            <input type="email" class="form-control" placeholder="">
                                        </div>
                                    </div>
                                </div>


                                <div class="row">
                                    <div class="sub-tit">
                                        Alumnos participantes
                                        <div class="pull-right ob">
                                            <a class="btn-add-alumnos-a">
                                                <img src="images/slices_mas.png"/>
                                                <span class="btn-add-alumnos"><em> Añadir alumnos</em></span>
                                            </a>
                                            <button class="btn btn-default bluebtn" type="submit">DESCARGAR ANEXO 3</button>
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-xs-12 nopadding">
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label>Nombres</label>
                                                <input type="text" class="form-control" placeholder="">
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label>Apellidos</label>
                                                <input type="text" class="form-control" placeholder="">
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding">
                                            <div class="form-group winput">
                                                <label>Fecha de nacimiento</label>
                                                <input type="date" class="form-control datepicker" placeholder="">
                                            </div>
                                        </div>

                                        <div class="col-xs-12 nopadding">
                                            <div class="col-xs-4 nopadding shijo">
                                                <div class="form-group winput">
                                                    <label class="hiden">Sexo</label>
                                                    <select class="form-control select2">
                                                        <option>Sexo</option>
                                                        <option>Masculino</option>
                                                        <option>Femenino</option>
                                                    </select>
                                                </div>

                                            </div>
                                            <div class="col-xs-4 nopadding shijo">
                                                <div class="form-group winput">
                                                    <label class="hiden">grado</label>
                                                    <select class="form-control select2">
                                                        <option>Grado</option>
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
                                                    <label>Tipo de documento</label>
                                                    <select class="form-control select2">
                                                        <option></option>
                                                        <option>OPCION1</option>
                                                        <option>OPCION2</option>
                                                        <option>OPCION3</option>
                                                        <option>OPCION4</option>
                                                        <option>OPCION5</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-12 nopadding">
                                            <div class="col-xs-4 nopadding">
                                            </div>
                                            <div class="col-xs-4 nopadding">
                                            </div>
                                            <div class="col-xs-4 nopadding">
                                                <div class="form-group winput">
                                                    <label>Numero de documento</label>
                                                    <input type="text" class="form-control" placeholder="">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xs-12 nopadding">
                                            <div class="col-xs-4 nopadding">
                                                <div class="form-group winput">
                                                    <label>Nombre del padre ó apoderado</label>
                                                    <input type="text" class="form-control" placeholder="">
                                                </div>
                                            </div>
                                            <div class="col-xs-4 nopadding">
                                                <div class="form-group winput shijo">
                                                    <label>Tipo de documento</label>
                                                    <select class="form-control select2">
                                                        <option></option>
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
                                                    <input type="text" class="form-control" placeholder="">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-xs-12">
                                            <div class="col-xs-4">
                                            </div>
                                            <div class="col-xs-4">
                                            </div>
                                            <div class="col-xs-4">
                                                <div class="pull-right">
                                                    <span class="nombre-archivo"></span>
                                                    <div class="btn btn-modalsmall plomo btn-uploader-container">
                                                        <input type="file" class="btn-upload-product-picture one-in">
                                                        <span class="btn-uploader-text"><em>Adjuntar anexo 3</em></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row btnform" id="datos-alumnos">
                                    <div class="col-xs-12">
                                        <div class="col-xs-3"></div>
                                        <div class="col-xs-3">
                                            <button type="button" onclick="parent.location = '?web_inicio'"  class="btn btn-default btn-cancelar">CANCELAR</button>
                                        </div>
                                        <div class="col-xs-3">
                                            <button type="button" onclick="parent.location = '?web_inicio'"  class="btn btn-default btn-enviar">ENVIAR</button>
                                        </div>
                                        <div class="col-xs-3"></div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </form>
                </div>
                </form>

            </section>

            <section class="footer-interno">
                <div class="container">
                    <footer class="logindiv">
                        <span class="small pull-right">© 2015 indeci</span>
                    </footer>
                </div>
            </section>

        </div>
    </body>
</html>
