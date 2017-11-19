package mon_mini_projet;

public abstract class EmployesDuServiceCommercial extends Employe {
	
	 

	//D�claration des attributs
	private double chiffreDAffaire;
	protected final static double VINGT_POURCENT = 0.2;
	
	
	
	//Cr�ation du constructeur
	public EmployesDuServiceCommercial(String nom, String prenom, int age, String matricule, String dateEntreeService, double chiffreDAffaire) {
		super(nom, prenom, age, matricule, dateEntreeService);
		this.chiffreDAffaire = chiffreDAffaire;
	}


	
	//Accesseur et Modificateur
	public double getChiffreDAffaire() {
		return chiffreDAffaire;
	}


	public void setChiffreDAffaire(double chiffreDAffaire) {
		this.chiffreDAffaire = chiffreDAffaire;
	}

	
}
