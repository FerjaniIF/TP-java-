package tp5;

abstract public class Propriete {
	private int id;
	protected Personne resp;
	protected String adr;
	protected double surface;
	
	public Propriete(int id, Personne r, String adr, double surface) {
		this.id = id;
		this.resp = r;
		this.adr = adr;
		this.surface = surface;
	}
	
	@Override
	public String toString () {
		return "id: "+id+", responsable: "+resp+", adresse: "+adr+", surface: "+surface;
	}
	
	abstract double calculImpot();
	
}
