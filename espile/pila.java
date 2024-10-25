import java.util.ArrayList;

public class pila {
    private ArrayList<moneta> elenco;

    public pila() {
        elenco = new ArrayList<moneta>();
    }

    public void push(double valore) {
        moneta temp = new moneta(valore);
        elenco.add(temp);
    }

    public moneta pop() {
        moneta temp = null;
        if(elenco.size()>0){
            temp = elenco.get(elenco.size()-1);
            elenco.remove(elenco.size()-1);
        }
        return temp;
    }

    public moneta top() {
        moneta temp = null;
        if (elenco.size() > 0) {
            temp = elenco.get(elenco.size() - 1);
        } else {
            System.out.println("La Pila e' vuota!");
        }
        return temp;
    }

    public int get_size() {
        return elenco.size();
    }

    public void stampa_pila() {
        moneta temp;
        System.out.println("Elementi Pila:");
        for (int i = elenco.size() - 1; i >= 0; i--) {
            temp = elenco.get(i);
            System.out.println(temp.get_valore());
        }
        System.out.println("*********************");
    }

    public void clear() {
        elenco.clear();
        System.out.println("Operazione completata con successo!");
    }

}
