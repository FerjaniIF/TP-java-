package iset.dsi2.animalerie;

public class TestHeritage {
	public static void main(String[] args) {
			
			Animal[] T = new Animal[3];
		    T[0] = new Animal();
		    T[1] = new Chat();
		    T[2] = new Chien();
		    
		    for (int i=0; i<T.length; i++) {
		    	if(T[i] instanceof Chat || T[i] instanceof Chien) {
		    		T[i].decrisToi();
			    	T[i].manger();
			    	T[i].boire();
			    	T[i].crier();		    	
			    }
		    	else{
		    		System.out.println("L'espece de cet animal est inconnu\n");    	}
		    }
			
	}
}

