import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class filtro_maggiorenni {
    private ArrayList<persona> list= new ArrayList<persona>();

    public void crea() {
        try {
            FileInputStream f = new FileInputStream("persone.dat");
            ObjectInputStream fIN = new ObjectInputStream(f);
            
            do {
                try {
                    list.add((persona) fIN.readObject());
                } catch (EOFException e) {
                    break;
                }
            } while (true);
            f.close();
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }

    public void filtra() {
        try {
            FileOutputStream f = new FileOutputStream("maggiorenni.dat");
            ObjectOutputStream fOUT = new ObjectOutputStream(f);
            for(persona i: list){
            if (i.getEta()>18) {
                fOUT.writeObject(i);
            }
            f.close();
        }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        
    }
    public static void main(String[] args) {
        
    }
}