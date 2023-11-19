package tp5;

public class PropPrivee extends Propriete{
	protected int nbPieces;
	
	public PropPrivee(int cin,Personne r, String adr, double surface, int nbPieces) {
		super(cin, r,adr,surface);
		this.nbPieces = nbPieces;
	}
	@Override
	double calculImpot() {
		double montant = 0.0;
		return montant = (50/this.surface)+(10 * this.nbPieces);
	}

}
