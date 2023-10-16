public class Dictionnaire {
    public int nbMots = 100;
    MotDico[] dico;
    String nom;

    public Dictionnaire(String nom) {
        this.nom = nom;
        dico = new MotDico[nbMots]; 
    }


    public void ajouterMot(MotDico m) {
        if (nbMots < dico.length) {
            dico[nbMots] = m;
            nbMots++;
        }
    }

    public void supprimerMot(String ch) {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i] != null && dico[i].getMot().equals(ch)) {
                dico[i] = null;
                nbMots--;
                break;
            }
        }
    }

    public int chercherMot(String ch) {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i] != null && dico[i].getMot().equals(ch))
                return i;
        }
        return -1;
    }

    public void listerDico() {
        System.out.println("Dictionnaire : " + nom + "\n");
        for (int i = 0; i < nbMots; i++) {
            if (dico[i] != null) {
                System.out.println(dico[i].getMot() + ": " + dico[i].getDef());
            }
        }
    }

    public int nbSynonymes(MotDico m) {
        int count = 0;
        for (int i = 0; i < nbMots; i++) {
            if (dico[i] != null && dico[i].synonyme(m)) {
                count++;
            }
        }
        return count;
    }
}
