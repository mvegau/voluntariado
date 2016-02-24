package com.tismart.voluntariado.bean;
// Generated 24-feb-2016 11:24:26 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VolConfirmacion generated by hbm2java
 */
public class VolConfirmacion  implements java.io.Serializable {


     private String ideConfirmacion;
     private VolVoluntario volVoluntario;
     private VolEvento volEvento;
     private Date fechaconfirmacion;
     private Character indDisponibilidad;
     private Date fechadisponibilidad;

    public VolConfirmacion() {
    }

	
    public VolConfirmacion(String ideConfirmacion) {
        this.ideConfirmacion = ideConfirmacion;
    }
    public VolConfirmacion(String ideConfirmacion, VolVoluntario volVoluntario, VolEvento volEvento, Date fechaconfirmacion, Character indDisponibilidad, Date fechadisponibilidad) {
       this.ideConfirmacion = ideConfirmacion;
       this.volVoluntario = volVoluntario;
       this.volEvento = volEvento;
       this.fechaconfirmacion = fechaconfirmacion;
       this.indDisponibilidad = indDisponibilidad;
       this.fechadisponibilidad = fechadisponibilidad;
    }
   
    public String getIdeConfirmacion() {
        return this.ideConfirmacion;
    }
    
    public void setIdeConfirmacion(String ideConfirmacion) {
        this.ideConfirmacion = ideConfirmacion;
    }
    public VolVoluntario getVolVoluntario() {
        return this.volVoluntario;
    }
    
    public void setVolVoluntario(VolVoluntario volVoluntario) {
        this.volVoluntario = volVoluntario;
    }
    public VolEvento getVolEvento() {
        return this.volEvento;
    }
    
    public void setVolEvento(VolEvento volEvento) {
        this.volEvento = volEvento;
    }
    public Date getFechaconfirmacion() {
        return this.fechaconfirmacion;
    }
    
    public void setFechaconfirmacion(Date fechaconfirmacion) {
        this.fechaconfirmacion = fechaconfirmacion;
    }
    public Character getIndDisponibilidad() {
        return this.indDisponibilidad;
    }
    
    public void setIndDisponibilidad(Character indDisponibilidad) {
        this.indDisponibilidad = indDisponibilidad;
    }
    public Date getFechadisponibilidad() {
        return this.fechadisponibilidad;
    }
    
    public void setFechadisponibilidad(Date fechadisponibilidad) {
        this.fechadisponibilidad = fechadisponibilidad;
    }




}


