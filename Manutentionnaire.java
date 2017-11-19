package mon_mini_projet;

public class Manutentionnaire extends Employe {


	//D�claration de l'attribut "nombreHeureDeTravaille"
	private double nombreHeureDeTravaille;
		
	
	
	//Cr�ation du constructeur
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
	
	
	
	//Red�finition de la m�thode calculerSalaire() de mani�re sp�cifique � la class "Manutentionnaire"
	@Override
	public double calculerSalaire() {
		return SALAIRE_DE_BASE + (nombreHeureDeTravaille * 65);
	}

	
	
	//Methode retournant le type de l'employe affect� � la manutention
	public String getTypeEmploye() {
		return " manutentionnaire ";
	}

}
