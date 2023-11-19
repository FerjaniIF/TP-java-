package tp5;

public class Lotissement implements GestionPropriete {
    protected Propriete[] tabProp;
    protected int nombre;

    Lotissement(int capacite) {
        this.nombre = 0;
        if (capacite <= MAX_PROPRIETE)
            tabProp = new Propriete[capacite];
    }

    public Propriete getproprieteByIndice(int i) {
        if (i >= 0 && i < nombre) 
            return tabProp[i];
        return null;
    }

    int getnbPieces() {
        int nb = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof PropPrivee)
                nb += ((PropPrivee) tabProp[i]).nbPieces;
        }
        return nb;
    }

    public void afficherPropriete() {
        for (int i = 0; i < nombre; i++)
            System.out.println(tabProp[i].toString());
    }

    public boolean ajouter(Propriete p) { 
        if (nombre < tabProp.length) {
            tabProp[nombre] = p;
            nombre++;
            return true;
        }
        return false;
    }

    public boolean supprimer(Propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].equals(p)) {
                for (int j = i; j < nombre - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                tabProp[nombre - 1] = null; 
                nombre--;
                return true;
            }
        }
        return false;
    }
}