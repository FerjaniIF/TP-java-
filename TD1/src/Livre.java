public class Livre { 
//------------------------------------------------------------- ex1 
//		private String titre, auteur;
//		private float nbPages;
//		
//		public Livre(String auteur,String titre) {
//			this.auteur = auteur;
//			this.titre = titre;
//		}
//		
//		public String getAuteur() { 
//			return auteur;
//		}
//		
//		public void setNbPages (float nbPages){
//			this.nbPages = nbPages;
//		}
//		
//		public String toString() {
//			return("l'auteur : "+auteur+"\nle titre du livre : "+titre);
//		}
//------------------------------------------------------------- ex2
//	private String titre, auteur;
//	private float nbPages;
//	
//	public Livre(String auteur,String titre) {
//		nbPages = 0;
//		this.auteur = auteur;
//		this.titre = titre;
//	}
//	
//	public Livre(String titre,float nbPages) {
//		this.titre = titre;
//		this.nbPages = nbPages;
//	}
//	
//	public Livre(String auteur,String titre,float nbPages) {
//		this.auteur = auteur;
//		this.titre = titre;
//		this.nbPages = nbPages;
//
//	}
//	
//	public String getAuteur() { 
//		return auteur;
//	}
//	
//	public String getTitre() {
//		return titre;
//	}
//	
//	public float getNbPages() {
//		return nbPages;
//	}
//	
//	public void setNbPages (float nbPages){
//		if (nbPages > 20)
//			this.nbPages = nbPages;
//		else
//			System.out.println("nombre de pages est faible");
//	}
//	
//	public void setAuteur(String auteur) {
//		this.auteur = auteur;
//	}
//	
//	public void setTitre(String titre) {
//		this.titre = titre;
//	}
//	
//	public  String toString() {
//		return("Livre intitule "+getTitre()+" de "+getAuteur()+", contenant "+getNbPages()+" pages");
//	}
//	
//	public void decrire() {
//		System.out.println(toString());
//	}
//------------------------------------------------------------- ex3

//	private String titre, auteur;
//	private float nbPages;
//	private double prix;
//	public static int prixFixe = 0;
//	
//	public Livre(String auteur,String titre) {
//		nbPages = 0;
//		prix=0;
//		this.auteur = auteur;
//		this.titre = titre;
//	}
//	
//	public Livre(String titre,float nbPages) {
//		this.titre = titre;
//		this.nbPages = nbPages;
//		
//	}
//	
//	public Livre(String auteur,String titre,float nbPages) {
//		this.auteur = auteur;
//		this.titre = titre;
//		this.nbPages = nbPages;
//	}
//	
//	
//	public String getAuteur() { 
//		return auteur;
//	}
//	
//	public String getTitre() {
//		return titre;
//	}
//	
//	public float getNbPages() {
//		return nbPages;
//	}
//	
//	public double getPrix() {
//		return prix;
//	}
//	
//	public void setNbPages (float nbPages){
//		if (nbPages > 20)
//			this.nbPages = nbPages;
//		else
//			System.out.println("nombre de pages est faible");
//	}
//	
//	public void setAuteur(String auteur) {
//		this.auteur = auteur;
//	}
//	
//	public void setTitre(String titre) {
//		this.titre = titre;
//	}
//	
//	public void setPrix(double prix) {
//		if (prixFixe == 0) {
//			this.prix = prix; 
//			prixFixe ++ ;
//		}
//		else
//			System.out.println("Le prix est deja modifie");
//	}
//	
//	public  String toString() {
//		return("Livre intitule "+getTitre()+" de "+getAuteur()+", contenant "+getNbPages()+" pages."+"\tPrix = "+getPrix());
//	}
//	
//	public void decrire() {
//		System.out.println(toString());
//	}
//	
//	public boolean testPrix() {
//		return prix >0;
//	}
}
