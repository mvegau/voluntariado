package com.tismart.voluntariado.bean;
// Generated 22-feb-2016 14:53:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolEstavolun generated by hbm2java
 */
public class VolEstavolun  implements java.io.Serializable {


     private BigDecimal ideEstadovoluntario;
     private String descripcion;
     private String usucreacion;
     private Date fecCreacion;
     private String usumodificacion;
     private Date fecMoficacion;
     private Set volVoluntarios = new HashSet(0);

    public VolEstavolun() {
    }

	
    public VolEstavolun(BigDecimal ideEstadovoluntario, String descripcion) {
        this.ideEstadovoluntario = ideEstadovoluntario;
        this.descripcion = descripcion;
    }
    public VolEstavolun(BigDecimal ideEstadovoluntario, String descripcion, String usucreacion, Date fecCreacion, String usumodificacion, Date fecMoficacion, Set volVoluntarios) {
       this.ideEstadovoluntario = ideEstadovoluntario;
       this.descripcion = descripcion;
       this.usucreacion = usucreacion;
       this.fecCreacion = fecCreacion;
       this.usumodificacion = usumodificacion;
       this.fecMoficacion = fecMoficacion;
       this.volVoluntarios = volVoluntarios;
    }
   
    public BigDecimal getIdeEstadovoluntario() {
        return this.ideEstadovoluntario;
    }
    
    public void setIdeEstadovoluntario(BigDecimal ideEstadovoluntario) {
        this.ideEstadovoluntario = ideEstadovoluntario;
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
    public Date getFecMoficacion() {
        return this.fecMoficacion;
    }
    
    public void setFecMoficacion(Date fecMoficacion) {
        this.fecMoficacion = fecMoficacion;
    }
    public Set getVolVoluntarios() {
        return this.volVoluntarios;
    }
    
    public void setVolVoluntarios(Set volVoluntarios) {
        this.volVoluntarios = volVoluntarios;
    }




}


