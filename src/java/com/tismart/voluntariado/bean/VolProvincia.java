package com.tismart.voluntariado.bean;
// Generated 26-feb-2016 9:56:41 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * VolProvincia generated by hbm2java
 */
public class VolProvincia  implements java.io.Serializable {


     private BigDecimal codProvincia;
     private VolDepartamento volDepartamento;
     private String nombrepro;
     private Set volVoluntarios = new HashSet(0);
     private Set volDistritos = new HashSet(0);
     private Set volVolusespads = new HashSet(0);

    public VolProvincia() {
    }

	
    public VolProvincia(BigDecimal codProvincia) {
        this.codProvincia = codProvincia;
    }
    public VolProvincia(BigDecimal codProvincia, VolDepartamento volDepartamento, String nombrepro, Set volVoluntarios, Set volDistritos, Set volVolusespads) {
       this.codProvincia = codProvincia;
       this.volDepartamento = volDepartamento;
       this.nombrepro = nombrepro;
       this.volVoluntarios = volVoluntarios;
       this.volDistritos = volDistritos;
       this.volVolusespads = volVolusespads;
    }
   
    public BigDecimal getCodProvincia() {
        return this.codProvincia;
    }
    
    public void setCodProvincia(BigDecimal codProvincia) {
        this.codProvincia = codProvincia;
    }
    public VolDepartamento getVolDepartamento() {
        return this.volDepartamento;
    }
    
    public void setVolDepartamento(VolDepartamento volDepartamento) {
        this.volDepartamento = volDepartamento;
    }
    public String getNombrepro() {
        return this.nombrepro;
    }
    
    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }
    public Set getVolVoluntarios() {
        return this.volVoluntarios;
    }
    
    public void setVolVoluntarios(Set volVoluntarios) {
        this.volVoluntarios = volVoluntarios;
    }
    public Set getVolDistritos() {
        return this.volDistritos;
    }
    
    public void setVolDistritos(Set volDistritos) {
        this.volDistritos = volDistritos;
    }
    public Set getVolVolusespads() {
        return this.volVolusespads;
    }
    
    public void setVolVolusespads(Set volVolusespads) {
        this.volVolusespads = volVolusespads;
    }




}


