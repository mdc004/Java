import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * base
 */
public class base {

    public static void main(String[] args) {
        boolean found = false;
        // Scanner str = new Scanner(System.in);
        // String parola = str.nextLine();
        // String parola = JOptionPane.showInputDialog("Inserirre una parola");
        // String string;
        // String parola = string;
        
        for(int i=0; i<parola.length(); i++)    {
        for(int j=i+1; j<parola.length(); j++){
            if(parola.charAt(i)==(parola.charAt(j)))found =true;
        }
            
        }
        
        if(found)System.out.println("Deja Vu");
        else System.out.println("Unique");
    }
}