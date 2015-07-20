/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siacra.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name="tipogrupo")
public class TipoGrupo implements Serializable{
    
    @Id
    @GeneratedValue
    @Column(name="idtipogrupo", nullable=false)
    int idtipogrupo;
    
    @Column(name="tipodegrupo",nullable = false, length = 25)
    String tipodegrupo;

    public int getIdtipogrupo() {
        return idtipogrupo;
    }

    public void setIdtipogrupo(int idtipogrupo) {
        this.idtipogrupo = idtipogrupo;
    }

    public String getTipodegrupo() {
        return tipodegrupo;
    }

    public void setTipodegrupo(String tipodegrupo) {
        this.tipodegrupo = tipodegrupo;
    }
    
}
