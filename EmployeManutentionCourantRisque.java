package mon_mini_projet;

public class EmployeManutentionCourantRisque extends Manutentionnaire implements ManipulerProduitDangereux{

	
	
	//Création du constructeur
	public EmployeManutentionCourantRisque(String nom, String prenom, int age, String matricule, String dateEntreeService,double nombreHeureDeTravaille) {
		super(nom, prenom, age, matricule, dateEntreeService, nombreHeureDeTravaille);
	}

	
	
	//Redéfinition de la méthode calculerSalaire() de manière spécifique à la class "EmployeManutentionCourantRisque"
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME_DE_RISQUE_MENSUELLE;
				
	}
	
	
	
	//Methode retournant le type de l'employé affecté à la manutention et, qui est appelé à fabriquer et manipuler des produits dangereux
	public String getTypeEmploye() {
		return " manutentionnaire manipulant des produits dangereux ";
	}
	
}
