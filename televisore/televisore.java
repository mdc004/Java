import javax.swing.JOptionPane;

public class televisore {
    private boolean stato = false;
    private int canale = 0;
    private int volume = 0;

    public void set_stato(boolean ins) {
        stato = ins;
    }

    public void set_canale(int ins) {
        canale = ins;
    }

    public void set_volume(int ins) {
        volume = ins;
    }

    public boolean get_stato() {
        return stato;
    }

    public int get_canale() {
        return canale;
    }

    public int get_volume() {
        return volume;
    }

    public void stampa() {
        JOptionPane.showMessageDialog(null,"In funzione: "+stato+"\n"+"Canale "+"\n"+"Volume "+volume);
    }

    public void cambia_canale(int canale) {
        this.canale = canale;
    }

    public void aumenta_canale() {
        canale++;
    }

    public void diminuisci_canale() {
        canale--;
    }

    public void aumenta_volume() {
        volume++;
    }

    public void diminuisci_volume() {
        volume--;
    }
    
    public void cambia_volume(int  volume) {
        this.volume = volume;
    }

}
