package tp5;

 public class LotPrivee extends Lotissement{

	public LotPrivee(int capacite) {
		super(capacite);
	}
	
	int i=0;
	@Override
	public boolean ajouter(Propriete p) {
	    if (p instanceof PropPrivee && i<nombre) {
	        tabProp[i] = p;
	        i++;
	        return true; 
	    }
	    return false; 
	}
	
	@Override
	public PropPrivee getproprieteByIndice(int i) {
	    if (i < nombre && tabProp[i] instanceof PropPrivee) {
	        return (PropPrivee) tabProp[i];
	    }
	    return null; 
	}

	
	@Override
	public int getnbPieces() {
	    int totalPieces = 0;
	    for (int i = 0; i < nombre; i++) {
	        if (tabProp[i] instanceof PropPrivee) {
	            totalPieces += ((PropPrivee) tabProp[i]).nbPieces;
	        }
	    }
	    return totalPieces;
	}

	
}