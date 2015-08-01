/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siacra.beans;

import com.siacra.models.Grupo;
import com.siacra.models.TipoGrupo;
import com.siacra.services.TipoGrupoService;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**  
 *
 * @author Daniel
 */
@ManagedBean(name="docenteBean")
@ViewScoped
public class TipoGrupoBean implements Serializable {
    
    @ManagedProperty(value="#{TipoGrupoService}")
    private TipoGrupoService tipoGrupoService;
    
    private List<Grupo> gruposList;
    
    String idTipoGrupo;
    String nombreGrupo;

    public List<Grupo> getGruposList() {
        return gruposList;
    }

    public void setGruposList(List<Grupo> gruposList) {
        this.gruposList = gruposList;
    }

    public String getIdTipoGrupo() {
        return idTipoGrupo;
    }

    public void setIdTipoGrupo(String idTipoGrupo) {
        this.idTipoGrupo = idTipoGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public TipoGrupoService getTipoGrupoService() {
        return tipoGrupoService;
    }

    public void setTipoGrupoService(TipoGrupoService tipoGrupoService) {
        this.tipoGrupoService = tipoGrupoService;
    }
    
    public void addMessage(String mensaje) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    
    public void addTipoGrupo(){
        TipoGrupo tipoGrupo = new TipoGrupo();
        tipoGrupo.setIdTipoGrupo(idTipoGrupo);
        tipoGrupo.setNombreGrupo(nombreGrupo);
        
        getTipoGrupoService().getTipoGrupoById(idTipoGrupo);
    }
    
}
