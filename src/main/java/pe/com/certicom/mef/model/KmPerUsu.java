package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KM_PER_USU database table.
 * 
 */
@Entity
@Table(name="KM_PER_USU")
@NamedQuery(name="KmPerUsu.findAll", query="SELECT k FROM KmPerUsu k")
public class KmPerUsu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PER_USU")
	private long idPerUsu;

	//bi-directional many-to-one association to KmModulo
	@ManyToOne
	@JoinColumn(name="ID_MODULO")
	private KmModulo kmModulo;

	//bi-directional many-to-one association to KmTmUsuario
	@ManyToOne
	@JoinColumn(name="USERNAME")
	private KmTmUsuario kmTmUsuario;

	public KmPerUsu() {
	}

	public long getIdPerUsu() {
		return this.idPerUsu;
	}

	public void setIdPerUsu(long idPerUsu) {
		this.idPerUsu = idPerUsu;
	}

	public KmModulo getKmModulo() {
		return this.kmModulo;
	}

	public void setKmModulo(KmModulo kmModulo) {
		this.kmModulo = kmModulo;
	}

	public KmTmUsuario getKmTmUsuario() {
		return this.kmTmUsuario;
	}

	public void setKmTmUsuario(KmTmUsuario kmTmUsuario) {
		this.kmTmUsuario = kmTmUsuario;
	}

}