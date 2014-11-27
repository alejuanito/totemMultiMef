package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the KM_LOG database table.
 * 
 */
@Entity
@Table(name="KM_LOG")
@NamedQuery(name="KmLog.findAll", query="SELECT k FROM KmLog k")
public class KmLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_LOG")
	private long idLog;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_CREA_REGISTRO")
	private Date feCreaRegistro;

	@Column(name="ID_CREA_REGISTRO")
	private String idCreaRegistro;

	@Column(name="IP_USUARIO")
	private String ipUsuario;

	private String origen;

	private String usuario;

	@Column(name="VAL_ANTERIOR")
	private String valAnterior;

	@Column(name="VAL_NUEVO")
	private String valNuevo;

	public KmLog() {
	}

	public long getIdLog() {
		return this.idLog;
	}

	public void setIdLog(long idLog) {
		this.idLog = idLog;
	}

	public Date getFeCreaRegistro() {
		return this.feCreaRegistro;
	}

	public void setFeCreaRegistro(Date feCreaRegistro) {
		this.feCreaRegistro = feCreaRegistro;
	}

	public String getIdCreaRegistro() {
		return this.idCreaRegistro;
	}

	public void setIdCreaRegistro(String idCreaRegistro) {
		this.idCreaRegistro = idCreaRegistro;
	}

	public String getIpUsuario() {
		return this.ipUsuario;
	}

	public void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getValAnterior() {
		return this.valAnterior;
	}

	public void setValAnterior(String valAnterior) {
		this.valAnterior = valAnterior;
	}

	public String getValNuevo() {
		return this.valNuevo;
	}

	public void setValNuevo(String valNuevo) {
		this.valNuevo = valNuevo;
	}

}