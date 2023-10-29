
public class Jcc {

	private Film[] competition;
    public int annee;
    private static final int NBFMAX = 30;
    private int nbF;
    
    public Jcc(int annee) {
        this.competition = new Film[NBFMAX];
        this.annee = annee;
        this.nbF = 0;
    }
    
    public void ajoutFilm(Film f) {
        if (nbF < NBFMAX) {
            competition[nbF] = f;
            nbF++;
        } 
        else 
            System.out.println("La competition est au complet");
        
    }
    
    public void listeFilmsJCC() {
        System.out.println("Films en competition pour  JCC " + annee + ":");
        for (int i = 0; i < nbF; i++) {
            System.out.println((i + 1) + "/" + competition[i]);
        }
    }
    
    public float totalVenteBilletsJCC() {
        float tot = 0;
        for (int i = 0; i < nbF; i++) {
            tot += competition[i].totalVenteBillets();
        }
        return tot; 
    }
}
