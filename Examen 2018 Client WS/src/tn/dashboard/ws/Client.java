package tn.dashboard.ws;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDashboardService proxy = new MyDashboardService();
		DashboardPortype service = proxy.getDashboardPort();
		System.out.println(service.creerCompteDashBoard(new Etudiant()));
		System.out.println(service.validerCompteDashBoard(5));
		System.out.println(service.affichageInformationEtudiant(5L));
		System.out.println(service.afficherEtudiantsInscrits());
	}

}
