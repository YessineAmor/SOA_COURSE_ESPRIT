package ws;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Animateur {
	private int age;
	private String nom;
	private String prenom;

	
	public Animateur() {
		
	}
	public int getAge() {
		return age;
	}

	@XmlElement(required = true)
	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	@XmlElement(required = true)
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@XmlElement(required = true)
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
