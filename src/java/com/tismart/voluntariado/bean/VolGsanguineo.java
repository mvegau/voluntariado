package com.tismart.voluntariado.bean;
// Generated 22-feb-2016 14:53:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolGsanguineo generated by hbm2java
 */
public class VolGsanguineo  implements java.io.Serializable {


     private BigDecimal ideGruposangui;
     private Date fecModificacion;
     private String descripcion;
     private String usucreacion;
     private Date fecCreacion;
     private String usumodificacion;
     private Set volVoluntarios = new HashSet(0);

    public VolGsanguineo() {
    }

	
    public VolGsanguineo(BigDecimal ideGruposangui, String descripcion) {
        this.ideGruposangui = ideGruposangui;
        this.descripcion = descripcion;
    }
    public VolGsanguineo(BigDecimal ideGruposangui, Date fecModificacion, String descripcion, String usucreacion, Date fecCreacion, String usumodificacion, Set volVoluntarios) {
       this.ideGruposangui = ideGruposangui;
       this.fecModificacion = fecModificacion;
       this.descripcion = descripcion;
       this.usucreacion = usucreacion;
       this.fecCreacion = fecCreacion;
       this.usumodificacion = usumodificacion;
       this.volVoluntarios = volVoluntarios;
    }
   
    public BigDecimal getIdeGruposangui() {
        return this.ideGruposangui;
    }
    
    public void setIdeGruposangui(BigDecimal ideGruposangui) {
        this.ideGruposangui = ideGruposangui;
    }
    public Date getFecModificacion() {
        return this.fecModificacion;
    }
    
    public void setFecModificacion(Date fecModificacion) {
        this.fecModificacion = fecModificacion;
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
    public Set getVolVoluntarios() {
        return this.volVoluntarios;
    }
    
    public void setVolVoluntarios(Set volVoluntarios) {
        this.volVoluntarios = volVoluntarios;
    }




}


