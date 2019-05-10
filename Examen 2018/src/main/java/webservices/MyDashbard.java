package webservices;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import entities.Etudiant;

@WebService(name = "DashboardPortype", portName = "DashboardPort")
public class MyDashbard {

	public List<Etudiant> afficherEtudiantsInscrits() {
		return new ArrayList<>();
	}
	
	public int creerCompteDashBoard(Etudiant etudiant) {
		return 0;
		
	}
}
