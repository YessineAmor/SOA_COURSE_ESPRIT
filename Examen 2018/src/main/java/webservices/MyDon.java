package webservices;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entities.Etudiant;

@WebService(name = "DonPortype", portName = "DonPort", targetNamespace = "http://www.collecteRamadan.tn/")
public class MyDon {

	@WebMethod
	@WebResult(name = "etatInscription")
	public String getEtatInscription(@WebParam(name = "id") int id) {
		return "en cours..";
	}

	@WebMethod
	@WebResult(name = "donInscrit")
	public Don obtenirInfoDon(@WebParam(name = "id") int id) {
		Don d = new Don();
		d.setDonateur("bejoaiu");
		d.setEtat("En cours");
		d.setPoids(5000);
		d.setTypeNour("fruite");
		return d;
	}

	@WebMethod
	@WebResult(name = "numeroConfirmation")
	public int inscrireDon(@WebParam(name = "id") int id, @WebParam(name = "donateur") String donateur,
			@WebParam(name = "typeNourri") String typeNourri, @WebParam(name = "etat") String etat) {
		return 123456;
	}
}
