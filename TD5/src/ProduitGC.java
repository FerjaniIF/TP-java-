
public class ProduitGC extends Article implements Promotion{

	public ProduitGC(long ref, String lib, double p, int q) {
		super(ref,lib,p,q);
	}
	
	@Override
	public float calculPrixTTC() {
		float prixTTC = (float) ((super.prixHT)*(1+TVA));
		return prixTTC;
	}
	
	@Override
	public void decrire() {
		super.decrire();
		System.out.println(" avec prixTTC = "+this.calculPrixTTC());
	}
	
	public double prixDeVente(String dateStr) {
		double prixV = this.calculPrixTTC();
		if(estPeriodePromo(dateStr))
			prixV=Promotion.calculerRemise(prixHT, this.calculPrixTTC());
		return prixV;
	}
}
