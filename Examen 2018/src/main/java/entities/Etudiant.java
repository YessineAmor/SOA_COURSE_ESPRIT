package entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Etudiant {
	private Long numeroEtudiant;
	private Date dateNaissance;
	private String email;
	private String nom;
	private String prenom;

	public Long getNumeroEtudiant() {
		return numeroEtudiant;
	}

	@XmlAttribute
	public void setNumeroEtudiant(Long numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	@XmlElement
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@XmlElement
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
