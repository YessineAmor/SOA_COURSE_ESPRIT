package sessionbeans;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * Session Bean implementation class Scolarite
 */
@Stateless
@LocalBean
@WebService
public class Scolarite implements ScolariteRemote {

    /**
     * Default constructor. 
     */
    public Scolarite() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String getEtatInscription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calculerFraisInscription(int numInscription) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Etudiant getInfoEtudiant(int numInscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiant> getListeEtudiants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inscrire(String cin, String nom, String prenom, Date dateNaissance, String adresse, Long numTel,
			String email) {
		// TODO Auto-generated method stub
		return 0;
	}

}
