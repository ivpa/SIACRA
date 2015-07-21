/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siacra.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name="tipogrupo")
public class TipoGrupo implements Serializable{
    
    @Id
    @Column(name="idtipogrupo", nullable=false)
    String idtipogrupo;
    
    @Column(name="tipodegrupo",nullable = false, length = 25)
    String tipodegrupo;
    
    @OneToMany(mappedBy="idtipogrupo")
    private Set<Grupo> grupo;

    public String getIdtipogrupo() {
        return idtipogrupo;
    }

    public void setIdtipogrupo(String idtipogrupo) {
        this.idtipogrupo = idtipogrupo;
    }

    public String getTipodegrupo() {
        return tipodegrupo;
    }

    public void setTipodegrupo(String tipodegrupo) {
        this.tipodegrupo = tipodegrupo;
    }

    public Set<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(Set<Grupo> grupo) {
        this.grupo = grupo;
    }
    
    
    
}