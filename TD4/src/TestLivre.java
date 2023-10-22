
public class TestLivre {

	public static void main(String[] args) {
		Librairie lib = new Librairie();
		lib.capacite = 4;
		lib.liste = new Livre[lib.capacite];
		
		Livre liv1 = new Livre("Livre 1", 1, "Domaine 1", 100);
		Roman rom1 = new Roman("Roman 1", 2, "Domaine 2", 200, "Auteur 1", "Editeur 1");
		Magazine mag1 = new Magazine("Magazine 1", 3, "Domaine 3", 50, 5);
		 
		 lib.ajoutLiv(liv1);
		 lib.ajoutLiv(rom1);
		 lib.ajoutLiv(mag1);
		 System.out.println("\nL'inventaire : ");
		 lib.inventaire();
		 
		 Roman rom2 = new Roman("Roman 2", 4, "Domaine 4", 600, "Auteur 2", "Editeur 2");
		 lib.ajoutLiv(rom2);
		 System.out.println("\nInventaire : categorie Roman");
		 lib.inventaire("Roman");
		 
		 double montantTotR = 0.0;
	        for (int i = 0; i < lib.getNb(); i++) {
	            if ( lib.liste[i] instanceof Roman) {
	                montantTotR += lib.liste[i].calculPrix();
	            }
	        }
	        System.out.println("\nMontant total pour romans disponibles : " + montantTotR+"DT");
	        
	        Magazine mag2 = new Magazine("Magazine 2", 8, "Domaine 5", 80, 2);
	        
	        System.out.println("\nInventaire : categorie Magazine :");
	        lib.ajoutLiv(mag2);
	        lib.inventaire("Magazine");
	        

	}

}
