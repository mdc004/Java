import javax.swing.JOptionPane;

/**
 * base
 */
public class base {

    public static void main(String[] args) {
        quadrato q1 = new quadrato();
        q1.setLato(Double.parseDouble(JOptionPane.showInputDialog("inserire il lato")));
        JOptionPane.showMessageDialog(null, "Area: "+q1.area()+"\nVolume: "+q1.volume());
    }
}