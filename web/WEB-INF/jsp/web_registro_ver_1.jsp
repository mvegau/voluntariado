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

        <script language="javascript">

            function isNumberKey(evt)
            {
                var charCode = (evt.which) ? evt.which : event.keyCode
                if (charCode > 31 && (charCode < 48 || charCode > 57))
                    return false;
                return true;
            }

            function cambiarPais()
            {
                var code = $("#codPais").val();
                $("#codDepartamento").load("DepartamentoServlet", {codPais: code});
            }

            function cambiarDepartamento()
            {
                var code = $("#departamentos").val();
                $("#codProvincia").load("ProvinciaServlet", {codDepartamento: code});
            }

            function cambiarProvincia()
            {
                var code = $("#provincias").val();
                $("#codDistrito").load("DistritoServlet", {codProvincia: code});
            }

        </script>
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
                    <form:form method="post" action="web_registro_ver_1.htm" modelAttribute="voluntarioBean" commandName="voluntarioBean">
                        <div class="row">
                            <div class="col-xs-12 contenedor-input register-container">
                                <div class="row top-row">
                                    <div class="col-xs-3 nopadding sprincipal steptitle">
                                        <span class="bluespan">1</span>
                                        <span class="titulo-top">PRIMER PASO</span>
                                    </div>
                                    <div class="pull-right sprincipal top-right stepbtn">
                                        <!--button class="btn btn-default btn-orange" type="submit">ANEXO 5</button-->
                                        <a class="btn btn-default btn-orange" href="pdf_cargado/Anexo5.pdf" download>
                                            Descargar base registro VER
                                        </a>
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
                                                    <form:select class="select2" path="volPais.codPais" onchange="cambiarPais()" id="codPais">
                                                        <form:option value="0" label="País"/>
                                                        <form:options items="${paises}"/>
                                                    </form:select>
                                                    <font color="red">${msgPais}</font>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xs-12 nopadding">
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="hiden">Departamento</label>
                                                <form:select class="select2" path="volDepartamento.codDepartamento" onchange="cambiarDepartamento()" id="codDepartamento">
                                                    <form:option value="0" label="Departamento"/>
                                                    <form:options items="${departamentos}"/>
                                                </form:select>
                                                <font color="red">${msgDepartamento}</font>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="hiden">Provincia</label>
                                                <form:select class="select2" path="volProvincia.codProvincia" onchange="cambiarProvincia()" id="codProvincia">
                                                    <form:option value="0" label="Provincia"/>
                                                    <form:options items="${provincias}"/>
                                                </form:select>
                                                <font color="red">${msgProvincia}</font>
                                            </div>
                                        </div>
                                        <div class="col-xs-4 nopadding shijo">
                                            <div class="form-group winput">
                                                <label class="hiden">Distrito</label>
                                                <form:select class="select2" path="volDistrito.codDistrito" id="codDistrito">
                                                    <form:option value="0" label="Distrito"/>
                                                    <form:options items="${distritos}"/>
                                                </form:select>
                                                <font color="red">${msgDistrito}</font>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Nombres</label>
                                            <font color="red">${msgNombre}</font>
                                            <input type="text" class="form-control" placeholder="" maxlength="30" value="${voluntarioBean.nombres}" name="nombres">
                                        </div>
                                    </div>
                                    <div class="col-xs-8 nopadding">
                                        <div class="form-group winputall">
                                            <label>Apellidos</label>
                                            <font color="red">${msgApellido}</font>
                                            <input type="text" class="form-control" placeholder="" maxlength="30" value="${voluntarioBean.apellidos}" name="apellidos">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label class="block-label">Fecha de nacimiento</label>
                                            <div class="col-xs-4 nopadding wauto">
                                                <input type="text" placeholder="" class="form-control datepicker" value="" name="fecNacimiento" onkeypress="return isNumberKey(event)" maxlength="10">
                                                <font color="red">${msgFecha}</font>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label class="block-label">Tipo de documento</label>
                                            <form:select class="select2" path="VolTipdocum.ideTipodocumento">
                                                <form:option value="0" label="Documento"/>
                                                <form:options items="${documentos}"/>
                                            </form:select>
                                            <font color="red">${msgTipDoc}</font>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Número de documento</label>
                                            <font color="red">${msgNumDoc}</font>
                                            <input type="text" class="form-control" placeholder="" minlength="8" maxlength="12" value="${voluntarioBean.numDocumento}" name="numDocumento">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label class="block-label">Profesión</label>
                                            <form:select class="select2" path="VolProfesion.ideProfesion">
                                                <form:option value="0" label="Elegir especialidad"/>
                                                <form:options items="${profesiones}"/>
                                            </form:select>
                                            <font color="red">${msgProfesion}</font>
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Domicilio</label>
                                            <font color="red">${msgDomicilio}</font>
                                            <input type="text" class="form-control" placeholder="" maxlength="100" value="${voluntarioBean.domicilio}" name="domicilio">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Teléfono</label>
                                            <font color="red">${msgTelefono}</font>
                                            <input type="text" class="form-control" placeholder="" maxlength="12" value="${voluntarioBean.telefono}" name="telefono" onkeypress="return isNumberKey(event)">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Email</label>
                                            <font color="red">${msgCorreo}</font>
                                            <input type="email" class="form-control" placeholder="" value="${voluntarioBean.correo}" name="correo">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding">
                                        <div class="form-group winput">
                                            <label>Skype</label>
                                            <font color="red">${msgSkype}</font>
                                            <input type="text" class="form-control" placeholder="" value="${voluntarioBean.cskype}" name="cskype">
                                        </div>
                                    </div>
                                    <div class="col-xs-4 nopadding shijo">
                                        <div class="form-group winput">
                                            <label class="block-label">Grupo sanguíneo</label>
                                            <form:select class="select2" path="VolGsanguineo.ideGruposangui">
                                                <form:option value="0" label="Grupo sanguíneo"/>
                                                <form:options items="${sanguineo}"/>
                                            </form:select>
                                            <font color="red">${msgSanguineo}</font>
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
                                            <!--a class="link-a"><span class="flecha-right"><em>Siguiente</em> <img src="images/slices1.png"></span></a-->
                                            <form action="web_registro_ver_1.html" method="post">
                                                <a href="#" onclick="document.forms[0].submit();return false;"><span class="flecha-right"><em>Siguiente</em> <img src="images/slices1.png"></span></a>
                                            </form>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </form:form>
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