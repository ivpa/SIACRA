/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siacra.beans;

import com.siacra.models.TipoGrupo;
import com.siacra.services.TipoGrupoService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**  
 *
 * @author Daniel
 */
@ManagedBean(name="docenteBean")
@ViewScoped
public class TipoGrupoBean implements Serializable {
    
    @ManagedProperty(value="#{TipoGrupoService}")
    private TipoGrupoService tipoGrupoService;
    
    private List<TipoGrupo> tipoGrupoList;
    
    
}
