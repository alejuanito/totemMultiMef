package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the KM_TM_KIOSKO database table.
 * 
 */
@Entity
@Table(name="KM_TM_KIOSKO")
@NamedQuery(name="KmTmKiosko.findAll", query="SELECT k FROM KmTmKiosko k")
public class KmTmKiosko implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_KIOSKO")
	private long idKiosko;

	@Column(name="DE_KIOSKO")
	private String deKiosko;

	@Column(name="ES_KIOSKO")
	private String esKiosko;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_CREA_REGISTRO")
	private Date feCreaRegistro;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_MOD_REGISTRO")
	private Date feModRegistro;

	@Column(name="ID_CREA_REGISTRO")
	private BigDecimal idCreaRegistro;

	@Column(name="ID_MOD_REGISTRO")
	private BigDecimal idModRegistro;

	@Column(name="IP_KIOSKO")
	private String ipKiosko;

	//bi-directional many-to-one association to KmAtencion
	@OneToMany(mappedBy="kmTmKiosko")
	private List<KmAtencion> kmAtencions;

	//bi-directional many-to-one association to KmTmCenAtencion
	@ManyToOne
	@JoinColumn(name="ID_CENTRO")
	private KmTmCenAtencion kmTmCenAtencion;

	public KmTmKiosko() {
	}

	public long getIdKiosko() {
		return this.idKiosko;
	}

	public void setIdKiosko(long idKiosko) {
		this.idKiosko = idKiosko;
	}

	public String getDeKiosko() {
		return this.deKiosko;
	}

	public void setDeKiosko(String deKiosko) {
		this.deKiosko = deKiosko;
	}

	public String getEsKiosko() {
		return this.esKiosko;
	}

	public void setEsKiosko(String esKiosko) {
		this.esKiosko = esKiosko;
	}

	public Date getFeCreaRegistro() {
		return this.feCreaRegistro;
	}

	public void setFeCreaRegistro(Date feCreaRegistro) {
		this.feCreaRegistro = feCreaRegistro;
	}

	public Date getFeModRegistro() {
		return this.feModRegistro;
	}

	public void setFeModRegistro(Date feModRegistro) {
		this.feModRegistro = feModRegistro;
	}

	public BigDecimal getIdCreaRegistro() {
		return this.idCreaRegistro;
	}

	public void setIdCreaRegistro(BigDecimal idCreaRegistro) {
		this.idCreaRegistro = idCreaRegistro;
	}

	public BigDecimal getIdModRegistro() {
		return this.idModRegistro;
	}

	public void setIdModRegistro(BigDecimal idModRegistro) {
		this.idModRegistro = idModRegistro;
	}

	public String getIpKiosko() {
		return this.ipKiosko;
	}

	public void setIpKiosko(String ipKiosko) {
		this.ipKiosko = ipKiosko;
	}

	public List<KmAtencion> getKmAtencions() {
		return this.kmAtencions;
	}

	public void setKmAtencions(List<KmAtencion> kmAtencions) {
		this.kmAtencions = kmAtencions;
	}

	public KmAtencion addKmAtencion(KmAtencion kmAtencion) {
		getKmAtencions().add(kmAtencion);
		kmAtencion.setKmTmKiosko(this);

		return kmAtencion;
	}

	public KmAtencion removeKmAtencion(KmAtencion kmAtencion) {
		getKmAtencions().remove(kmAtencion);
		kmAtencion.setKmTmKiosko(null);

		return kmAtencion;
	}

	public KmTmCenAtencion getKmTmCenAtencion() {
		return this.kmTmCenAtencion;
	}

	public void setKmTmCenAtencion(KmTmCenAtencion kmTmCenAtencion) {
		this.kmTmCenAtencion = kmTmCenAtencion;
	}

}