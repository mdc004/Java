import java.io.Serializable;

import javax.swing.JOptionPane;

public class person implements Serializable{
    private String nome = "";
    private String cognome = "";
    private int eta = 0;

    public int getEta() {
        return eta;
    }

    public person(){
        this.nome = JOptionPane.showInputDialog("Inserire il nome della persona");
        this.cognome = JOptionPane.showInputDialog("Inserire il cognome della persona");
        this.eta = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'eta' di "+this.nome));
    }
    
    public String toString(){
        return this.cognome +" "+this.nome+" "+this.eta;
    }
}
