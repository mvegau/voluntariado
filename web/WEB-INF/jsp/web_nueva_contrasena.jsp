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

        <script>
            (function () {
                $('#pages').addClass('nueva-contrasena');
            })();
        </script>
    </head>

    <body>
        <div id="pages">
            <section class="cont-blue-contrasena">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12">

                            <div class="card card-container text-center">
                                <img src="images/logo2.png" class="img-responsive profile-img-card">
                                <span class="twhite font-b">Ingrese su nueva contraseña</span>
                                <form class="form-signin w-form">
                                    <input type="password" autofocus="" required="" placeholder="Nueva contraseña" class="form-control" value="">
                                    <input type="password" required="" placeholder="Confirmar contraseña" class="form-control" value="">
                                    <br>
                                    <button type="submit" class="btn btn-lg btn-primary btn-block btn-signin font-b">CAMBIAR CONTRASEÑA</button>
                                </form>
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
