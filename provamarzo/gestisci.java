import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public abstract class gestisci {
    private static ArrayList<giocatore> list = new ArrayList<giocatore>();

    // crea un file di n giocatori
    public static void crea() {
        try {
            FileOutputStream f = new FileOutputStream("giocatori.dat");
            ObjectOutputStream F = new ObjectOutputStream(f);

            int n = Integer.parseInt(JOptionPane.showInputDialog("Quanti giocatori si desidera inserire?"));
            // Inserimento giocatori nel file
            for (int i = 0; i < n; i++)
                F.writeObject(new giocatore());
            f.flush();
            f.close();
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    // copia tutti i gli oggetti di un file "giocatori.dat" su un array
    public static void copia_su_arr() {
        list.clear();
        try {
            FileInputStream f = new FileInputStream("giocatori.dat");
            ObjectInputStream F = new ObjectInputStream(f);

            while (true) {
                try {
                    list.add((giocatore) F.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    // cerca e stampa tutti i giocatori appartenenti ad una squadra
    public static void cerca_squadra() {
        try {
            FileInputStream f = new FileInputStream("giocatori.dat");
            ObjectInputStream F = new ObjectInputStream(f);

            String squadra = JOptionPane.showInputDialog("Di quale squadra si desidera conoscere i giocatori?");
            while (true) {
                try {
                    giocatore temp = (giocatore) F.readObject();

                    if (temp.getSquadra().equals(squadra))
                        temp.stampa_nome();
                } catch (EOFException e) {
                    break;
                }
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    // crea un file di backup senza utilizzare un arraylist
    public static void copia_senza_arr() {
        try {
            FileInputStream f = new FileInputStream("giocatori.dat");
            ObjectInputStream F = new ObjectInputStream(f);

            FileOutputStream f1 = new FileOutputStream("backp.dat");
            ObjectOutputStream F1 = new ObjectOutputStream(f1);

            while (true) {
                try {
                    F1.writeObject((giocatore) F.readObject());
                    f1.flush();
                } catch (EOFException e) {
                    break;
                }
            }
            f.close();
            f1.close();
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    // crea un file di backup usando un arraylist
    public static void copia_con_arr() {
        try {
            copia_su_arr();
            FileOutputStream f = new FileOutputStream("backp.dat");
            ObjectOutputStream F = new ObjectOutputStream(f);

            // Inserimento giocatori nel file
            for (giocatore i : list)
                F.writeObject(i);
            f.flush();
            f.close();
            list.clear();
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    // inserisci in coda al file giocatori.dat n giocatori
    public static void inserisci_in_coda() {
        copia_su_arr();
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quanti giocatori si desidera inserire ijn coda?"));
        for (int i = 0; i < n; i++)
            list.add(new giocatore());

        try {
            FileOutputStream f = new FileOutputStream("giocatori.dat");
            ObjectOutputStream F = new ObjectOutputStream(f);

            // Inserimento giocatori nel file
            for (giocatore i : list)
                F.writeObject(i);
            f.flush();
            f.close();
            list.clear();
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    // cancella un giocatore dal file
    public static void cancella_giocatore() {
        copia_su_arr();

        String nome = JOptionPane.showInputDialog("Inserire il nome del giocatore da cancellare");
        String cognome = JOptionPane.showInputDialog("Inserire il cognome del giocatore da cancellare");

        try {
            FileOutputStream f = new FileOutputStream("giocatori.dat");
            ObjectOutputStream F = new ObjectOutputStream(f);

            // Inserimento giocatori nel file
            for (giocatore i : list) {
                if (!(i.getCognome().equals(cognome) && i.getNome().equals(nome)))
                    F.writeObject(i);
                else
                    JOptionPane.showMessageDialog(null, "Elemento rimosso con successo!");
            }
            f.flush();
            f.close();
            list.clear();
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    public static void stampa() {
        copia_su_arr();
        for (giocatore i : list)
            i.stampa();
        list.clear();
    }
}
