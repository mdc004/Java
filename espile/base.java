import javax.swing.JOptionPane;

public class base {
    public static void main(String[] args) {
        pila p1 = new pila();
        int key;
        do {
            
            key = Integer.parseInt(JOptionPane.showInputDialog("Premere:"+
            
            "\n1. Per inserire una moneta in coda alla pila"+
            "\n2. Per rimuovere l'ultimo elemento della pila"+
            "\n3. Per stampare il primo elemento della pila"+
            "\n4. Per svuotare la pila"+
            "\n5. Per stampare tutti i dati della pila"+
            "\n6. Per terminare il programma"+
            "\nScelta"));
            switch (key) {
                case 1:
                    double val = 0.0;
                    try {
                        val = Double.parseDouble(JOptionPane.showInputDialog("Inserire il valore della moneta da aggiungere in coda alla pila"));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inserire solo valori numerici");
                    }
                    p1.push(val);
                    break;
                case 2:
                    System.out.println("Valore della moneta eliminata: "+p1.pop().stampa());
                    break;
                case 3:
                    System.out.println("Valore moneta in testa: "+p1.top().stampa());
                    break;
                case 4:
                    p1.clear();
                    break;
                case 5:
                    p1.stampa_pila();
                    break;
                case 6:
                    System.out.println("*********Programma Terminato*********");
                    break;
            }
        } while (key != 0);
    }
}
    

