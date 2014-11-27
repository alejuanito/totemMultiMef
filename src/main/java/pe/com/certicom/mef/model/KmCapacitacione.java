package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the KM_CAPACITACIONES database table.
 * 
 */
@Entity
@Table(name="KM_CAPACITACIONES")
@NamedQuery(name="KmCapacitacione.findAll", query="SELECT k FROM KmCapacitacione k")
public class KmCapacitacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CAPAC")
	private long idCapac;

	@Column(name="ANIO_CAPAC")
	private String anioCapac;

	@Lob
	@Column(name="DE_CAPAC")
	private String deCapac;

	@Column(name="DIA_CAPAC")
	private BigDecimal diaCapac;

	@Column(name="ES_CAP")
	private String esCap;

	@Temporal(TemporalType.DATE)
	@Column(name="FEC_CAPAC")
	private Date fecCapac;

	@Temporal(TemporalType.DATE)
	@Column(name="HORA_CAPAC")
	private Date horaCapac;

	@Column(name="MES_CAPAC")
	private String mesCapac;

	@Column(name="PATH_IMAGE")
	private String pathImage;

	@Column(name="PATH_VIDEO")
	private String pathVideo;

	@Column(name="TI_CAPAC")
	private String tiCapac;

	//bi-directional many-to-one association to KmTmCenAtencion
	@ManyToOne
	@JoinColumn(name="ID_CENTRO")
	private KmTmCenAtencion kmTmCenAtencion;

	public KmCapacitacione() {
	}

	public long getIdCapac() {
		return this.idCapac;
	}

	public void setIdCapac(long idCapac) {
		this.idCapac = idCapac;
	}

	public String getAnioCapac() {
		return this.anioCapac;
	}

	public void setAnioCapac(String anioCapac) {
		this.anioCapac = anioCapac;
	}

	public String getDeCapac() {
		return this.deCapac;
	}

	public void setDeCapac(String deCapac) {
		this.deCapac = deCapac;
	}

	public BigDecimal getDiaCapac() {
		return this.diaCapac;
	}

	public void setDiaCapac(BigDecimal diaCapac) {
		this.diaCapac = diaCapac;
	}

	public String getEsCap() {
		return this.esCap;
	}

	public void setEsCap(String esCap) {
		this.esCap = esCap;
	}

	public Date getFecCapac() {
		return this.fecCapac;
	}

	public void setFecCapac(Date fecCapac) {
		this.fecCapac = fecCapac;
	}

	public Date getHoraCapac() {
		return this.horaCapac;
	}

	public void setHoraCapac(Date horaCapac) {
		this.horaCapac = horaCapac;
	}

	public String getMesCapac() {
		return this.mesCapac;
	}

	public void setMesCapac(String mesCapac) {
		this.mesCapac = mesCapac;
	}

	public String getPathImage() {
		return this.pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}

	public String getPathVideo() {
		return this.pathVideo;
	}

	public void setPathVideo(String pathVideo) {
		this.pathVideo = pathVideo;
	}

	public String getTiCapac() {
		return this.tiCapac;
	}

	public void setTiCapac(String tiCapac) {
		this.tiCapac = tiCapac;
	}

	public KmTmCenAtencion getKmTmCenAtencion() {
		return this.kmTmCenAtencion;
	}

	public void setKmTmCenAtencion(KmTmCenAtencion kmTmCenAtencion) {
		this.kmTmCenAtencion = kmTmCenAtencion;
	}

}