
public class Librairie {
	Livre[] liste;
	int capacite;
	private int nb;
	
	public Librairie(){
		Livre[] liste= new Livre[capacite];
	}
	
	public int getNb() {
		return nb;
	}
	
	public void inventaire() {
		for (int i=0; i<nb; i++) 
			System.out.println("Titre : "+liste[i].titre+", prix : "+liste[i].prix);
	}
	
	public void inventaire(String categ) {
		for (int i=0; i<getNb(); i++) {
			if(liste[i].getClass().getSimpleName() == categ)
				System.out.println("Titre : "+liste[i].titre+" de categorie : "+liste[i].getClass()+", prix : "+liste[i].prix);	
		}
	}
	
	public void ajoutLiv(Livre liv) {
		if (nb<capacite) {
			liste[nb] = liv;
			nb++;
		}
		else
			System.out.println("Librairie est pleine");
	}
	
	public void suppLiv(int num) {
		for(int i=0; i<nb ; i++) {
			if(liste[i].id == num) {
				liste[i] = liste[nb];
				nb--;
			}
		}
	}
	
}
