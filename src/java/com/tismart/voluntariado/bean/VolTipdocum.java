package com.tismart.voluntariado.bean;
// Generated 26-feb-2016 9:56:41 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolTipdocum generated by hbm2java
 */
public class VolTipdocum  implements java.io.Serializable {


     private BigDecimal ideTipodocumento;
     private String descripcion;
     private String usucreacion;
     private Date fecCreacion;
     private String usumodificacion;
     private Date fecModificacion;
     private Set volVoluntarios = new HashSet(0);

    public VolTipdocum() {
    }

	
    public VolTipdocum(BigDecimal ideTipodocumento, String descripcion) {
        this.ideTipodocumento = ideTipodocumento;
        this.descripcion = descripcion;
    }
    public VolTipdocum(BigDecimal ideTipodocumento, String descripcion, String usucreacion, Date fecCreacion, String usumodificacion, Date fecModificacion, Set volVoluntarios) {
       this.ideTipodocumento = ideTipodocumento;
       this.descripcion = descripcion;
       this.usucreacion = usucreacion;
       this.fecCreacion = fecCreacion;
       this.usumodificacion = usumodificacion;
       this.fecModificacion = fecModificacion;
       this.volVoluntarios = volVoluntarios;
    }
   
    public BigDecimal getIdeTipodocumento() {
        return this.ideTipodocumento;
    }
    
    public void setIdeTipodocumento(BigDecimal ideTipodocumento) {
        this.ideTipodocumento = ideTipodocumento;
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


