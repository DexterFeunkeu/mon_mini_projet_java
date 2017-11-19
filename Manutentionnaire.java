package mon_mini_projet;

public class Manutentionnaire extends Employe {


	//Déclaration de l'attribut "nombreHeureDeTravaille"
	private double nombreHeureDeTravaille;
		
	
	
	//Création du constructeur
	public Manutentionnaire(String nom, String prenom, int age, String matricule, String dateEntreeService, double nombreHeureDeTravaille) {
		super(nom, prenom, age, matricule, dateEntreeService);
		this.nombreHeureDeTravaille = nombreHeureDeTravaille;
		
	}


	
	
	//Accesseurs et Modificateurs
	public double getNombreHeureDeTravaille() {
		return nombreHeureDeTravaille;
	}

	public void setNombreHeureDeTravaille(double nombreHeureDeTravaille) {
		this.nombreHeureDeTravaille = nombreHeureDeTravaille;
	}
	
	
	
	//Redéfinition de la méthode calculerSalaire() de manière spécifique à la class "Manutentionnaire"
	@Override
	public double calculerSalaire() {
		return SALAIRE_DE_BASE + (nombreHeureDeTravaille * 65);
	}

	
	
	//Methode retournant le type de l'employe affecté à la manutention
	public String getTypeEmploye() {
		return " manutentionnaire ";
	}

}
