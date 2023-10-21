
public class Entreprise {

	public static void main(String[] args) {
		Salarie[] tabSalaire = new Salarie[5];
		
		tabSalaire[0] = new Employe(1234,"Walid",2002.0,15,4);
		tabSalaire[1] = new Vendeur(23445,"Yessine",2007.0,1000,0.1);
		tabSalaire[2] = new Vendeur(65478,"Nassime",2000.0,700,0.1);
		tabSalaire[3] = new Employe(87698,"Aymen ",2003.0,19,5);
		tabSalaire[4] = new Employe(12345,"Khaled",2008.0,7,4);

		System.out.println("\n********************** Liste des employes **********************\n");
		for(int i=0; i<tabSalaire.length; i++) {
			if(tabSalaire[i] instanceof Employe ) { 
					tabSalaire[i].affiche();
			}
		}
		
		System.out.println("\n********************** Liste des vendeurs **********************\n");
		for(int i=0; i<tabSalaire.length; i++) {
			if(tabSalaire[i] instanceof Vendeur ) {
					tabSalaire[i].affiche();
			}
		}
		
		System.out.println("\n********************** Nom du salarie le plus ancien dans l'entreprise  **********************\n");
		Salarie sa = tabSalaire[0];
		for(int i=1; i<tabSalaire.length; i++) {
			if(sa.getRecrutement()> tabSalaire[i].getRecrutement()) {
					sa = tabSalaire[i];
					System.out.println("NOM : "+sa.getNom()+" recrute en l'an "+sa.getRecrutement());
			}
		}
		
		System.out.println("\n********************** Matricule du vendeur disposant le plus grand salaire **********************\n");
		Salarie smax = null;
		for (int i = 0; i < tabSalaire.length; i++) {
		    if (tabSalaire[i] instanceof Vendeur) {
		        if (smax == null)
		            smax = tabSalaire[i];
		        else if (smax.Salaire(smax.getRecrutement()) < tabSalaire[i].Salaire(smax.getRecrutement()));
		            smax = tabSalaire[i];
		    }
		}
		System.out.println("Matricule = " + smax.getMatricule() + " de salaire = " + smax.Salaire(smax.getRecrutement())+"DT");

	}
}
