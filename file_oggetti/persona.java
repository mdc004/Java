import javax.swing.JOptionPane;

public class persona {
    private String nome = "";
    private String cognome = "";
    private int eta = 0;

    public int getEta() {
        return eta;
    }

    public persona(){
        this.nome = JOptionPane.showInputDialog("Inserire il nome della persona");
        this.cognome = JOptionPane.showInputDialog("Inserire il cognome della persona");
        this.eta = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'età di "+this.nome));
    }
}
