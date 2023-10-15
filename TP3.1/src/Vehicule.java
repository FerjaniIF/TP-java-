public class Vehicule {
	private int num;
	private String marque, modele;
	private int annee;
	private double prix;
	static private int count;
	
	public Vehicule(String marque, String modele, int annee, double prix) {
		num= count;
		count ++;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
	}
	
	void decrisVehicule() {
		System.out.println("Vehicule numero : "+num+", la marque et modele : "+marque+", "+modele+", annee de creation : "+annee+", prix : "+prix);
	}
	
	String getMarque() {
		return marque;
	}
	
	String getModele() {
		return modele;
	}
	
	double getPrix() {
		return prix;
	}
	
	void setMarque(String modele) {
		this.marque = marque;
	}
	
	void setModele() {
		this.modele = modele;
	}
	
	void setPrix(double prix) {
		this.prix = prix;
	}
	
	int getCount() {
		return count;
	}
	
	int getAnnee() {
		return annee;
	}
}
