package com.siacra.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * User Entity
 *
 * @author SIACRA Development Team
 * @since 16-07-15
 * @version 1.0.0
 *
 */

@Entity
@Table(name = "usuario")
public class User {
        
        @Id
        @GeneratedValue
	@Column(name = "idusuario", unique = true, nullable = false)
        private int idUsuario;
        
        @Column(name = "nombreusuario", nullable = false, length = 30)
	private String nombreUsuario;
        
        @Column(name = "contrasenia", nullable = false, length = 30)
	private String contrasenia;
        
        @Column(name = "nombres", nullable = false, length = 50)
        private String nombres;

        @Column(name = "apellidos", nullable = false, length = 50)
        private String apellidos;
        
        @Column(name = "estadousuario", nullable = false)
	private int estadoUsuario;
        
        @ManyToOne
        @JoinColumn(name="idnivelacceso")
	private NivelAcceso nivel;

	public int getIdUsuario() {
		return this.idUsuario;
	}
 
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
        
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}
 
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
        
	public String getContrasenia() {
		return this.contrasenia;
	}
 
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
        
	public String getNombres() {
		return this.nombres;
	}
 
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
        
	public String getApellidos() {
		return this.apellidos;
	}
 
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
        
	public int getEstadoUsuario() {
		return this.estadoUsuario;
	}
 
	public void setEstadoUsuario(int estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}
        
	public NivelAcceso getNivel() {
		return this.nivel;
	}
 
	public void setNivel(NivelAcceso nivel) {
		this.nivel = nivel;
	}
        
 
}