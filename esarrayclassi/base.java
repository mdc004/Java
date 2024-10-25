import javax.swing.JOptionPane;
public class base {
    public static void main(String[] args) {
        archivio_laureati a1 = new archivio_laureati();
        int key = 6;
        do {
            key = Integer.parseInt(JOptionPane.showInputDialog("Premere:"+
                    "\n0. Per terminare il programma"+
                    "\n1. Per inserire aggiungere gli studenti all'archivio"+
                    "\n2. Per inserire la soglia oltre al quale conoscere gli studenti con un voto superiore o uguale a essa"+
                    "\n3. Per conoscere il voto medio in una determinata materia"+
                    "\n4. Per ricercare e stampare il nome di uno studente"+
                    "\n5. Per cancellare un determinato studente dall'archivio"+
                    "\n6. Per aumentare i voti di una determinata materia del 10%"+
                    "\n7. Per ordinare e successivamente stampare l'archivio"));
            switch (key) {
                case 0:
                    System.out.println("********Programma Terminato********");
                    break;
                case 1:
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Quanti studenti neolaureati si desidera inserire?"));
                    a1.inserisci(n);
                    break;
                case 2:
                    int vsoglia = Integer.parseInt(JOptionPane.showInputDialog("Inserire la soglia"));
                    a1.controlla_voto(vsoglia);
                    break;
                case 3:
                    String materia = JOptionPane.showInputDialog("Inserire la materia di interesse");
                    a1.voto_medio_in(materia);
                    break;
                case 4:
                    String nome = JOptionPane.showInputDialog("Inserire il nome dello studente");
                    String cognome = JOptionPane.showInputDialog("Inserire il cognome dello studente");
                    a1.cerca_studente(cognome, nome);
                    break;
                case 5:
                    nome = JOptionPane.showInputDialog("Inserire il nome dello studente");
                    cognome = JOptionPane.showInputDialog("Inserire il cognome dello studente");
                    a1.cancella_studente(cognome, nome);
                    break;
                case 6:
                    materia = JOptionPane.showInputDialog("Inserire il corso di cui aumentare i voti del 10%");
                    a1.aumenta_10(materia);
                    break;
                case 7:
                    a1.ordina();
                    break;
            }
        } while (key!=0);
    }
}