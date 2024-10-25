package grafica_prove;

import java.awt.Container;
import javax.swing.*;

public class Grafica_prove {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel l = new JLabel("Etichetta");
        JButton b = new JButton("Pulsante");
        p.add(l);
        p.add(b);
        
        Container c = new Container();
        c.add(p);
        f.setVisible(true);
    }
    
}
