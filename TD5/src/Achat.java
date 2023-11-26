import java.time.LocalDate;

public class Achat{

	public static void main(String[] args) {

		Article[] supermarche= new Article[4];
		
		Vetement v1= new Vetement(123,"Jupe ",39.000,2,"bleue",'S');
		ProduitElec p1 = new ProduitElec(145,"TV Led 80cm",1450.000,0,"TV");
		Vetement v2= new Vetement(178,"Pontalon",39.000,2,"noir",'M');
		ProduitGC p2= new ProduitGC(191,"Pates", 0.410, 18);
		
		supermarche[0] = v1;
		supermarche[1] = p1;
		supermarche[2] = v2;
		supermarche[3] = p2;
		
//		----------- v1 ----------------------------------
		System.out.println("\n------------------ article 1 : "+supermarche[0].getClass().getSimpleName()+"------------------------");
		if(supermarche[0].estDispo(0)) {
			System.out.println("Quantite disponible : ");
			supermarche[0].decrire();
			System.out.println("prixTTC = "+supermarche[0].calculPrixTTC());
			System.out.println("\nMontant total a payer : " + (supermarche[0].calculPrixTTC())*0 + "DT" );
		}	
		else {
			System.out.println("Quantite non disponible");
			supermarche[0].approvisionner(5);
		}
		
//		----------- p1 ----------------------------------
		System.out.println("\n------------------ article 2 : "+supermarche[1].getClass().getSimpleName()+"------------------------");
		if(supermarche[1].estDispo(1)) {
			System.out.println("Quantite disponible : ");
			supermarche[1].decrire();
			System.out.println("prixTTC = "+supermarche[1].calculPrixTTC());
			System.out.println("\nMontant total a payer : " + (supermarche[1].calculPrixTTC())*1 + "DT" );
		}	
		else {
			System.out.println("Quantite non disponible");
			supermarche[1].approvisionner(5);
		}
		System.out.println(" apres approvisionnement");
		if(supermarche[1].estDispo(1)) 
			System.out.println("Quantite disponible");
		
//		----------- v2 ----------------------------------
		System.out.println("\n------------------ article 3 : "+supermarche[2].getClass().getSimpleName()+" ------------------------");
		if(supermarche[2].estDispo(1)) {
			System.out.println("Quantite disponible : ");
			supermarche[2].decrire();
			System.out.println("prixTTC = "+supermarche[2].calculPrixTTC());
			System.out.println("\nMontant total a payer : " + (supermarche[2].calculPrixTTC())*1 + "DT" );
		}	
		else {
			System.out.println("Quantite non disponible");
			supermarche[2].approvisionner(5);
		}
		
//		----------- p2 ----------------------------------
		System.out.println("\n------------------ article 4 : "+supermarche[3].getClass().getSimpleName()+"------------------------");
		if(supermarche[3].estDispo(3)) {
			System.out.println("Quantite disponible : ");
			supermarche[3].decrire();
			System.out.println("\nMontant total a payer : " + (supermarche[3].calculPrixTTC())*3 + "DT" );
		}	
		else {
			System.out.println("Quantite non disponible");
			supermarche[3].approvisionner(5);
		}
	}
}
