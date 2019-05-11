package rest.ressources;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Place {
	private String nom;
	private String numTel;
	private String adresse;
	private String type;
	private String siteWeb;
	private Location location;

	public String getNom() {
		return nom;
	}

	@XmlElement
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumTel() {
		return numTel;
	}

	@XmlElement(name = "numero_telephone")
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getAdresse() {
		return adresse;
	}

	@XmlElement
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getType() {
		return type;
	}

	@XmlElement
	public void setType(String type) {
		this.type = type;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	@XmlAttribute(name = "site_Web")
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public Location getLocation() {
		return location;
	}

	@XmlElement
	public void setLocation(Location location) {
		this.location = location;
	}
}
