import java.util.ArrayList;

import javax.swing.JOptionPane;

public class archivio_laureati {
    private ArrayList<neolaureato> lista;
    

    public archivio_laureati(){
        lista = new ArrayList<neolaureato>();
    }

    public void inserisci(int n) {
        for (int i = 0; i < n; i++) {
            String nome = JOptionPane.showInputDialog("Inserire il ");
            String cognome = JOptionPane.showInputDialog("Inserire il ");
            String materia = "Non definita";
            int key = Integer.parseInt(JOptionPane.showInputDialog("Premere:\n1. Per Informatica\n2. Per Elettronica\n3. Per Civile\n4. Per Meccanica\n5. Per Elettrica\n6. Per Gestionale"));
            switch (key) {
                case 1:
                    materia = "Informatica";
                    break;
                case 2:
                    materia = "Elettronica";
                    break;
                case 3:
                    materia = "Civile";
                    break;
                case 4:
                    materia = "Meccanica";
                    break;
                case 5:
                    materia = "Elettrica";
                    break;
                case 6:
                    materia = "Gestionale";
                    break;
            }
            int voto = Integer.parseInt(JOptionPane.showInputDialog("Inserire la valutazione di "+cognome+" "+nome));
            neolaureato temp = new neolaureato(nome, cognome, materia, voto);
            lista.add(temp);
        }
    }

    public void controlla_voto(int vsoglia) {
        int count = 0;
        for (neolaureato i : lista) {
            if(i.getVoto()>= vsoglia)JOptionPane.showMessageDialog(null, i.getCognome()+" "+i.getNome()+" "+i.getVoto());
            count++;
        }
        JOptionPane.showMessageDialog(null, "In totale "+count+" studenti hanno conseguito la laurea con un voto maggiore a "+vsoglia);
    }

    public void voto_medio_in(String materia) {
        int count = 0, somma = 0;
        double media = 0;
        for (neolaureato i : lista) {
            if(i.getMateria().equals(materia)==true){
                count ++;
                somma+=i.getVoto();
            }
        }
        media= (double) somma/count;
        count = 0;
        for (neolaureato i : lista) {
            if (i.getVoto() > media)
                count++;
        }
        JOptionPane.showMessageDialog(null,"La media dei voti e' pari a " + media + ", " + count + "hanno un voto superiore alla media");
    }

    public void cerca_studente(String cognome, String nome) {
        for (neolaureato i : lista) {
            if ((i.getCognome().equals(cognome)==true) && (i.getNome().equals(nome)==true)) {
                i.stampa();
            }
        }
    }

    public void cancella_studente(String cognome, String nome) {
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i).getCognome().equals(cognome)==true) && (lista.get(i).getNome().equals(nome)==true)) {
                lista.remove(i);
            }
        }
    }

    public void aumenta_10(String materia) {
        for (neolaureato i : lista) {
            if (i.getMateria().equals(materia) == true) {
                long temp = Math.round(i.getVoto() * 1.1);
                i.setVoto((int)temp);
            }
        }
    }

    public void ordina() {
        for (int i = 0; i < lista.size(); i++) {
            int pos = i;
            for (int j = i; j < lista.size(); j++) {
                if(lista.get(j).getCognome().compareTo(lista.get(pos).getCognome()) <0){
                    pos = j;
                }
            }
            neolaureato temp = lista.get(i);
            lista.remove(i);
            lista.add(i,lista.get(pos));
            lista.remove(pos);
            lista.add(pos, temp);
        }
        for (neolaureato i : lista) {
            i.stampa();
        }
    }
}
