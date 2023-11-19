package tp5;

public class Villa extends PropPrivee{
	private boolean avecP;
	
	public Villa(int cin,Personne r, String adr, double surface, int nbP, boolean avecP) {
		super(cin, r,adr,surface,nbP);
		this.avecP = avecP;
	}
	
	@Override 
	public String toString () {
		return super.toString()+ ", avec piscine: "+avecP;
	}
	
	double calculImpot() {
		double m = super.calculImpot();
		
		if (avecP) 
			return m+=200;
		return m; 
	}
}
