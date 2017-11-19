package mon_mini_projet;

public class Technicien extends Employe {
	


	//Déclaration de attribut
	private double nombreUnitesProduites;

	
	
	//Création du constructeur
	public Technicien(String nom, String prenom, int age, String matricule, String dateEntreeService, double nombreUnitesProduites) {
		super(nom, prenom, age, matricule, dateEntreeService);
		this.nombreUnitesProduites = nombreUnitesProduites;
	}
		
	
	
	//Accesseurs et Modificateurs
	public double getNombreUnitesProduites() {
		return nombreUnitesProduites;
	}


	public void setNombreUnitesProduites(double nombreUnitesProduites) {
		this.nombreUnitesProduites = nombreUnitesProduites;
	}

	
	
	//Redéfinition de la méthode calculerSalaire() de manière spécifique à la class "Technicien"
	@Override
	public double calculerSalaire() {
		
		return SALAIRE_DE_BASE + (nombreUnitesProduites *  5);
	}

	
	
	//Methode retournant le type de l'employe affecté à la production
	public String getTypeEmploye() {
		return " technicien ";
	}
	
		

}
