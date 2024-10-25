public class moneta {
    private double valore;

    public moneta(double valore) {
        this.valore = valore;
    }

    public void set_valore(double valore) {
        this.valore = valore;
    }

    public double get_valore() {
        return valore;
    }

    public double stampa(){
        return this.valore;
    }
}


