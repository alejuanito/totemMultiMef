package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the KM_TM_CEN_ATENCION database table.
 * 
 */
@Entity
@Table(name="KM_TM_CEN_ATENCION")
@NamedQuery(name="KmTmCenAtencion.findAll", query="SELECT k FROM KmTmCenAtencion k")
public class KmTmCenAtencion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CENTRO")
	private long idCentro;

	@Column(name="DESC_CENTRO")
	private String descCentro;

	@Column(name="DIREC_CENTRO")
	private String direcCentro;

	@Column(name="ES_CENTRO")
	private String esCentro;

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

	@Column(name="PASS_SERVER")
	private String passServer;

	@Column(name="PORT_SERVER")
	private BigDecimal portServer;

	private String server;

	@Column(name="USER_SERVER")
	private String userServer;

	//bi-directional many-to-one association to KmCapacitacione
	@OneToMany(mappedBy="kmTmCenAtencion")
	private List<KmCapacitacione> kmCapacitaciones;

	//bi-directional many-to-one association to KmCentroUser
	@OneToMany(mappedBy="kmTmCenAtencion")
	private List<KmCentroUser> kmCentroUsers;

	//bi-directional many-to-one association to KmInfoDireccion
	@OneToMany(mappedBy="kmTmCenAtencion")
	private List<KmInfoDireccion> kmInfoDireccions;

	//bi-directional many-to-one association to KmParametro
	@OneToMany(mappedBy="kmTmCenAtencion")
	private List<KmParametro> kmParametros;

	//bi-directional many-to-one association to KmPregFrec
	@OneToMany(mappedBy="kmTmCenAtencion")
	private List<KmPregFrec> kmPregFrecs;

	//bi-directional many-to-one association to KmTmKiosko
	@OneToMany(mappedBy="kmTmCenAtencion")
	private List<KmTmKiosko> kmTmKioskos;

	public KmTmCenAtencion() {
	}

	public long getIdCentro() {
		return this.idCentro;
	}

	public void setIdCentro(long idCentro) {
		this.idCentro = idCentro;
	}

	public String getDescCentro() {
		return this.descCentro;
	}

	public void setDescCentro(String descCentro) {
		this.descCentro = descCentro;
	}

	public String getDirecCentro() {
		return this.direcCentro;
	}

	public void setDirecCentro(String direcCentro) {
		this.direcCentro = direcCentro;
	}

	public String getEsCentro() {
		return this.esCentro;
	}

	public void setEsCentro(String esCentro) {
		this.esCentro = esCentro;
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

	public String getPassServer() {
		return this.passServer;
	}

	public void setPassServer(String passServer) {
		this.passServer = passServer;
	}

	public BigDecimal getPortServer() {
		return this.portServer;
	}

	public void setPortServer(BigDecimal portServer) {
		this.portServer = portServer;
	}

	public String getServer() {
		return this.server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getUserServer() {
		return this.userServer;
	}

	public void setUserServer(String userServer) {
		this.userServer = userServer;
	}

	public List<KmCapacitacione> getKmCapacitaciones() {
		return this.kmCapacitaciones;
	}

	public void setKmCapacitaciones(List<KmCapacitacione> kmCapacitaciones) {
		this.kmCapacitaciones = kmCapacitaciones;
	}

	public KmCapacitacione addKmCapacitacione(KmCapacitacione kmCapacitacione) {
		getKmCapacitaciones().add(kmCapacitacione);
		kmCapacitacione.setKmTmCenAtencion(this);

		return kmCapacitacione;
	}

	public KmCapacitacione removeKmCapacitacione(KmCapacitacione kmCapacitacione) {
		getKmCapacitaciones().remove(kmCapacitacione);
		kmCapacitacione.setKmTmCenAtencion(null);

		return kmCapacitacione;
	}

	public List<KmCentroUser> getKmCentroUsers() {
		return this.kmCentroUsers;
	}

	public void setKmCentroUsers(List<KmCentroUser> kmCentroUsers) {
		this.kmCentroUsers = kmCentroUsers;
	}

	public KmCentroUser addKmCentroUser(KmCentroUser kmCentroUser) {
		getKmCentroUsers().add(kmCentroUser);
		kmCentroUser.setKmTmCenAtencion(this);

		return kmCentroUser;
	}

	public KmCentroUser removeKmCentroUser(KmCentroUser kmCentroUser) {
		getKmCentroUsers().remove(kmCentroUser);
		kmCentroUser.setKmTmCenAtencion(null);

		return kmCentroUser;
	}

	public List<KmInfoDireccion> getKmInfoDireccions() {
		return this.kmInfoDireccions;
	}

	public void setKmInfoDireccions(List<KmInfoDireccion> kmInfoDireccions) {
		this.kmInfoDireccions = kmInfoDireccions;
	}

	public KmInfoDireccion addKmInfoDireccion(KmInfoDireccion kmInfoDireccion) {
		getKmInfoDireccions().add(kmInfoDireccion);
		kmInfoDireccion.setKmTmCenAtencion(this);

		return kmInfoDireccion;
	}

	public KmInfoDireccion removeKmInfoDireccion(KmInfoDireccion kmInfoDireccion) {
		getKmInfoDireccions().remove(kmInfoDireccion);
		kmInfoDireccion.setKmTmCenAtencion(null);

		return kmInfoDireccion;
	}

	public List<KmParametro> getKmParametros() {
		return this.kmParametros;
	}

	public void setKmParametros(List<KmParametro> kmParametros) {
		this.kmParametros = kmParametros;
	}

	public KmParametro addKmParametro(KmParametro kmParametro) {
		getKmParametros().add(kmParametro);
		kmParametro.setKmTmCenAtencion(this);

		return kmParametro;
	}

	public KmParametro removeKmParametro(KmParametro kmParametro) {
		getKmParametros().remove(kmParametro);
		kmParametro.setKmTmCenAtencion(null);

		return kmParametro;
	}

	public List<KmPregFrec> getKmPregFrecs() {
		return this.kmPregFrecs;
	}

	public void setKmPregFrecs(List<KmPregFrec> kmPregFrecs) {
		this.kmPregFrecs = kmPregFrecs;
	}

	public KmPregFrec addKmPregFrec(KmPregFrec kmPregFrec) {
		getKmPregFrecs().add(kmPregFrec);
		kmPregFrec.setKmTmCenAtencion(this);

		return kmPregFrec;
	}

	public KmPregFrec removeKmPregFrec(KmPregFrec kmPregFrec) {
		getKmPregFrecs().remove(kmPregFrec);
		kmPregFrec.setKmTmCenAtencion(null);

		return kmPregFrec;
	}

	public List<KmTmKiosko> getKmTmKioskos() {
		return this.kmTmKioskos;
	}

	public void setKmTmKioskos(List<KmTmKiosko> kmTmKioskos) {
		this.kmTmKioskos = kmTmKioskos;
	}

	public KmTmKiosko addKmTmKiosko(KmTmKiosko kmTmKiosko) {
		getKmTmKioskos().add(kmTmKiosko);
		kmTmKiosko.setKmTmCenAtencion(this);

		return kmTmKiosko;
	}

	public KmTmKiosko removeKmTmKiosko(KmTmKiosko kmTmKiosko) {
		getKmTmKioskos().remove(kmTmKiosko);
		kmTmKiosko.setKmTmCenAtencion(null);

		return kmTmKiosko;
	}

}