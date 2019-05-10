package sessionbeans;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "adresse", "dateNaissance", "email", "nom", "prenom" })
public class Etudiant {

	private String CIN;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String adresse;
	private Long numTel;
	private String email;

	public String getCIN() {
		return CIN;
	}

	@XmlAttribute(name = "cin")
	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getNom() {
		return nom;
	}

	@XmlElement(name = "lastName")
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@XmlElement(name = "firstName")

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	@XmlElement(name = "dateNaissance")

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	@XmlElement

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Long getNumTel() {
		return numTel;
	}

	@XmlTransient
	public void setNumTel(Long numTel) {
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement(name = "email")

	public void setEmail(String email) {
		this.email = email;
	}

}
