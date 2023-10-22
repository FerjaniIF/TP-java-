package iset.dsi2.animalerie;

public class Chien extends Animal{
	String race;
	
	public Chien() {
		super();
	}
	
	public Chien(String couleur, int poids, String race) {
		super(couleur,poids);
		this.race = race;
	}
}
