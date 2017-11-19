package mon_mini_projet;

public class EmployeProductionCourantRisque extends Technicien implements ManipulerProduitDangereux{

	
	
	//création du constructeur
	public EmployeProductionCourantRisque(String nom, String prenom, int age, String matricule, String dateEntreeService, double nombreUnitesProduites) {
		super(nom, prenom, age, matricule, dateEntreeService, nombreUnitesProduites);
	}
	
	
	
	//Redéfinition de la méthode calculerSalaire() de manière spécifique à la class "EmployeProductionCourantRisque"
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME_DE_RISQUE_MENSUELLE;
	
	}

	
	
	//Methode retournant le type de l'employé affecté à la production et, qui est appelé à fabriquer et manipuler des produits dangereux
	public String getTypeEmploye() {
		return " technicien manipulant des produits dangereux ";
	}

}
