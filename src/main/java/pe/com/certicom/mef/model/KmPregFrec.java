package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the KM_PREG_FREC database table.
 * 
 */
@Entity
@Table(name="KM_PREG_FREC")
@NamedQuery(name="KmPregFrec.findAll", query="SELECT k FROM KmPregFrec k")
public class KmPregFrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PREG")
	private long idPreg;

	@Lob
	@Column(name="DE_PREGUNTA")
	private String dePregunta;

	@Lob
	@Column(name="DE_RESPUESTA")
	private String deRespuesta;

	@Column(name="ES_PREG")
	private String esPreg;

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

	//bi-directional many-to-one association to KmTmCenAtencion
	@ManyToOne
	@JoinColumn(name="ID_CENTRO")
	private KmTmCenAtencion kmTmCenAtencion;

	//bi-directional many-to-one association to KmTmRubroPre
	@ManyToOne
	@JoinColumn(name="ID_RUBRO")
	private KmTmRubroPre kmTmRubroPre;

	public KmPregFrec() {
	}

	public long getIdPreg() {
		return this.idPreg;
	}

	public void setIdPreg(long idPreg) {
		this.idPreg = idPreg;
	}

	public String getDePregunta() {
		return this.dePregunta;
	}

	public void setDePregunta(String dePregunta) {
		this.dePregunta = dePregunta;
	}

	public String getDeRespuesta() {
		return this.deRespuesta;
	}

	public void setDeRespuesta(String deRespuesta) {
		this.deRespuesta = deRespuesta;
	}

	public String getEsPreg() {
		return this.esPreg;
	}

	public void setEsPreg(String esPreg) {
		this.esPreg = esPreg;
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

	public KmTmCenAtencion getKmTmCenAtencion() {
		return this.kmTmCenAtencion;
	}

	public void setKmTmCenAtencion(KmTmCenAtencion kmTmCenAtencion) {
		this.kmTmCenAtencion = kmTmCenAtencion;
	}

	public KmTmRubroPre getKmTmRubroPre() {
		return this.kmTmRubroPre;
	}

	public void setKmTmRubroPre(KmTmRubroPre kmTmRubroPre) {
		this.kmTmRubroPre = kmTmRubroPre;
	}

}