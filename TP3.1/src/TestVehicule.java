public class TestVehicule {
	public static void main(String[] args) {
		Vehicule v = new Vehicule("clio","classique",2000,20.000);
		Vehicule w = new Vehicule("mercedes","fantome",2008,60.000);
		Vehicule x = new Vehicule("kia","picanto",2012,35.000);

		AgenceMobiliere ag=new AgenceMobiliere(4);
		ag.ajoutVehicule(v);
		ag.ajoutVehicule(w);
		ag.ajoutVehicule(x);
		
//		v.decrisVehicule();
//		w.decrisVehicule();
//		x.decrisVehicule();
		
//		ag.selection("mercedes");
		
//		ag.selection(40.000);
		
//		System.out.println("La voiture la plus ancienne dans le parking :");
//		ag.selection(ag.plus_anc());
	}

}