package webservices;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entities.Etudiant;

@WebService(name = "DashboardPortype", portName = "DashboardPort", targetNamespace = "http://ws.dashboard.tn/")
public class MyDashboard {

	@WebMethod
	@WebResult(name = "etudiantsInscrits")
	public List<Etudiant> afficherEtudiantsInscrits() {
		return new ArrayList<>();
	}

	@WebMethod
	@WebResult(name = "codeValidation")
	public int creerCompteDashBoard(@WebParam(name = "nouveauCompteDashboard") Etudiant etudiant) {
		return 0;
	}

	@WebMethod
	@WebResult(name = "informationEtudiant")
	public Etudiant affichageInformationEtudiant(@WebParam(name = "numeroEtudiant") Long numeroEtudiant) {
		return null;
	}

	@WebMethod
	@WebResult(name = "numeroConfirmation")
	public int validerCompteDashBoard(@WebParam(name = "codeValidation") int codeValidation) {
		return 0;
	}
}
