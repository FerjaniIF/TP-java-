
public class Employe extends Salarie {
	private double Hsupp;
	private double PHsupp;
	
	public Employe(int Matricule, String Nom, Double Recrutement, double Hsupp, double PHsupp) {
		super(Matricule,Nom,Recrutement);
		this.Hsupp = Hsupp;
		this.PHsupp = PHsupp;
	}
	
	public double getHsupp() {
		return this.Hsupp;
	}
	
	public double getPHsupp() {
		return this.PHsupp;
	}
	
	public void setHsupp(double Hsupp) {
		this.Hsupp = Hsupp;
	}
	
	public void setPHsupp(double PHsupp) {
		this.PHsupp = PHsupp;
	}
	@Override
	public void affiche() {
		super.affiche();
//		this.getClass().getSimpleName()
		System.out.println("nombre d'heures supplementaire = "+getHsupp()+", prix par heure supplementaire = "+getPHsupp()+"\n");
	}

	public double Salaire(Double R) {
		double s = super.Salaire(R);
		s += getHsupp()*getPHsupp();
		return s;
	}
}
