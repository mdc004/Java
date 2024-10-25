import java.util.*;
public class comparatorVeicoli implements Comparator<Veicolo>{
    public int compare(Veicolo a, Veicolo b){
        return Integer.compare(a.getAnno(), b.getAnno());
    }
}
