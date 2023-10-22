package iset.dsi2.animalerie;

public class Animal {
	protected String couleur;
	protected int poids=20;
	
	Animal(){
	}
	
	Animal(String couleur, int poids){
		this.couleur= couleur;
		this.poids=poids;
	}
	
	public void boire(){
		System.out.println(" Je bois de l'eau");
	}
	
	public void manger(){
		System.out.println(" Je mange de la nourriture");
	}
	
	public void crier(){
		System.out.println(" Je crie \n");
	}
	
	public String toString() {
		return (" Je suis un objet de " +this.getClass()+", je suis de couleur "+ this.couleur +" et je pese " + this.poids+" kg ");
	}
	
	public void decrisToi(){
		System.out.println(this.toString());
	}
}
