
public class Lettre extends Courrier{
	double poids;
	String format;
	
	public Lettre(boolean exp, String adr, double poids, String format){
		super(exp,adr);
		this.poids = poids;
		this.format = format;
	}
	@Override
	public void decrire() {
		super.decrire();
		System.out.println("le poids : "+poids+"G , format : "+format);
	}
	@Override
	public double affranchir() {
		double montant;
		
		if (format.equals("A4"))
			poids = 2.50;
		else if(format.equals("A3"))
			poids = 3.50;
		
		montant = tarif+ 0.5 * poids;
		
		if(exp == true)
			return montant*=2; 
		else 
			return montant; 
	}
}
