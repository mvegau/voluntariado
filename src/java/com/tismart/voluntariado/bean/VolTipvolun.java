package com.tismart.voluntariado.bean;
// Generated 24-feb-2016 11:24:26 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolTipvolun generated by hbm2java
 */
public class VolTipvolun  implements java.io.Serializable {


     private BigDecimal ideTipovoluntario;
     private String descripcion;
     private String usucreacion;
     private Date fecCreacion;
     private String usumodificacion;
     private Date fecModificacion;
     private Set volVoluntarios = new HashSet(0);

    public VolTipvolun() {
    }

	
    public VolTipvolun(BigDecimal ideTipovoluntario, String descripcion) {
        this.ideTipovoluntario = ideTipovoluntario;
        this.descripcion = descripcion;
    }
    public VolTipvolun(BigDecimal ideTipovoluntario, String descripcion, String usucreacion, Date fecCreacion, String usumodificacion, Date fecModificacion, Set volVoluntarios) {
       this.ideTipovoluntario = ideTipovoluntario;
       this.descripcion = descripcion;
       this.usucreacion = usucreacion;
       this.fecCreacion = fecCreacion;
       this.usumodificacion = usumodificacion;
       this.fecModificacion = fecModificacion;
       this.volVoluntarios = volVoluntarios;
    }
   
    public BigDecimal getIdeTipovoluntario() {
        return this.ideTipovoluntario;
    }
    
    public void setIdeTipovoluntario(BigDecimal ideTipovoluntario) {
        this.ideTipovoluntario = ideTipovoluntario;
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
    public Date getFecModificacion() {
        return this.fecModificacion;
    }
    
    public void setFecModificacion(Date fecModificacion) {
        this.fecModificacion = fecModificacion;
    }
    public Set getVolVoluntarios() {
        return this.volVoluntarios;
    }
    
    public void setVolVoluntarios(Set volVoluntarios) {
        this.volVoluntarios = volVoluntarios;
    }




}


