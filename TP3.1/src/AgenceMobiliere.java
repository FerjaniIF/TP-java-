public class AgenceMobiliere {
	final int max;
	private int nb = 0;
	private Vehicule tab[];
	
	 public AgenceMobiliere(int max) {
		 this.max = max;
		tab = new Vehicule[max];
	}
	
	void ajoutVehicule(Vehicule v) {
		if(nb<max) {
			tab[nb] = v;
			nb++;
		}
		else
			System.out.println("taille insuffisante");
	}
	
	void selection(int n) {
		if (tab[n]!= null)
			tab[n].decrisVehicule();
		else
			System.out.println("champ est vide");
	}
	
	void selection(String mq) {
	    boolean vehiculeTrouve = false; 
	    for (int i = 0; i < max; i++) {
	        if (tab[i] != null && tab[i].getMarque().equals(mq)) {
	        	System.out.println("\nVehicule trouve: ");
	            tab[i].decrisVehicule();
	            vehiculeTrouve = true; 
	        }
	    }
	    if (!vehiculeTrouve) {
	        System.out.println("\nIl n'y a pas de vehicules de cette marque");
	    }
	}

	
	void selection(double px) {
		boolean vehiculeTrouve = false;
		for (int i=0; i<nb ; i++) {
			if (tab[i].getPrix() <= px) { 
				tab[i].decrisVehicule();
				vehiculeTrouve = true;
			}
		}	
		if (!vehiculeTrouve) {
			System.out.println("il n y a pas de vehicules dans cette marge de prix");
		}
	}
	
	public int plus_anc() {
		int min = tab[0].getAnnee();
		int min_index = 0;
		for(int i=0; i<nb ; i++) {
			if (tab[i].getAnnee() < min) {
				min = tab[i].getAnnee();
				min_index = i;
			}
		}
		return min_index;
	}
	
}
