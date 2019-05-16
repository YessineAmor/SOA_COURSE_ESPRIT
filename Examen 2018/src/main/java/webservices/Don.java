package webservices;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Don {
	private int id;
	private String donateur;
	private String typeNour;
	private int poids;
	private String etat;

	public int getId() {
		return id;
	}

	@XmlAttribute(name = "id")
	public void setId(int id) {
		this.id = id;
	}

	public String getDonateur() {
		return donateur;
	}

	@XmlElement
	public void setDonateur(String donateur) {
		this.donateur = donateur;
	}

	public String getTypeNour() {
		return typeNour;
	}

	@XmlElement
	public void setTypeNour(String typeNour) {
		this.typeNour = typeNour;
	}

	public int getPoids() {
		return poids;
	}

	@XmlElement
	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getEtat() {
		return etat;
	}

	@XmlElement
	public void setEtat(String etat) {
		this.etat = etat;
	}

}
