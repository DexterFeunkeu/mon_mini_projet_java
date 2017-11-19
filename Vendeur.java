package mon_mini_projet;

public class Vendeur extends EmployesDuServiceCommercial{

	
	
	//D�claration des attributs
	private final static int BONUS_POUR_VENDEUR = 100;

	
	
	//Cr�ation du constructeur
	public Vendeur(String nom, String prenom, int age, String matricule, String dateEntreeService, double chiffreDAffaire) {
		super(nom, prenom, age, matricule, dateEntreeService, chiffreDAffaire);
		
	}
	

	
	//Red�finition de la m�thode calculerSalaire() de mani�re sp�cifique � la class "Vendeur"
	@Override
	public double calculerSalaire() {
		
		return SALAIRE_DE_BASE + (getChiffreDAffaire() * VINGT_POURCENT) + BONUS_POUR_VENDEUR;
	}
	
	
	
	//Methode retournant le type de l'employe affect� � la vente
	public String getTypeEmploye() {
		return " vendeur ";
	}
	
	
	

}
