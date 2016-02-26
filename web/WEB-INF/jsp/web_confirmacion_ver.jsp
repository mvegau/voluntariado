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
        <meta http-equiv="X-UA-Compatible" content="IE=edge ">
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
            <div class="header-confirmacion">
                <div class="container">
                    <div class="copyright">
                        <span class="small pull-right">&copy; 2016 indeci</span>
                    </div>
                    <div class="confirmacion-logo text-center">
                        <img src="images/logo2.png" />
                    </div>
                </div>

            </div>
            <div class="container">
                <form>
                    <div class="body-confirmacion text-center">
                        <h1 class="confirmacion-h1">¡FELICITACIONES!</h1>
                        <p>Tu registro como <b>voluntario en Emergencias<br>
                                y Rehabilitación</b> se realizó satisfactoriamente.</p>
                        <div class="confirmacion-msj">
                            <p>Gracias por ser parte de esta iniciativa de <b>INDECI</b>, se te
                                <br> enviará notificaciones para el voluntario.</p>
                            <br>
                            <p>Tus datos de registro son:</p>
                            <br>
                            <p>D.N.I : ${documento}
                                <br> Contraseña : ${clave}</p>
                        </div>
                        <br>
                        <br>
                        <br>
                        <div class="col-xs-12 text-center">
                            <a href="index.htm"><span class="btn-orange-lg">IR A INICIO</span></a>
                        </div>
                    </div>
                </form>
            </div>
            <div class="confirmacion-footer text-center">
                <p>Calle Ricardo Angulo Ramírez Nº 694 Urb. Corpac - San Isidro Lima Perú <span>Central Telefónica : (51)1 225-9898</span></p>
            </div>

        </div>
    </body>
</html>
