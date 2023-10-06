public class TestCompte {

	public static void main(String[] args) {
		Compte[] C= new Compte[3];
		
		C[0]= new Compte(new Personne("aa","bb","123@gmail.com"));
		C[1]= new Compte(200,950,2500,new Personne("cc","dd","456@gmail.com"));
		C[2]= new Compte(400,-1000,25000,new Personne("xx","yy","456@gmail.com"));
		
		Compte max = C[0];

		for (int i =0;i< C.length; i++) {	
			System.out.println(C[i].titulaire.toString());
			System.out.println(C[i].toString());
			if (max.getsolde()< C[i].getsolde())
				max = C[i];
		}
		//Compte.virement(C[1], C[2], 100.0);
		//C[1].virement(C[2], 500.0);
//		System.out.println(C[1].titulaire.toString());
//		System.out.println(C[1].toString());
//		System.out.println(C[2].titulaire.toString());
//		System.out.println(C[2].toString());
	
		System.out.println("\n-------------------------------------------------\nle compte avec solde le plus elevee");
		System.out.println(max.titulaire.toString());
		System.out.println(max.toString());
		
		}
}
