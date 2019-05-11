package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService(name = "GestionChainePortype", portName = "GestionChainePort", targetNamespace = "http://examen.soa.edu.gestionchaine.tn/", endpointInterface = "")
public class GestionChaineWS {

	@WebMethod
	@WebResult(name = "Response")
	public String ajouterChaine(@WebParam(name = "chaineTelevise") ChaineTelevise chaine) {
		return "La chaine a sdfsfsd...";
	}

	@WebMethod
	@WebResult(name = "EmissionTrouvée")
	public Emission ChercherEmission(@WebParam(name = "heure") int heure, @WebParam(name = "jour") int jour,
			@WebParam(name = "nomChaine") @XmlElement(required=true,nillable=false) String nomChaine) {

		return new Emission();

	}

}
