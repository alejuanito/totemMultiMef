package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the KM_TM_USUARIO database table.
 * 
 */
@Entity
@Table(name="KM_TM_USUARIO")
@NamedQuery(name="KmTmUsuario.findAll", query="SELECT k FROM KmTmUsuario k")
public class KmTmUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String username;

	@Column(name="AM_USUARIO")
	private String amUsuario;

	@Column(name="AP_USUARIO")
	private String apUsuario;

	private String dni;

	private String enabled;

	@Column(name="ES_USUARIO")
	private String esUsuario;

	@Column(name="NO_USUARIO")
	private String noUsuario;

	private String password;

	//bi-directional many-to-one association to KmCentroUser
	@OneToMany(mappedBy="kmTmUsuario")
	private List<KmCentroUser> kmCentroUsers;

	//bi-directional many-to-one association to KmPerUsu
	@OneToMany(mappedBy="kmTmUsuario")
	private List<KmPerUsu> kmPerUsus;

	//bi-directional many-to-one association to KmUserRol
	@OneToMany(mappedBy="kmTmUsuario")
	private List<KmUserRol> kmUserRols;

	public KmTmUsuario() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAmUsuario() {
		return this.amUsuario;
	}

	public void setAmUsuario(String amUsuario) {
		this.amUsuario = amUsuario;
	}

	public String getApUsuario() {
		return this.apUsuario;
	}

	public void setApUsuario(String apUsuario) {
		this.apUsuario = apUsuario;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getEsUsuario() {
		return this.esUsuario;
	}

	public void setEsUsuario(String esUsuario) {
		this.esUsuario = esUsuario;
	}

	public String getNoUsuario() {
		return this.noUsuario;
	}

	public void setNoUsuario(String noUsuario) {
		this.noUsuario = noUsuario;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<KmCentroUser> getKmCentroUsers() {
		return this.kmCentroUsers;
	}

	public void setKmCentroUsers(List<KmCentroUser> kmCentroUsers) {
		this.kmCentroUsers = kmCentroUsers;
	}

	public KmCentroUser addKmCentroUser(KmCentroUser kmCentroUser) {
		getKmCentroUsers().add(kmCentroUser);
		kmCentroUser.setKmTmUsuario(this);

		return kmCentroUser;
	}

	public KmCentroUser removeKmCentroUser(KmCentroUser kmCentroUser) {
		getKmCentroUsers().remove(kmCentroUser);
		kmCentroUser.setKmTmUsuario(null);

		return kmCentroUser;
	}

	public List<KmPerUsu> getKmPerUsus() {
		return this.kmPerUsus;
	}

	public void setKmPerUsus(List<KmPerUsu> kmPerUsus) {
		this.kmPerUsus = kmPerUsus;
	}

	public KmPerUsu addKmPerUsus(KmPerUsu kmPerUsus) {
		getKmPerUsus().add(kmPerUsus);
		kmPerUsus.setKmTmUsuario(this);

		return kmPerUsus;
	}

	public KmPerUsu removeKmPerUsus(KmPerUsu kmPerUsus) {
		getKmPerUsus().remove(kmPerUsus);
		kmPerUsus.setKmTmUsuario(null);

		return kmPerUsus;
	}

	public List<KmUserRol> getKmUserRols() {
		return this.kmUserRols;
	}

	public void setKmUserRols(List<KmUserRol> kmUserRols) {
		this.kmUserRols = kmUserRols;
	}

	public KmUserRol addKmUserRol(KmUserRol kmUserRol) {
		getKmUserRols().add(kmUserRol);
		kmUserRol.setKmTmUsuario(this);

		return kmUserRol;
	}

	public KmUserRol removeKmUserRol(KmUserRol kmUserRol) {
		getKmUserRols().remove(kmUserRol);
		kmUserRol.setKmTmUsuario(null);

		return kmUserRol;
	}

}