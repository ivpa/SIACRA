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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "grupo")
public class Grupo implements Serializable{
    
    @Id
    @GeneratedValue
    int idgrupo;
    
    @Column(name="cupo", nullable = true)
    int cupo;
    
    @Column(name = "numerogrupo", nullable = true )
    int numerogrupo;
    
    @Column(name = "", nullable = true)
    boolean aprobargrupo;
    
    @ManyToOne
    @JoinColumn(name="idtipogrupo")
    private TipoGrupo idtipogrupo;
    
    @OneToMany(mappedBy="idgrupo")
    private Set<Oferta> oferta;

    public int getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(int idgrupo) {
        this.idgrupo = idgrupo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getNumerogrupo() {
        return numerogrupo;
    }

    public void setNumerogrupo(int numerogrupo) {
        this.numerogrupo = numerogrupo;
    }

    public boolean isAprobargrupo() {
        return aprobargrupo;
    }

    public void setAprobargrupo(boolean aprobargrupo) {
        this.aprobargrupo = aprobargrupo;
    }

    public TipoGrupo getIdtipogrupo() {
        return idtipogrupo;
    }

    public void setIdtipogrupo(TipoGrupo idtipogrupo) {
        this.idtipogrupo = idtipogrupo;
    }
        
}
