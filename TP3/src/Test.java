public class Test {

	public static void main(String[] args) {
		Personne p = new Personne("aa","bb","cc");
		Personne p1 = new Personne("xx","yy","zz");
		
		Compte c = new Compte(p);
		Compte c1 = new Compte(p1);
		
		System.out.println(p.toString());
		System.out.println(c.toString());

		System.out.println(p1.toString());
		System.out.println(c1.toString());		 
		
	}
}
