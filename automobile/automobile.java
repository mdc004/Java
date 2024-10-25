import javax.swing.JOptionPane;

public class automobile {
    int velocita = 50;

    public void accelera(){
        velocita+=5;
    }
    
    public void frena(){
        if(velocita-10>=0)velocita-=10;
        else JOptionPane.showMessageDialog(null, "Sei fermo. Non puoi rallentare ulteriormente");
    }

    public void controllo() {
        if(velocita>90)JOptionPane.showMessageDialog(null,"Vai troppo forte. Rallenta");
        JOptionPane.showMessageDialog(null, "Velocita': "+velocita);
    }
}
