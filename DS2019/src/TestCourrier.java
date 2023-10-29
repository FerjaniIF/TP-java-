public class TestCourrier {

    public static void main(String[] args) {
        BoiteCourrier bc = new BoiteCourrier(3);

        Courrier a = new Courrier(true, "aa");
        Courrier b = new Lettre(false ,"bb", 10.0, "A4");
        Courrier c = new Colis(true, "cc", 20.0, 60.0);

        System.out.println("------------------ Courrier 1 --------------");
        bc.ajoutCourrier(a);
        bc.afficher();
        System.out.println("------------------ Courrier 2 --------------");
        bc.ajoutCourrier(b);
        bc.afficher();
        System.out.println("------------------ Courrier 3 --------------");
        bc.ajoutCourrier(c);
        bc.afficher();
        System.out.println("--------------------- Total ------------------");
        System.out.println("le total:"+bc.affranchir());
        System.out.println("--------------------- NB ------------------");
        System.out.println("les couriers invalides sont :"+bc.courriersInvalides());
    }

}
