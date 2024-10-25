import java.util.ArrayList;

public class cd {
    private ArrayList<canzone> lista;

    public cd(){
        lista = new ArrayList<canzone>();
    }

    for(
    int i = 0;i<n;i++)
    {
        int durata = Integer.parseInt(JOptionPane.showInputDialog("Quante canzoni si deisdera inserire nel cd"));
        String nome = JOptionPane.showInputDialog("Quante canzoni si deisdera inserire nel cd");
        cd c = new cd();
    }

    public int cerca_canzone(String nome) {
        for (canzone i : lista) {
            if (i.nome.equals(nome) == true) {
                int temp = i.durata;
                return temp;
            }
            // for (int i = 0; i < lista.size(); i++) {
            // if (lista.get(i).nome.equals(nome) == true) {
            // return lista.get(i).durata;
            // }
        }
    }
}