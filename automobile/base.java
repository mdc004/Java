import javax.swing.JOptionPane;

/**
 * base
 */
public class base {
    public static void main(String[] args) {
        int x=1;
        String k;
        auto a = new auto();
        do {
            k=JOptionPane.showInputDialog("Inserire A per accelerare, F per frenare, I per accendere la macchina e S per spegnere la macchina");
            if (k.equals("A")==false) {
                a.accelera();
            }
            if (k.equals("F")==false) {
                a.frena();
            }
            if (k.equals("I")==false) {
                a.accendi();
            }
            if (k.equals("S")==false) {
                a.spegni();
            }
        } 
        while (x != 0);
    }
        
    }