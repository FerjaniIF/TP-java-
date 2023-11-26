
public class ProduitElec extends Article implements Promotion  {

	String categorie;
	
	public ProduitElec(long ref, String lib, double p, int q, String categorie) {
		super(ref,lib,p,q);
		this.categorie = categorie;
	}
	
	@Override
	public float calculPrixTTC() {
		float prixTTC = (float) ((super.prixHT)*(1.08+TVA));
		return prixTTC;
	}
	
	@Override 
	public void decrire() {
		super.decrire();
		System.out.println(categorie+", " +this.getClass().getSimpleName());
	}
	
	@Override
	public double prixDeVente(String dateStr) {
		double prixV = this.calculPrixTTC();
		if(estPeriodePromo(dateStr))
			prixV=Promotion.calculerRemise(prixHT, this.calculPrixTTC());
		return prixV;
	}
}
