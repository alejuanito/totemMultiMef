package pe.com.certicom.mef.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KM_PARAMETRO database table.
 * 
 */
@Entity
@Table(name="KM_PARAMETRO")
@NamedQuery(name="KmParametro.findAll", query="SELECT k FROM KmParametro k")
public class KmParametro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PARAMETRO")
	private long idParametro;

	@Column(name="PATH_FOLDER_IMAGE")
	private String pathFolderImage;

	@Column(name="PATH_FOLDER_VIDEO")
	private String pathFolderVideo;

	//bi-directional many-to-one association to KmTmCenAtencion
	@ManyToOne
	@JoinColumn(name="ID_CENTRO")
	private KmTmCenAtencion kmTmCenAtencion;

	public KmParametro() {
	}

	public long getIdParametro() {
		return this.idParametro;
	}

	public void setIdParametro(long idParametro) {
		this.idParametro = idParametro;
	}

	public String getPathFolderImage() {
		return this.pathFolderImage;
	}

	public void setPathFolderImage(String pathFolderImage) {
		this.pathFolderImage = pathFolderImage;
	}

	public String getPathFolderVideo() {
		return this.pathFolderVideo;
	}

	public void setPathFolderVideo(String pathFolderVideo) {
		this.pathFolderVideo = pathFolderVideo;
	}

	public KmTmCenAtencion getKmTmCenAtencion() {
		return this.kmTmCenAtencion;
	}

	public void setKmTmCenAtencion(KmTmCenAtencion kmTmCenAtencion) {
		this.kmTmCenAtencion = kmTmCenAtencion;
	}

}