package tp5;

public class Appartement extends PropPrivee{
	private int numEtage;
	
	public Appartement(int cin, Personne r, String adr, double s, int nbE, int numE) {
		super(cin,r,adr,s, nbE);
		this.numEtage = numE;
	}
	
	@Override
	public String toString() {
		return super.toString()+", num etage: "+numEtage;
	}
}
