
public class PointCol extends Point {
	private String couleur;
	
	public PointCol() {
		super();
		couleur = null;
	}
	
	public PointCol(char nom, int abs, int ord, String couleur) {
		super(nom, abs, ord);
		this.couleur = couleur;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("couleur : "+getCouleur()+"\n");
	}
	
}
