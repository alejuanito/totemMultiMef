package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the KM_TM_RUBRO_PRE database table.
 * 
 */
@Entity
@Table(name="KM_TM_RUBRO_PRE")
@NamedQuery(name="KmTmRubroPre.findAll", query="SELECT k FROM KmTmRubroPre k")
public class KmTmRubroPre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_RUBRO")
	private long idRubro;

	@Column(name="DE_RUBRO")
	private String deRubro;

	@Column(name="ES_RUBRO")
	private String esRubro;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_CREA_REGISTRO")
	private Date feCreaRegistro;

	@Temporal(TemporalType.DATE)
	@Column(name="FE_MOD_REGISTRO")
	private Date feModRegistro;

	//bi-directional many-to-one association to KmPregFrec
	@OneToMany(mappedBy="kmTmRubroPre")
	private List<KmPregFrec> kmPregFrecs;

	public KmTmRubroPre() {
	}

	public long getIdRubro() {
		return this.idRubro;
	}

	public void setIdRubro(long idRubro) {
		this.idRubro = idRubro;
	}

	public String getDeRubro() {
		return this.deRubro;
	}

	public void setDeRubro(String deRubro) {
		this.deRubro = deRubro;
	}

	public String getEsRubro() {
		return this.esRubro;
	}

	public void setEsRubro(String esRubro) {
		this.esRubro = esRubro;
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

	public List<KmPregFrec> getKmPregFrecs() {
		return this.kmPregFrecs;
	}

	public void setKmPregFrecs(List<KmPregFrec> kmPregFrecs) {
		this.kmPregFrecs = kmPregFrecs;
	}

	public KmPregFrec addKmPregFrec(KmPregFrec kmPregFrec) {
		getKmPregFrecs().add(kmPregFrec);
		kmPregFrec.setKmTmRubroPre(this);

		return kmPregFrec;
	}

	public KmPregFrec removeKmPregFrec(KmPregFrec kmPregFrec) {
		getKmPregFrecs().remove(kmPregFrec);
		kmPregFrec.setKmTmRubroPre(null);

		return kmPregFrec;
	}

}