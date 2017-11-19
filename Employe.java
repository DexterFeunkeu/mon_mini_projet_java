package mon_mini_projet;

public abstract class Employe {
	
	
	//Déclaration des attributs
	private String nom;
	private String prenom;
	private int age;
	private String matricule;
	private String dateEntreeService;
	private String typeEmploye;
	public final static int SALAIRE_DE_BASE = 110000;
	
	
	//Création du constructeur
	public Employe(String nom, String prenom, int age, String matricule, String dateEntreeService) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.matricule = matricule;
		this.dateEntreeService = dateEntreeService;
		
	}

	
	
	//Accesseurs et modificateurs
	public String getNom() {
		return " L'employé " + nom + " " + prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getDateEntreeService() {
		return dateEntreeService;
	}

	public void setDateEntreeService(String dateEntreeService) {
		this.dateEntreeService = dateEntreeService;
	}

	
	public String getTypeEmploye() {
		return typeEmploye;
	}


	public void setTypeEmploye(String typeEmploye) {
		this.typeEmploye = typeEmploye;
	}
	
	
	
	
	//Methode pour le calcul du salaire de chaque employé
	public abstract double calculerSalaire();
	
	
	

}
