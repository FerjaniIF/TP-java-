
public class Vendeur extends Salarie {
	private double Vente;
	private double Pourcentage;
	
	public Vendeur(int Matricule, String Nom, Double Recrutement, double Vente, double Pourcentage) {
		super(Matricule,Nom,Recrutement);
		this.Vente = Vente;
		this.Pourcentage = Pourcentage;
	}
	
	public double getVente() {
		return this.Vente;
	}
	
	public double getPourcentage() {
		return this.Pourcentage;
	}
	
	public void setVente(double Vente) {
		this.Vente = Vente;
	}
	
	public void setPourcentage(double Pourcentage) {
		this.Pourcentage = Pourcentage;
	}
	@Override
	public void affiche() {
		super.affiche();
		System.out.println(",total des ventes par mois (Dinars) = "+getVente()+", pourcentage sur les ventes = "+getPourcentage()+"%\n");
	}

	public double Salaire(Double R) {
		double s = super.Salaire(R);
		s += getVente()*getPourcentage();
		return s;
	}
}
