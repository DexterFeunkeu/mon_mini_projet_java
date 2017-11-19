package mon_mini_projet;

//Classe testant toute les autres classes du m�me paquetage
public class Salary {

	
	public static void main(String[] args) {

		
		
		//Cr�ation d'une instance de la classe "Personnel"
		Personnel liste = new Personnel();
		
		
		
		//Ajout des differents types d'employ�s
		liste.ajouterEmploye(new Vendeur("Dexter", "Feunkeu", 20,"16B375FS", "16/09/2017", 24500) );
		liste.ajouterEmploye(new Representant("Dexter", "Feunkeu", 20,"16B375FS", "16/09/2017", 24500));
		liste.ajouterEmploye(new Technicien("Dexter", "Feunkeu", 20,"16B375FS", "16/09/2017", 24));
		liste.ajouterEmploye(new Manutentionnaire("Dexter", "Feunkeu", 20,"16B375FS", "16/09/2017", 24));
		liste.ajouterEmploye(new EmployeProductionCourantRisque("Dexter", "Feunkeu", 20,"16B375FS", "16/09/2017", 24));
		liste.ajouterEmploye(new EmployeManutentionCourantRisque("Dexter", "Feunkeu", 20,"16B375FS", "16/09/2017", 24));
		
		
		
		//Affichage du salaire pour chaque type d'employ�
		liste.calculerSalaire();
		
		
		
		//Affichage du salire moyen d'un employ�
		System.out.println("Le salaire moyen des employ�s est de : " + liste.salaireMoyen());


	}

}
