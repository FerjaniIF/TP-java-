
public class Colis extends Courrier {
	double poids;
	double vol;
	
	public Colis(boolean exp, String adr, double poids, double vol) {
		super(exp,adr);
		this.poids = poids;
		this.vol = vol;
	}
	
	@Override
	public void decrire() {
		super.decrire();
		System.out.println("le poids : "+poids+"G , volume : "+vol+"L");
	}
	@Override
	public double affranchir() {
		double montant = 0.25 * vol + poids * 1.0;
		return montant;
	}
}
