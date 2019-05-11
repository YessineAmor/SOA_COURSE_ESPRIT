package ws;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Emission {
	private Animateur animateur;
	private String heureDiffusion;
	private String jourDiffusion;
	private String nom;

	public Emission() {

	}

	public String getNom() {
		return nom;
	}

	@XmlAttribute
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animateur getAnimateur() {
		return animateur;
	}

	@XmlElement(required = true)
	public void setAnimateur(Animateur animateur) {
		this.animateur = animateur;
	}

	public String getHeureDiffusion() {
		return heureDiffusion;
	}

	@XmlElement(required = true)
	public void setHeureDiffusion(String heureDiffusion) {
		this.heureDiffusion = heureDiffusion;
	}

	public String getJourDiffusion() {
		return jourDiffusion;
	}

	@XmlElement(required = true)
	public void setJourDiffusion(String jourDiffusion) {
		this.jourDiffusion = jourDiffusion;
	}

}
