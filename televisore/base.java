/**
 * base
 */
public class base {

    public static void main(String[] args) {
        televisore t1 = new televisore();
        
        t1.set_canale(66);
        t1.set_stato(false);
        t1.set_volume(30);
        
        t1.aumenta_canale();
        t1.stampa();
        t1.diminuisci_canale();
        t1.stampa();
        t1.aumenta_volume();
        t1.diminuisci_volume();
        t1.cambia_volume(10);
        t1.cambia_canale(23);
        t1.stampa();
    }
}