import java.util.*;
public class Noleggio {
    private ArrayList<Veicolo> veicoli;

    public void Noleggio(){
        veicoli = new ArrayList<Veicolo>();
    }

    public void aggiungiVeicolo(Veicolo v){
        veicoli.add(v);
    }
    public Auto noleggiaAuto(int anno, int numeroPax){
        for(Veicolo v: veicoli) {
            if(v instanceof Auto && ( (Auto) v ).getNumeroPax() < numeroPax && v.getAnno() < anno) {
                veicoli.remove(v);
                return (Auto) v;
            }
        }
        return null;
    }

    public Moto noleggiaMoto(String modello, int cavalli) {
        for(Veicolo v: veicoli) {
            if(v instanceof Moto && v.getModello().equals(modello) && ((Moto) v).getCavalli() < cavalli) {
                veicoli.remove(v);
                return (Moto) v;
            }
        }
        return null;
    }

    public void print(){
        System.out.println("**********************************");
        for(Veicolo v: veicoli){
            System.out.println(v.toString());
        }
        System.out.println("**********************************");
    }

    public void sort(){
        Collections.sort(veicoli, new comparatorVeicoli());
    }
}