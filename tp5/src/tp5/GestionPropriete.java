package tp5;

public interface GestionPropriete {
	public final static int MAX_PROPRIETE=100;
	
	public  void afficherPropriete();
	boolean ajouter(Propriete p);
	boolean supprimer(Propriete p);
}
