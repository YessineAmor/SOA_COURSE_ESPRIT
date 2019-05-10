package sessionbeans;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@Remote
@WebService(name = "ScolaritePortType", targetNamespace = "http://ws.scolarite.tn", serviceName = "ScolariteService")
public interface ScolariteRemote {
	@WebMethod
	@WebResult(name = "etat")
	public String getEtatInscription();

	@WebMethod
	@WebResult(name = "fraisInscription")
	public int calculerFraisInscription(@WebParam(name = "numInscription") int numInscription);

	@WebMethod
	@WebResult(name = "infoEtudiant")
	public Etudiant getInfoEtudiant(@WebParam(name = "numInscription") int numInscription);

	@WebMethod
	@WebResult(name = "return")
	public List<Etudiant> getListeEtudiants();

	@WebMethod
	@WebResult(name = "numInscription")
	public int inscrire(@WebParam(name = "cin") String cin, @WebParam(name = "nom") String nom,
			@WebParam(name = "prenom") String prenom, @WebParam(name = "dateNaissance") Date dateNaissance,
			@WebParam(name = "adresse") String adresse, @WebParam(name = "numTel") Long numTel,
			@WebParam(name = "email") String email);

}
