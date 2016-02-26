package com.tismart.voluntariado.bean;
// Generated 26-feb-2016 9:56:41 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * VolVolusespad generated by hbm2java
 */
public class VolVolusespad  implements java.io.Serializable {


     private BigDecimal ideVoluntariosespad;
     private VolPais volPais;
     private VolDepartamento volDepartamento;
     private VolProvincia volProvincia;
     private VolDistrito volDistrito;
     private VolGradoacade volGradoacade;
     private String nombres;
     private String apellidos;
     private String institucioneduca;
     private String direccioniiee;
     private String telefonoiiee;
     private String faxiiee;
     private String directoriiee;
     private String rutaautorizacion;
     private Date fecRegistro;
     private String nombresdocente;
     private String apellidosdocente;
     private String telefonodocente;
     private String correodocente;
     private String direcciondocente;
     private Date fecValidacion;

    public VolVolusespad() {
    }

	
    public VolVolusespad(BigDecimal ideVoluntariosespad, VolGradoacade volGradoacade, String nombres, String apellidos, String rutaautorizacion) {
        this.ideVoluntariosespad = ideVoluntariosespad;
        this.volGradoacade = volGradoacade;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rutaautorizacion = rutaautorizacion;
    }
    public VolVolusespad(BigDecimal ideVoluntariosespad, VolPais volPais, VolDepartamento volDepartamento, VolProvincia volProvincia, VolDistrito volDistrito, VolGradoacade volGradoacade, String nombres, String apellidos, String institucioneduca, String direccioniiee, String telefonoiiee, String faxiiee, String directoriiee, String rutaautorizacion, Date fecRegistro, String nombresdocente, String apellidosdocente, String telefonodocente, String correodocente, String direcciondocente, Date fecValidacion) {
       this.ideVoluntariosespad = ideVoluntariosespad;
       this.volPais = volPais;
       this.volDepartamento = volDepartamento;
       this.volProvincia = volProvincia;
       this.volDistrito = volDistrito;
       this.volGradoacade = volGradoacade;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.institucioneduca = institucioneduca;
       this.direccioniiee = direccioniiee;
       this.telefonoiiee = telefonoiiee;
       this.faxiiee = faxiiee;
       this.directoriiee = directoriiee;
       this.rutaautorizacion = rutaautorizacion;
       this.fecRegistro = fecRegistro;
       this.nombresdocente = nombresdocente;
       this.apellidosdocente = apellidosdocente;
       this.telefonodocente = telefonodocente;
       this.correodocente = correodocente;
       this.direcciondocente = direcciondocente;
       this.fecValidacion = fecValidacion;
    }
   
    public BigDecimal getIdeVoluntariosespad() {
        return this.ideVoluntariosespad;
    }
    
    public void setIdeVoluntariosespad(BigDecimal ideVoluntariosespad) {
        this.ideVoluntariosespad = ideVoluntariosespad;
    }
    public VolPais getVolPais() {
        return this.volPais;
    }
    
    public void setVolPais(VolPais volPais) {
        this.volPais = volPais;
    }
    public VolDepartamento getVolDepartamento() {
        return this.volDepartamento;
    }
    
    public void setVolDepartamento(VolDepartamento volDepartamento) {
        this.volDepartamento = volDepartamento;
    }
    public VolProvincia getVolProvincia() {
        return this.volProvincia;
    }
    
    public void setVolProvincia(VolProvincia volProvincia) {
        this.volProvincia = volProvincia;
    }
    public VolDistrito getVolDistrito() {
        return this.volDistrito;
    }
    
    public void setVolDistrito(VolDistrito volDistrito) {
        this.volDistrito = volDistrito;
    }
    public VolGradoacade getVolGradoacade() {
        return this.volGradoacade;
    }
    
    public void setVolGradoacade(VolGradoacade volGradoacade) {
        this.volGradoacade = volGradoacade;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getInstitucioneduca() {
        return this.institucioneduca;
    }
    
    public void setInstitucioneduca(String institucioneduca) {
        this.institucioneduca = institucioneduca;
    }
    public String getDireccioniiee() {
        return this.direccioniiee;
    }
    
    public void setDireccioniiee(String direccioniiee) {
        this.direccioniiee = direccioniiee;
    }
    public String getTelefonoiiee() {
        return this.telefonoiiee;
    }
    
    public void setTelefonoiiee(String telefonoiiee) {
        this.telefonoiiee = telefonoiiee;
    }
    public String getFaxiiee() {
        return this.faxiiee;
    }
    
    public void setFaxiiee(String faxiiee) {
        this.faxiiee = faxiiee;
    }
    public String getDirectoriiee() {
        return this.directoriiee;
    }
    
    public void setDirectoriiee(String directoriiee) {
        this.directoriiee = directoriiee;
    }
    public String getRutaautorizacion() {
        return this.rutaautorizacion;
    }
    
    public void setRutaautorizacion(String rutaautorizacion) {
        this.rutaautorizacion = rutaautorizacion;
    }
    public Date getFecRegistro() {
        return this.fecRegistro;
    }
    
    public void setFecRegistro(Date fecRegistro) {
        this.fecRegistro = fecRegistro;
    }
    public String getNombresdocente() {
        return this.nombresdocente;
    }
    
    public void setNombresdocente(String nombresdocente) {
        this.nombresdocente = nombresdocente;
    }
    public String getApellidosdocente() {
        return this.apellidosdocente;
    }
    
    public void setApellidosdocente(String apellidosdocente) {
        this.apellidosdocente = apellidosdocente;
    }
    public String getTelefonodocente() {
        return this.telefonodocente;
    }
    
    public void setTelefonodocente(String telefonodocente) {
        this.telefonodocente = telefonodocente;
    }
    public String getCorreodocente() {
        return this.correodocente;
    }
    
    public void setCorreodocente(String correodocente) {
        this.correodocente = correodocente;
    }
    public String getDirecciondocente() {
        return this.direcciondocente;
    }
    
    public void setDirecciondocente(String direcciondocente) {
        this.direcciondocente = direcciondocente;
    }
    public Date getFecValidacion() {
        return this.fecValidacion;
    }
    
    public void setFecValidacion(Date fecValidacion) {
        this.fecValidacion = fecValidacion;
    }




}


