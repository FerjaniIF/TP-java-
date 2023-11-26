
 public class Vetement extends Article implements Promotion{
	public String couleur;
	public char taille;

	public Vetement(long ref, String lib, double p, int q, String couleur, char taille) {
		super(ref,lib,p,q);
		this.couleur = couleur;
		this.taille = taille;
	}
	
	float calculPrixTTC() {
		float prixTTC = (float) ((super.prixHT)*(1+TVA));
		return prixTTC;
	}
	
	@Override 
	public void decrire() {
		super.decrire();
		System.out.println(couleur+" taille "+taille);
	}
	
	void prixDeVente() {}

	@Override
	public double prixDeVente(String dateStr) {
		double prixV = this.calculPrixTTC();
		if(estPeriodePromo(dateStr))
			prixV=Promotion.calculerRemise(prixHT, this.calculPrixTTC());
		return prixV;
	}
}
