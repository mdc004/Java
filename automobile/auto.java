import javax.swing.JOptionPane;

public class auto extends automobile {
    boolean stato;

    public void accendi() {
        stato = true;
    }

    public void spegni() {
        stato = false;
    }

    public void accelera() {
        if (stato != false) {
            super.accelera();
        } else {
            JOptionPane.showMessageDialog(null,"Prima di effettuare qualsiasi operazione e' necessario accendere l'automobile");
        }
    }

    public void frena() {
        if (stato != false) {
            super.frena();
        } else {
            JOptionPane.showMessageDialog(null,"Prima di effettuare qualsiasi operazione e' necessario accendere l'automobile");
        }
    }
}
