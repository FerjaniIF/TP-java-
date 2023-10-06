public class Compte {

	private int num;
	private double solde;
	private double dec_max;
	private double debit_max;
	Personne titulaire;
	static int count = 0;


	public Compte(Personne p) {
		num= count++;
		solde = 0;
		dec_max = 800;
		debit_max = 1000;
		this.titulaire = p;
	}
	
	public Compte(double solde, double dec_max, double debit_max,Personne p) {
		num= count++;
		this.solde = solde;
		this.dec_max = dec_max;
		this.debit_max = debit_max;
		this.titulaire = p;
	}
	
	public String toString() {
		return "num : "+num+"\nsolde : "+this.solde+"\ndecouvert max : "+dec_max+"\ndebit max : "+debit_max;
	}
	
	public int getnum() {
		return num;
	}
	
	public double getsolde() {
		return solde;
	}
	
	public double setsolde(double solde) {
		return this.solde = solde;
	}
	
	public double getdec_max() {
		return dec_max;
	}
	
	public double setdec_max(double dec_max) {
		return this.dec_max = dec_max;
	}
	
	public double getdebit_max() {
		return debit_max;
	}
	
	public double setdebit_max(double debit_max) {
		return this.debit_max = debit_max;
	}
	
	public void crediter(double montant) {
		if (montant > 0)
			solde += montant;
	}
	
	public void debiter(double montant) {
		if (Math.abs(solde - montant) <= dec_max) {
			solde -= montant;
		}	 
	}
	
	public boolean retirer(double montant) {
		if (montant > 0 && montant <= debit_max) {
			debiter(montant);
			return true;
		}
		else 
			return false;
	}
	
	public boolean estaDecouvert() {
		return (solde<0); 
	}
	
	public double MontantDecouvert() {
		if(estaDecouvert())
			return Math.abs(solde);
		else
			return 0;
	}
	
	public void virement(Compte c,double montant) {
		if(this.retirer(montant))
			c.crediter(montant);
	}
	
	static public void virement(Compte c1,Compte c2, Double montant) {
		if(c1.retirer(montant))
			c2.crediter(montant);
	}
	
	
}
