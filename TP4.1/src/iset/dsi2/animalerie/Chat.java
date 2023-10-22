package iset.dsi2.animalerie;

public class Chat extends Animal {
	boolean sauvage;
	
	public Chat() {
		super();
	}
	
	public Chat(String couleur,int poids, boolean sauvage) {
		super(couleur,poids);
		this.sauvage = sauvage;
	}
}
