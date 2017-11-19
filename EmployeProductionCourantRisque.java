package mon_mini_projet;

public class EmployeProductionCourantRisque extends Technicien implements ManipulerProduitDangereux{

	
	
	//cr�ation du constructeur
	public EmployeProductionCourantRisque(String nom, String prenom, int age, String matricule, String dateEntreeService, double nombreUnitesProduites) {
		super(nom, prenom, age, matricule, dateEntreeService, nombreUnitesProduites);
	}
	
	
	
	//Red�finition de la m�thode calculerSalaire() de mani�re sp�cifique � la class "EmployeProductionCourantRisque"
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME_DE_RISQUE_MENSUELLE;
	
	}

	
	
	//Methode retournant le type de l'employ� affect� � la production et, qui est appel� � fabriquer et manipuler des produits dangereux
	public String getTypeEmploye() {
		return " technicien manipulant des produits dangereux ";
	}

}
