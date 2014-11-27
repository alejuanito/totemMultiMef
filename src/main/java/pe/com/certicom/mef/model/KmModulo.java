package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the KM_MODULOS database table.
 * 
 */
@Entity
@Table(name="KM_MODULOS")
@NamedQuery(name="KmModulo.findAll", query="SELECT k FROM KmModulo k")
public class KmModulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_MOD")
	private long idMod;

	@Column(name="DE_MOD")
	private String deMod;

	@Column(name="ES_MOD")
	private String esMod;

	@Column(name="IS_ADMIN")
	private String isAdmin;

	@Column(name="IS_DIRECCION")
	private String isDireccion;

	@Column(name="PATH_MOD")
	private String pathMod;

	//bi-directional many-to-one association to KmPerUsu
	@OneToMany(mappedBy="kmModulo")
	private List<KmPerUsu> kmPerUsus;

	public KmModulo() {
	}

	public long getIdMod() {
		return this.idMod;
	}

	public void setIdMod(long idMod) {
		this.idMod = idMod;
	}

	public String getDeMod() {
		return this.deMod;
	}

	public void setDeMod(String deMod) {
		this.deMod = deMod;
	}

	public String getEsMod() {
		return this.esMod;
	}

	public void setEsMod(String esMod) {
		this.esMod = esMod;
	}

	public String getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getIsDireccion() {
		return this.isDireccion;
	}

	public void setIsDireccion(String isDireccion) {
		this.isDireccion = isDireccion;
	}

	public String getPathMod() {
		return this.pathMod;
	}

	public void setPathMod(String pathMod) {
		this.pathMod = pathMod;
	}

	public List<KmPerUsu> getKmPerUsus() {
		return this.kmPerUsus;
	}

	public void setKmPerUsus(List<KmPerUsu> kmPerUsus) {
		this.kmPerUsus = kmPerUsus;
	}

	public KmPerUsu addKmPerUsus(KmPerUsu kmPerUsus) {
		getKmPerUsus().add(kmPerUsus);
		kmPerUsus.setKmModulo(this);

		return kmPerUsus;
	}

	public KmPerUsu removeKmPerUsus(KmPerUsu kmPerUsus) {
		getKmPerUsus().remove(kmPerUsus);
		kmPerUsus.setKmModulo(null);

		return kmPerUsus;
	}

}