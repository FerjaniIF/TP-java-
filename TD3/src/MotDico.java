public class MotDico {
    private int num;
    private String mot;
    private String def;

    public String getMot() {
        return mot;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String s) {
        this.def = s;
    }

    public void setMot(String s) {
        this.mot = s;
    }

    public boolean synonyme(MotDico m) {
        return this.mot.equals(m.getMot());
    }

    public MotDico(String mot, String def) {
        this.mot = mot;
        this.def = def;
    }
}
