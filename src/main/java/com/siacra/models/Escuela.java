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
 * @author SIACRA Development Team
 * @since 08-07-15
 * @version 1.0.0
 */

@Entity
@Table(name="escuela")
public class Escuela implements Serializable{

  
    @Id
    @Column(name="idescuela")
    @GeneratedValue
    private int idescuela; 
    
    @Column(name = "codigoescuela", nullable = false)
    private String codigoescuela; 
    
    @Column(name = "nombreescuela", nullable = false)
    private String nombreescuela; 
    
    @OneToMany(mappedBy="escuela")
    private Set<Docente> docente;
    
    public int getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(int idescuela) {
        this.idescuela = idescuela;
    }

    public String getCodigoescuela() {
        return codigoescuela;
    }

    public void setCodigoescuela(String codigoescuela) {
        this.codigoescuela = codigoescuela;
    }
    
    public String getNombreescuela() {
        return nombreescuela;
    }

    public void setNombreescuela(String nombreescuela) {
        this.nombreescuela = nombreescuela;
    }
    
     /**
     * Get Docente
     *
     * @return docente Set<Docente>
     */
    public Set<Docente> getDocente() {
        return docente;
    }
    
    /**
     * Set Docente
     *
     * @param docente Docente
     */
    public void setDocente(Set<Docente> docente) {
        this.docente = docente;
    }
    
    @Override
    public String toString() {
        StringBuilder strBuff = new StringBuilder();
        strBuff.append("idescuela : ").append(getIdescuela());
        strBuff.append(", codigoescuela : ").append(getCodigoescuela());
        strBuff.append(", nombreescuela : ").append(getNombreescuela());
        return strBuff.toString();               
    }    
    
}
