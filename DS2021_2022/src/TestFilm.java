
public class TestFilm {
	 public static void main(String[] args) {
	        Jcc j = new Jcc(2021);

	        Film f1 = new Documentaire("Le dernier refuge", "Ousman", "Mali", 86, "La guerre civile");
	        f1.setNbPr(30); 

	        Film f2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
	        f2.setNbPr(45); 

	        j.ajoutFilm(f1);
	        j.ajoutFilm(f2);
	        System.out.println("------------ les films de jcc : ----------------------");
	        j.listeFilmsJCC();
//	        System.out.println("----------------------------------");
//	        System.out.println("\nMontant des ventes pour le film 1 : \n" + f1.totalVenteBillets() + " DT");
//	        System.out.println("----------------------------------");
//	        System.out.println("\nMontant des ventes pour le film 2 : \n" + f2.totalVenteBillets() + " DT");
	        System.out.println("----------------------------------");
	        System.out.println("\nMontant total des ventes pour les JCC \n" + j.annee + " : " + (f1.totalVenteBillets()+f2.totalVenteBillets()) + " DT");
	    }
	
}
