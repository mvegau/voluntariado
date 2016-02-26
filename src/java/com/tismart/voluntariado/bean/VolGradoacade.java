package com.tismart.voluntariado.bean;
// Generated 26-feb-2016 9:56:41 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolGradoacade generated by hbm2java
 */
public class VolGradoacade  implements java.io.Serializable {


     private BigDecimal ideGradoacademico;
     private String descripcion;
     private String usucreacion;
     private Date fecCreacion;
     private String usumodificacion;
     private String fecModificacion;
     private Set volVolusespads = new HashSet(0);
     private Set volVoluntarios = new HashSet(0);

    public VolGradoacade() {
    }

	
    public VolGradoacade(BigDecimal ideGradoacademico, String descripcion) {
        this.ideGradoacademico = ideGradoacademico;
        this.descripcion = descripcion;
    }
    public VolGradoacade(BigDecimal ideGradoacademico, String descripcion, String usucreacion, Date fecCreacion, String usumodificacion, String fecModificacion, Set volVolusespads, Set volVoluntarios) {
       this.ideGradoacademico = ideGradoacademico;
       this.descripcion = descripcion;
       this.usucreacion = usucreacion;
       this.fecCreacion = fecCreacion;
       this.usumodificacion = usumodificacion;
       this.fecModificacion = fecModificacion;
       this.volVolusespads = volVolusespads;
       this.volVoluntarios = volVoluntarios;
    }
   
    public BigDecimal getIdeGradoacademico() {
        return this.ideGradoacademico;
    }
    
    public void setIdeGradoacademico(BigDecimal ideGradoacademico) {
        this.ideGradoacademico = ideGradoacademico;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUsucreacion() {
        return this.usucreacion;
    }
    
    public void setUsucreacion(String usucreacion) {
        this.usucreacion = usucreacion;
    }
    public Date getFecCreacion() {
        return this.fecCreacion;
    }
    
    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
    }
    public String getUsumodificacion() {
        return this.usumodificacion;
    }
    
    public void setUsumodificacion(String usumodificacion) {
        this.usumodificacion = usumodificacion;
    }
    public String getFecModificacion() {
        return this.fecModificacion;
    }
    
    public void setFecModificacion(String fecModificacion) {
        this.fecModificacion = fecModificacion;
    }
    public Set getVolVolusespads() {
        return this.volVolusespads;
    }
    
    public void setVolVolusespads(Set volVolusespads) {
        this.volVolusespads = volVolusespads;
    }
    public Set getVolVoluntarios() {
        return this.volVoluntarios;
    }
    
    public void setVolVoluntarios(Set volVoluntarios) {
        this.volVoluntarios = volVoluntarios;
    }




}


