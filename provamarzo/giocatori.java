import javax.swing.JOptionPane;

public class giocatori extends gestisci{
    public static void main(String[] args) {
        int key = 0;
        // gestisci G = new gestisci();
        do {
            key = Integer.parseInt(JOptionPane.showInputDialog("Premere:" +
                    "\n0. Per terminare il programma" +
                    "\n1. Per inserire n giocatori" +
                    "\n2. Per conoscere i giocatori appartenenti ad una squadra" +
                    "\n3. Per copiare i file in un file di backup senza utilizzare un array di supporto" +
                    "\n4. Per copiare i file in un file di backup utilizzando un array di supporto" +
                    "\n5. Per inserire in coda al file \"giocatori.dat\" n giocatori" +
                    "\n6. Per cercare e cancellare un giocatore dal file" +
                    "\n7. Per conoscere i giocatori presenti nel file"));
            switch (key) {
                case 0:
                    System.out.println("*********Programma Terminato*********");
                    break;
                case 1:
                    crea();
                    break;
                case 2:
                    cerca_squadra();
                    break;
                case 3:
                    copia_senza_arr();
                    break;
                case 4:
                    copia_con_arr();
                    break;
                case 5:
                    inserisci_in_coda();
                    break;
                case 6:
                    cancella_giocatore();
                    break;
                case 7:
                    stampa();
                    break;
            }
        } while (key != 0);
    }
}