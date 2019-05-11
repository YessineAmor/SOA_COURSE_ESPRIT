package ws;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ChaineTelevise {
	private String nom;
	private String local;
	private List<Emission> emissions;

	public ChaineTelevise() {

	}

	public String getNom() {
		return nom;
	}

	@XmlAttribute
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLocal() {
		return local;
	}

	@XmlElement(required = true)
	public void setLocal(String local) {
		this.local = local;
	}

	public List<Emission> getEmissions() {
		return emissions;
	}

	@XmlElement(required = true)
	public void setEmissions(List<Emission> emissions) {
		this.emissions = emissions;
	}

}
