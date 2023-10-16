import java.util.Scanner;

public class Tab {
	static public final int nmax=40;
	
	
	static void remplir(float t[]) {
		Scanner sc = new Scanner(System.in);
		for (int i=0 ; i<t.length ; i++) {
			System.out.println("T["+i+"] = ");
			t[i] = sc.nextFloat();
		}
	}
	
	static float somme_element(float t[]) {
		float s = 0;
		for (int i=0 ; i<t.length ; i++) 
			s+= t[i];
		return s;
	}
	
	static float[] additionner(float t1[], float t2[]) {
		float[] t3= new float[t1.length];
		for (int i=0 ; i<t3.length ; i++) 
			t3[i] = t1[i]+t2[i];
		return t3;
	}
	
	static float[] produit(float x, float t[]) {
		for (int i=0 ; i<t.length ; i++) 
			t[i]*= x;
		return t;
	}
	
	static void lister(float t[]) {
		for (int i=0 ; i<t.length ; i++) 
			System.out.println("\nt["+i+"] ="+t[i]);
	}
	
	static float[] additionner(float x, float t[]) {
		for (int i=0 ; i<t.length ; i++) 
			t[i]+= x;
		return t;
	}
	
}
