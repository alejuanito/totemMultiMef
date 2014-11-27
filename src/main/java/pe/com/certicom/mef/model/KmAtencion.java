package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the KM_ATENCION database table.
 * 
 */
@Entity
@Table(name="KM_ATENCION")
@NamedQuery(name="KmAtencion.findAll", query="SELECT k FROM KmAtencion k")
public class KmAtencion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ATENCION")
	private long idAtencion;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_ATENCION")
	private Date feAtencion;

	//bi-directional many-to-one association to KmTmKiosko
	@ManyToOne
	@JoinColumn(name="ID_KIOSKO")
	private KmTmKiosko kmTmKiosko;

	public KmAtencion() {
	}

	public long getIdAtencion() {
		return this.idAtencion;
	}

	public void setIdAtencion(long idAtencion) {
		this.idAtencion = idAtencion;
	}

	public Date getFeAtencion() {
		return this.feAtencion;
	}

	public void setFeAtencion(Date feAtencion) {
		this.feAtencion = feAtencion;
	}

	public KmTmKiosko getKmTmKiosko() {
		return this.kmTmKiosko;
	}

	public void setKmTmKiosko(KmTmKiosko kmTmKiosko) {
		this.kmTmKiosko = kmTmKiosko;
	}

}