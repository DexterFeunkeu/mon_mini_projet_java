package mon_mini_projet;

public class EmployeManutentionCourantRisque extends Manutentionnaire implements ManipulerProduitDangereux{

	
	
	//Cr�ation du constructeur
	public EmployeManutentionCourantRisque(String nom, String prenom, int age, String matricule, String dateEntreeService,double nombreHeureDeTravaille) {
		super(nom, prenom, age, matricule, dateEntreeService, nombreHeureDeTravaille);
	}

	
	
	//Red�finition de la m�thode calculerSalaire() de mani�re sp�cifique � la class "EmployeManutentionCourantRisque"
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME_DE_RISQUE_MENSUELLE;
				
	}
	
	
	
	//Methode retournant le type de l'employ� affect� � la manutention et, qui est appel� � fabriquer et manipuler des produits dangereux
	public String getTypeEmploye() {
		return " manutentionnaire manipulant des produits dangereux ";
	}
	
}
