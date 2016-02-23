package com.tismart.voluntariado.bean;
// Generated 22-feb-2016 14:53:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolCargo generated by hbm2java
 */
public class VolCargo  implements java.io.Serializable {


     private BigDecimal ideCargo;
     private String usumodificacion;
     private Date fecModificacion;
     private String nombre;
     private String usucreacion;
     private Date fecCreacion;
     private Set volUsuarios = new HashSet(0);

    public VolCargo() {
    }

	
    public VolCargo(BigDecimal ideCargo) {
        this.ideCargo = ideCargo;
    }
    public VolCargo(BigDecimal ideCargo, String usumodificacion, Date fecModificacion, String nombre, String usucreacion, Date fecCreacion, Set volUsuarios) {
       this.ideCargo = ideCargo;
       this.usumodificacion = usumodificacion;
       this.fecModificacion = fecModificacion;
       this.nombre = nombre;
       this.usucreacion = usucreacion;
       this.fecCreacion = fecCreacion;
       this.volUsuarios = volUsuarios;
    }
   
    public BigDecimal getIdeCargo() {
        return this.ideCargo;
    }
    
    public void setIdeCargo(BigDecimal ideCargo) {
        this.ideCargo = ideCargo;
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
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public Set getVolUsuarios() {
        return this.volUsuarios;
    }
    
    public void setVolUsuarios(Set volUsuarios) {
        this.volUsuarios = volUsuarios;
    }




}


