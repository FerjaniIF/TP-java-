
public class Courrier {
	boolean exp;
	String adr;
	final float tarif = 0.5f;
	
	public Courrier(boolean exp, String adr){
		this.exp = exp;
		this.adr = adr;
	}
	
	public boolean estValide() {
		if (adr.equals(null))
			return false;
		return true;
	}
	
	public void decrire() {
		System.out.println("Mode d'expedition : "+exp+", l'adresse de destination : "+adr+", tarif : "+tarif+"DT");
	}
	
	public double affranchir() {
		double montant = 0.0;

		if (estValide()) {
			if(exp == false)
				montant = tarif;
			else 
				montant = tarif*2;
		}
		
		return montant;
	}
}
