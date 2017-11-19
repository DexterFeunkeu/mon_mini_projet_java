package mon_mini_projet;

public class Technicien extends Employe {
	


	//D�claration de attribut
	private double nombreUnitesProduites;

	
	
	//Cr�ation du constructeur
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

	
	
	//Red�finition de la m�thode calculerSalaire() de mani�re sp�cifique � la class "Technicien"
	@Override
	public double calculerSalaire() {
		
		return SALAIRE_DE_BASE + (nombreUnitesProduites *  5);
	}

	
	
	//Methode retournant le type de l'employe affect� � la production
	public String getTypeEmploye() {
		return " technicien ";
	}
	
		

}
