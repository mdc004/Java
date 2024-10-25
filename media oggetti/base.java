import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class base {
    
    public static void create(){
        try {
            FileOutputStream f = new FileOutputStream("people.dat");
            ObjectOutputStream F = new ObjectOutputStream(f);
            int n = Integer.parseInt(JOptionPane.showInputDialog("Quante persone si desidera inserire?"));
            for (int i = 0; i < n; i++){
                F.writeObject(new person()); 
                
            }  
            F.flush();     
            f.close();
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }

    public static void leggiestampa(){
        ArrayList<person> list = new ArrayList<person>();
        try {
            FileInputStream f = new FileInputStream("people.dat");
            ObjectInputStream F = new ObjectInputStream(f);

            while (true) {
                try {
                    person temp = (person) F.readObject();
                    list.add(temp);
                } catch (EOFException e) {
                    break;
                }
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
        int sum = 0;
        for (person i : list) {
            sum += i.getEta();
        }
        int average = sum/list.size();
        
            try {
                FileOutputStream f = new FileOutputStream("media.dat");
                ObjectOutputStream F = new ObjectOutputStream(f);
                for (person i : list){
                    if(i.getEta()>average){
                        F.writeObject(new person());
                    }
                }
                F.flush();
                f.close();
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        
    }
    public static void main(String[] args) {
        create();
        leggiestampa();
    }
}