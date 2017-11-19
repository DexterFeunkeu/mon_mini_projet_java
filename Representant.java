package mon_mini_projet;

public class Representant extends EmployesDuServiceCommercial {
	
	
	
	//Déclaration des attributs
	private final static int BONUS_POUR_REPRESENTANT = 200;

	
	
	//Constructeur
	public Representant(String nom, String prenom, int age, String matricule, String dateEntreeService, double chiffreDAffaire) {
		super(nom, prenom, age, matricule, dateEntreeService, chiffreDAffaire);
	}
	
	
	
	//La méthode calculerSalaire() redéfinie de manière spécifique à la class "Representant"
	@Override
	public double calculerSalaire() {

		return SALAIRE_DE_BASE + (getChiffreDAffaire() * VINGT_POURCENT) + BONUS_POUR_REPRESENTANT;
	}
	
	
	
	//Methode retournant le type de l'employe affecté à la représentation
	public String getTypeEmploye() {
		return " représentant ";
	}
	
		

}
