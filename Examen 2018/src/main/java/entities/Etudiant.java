package entities;

import java.util.Date;

public class Etudiant {
	private Long numeroEtudiant;
	private Date dateNaissance;
	private String email;

	public Long getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public void setNumeroEtudiant(Long numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	private String nom;
	private String prenom;

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

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

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
