public class Salarie {
	private int Matricule;
	private String Nom;
	private Double Recrutement;
	
	public Salarie(int Matricule, String Nom, Double Recrutement) {
		this.Matricule = Matricule;
		this.Nom = Nom;
		this.Recrutement = Recrutement;
	}
	
	public int getMatricule() {
		return this.Matricule;
	}
	
	public String getNom() {
		return this.Nom;
	}
	
	public Double getRecrutement() {
		return this.Recrutement;
	}
	 
	public void setMatricule(int Matricule) {
		this.Matricule = Matricule;
	}
	
	public void setNom(String Nom) {
		this.Nom = Nom;
	}
	
	public void setRecrutement(double Recrutement) {
		this.Recrutement = Recrutement ;
	}
	
	public void affiche() {
		System.out.println("Matricule = "+getMatricule()+",Nom = "+getNom()+", Annee de recrutement : "+getRecrutement());
	}
	
	public double Salaire(Double R) {
		double sal = 0;
		if(R <2005)
			sal = 400;
		else
			sal = 280;
		return sal;
	}
	
	
}
