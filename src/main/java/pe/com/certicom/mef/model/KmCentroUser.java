package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KM_CENTRO_USER database table.
 * 
 */
@Entity
@Table(name="KM_CENTRO_USER")
@NamedQuery(name="KmCentroUser.findAll", query="SELECT k FROM KmCentroUser k")
public class KmCentroUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_USER_CENTRO")
	private long idUserCentro;

	//bi-directional many-to-one association to KmTmCenAtencion
	@ManyToOne
	@JoinColumn(name="ID_CENTRO")
	private KmTmCenAtencion kmTmCenAtencion;

	//bi-directional many-to-one association to KmTmUsuario
	@ManyToOne
	@JoinColumn(name="USERNAME")
	private KmTmUsuario kmTmUsuario;

	public KmCentroUser() {
	}

	public long getIdUserCentro() {
		return this.idUserCentro;
	}

	public void setIdUserCentro(long idUserCentro) {
		this.idUserCentro = idUserCentro;
	}

	public KmTmCenAtencion getKmTmCenAtencion() {
		return this.kmTmCenAtencion;
	}

	public void setKmTmCenAtencion(KmTmCenAtencion kmTmCenAtencion) {
		this.kmTmCenAtencion = kmTmCenAtencion;
	}

	public KmTmUsuario getKmTmUsuario() {
		return this.kmTmUsuario;
	}

	public void setKmTmUsuario(KmTmUsuario kmTmUsuario) {
		this.kmTmUsuario = kmTmUsuario;
	}

}