package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KM_USER_ROL database table.
 * 
 */
@Entity
@Table(name="KM_USER_ROL")
@NamedQuery(name="KmUserRol.findAll", query="SELECT k FROM KmUserRol k")
public class KmUserRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ROL_USER")
	private long idRolUser;

	@Column(name="\"ROLE\"")
	private String role;

	//bi-directional many-to-one association to KmTmUsuario
	@ManyToOne
	@JoinColumn(name="USERNAME")
	private KmTmUsuario kmTmUsuario;

	public KmUserRol() {
	}

	public long getIdRolUser() {
		return this.idRolUser;
	}

	public void setIdRolUser(long idRolUser) {
		this.idRolUser = idRolUser;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public KmTmUsuario getKmTmUsuario() {
		return this.kmTmUsuario;
	}

	public void setKmTmUsuario(KmTmUsuario kmTmUsuario) {
		this.kmTmUsuario = kmTmUsuario;
	}

}