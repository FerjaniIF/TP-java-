
abstract public class Article {

	protected long ref;
	protected String lib;
	protected double prixHT;
	protected int qteStock = 0;
	final static double TVA = 0.1;
	
	public Article(long ref, String lib, double p, int q) {
		this.ref = ref;
		this.lib = lib;
		this.prixHT = p;
		this.qteStock = q;
	}
	
	public void approvisionner(int nb) {
		this.qteStock += nb;
	}
	
	public void decrire() {
		System.out.println("l'article de reference "+ref+": "+lib);
	}
	
	abstract float calculPrixTTC();
	
	public boolean appartientPromo() {
		if(this instanceof ProduitElec || this instanceof Vetement )
			return true;
		return false;
	}
	
	public boolean estDispo(int qteAchat) {
		if (qteAchat< this.qteStock)
			return true;
		return false;
	}
	
}
