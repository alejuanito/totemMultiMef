package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the KM_FILES_DIRE database table.
 * 
 */
@Entity
@Table(name="KM_FILES_DIRE")
@NamedQuery(name="KmFilesDire.findAll", query="SELECT k FROM KmFilesDire k")
public class KmFilesDire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_FILE")
	private long idFile;

	@Column(name="CO_TIPO")
	private String coTipo;

	@Column(name="ES_FILE")
	private String esFile;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_CREA_REGISTRO")
	private Date feCreaRegistro;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_MOD_REGISTRO")
	private Date feModRegistro;

	@Column(name="NOM_FILE")
	private String nomFile;

	@Column(name="\"PATH\"")
	private String path;

	private String tipo;

	//bi-directional many-to-one association to KmInfoDireccion
	@ManyToOne
	@JoinColumn(name="ID_INFO")
	private KmInfoDireccion kmInfoDireccion;

	public KmFilesDire() {
	}

	public long getIdFile() {
		return this.idFile;
	}

	public void setIdFile(long idFile) {
		this.idFile = idFile;
	}

	public String getCoTipo() {
		return this.coTipo;
	}

	public void setCoTipo(String coTipo) {
		this.coTipo = coTipo;
	}

	public String getEsFile() {
		return this.esFile;
	}

	public void setEsFile(String esFile) {
		this.esFile = esFile;
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

	public String getNomFile() {
		return this.nomFile;
	}

	public void setNomFile(String nomFile) {
		this.nomFile = nomFile;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public KmInfoDireccion getKmInfoDireccion() {
		return this.kmInfoDireccion;
	}

	public void setKmInfoDireccion(KmInfoDireccion kmInfoDireccion) {
		this.kmInfoDireccion = kmInfoDireccion;
	}

}