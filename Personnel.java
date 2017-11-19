package mon_mini_projet;


public class Personnel  {

	
	
	//D�claration des attributs
	private Employe[] registreDuPersonnel;
	private int nombreEmploye;
	private int nombreMaxEmploye = 500;
	
	
	
	//Cr�ation du constructeur
	public Personnel() {
		registreDuPersonnel = new Employe[nombreMaxEmploye];
		nombreEmploye = 0;
		
	}

	
	
	//Methode permettant d'ajouter un employ� 
	public void ajouterEmploye(Employe employe) {
		++nombreEmploye;
		
		if(nombreEmploye <= nombreMaxEmploye ) {
			
			registreDuPersonnel[nombreEmploye - 1] = employe;
			
		} else {
			System.out.println("Il est impossible d'ajouter plus de " + nombreMaxEmploye + " employ�s !");
			
		}	
		
	}
	
	
	
	//Methode permettant d'afficher le salaire de chaque employ�
	public void calculerSalaire() {
		for(int i = 0; i < nombreEmploye; i++ ) {
			System.out.println(registreDuPersonnel[i].getNom() + " de " + registreDuPersonnel[i].getAge() + " ans"  +  ", au matricule " 
		    + registreDuPersonnel[i].getMatricule() + ", en service depuis le " + registreDuPersonnel[i].getDateEntreeService() + " et exer�ant comme" + registreDuPersonnel[i].getTypeEmploye() + "a pour salaire mensuel " + registreDuPersonnel[i].calculerSalaire() + " francs.");
		}
	}
	
	
	
	//Methode permettant de calculer le salaire moyen d'un employ�
	public double salaireMoyen() {
		double sommeSalaires = 0.0;
		for(int i = 0; i < nombreEmploye; i++ ) {
			sommeSalaires += registreDuPersonnel[i].calculerSalaire();
		}
		
		return (sommeSalaires / nombreEmploye);
	}
	
	
}
