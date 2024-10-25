import java.util.HashMap;
import javax.swing.JOptionPane;

public class concessionario {
    private HashMap<String, car> list = new HashMap<String, car>();
    
    public void add(){
        String targ = JOptionPane.showInputDialog("inserire la targa della macchina");
        list.put(targ,new car(targ));
    }
    
    public void add_n(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quante automobili si desidera inserire?"));
        for(int i = 0; i<n; i++)add();
    }
    
    public void remove(){
        if(list.remove(JOptionPane.showInputDialog("Inserire la targa dell'automobile da cancellare"))==null)JOptionPane.showMessageDialog(null, "targa inesistente");             
    }
    
    public void print_all(){
        for(String i: list.keySet())list.get(i).print();
    }
    
    public void overc(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Inserire il livello del filtro"));
        int count = 0;
        for(String i: list.keySet()){
            if(list.get(i).getCilindrata()>n){
                count++;
                list.get(i).print();
            }
        }
        if(count<1)JOptionPane.showMessageDialog(null, "Non sono state inserite macchine con una cilindrata superiore a"+n);
        else JOptionPane.showMessageDialog(null, count+" macchine hanno una cilindrata superiore a "+n+"cc");
    }
    public static void main(String[] args) {
        concessionario c1 = new concessionario();
        int key = 0;
        do{
            key = Integer.parseInt(JOptionPane.showInputDialog("Premere:"
                    +"\n0. Per terminare il programma"
                    +"\n1. Per inserire una macchina"
                    +"\n2. Per inserire n macchine"
                    +"\n3. Per cancellare una macchina"
                    +"\n4. Per stampare macchine e rispettivi dati"
                    +"\n5. Per conoscere quante e quali macchine hanno una cilindrata superiore a una indicata"
            ));
            
            switch(key){
                case 0:
                    System.out.println("********Programma Terminato********");
                    break;
                case 1:
                    c1.add();
                    break;
                case 2:
                    c1.add_n();
                    break;
                case 3:
                    c1.remove();
                    break;
                case 4:
                    c1.print_all();
                    break;
                case 5:
                    c1.overc();
                    break;
                    
            }
        }
        while(key!=0);
    }
    
}
