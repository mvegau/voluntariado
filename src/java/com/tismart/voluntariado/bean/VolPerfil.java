package com.tismart.voluntariado.bean;
// Generated 22-feb-2016 14:53:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolPerfil generated by hbm2java
 */
public class VolPerfil  implements java.io.Serializable {


     private BigDecimal idePerfil;
     private String descripcion;
     private String usucreacion;
     private Date fecCreacion;
     private String usumodificacion;
     private Date fecModificacion;
     private Set volUsuarios = new HashSet(0);

    public VolPerfil() {
    }

	
    public VolPerfil(BigDecimal idePerfil, String descripcion) {
        this.idePerfil = idePerfil;
        this.descripcion = descripcion;
    }
    public VolPerfil(BigDecimal idePerfil, String descripcion, String usucreacion, Date fecCreacion, String usumodificacion, Date fecModificacion, Set volUsuarios) {
       this.idePerfil = idePerfil;
       this.descripcion = descripcion;
       this.usucreacion = usucreacion;
       this.fecCreacion = fecCreacion;
       this.usumodificacion = usumodificacion;
       this.fecModificacion = fecModificacion;
       this.volUsuarios = volUsuarios;
    }
   
    public BigDecimal getIdePerfil() {
        return this.idePerfil;
    }
    
    public void setIdePerfil(BigDecimal idePerfil) {
        this.idePerfil = idePerfil;
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
    public Set getVolUsuarios() {
        return this.volUsuarios;
    }
    
    public void setVolUsuarios(Set volUsuarios) {
        this.volUsuarios = volUsuarios;
    }




}


