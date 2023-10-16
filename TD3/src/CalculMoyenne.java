import java.util.Scanner;

public class CalculMoyenne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Donnez nombre d'etudiants : ");
	    int nb = sc.nextInt();
	    
		if (nb <= Tab.nmax) {
	    	float[] noteCtrl = new float[nb];
			float[] noteExam = new float[nb];
			
			System.out.println("Remplissez le tableau noteCtrl :\n");
	        Tab.remplir(noteCtrl);
	        System.out.println("Remplissez le tableau noteExam :\n");
	        Tab.remplir(noteExam);
	        
			System.out.println("\n---------------- contenu du tableau noteCtrl -----------------");
	        Tab.lister(noteCtrl);
			System.out.println("\n---------------- contenu du tableau noteExam-----------------");
	        Tab.lister(noteExam);
	        
	      	float moy_classe[] = Tab.additionner(noteCtrl, Tab.produit(2, noteExam));
			System.out.println("\n---------------- contenu du tableau moyenne -----------------\n");
			Tab.lister(moy_classe);

	        float moy = Tab.somme_element(moy_classe)/nb;
	        System.out.println("\n--------------------\nla moyenne de la classe : "+moy);
	        
			System.out.println("\n---------------- contenu du tableau apres bonus -----------------\n");
			float bonus = (float) 1.5;
			Tab.lister(Tab.additionner(bonus, moy_classe));
	        
	    }
		else {
			System.out.println("Nombre est depasse");
			return;
		}
			
	}

}
