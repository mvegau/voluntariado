package com.tismart.voluntariado.bean;
// Generated 26-feb-2016 9:56:41 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * VolEvento generated by hbm2java
 */
public class VolEvento  implements java.io.Serializable {


     private BigDecimal ideEvento;
     private String usumodificacion;
     private Date fecModificacion;
     private String nombre;
     private String ubicacion;
     private Date fecinicio;
     private Date fecfin;
     private String descripcion;
     private Character indEstado;
     private Date fecCreacion;
     private String usucreacion;
     private String materialapoyo;
     private Character indSolicitavacuna;
     private Set volEvenvoluntDets = new HashSet(0);
     private Set volConfirmacions = new HashSet(0);

    public VolEvento() {
    }

	
    public VolEvento(BigDecimal ideEvento) {
        this.ideEvento = ideEvento;
    }
    public VolEvento(BigDecimal ideEvento, String usumodificacion, Date fecModificacion, String nombre, String ubicacion, Date fecinicio, Date fecfin, String descripcion, Character indEstado, Date fecCreacion, String usucreacion, String materialapoyo, Character indSolicitavacuna, Set volEvenvoluntDets, Set volConfirmacions) {
       this.ideEvento = ideEvento;
       this.usumodificacion = usumodificacion;
       this.fecModificacion = fecModificacion;
       this.nombre = nombre;
       this.ubicacion = ubicacion;
       this.fecinicio = fecinicio;
       this.fecfin = fecfin;
       this.descripcion = descripcion;
       this.indEstado = indEstado;
       this.fecCreacion = fecCreacion;
       this.usucreacion = usucreacion;
       this.materialapoyo = materialapoyo;
       this.indSolicitavacuna = indSolicitavacuna;
       this.volEvenvoluntDets = volEvenvoluntDets;
       this.volConfirmacions = volConfirmacions;
    }
   
    public BigDecimal getIdeEvento() {
        return this.ideEvento;
    }
    
    public void setIdeEvento(BigDecimal ideEvento) {
        this.ideEvento = ideEvento;
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
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Date getFecinicio() {
        return this.fecinicio;
    }
    
    public void setFecinicio(Date fecinicio) {
        this.fecinicio = fecinicio;
    }
    public Date getFecfin() {
        return this.fecfin;
    }
    
    public void setFecfin(Date fecfin) {
        this.fecfin = fecfin;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Character getIndEstado() {
        return this.indEstado;
    }
    
    public void setIndEstado(Character indEstado) {
        this.indEstado = indEstado;
    }
    public Date getFecCreacion() {
        return this.fecCreacion;
    }
    
    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
    }
    public String getUsucreacion() {
        return this.usucreacion;
    }
    
    public void setUsucreacion(String usucreacion) {
        this.usucreacion = usucreacion;
    }
    public String getMaterialapoyo() {
        return this.materialapoyo;
    }
    
    public void setMaterialapoyo(String materialapoyo) {
        this.materialapoyo = materialapoyo;
    }
    public Character getIndSolicitavacuna() {
        return this.indSolicitavacuna;
    }
    
    public void setIndSolicitavacuna(Character indSolicitavacuna) {
        this.indSolicitavacuna = indSolicitavacuna;
    }
    public Set getVolEvenvoluntDets() {
        return this.volEvenvoluntDets;
    }
    
    public void setVolEvenvoluntDets(Set volEvenvoluntDets) {
        this.volEvenvoluntDets = volEvenvoluntDets;
    }
    public Set getVolConfirmacions() {
        return this.volConfirmacions;
    }
    
    public void setVolConfirmacions(Set volConfirmacions) {
        this.volConfirmacions = volConfirmacions;
    }




}


