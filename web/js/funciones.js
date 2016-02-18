$(document).ready(function() {
  var view = location.search,
    nowTemp,
    now,
    sinceDate,
    newDate,
    untilDate;


  //CARGA DE VISTAS (TEMPORAL)
  view = view.substring(1);
  $('#pages').load(view + '.html', function() {
    //Calendario//
    $('.datepicker').datepicker();

    $('input, textarea').placeholder();

    //calendario con rango//
    nowTemp = new Date();
    now = new Date(nowTemp.getFullYear(), nowTemp.getMonth(), nowTemp.getDate(), 0, 0, 0, 0);
    sinceDate = $('#alert_datepicker-since').datepicker({
      onRender: function(date) {
        return date.valueOf() < now.valueOf() ? 'disabled' : '';
      }
    }).on("changeDate", function(ev) {
      if (ev.date.valueOf() > untilDate.date.valueOf()) {
        newDate = new Date(ev.date);
        newDate.setDate(newDate.getDate() + 1);
        untilDate.setValue(newDate);
      }
      $('#alert_datepicker-since').datepicker('hide');
    }).data('datepicker');

    untilDate = $('#alert_datepicker-until').datepicker({
      onRender: function(date) {
        return date.valueOf() <= sinceDate.date.valueOf() ? 'disabled' : '';
      }
    }).on("changeDate", function(ev) {
      $('#alert_datepicker-until').datepicker('hide');
    }).data('datepicker');

    // Agregar seccion de alumnos //
    var alumnosBlock = 0;
    $(".btn-add-alumnos-a").on("click", function() {
      $("#datos-alumnos").before("<div id=alumnos-block-" + alumnosBlock + " class=\"row\"><div class=\"elim-x\"><img src=\"images/slices_borrar.png\"></div><div class=\"elim\"></div><div class=\"col-xs-12 nopadding\"><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Nombres</label><input type=\"text\" class=\"form-control\" placeholder=\"\"></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Apellidos</label><input type=\"text\" class=\"form-control\" placeholder=\"\"></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Fecha de nacimiento</label><input type=\"date\" class=\"form-control datepicker\" placeholder=\"\"></div></div><div class=\"col-xs-12 nopadding\"><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label class=\"hiden\">sexo</label><select class=\"select2\"><option>Sexo</option><option>Masculino</option><option>Femenino</option></select></div></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label class=\"hiden\">Grado</label><select class=\"select2\"><option>Grado</option><option>OPCION1</option><option>OPCION2</option><option>OPCION3</option><option>OPCION4</option><option>OPCION5</option></select></div></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Tipo de documento</label><select class=\"select2\"><option></option><option>OPCION1</option><option>OPCION2</option><option>OPCION3</option><option>OPCION4</option><option>OPCION5</option></select></div></div><div class=\"col-xs-12 nopadding\"><div class=\"col-xs-4 nopadding\"></div><div class=\"col-xs-4 nopadding\"></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Numero de documento</label><input type=\"text\" class=\"form-control\" placeholder=\"\"></div></div></div><div class=\"col-xs-12 nopadding\"><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Nombre del padre ó apoderado</label><input type=\"text\" class=\"form-control\"></div></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Tipo de documento</label><select class=\"select2\"><option></option><option>OPCION1</option><option>OPCION2</option><option>OPCION3</option><option>OPCION4</option><option>OPCION5</option></select></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Número de documento</label><input type=\"text\" class=\"form-control\"></div></div></div><div class=\"row\"><div class=\"col-xs-12\"><div class=\"col-xs-4\"></div><div class=\"col-xs-4\"></div><div class=\"col-xs-4\"><div class=\"pull-right\"><span class=\"nombre-archivo\"></span><div class=\"btn btn-modalsmall plomo btn-uploader-container\"><input type=\"file\" class=\"btn-upload-product-picture one-in\"><span class=\"btn-uploader-text\"><em>Adjuntar anexo 3</em></span></div></div></div></div></div>");
      $(".select2").select2({
        minimumResultsForSearch: -1
      });
      $('#alumnos-block-' + alumnosBlock).find('.datepicker').datepicker();
    });
    $(document).on('click', '.elim-x', function(e) {
      $(this).parent('.row').remove();
    });


    $(".btn-add-especialidad-a").on("click", function() {
      $("#especialidad").before("<div class=\"row padre\"><div class=\"elim-x-5\"><img src=\"images/slices_borrar.png\"></div><div class=\"elim\"></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Grado académico</label><select class=\"select2\"><option></option><option>Opcion1</option><option>Opcion2</option><option>Opcion3</option><option>Opcion4</option><option>Opcion5</option></select></div></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Institución</label><select class=\"select2\"><option>UNIVERSIDAD CATOLICA</option><option>IPP</option><option>SAN MARCOS</option><option>IPAD</option><option>IDAD</option><option>OPCION5</option></select></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label class=\"hiden\">Otros</label><input type=\"text\" class=\"form-control\" placeholder=\"otros\"></div></div><div class=\"clearfix\"></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Año en que culmino</label><input type=\"text\" class=\"form-control\" placeholder=\"\"></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label class=\"hiden\">Adjuntar</label><div><span class=\"nombre-archivo\"></span><div class=\"btn btn-modalsmall plomo btn-uploader-container\"><input type=\"file\" class=\"btn-upload-product-picture one-in\"><span class=\"btn-uploader-text\"><em>Adjuntar certificado de especialización</em></span></div></div></div></div></div>");
      $(".select2").select2({
        minimumResultsForSearch: -1
      });
    });
    $(document).on('click', '.elim-x-5', function(e) {
      $(this).parents('.padre').remove();
    });

    var courseBlock = 0;
    $(".btn-add-cursos-a").on("click", function() {
      courseBlock++;
      $("#cont-info").before("<div id=course-block-" + courseBlock + " class=\"padre\"><div class=\"row\"><div class=\"elim-x-2\"><img src=\"images/slices_borrar.png\"></div><div class=\"elim\"></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Curso</label><select class=\"select2\"><option></option><option>opcion1</option></select></div></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Institución ( Seleccionar )</label><select class=\"select2\"><option></option><option>opcion1</option></select></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label class=\"hiden\">Otros</label><input type=\"text\" placeholder=\"\" class=\"form-control\"></div></div><div class=\"clearfix\"></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label class=\"block-label\">Fecha</label><input type=\"text\" class=\"form-control datepicker\" placeholder=\"\"></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Duración de horas</label><input type=\"text\" class=\"form-control\" placeholder=\"\"></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label class=\"hiden\">Adjuntar</label><div><span class=\"nombre-archivo\"></span><div class=\"btn btn-modalsmall plomo btn-uploader-container\"><input type=\"file\" class=\"btn-upload-product-picture one-in\"><span class=\"btn-uploader-text\"><em>Adjuntar certificado de capacitación</em></span></div></div></div></div></div></div>");
      $(".select2").select2({
        minimumResultsForSearch: -1
      });
      $('#course-block-' + courseBlock).find('.datepicker').datepicker();
    });
    $(document).on('click', '.elim-x-2', function(e) {
      $(this).parents('.padre').remove();
    });


    $(".btn-add-experiencia-a").on("click", function() {
      $(".div-experiencia").before("<div class=\"div-experiencia1\"><div class=\"row\"><div class=\"elim-x-3\"><img src=\"images/slices_borrar.png\"></div><div class=\"elim\"></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Institución ( seleccionar )</label><select class=\"select2\"><option></option><option>opcion1</option></select></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label class=\"hiden\">otros</label><input type=\"text\" class=\"form-control\" placeholder=\"Otros\"></div></div><div class=\"clearfix\"></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Ciudad</label><select class=\"select2 col-xs-2\"><option></option><option>lima</option><option>opcion1</option><option>opcion2</option><option>opcion3</option><option>opcion4</option></select></div></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Cargo</label><select class=\"select2\"><option></option>opcion1<option></option></select></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Tiempo</label><input type=\"text\" class=\"form-control\" placeholder=\"\"></div></div>");
      $(".select2").select2({
        minimumResultsForSearch: -1
      });
    });

    $(document).on('click', '.elim-x-3', function(e) {
      $(this).parents('.div-experiencia1').remove();
    });

    $(document).on('click', '.op-deshabilitar span', function(e) {
      $(this).toggleClass('habilitado');
      $(this).parent().parent("tr").toggleClass('row-grey');

      if ($(this).hasClass('habilitado')) {
        $(this).text('Deshabilitar');
      } else {
        $(this).text('Habilitar');
      }
    });


    $(".btn-add-actividades-a").on("click", function() {
      $(".div-actividades").before("<div class=\"div-actividades1\"><div class=\"row\"><div class=\"elim-x-4\"><img src=\"images/slices_borrar.png\"></div><div class=\"elim\"></div><div class=\"col-xs-4 nopadding shijo\"><div class=\"form-group winput\"><label>Disciplina deportiva</label><select class=\"select2\"><option></option><option>opcio1</option></select></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Intensidad por semana (en horas)</label><input type=\"text\" placeholder=\"\" class=\"form-control\"></div></div><div class=\"col-xs-4 nopadding\"><div class=\"form-group winput\"><label>Tiempo de práctica (en meses)</label><input type=\"text\" placeholder=\"\" class=\"form-control\"></div></div></div></div>");
      $(".select2").select2({
        minimumResultsForSearch: -1
      });
    });

    $(document).on('click', '.elim-x-4', function(e) {
      $(this).parents('.div-actividades1').remove();
    });


    $('.multiselect').multiselect({
      nonSelectedText: 'Elige una opción',
      allSelectedText: 'Todos'
    });

    $(".select2").select2({
      minimumResultsForSearch: -1
    });

    $('.scrollbox').enscroll({
      showOnHover: false,
      verticalTrackClass: 'track3',
      verticalHandleClass: 'handle3'
    });

    $('.scrollbox1').enscroll({
      showOnHover: false,
      verticalTrackClass: 'track3',
      verticalHandleClass: 'handle3'
    });

    $('.icheck-container input').iCheck({
      checkboxClass: 'icheckbox_minimal-blue',
      radioClass: 'iradio_minimal-blue',
      increaseArea: '20%'
    });
    //--------------------------------------------------------------------------------
    $(document).on('change', '.btn-uploader-container :file', function() {
      var input = $(this),
        numFiles = input.get(0).files ? input.get(0).files.length : 1,
        label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
      input.trigger('fileselect', [numFiles, label]);
    });

    $(document).on('fileselect', '.btn-uploader-container :file', function(event, numFiles, label) {
      $(this).parent().prev('.nombre-archivo').text(label);
    });
    //------------------------------------------------------------------------------------
    $(document).on('change', '.btn-uploader-container-up :file', function() {
      var input = $(this),
        numFiles = input.get(0).files ? input.get(0).files.length : 1,
        label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
      input.trigger('fileselect', [numFiles, label]);
    });

    $(document).on('fileselect', '.btn-uploader-container-up :file', function(event, numFiles, label) {
      $(this).parent().find('.nombre-archivo-up').text(label);
    });



    $('.icheck-container .check-all').iCheck({
      checkboxClass: 'icheckbox_minimal-blue',
      radioClass: 'iradio_minimal-blue',
      increaseArea: '20%'
    });
    //SELECCIONAR TODOS LOS CHECKS

    $('.check-all').on('ifChecked', function(event) {
      var dataCheck = $(this).attr('data-check');
      $('.check-all-childrens-' + dataCheck + ' input').iCheck('check');
    });
    $('.check-all').on('ifUnchecked', function(event) {
      var dataCheck = $(this).attr('data-check');
      $('.check-all-childrens-' + dataCheck + ' input').iCheck('uncheck');
    });

  });
});
