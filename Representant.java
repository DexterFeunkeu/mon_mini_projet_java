package mon_mini_projet;

public class Representant extends EmployesDuServiceCommercial {
	
	
	
	//D�claration des attributs
	private final static int BONUS_POUR_REPRESENTANT = 200;

	
	
	//Constructeur
	public Representant(String nom, String prenom, int age, String matricule, String dateEntreeService, double chiffreDAffaire) {
		super(nom, prenom, age, matricule, dateEntreeService, chiffreDAffaire);
	}
	
	
	
	//La m�thode calculerSalaire() red�finie de mani�re sp�cifique � la class "Representant"
	@Override
	public double calculerSalaire() {

		return SALAIRE_DE_BASE + (getChiffreDAffaire() * VINGT_POURCENT) + BONUS_POUR_REPRESENTANT;
	}
	
	
	
	//Methode retournant le type de l'employe affect� � la repr�sentation
	public String getTypeEmploye() {
		return " repr�sentant ";
	}
	
		

}
