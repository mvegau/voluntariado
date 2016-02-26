package com.tismart.voluntariado.bean;
// Generated 26-feb-2016 9:56:41 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolUsuario generated by hbm2java
 */
public class VolUsuario  implements java.io.Serializable {


     private BigDecimal ideUsuario;
     private VolPerfil volPerfil;
     private VolCargo volCargo;
     private Date fecModificacion;
     private String nombre;
     private String password;
     private Date fecCreacion;
     private String apellidos;
     private String correo;
     private String telefonos;
     private String usucreacion;
     private String numDocumento;
     private String usumodificacion;
     private BigDecimal indDesactivo;
     private Set volDepartamentos = new HashSet(0);

    public VolUsuario() {
    }

	
    public VolUsuario(BigDecimal ideUsuario) {
        this.ideUsuario = ideUsuario;
    }
    public VolUsuario(BigDecimal ideUsuario, VolPerfil volPerfil, VolCargo volCargo, Date fecModificacion, String nombre, String password, Date fecCreacion, String apellidos, String correo, String telefonos, String usucreacion, String numDocumento, String usumodificacion, BigDecimal indDesactivo, Set volDepartamentos) {
       this.ideUsuario = ideUsuario;
       this.volPerfil = volPerfil;
       this.volCargo = volCargo;
       this.fecModificacion = fecModificacion;
       this.nombre = nombre;
       this.password = password;
       this.fecCreacion = fecCreacion;
       this.apellidos = apellidos;
       this.correo = correo;
       this.telefonos = telefonos;
       this.usucreacion = usucreacion;
       this.numDocumento = numDocumento;
       this.usumodificacion = usumodificacion;
       this.indDesactivo = indDesactivo;
       this.volDepartamentos = volDepartamentos;
    }
   
    public BigDecimal getIdeUsuario() {
        return this.ideUsuario;
    }
    
    public void setIdeUsuario(BigDecimal ideUsuario) {
        this.ideUsuario = ideUsuario;
    }
    public VolPerfil getVolPerfil() {
        return this.volPerfil;
    }
    
    public void setVolPerfil(VolPerfil volPerfil) {
        this.volPerfil = volPerfil;
    }
    public VolCargo getVolCargo() {
        return this.volCargo;
    }
    
    public void setVolCargo(VolCargo volCargo) {
        this.volCargo = volCargo;
    }
    public Date getFecModificacion() {
        return this.fecModificacion;
    }
    
    public void setFecModificacion(Date fecModificacion) {
        this.fecModificacion = fecModificacion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getFecCreacion() {
        return this.fecCreacion;
    }
    
    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefonos() {
        return this.telefonos;
    }
    
    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }
    public String getUsucreacion() {
        return this.usucreacion;
    }
    
    public void setUsucreacion(String usucreacion) {
        this.usucreacion = usucreacion;
    }
    public String getNumDocumento() {
        return this.numDocumento;
    }
    
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    public String getUsumodificacion() {
        return this.usumodificacion;
    }
    
    public void setUsumodificacion(String usumodificacion) {
        this.usumodificacion = usumodificacion;
    }
    public BigDecimal getIndDesactivo() {
        return this.indDesactivo;
    }
    
    public void setIndDesactivo(BigDecimal indDesactivo) {
        this.indDesactivo = indDesactivo;
    }
    public Set getVolDepartamentos() {
        return this.volDepartamentos;
    }
    
    public void setVolDepartamentos(Set volDepartamentos) {
        this.volDepartamentos = volDepartamentos;
    }




}


