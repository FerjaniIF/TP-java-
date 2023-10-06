public class Personne {

	private String nom;
	private String prenom;
	private String adresse;
	
	public Personne(String nom, String prenom, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public String toString() {
		return "\nnom : "+nom+"\nprenom : "+prenom+"\nadresse : "+adresse;
	}

	public String getnom() {
		return nom;
	}

	public String getprenom() {
		return prenom;
	}

	public String getadresse() {
		return adresse;
	}
	
		
	
}
