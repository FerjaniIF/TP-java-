package tp5;

public class Fiscalite {
	public static void main (String args[]) {
		Personne p1 = new Personne(1,"intissar","ferjani");
		Personne p2 = new Personne(2,"tesnim","ben salem");
		Personne p3 = new Personne(3,"malek","ben othmen");
		
		Lotissement lot = new Lotissement(10);

		PropPrivee prop1 = new PropPrivee(1,p1,"Corniche",350,4);
		Villa prop2 = new Villa(2,p2,"Dar Chaabane",400,6,true);
		Appartement prop3 = new Appartement(3,p2,"Hammamet",1200,8,3);
		PropProfessionnelle prop4 = new PropProfessionnelle(4,p3,"Korba",1000,50,true);
		PropProfessionnelle prop5 = new PropProfessionnelle(5,p1,"Bir Bouregba",2500,400,false);
		
		lot.ajouter(prop1);
		lot.ajouter(prop2);
		lot.ajouter(prop3);
		lot.ajouter(prop4);
		lot.ajouter(prop5);
		
		lot.afficherPropriete();
		System.out.println("\nnombre des pieces : "+lot.getnbPieces());

		double minTax = Double.MAX_VALUE;
		PropPrivee minProp = null;

		for (int i = 0; i < lot.nombre; i++) {
		    if (lot.tabProp[i] instanceof PropPrivee) {
		        PropPrivee propprv = (PropPrivee) lot.tabProp[i];
		        double tax = propprv.calculImpot();
		        if (tax < minTax) {
		            minTax = tax;
		            minProp = propprv;
		        }
		    }
		}

		if (minProp != null) 
		    System.out.println("Proprietaire qui paie le moins d'impots: " + minProp.resp.getNom() +"\nMontant des impots: " + Math.round(minTax));
		else 
		    System.out.println("Aucune propriete privee trouvee dans le lotissement.");
		
		for(int i=0; i<lot.nombre;i++) {
			if (lot.tabProp[i].adr.equals("Hammamet"))
				lot.supprimer(lot.tabProp[i]);
		}
		
		lot.afficherPropriete();

//		----------------- Lotissement Privee ----------------------------
//		LotPrivee lt= new LotPrivee(10);
//
//		PropPrivee prop1 = new PropPrivee(1,p1,"Corniche",350,4);
//		Villa prop2 = new Villa(2,p2,"Dar Chaabane",400,6,true);
//		Appartement prop3 = new Appartement(3,p2,"Hammamet",1200,8,3);
//		PropProfessionnelle prop4 = new PropProfessionnelle(4,p3,"Korba",1000,50,true);
//		PropProfessionnelle prop5 = new PropProfessionnelle(5,p1,"Bir Bouregba",2500,400,false);
//		
//		lt.ajouter(prop1);
//		lt.ajouter(prop2);
//		lt.ajouter(prop3);
//		lt.ajouter(prop4);
//		lt.ajouter(prop5);
//		
//		lt.afficherPropriete();
//		System.out.println("\nnombre des pieces : "+lt.getnbPieces());
//
//		double minTax = Double.MAX_VALUE;
//		PropPrivee minProp = null;
//
//		for (int i = 0; i < lt.nombre; i++) {
//		    if (lt.tabProp[i] instanceof PropPrivee) {
//		        PropPrivee propprv = (PropPrivee) lt.tabProp[i];
//		        double tax = propprv.calculImpot();
//		        if (tax < minTax) {
//		            minTax = tax;
//		            minProp = propprv;
//		        }
//		    }
//		}
//
//		if (minProp != null) 
//		    System.out.println("Proprietaire qui paie le moins d'impots: " + minProp.resp.getNom() +"\nMontant des impots: " + Math.round(minTax));
//		else 
//		    System.out.println("Aucune propriete privee trouvee dans le lotissement.");
//		
//		for(int i=0; i<lt.nombre;i++) {
//			if (lt.tabProp[i].adr.equals("Hammamet"))
//				lt.supprimer(lt.tabProp[i]);
//		}
//		
//		lt.afficherPropriete();
				
	}
}
