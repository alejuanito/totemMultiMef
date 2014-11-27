package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the KM_INFO_DIRECCION database table.
 * 
 */
@Entity
@Table(name="KM_INFO_DIRECCION")
@NamedQuery(name="KmInfoDireccion.findAll", query="SELECT k FROM KmInfoDireccion k")
public class KmInfoDireccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_INFO")
	private long idInfo;

	@Lob
	@Column(name="CONC_BASICO")
	private String concBasico;

	@Lob
	@Column(name="DE_FUNCIONES")
	private String deFunciones;

	@Column(name="ES_INFO")
	private String esInfo;

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

	@Lob
	private String norma;

	@Lob
	private String novedades;

	//bi-directional many-to-one association to KmFilesDire
	@OneToMany(mappedBy="kmInfoDireccion")
	private List<KmFilesDire> kmFilesDires;

	//bi-directional many-to-one association to KmTmCenAtencion
	@ManyToOne
	@JoinColumn(name="ID_CENTRO")
	private KmTmCenAtencion kmTmCenAtencion;

	public KmInfoDireccion() {
	}

	public long getIdInfo() {
		return this.idInfo;
	}

	public void setIdInfo(long idInfo) {
		this.idInfo = idInfo;
	}

	public String getConcBasico() {
		return this.concBasico;
	}

	public void setConcBasico(String concBasico) {
		this.concBasico = concBasico;
	}

	public String getDeFunciones() {
		return this.deFunciones;
	}

	public void setDeFunciones(String deFunciones) {
		this.deFunciones = deFunciones;
	}

	public String getEsInfo() {
		return this.esInfo;
	}

	public void setEsInfo(String esInfo) {
		this.esInfo = esInfo;
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

	public String getNorma() {
		return this.norma;
	}

	public void setNorma(String norma) {
		this.norma = norma;
	}

	public String getNovedades() {
		return this.novedades;
	}

	public void setNovedades(String novedades) {
		this.novedades = novedades;
	}

	public List<KmFilesDire> getKmFilesDires() {
		return this.kmFilesDires;
	}

	public void setKmFilesDires(List<KmFilesDire> kmFilesDires) {
		this.kmFilesDires = kmFilesDires;
	}

	public KmFilesDire addKmFilesDire(KmFilesDire kmFilesDire) {
		getKmFilesDires().add(kmFilesDire);
		kmFilesDire.setKmInfoDireccion(this);

		return kmFilesDire;
	}

	public KmFilesDire removeKmFilesDire(KmFilesDire kmFilesDire) {
		getKmFilesDires().remove(kmFilesDire);
		kmFilesDire.setKmInfoDireccion(null);

		return kmFilesDire;
	}

	public KmTmCenAtencion getKmTmCenAtencion() {
		return this.kmTmCenAtencion;
	}

	public void setKmTmCenAtencion(KmTmCenAtencion kmTmCenAtencion) {
		this.kmTmCenAtencion = kmTmCenAtencion;
	}

}