import java.io.*;

/**
 * base
 */
public class base {

    public static void main(String[] args) {
        try {
            FileInputStream NomeVariabile1 = new FileInputStream("NomeFile.estensione");
            ObjectInputStream NomeVariabile2 = new ObjectInputStream(NomeVariabile1);
            
        } catch (Exception e) {
            System.out.println("Eccezione: "+e.getMessage());
        }
    }
}