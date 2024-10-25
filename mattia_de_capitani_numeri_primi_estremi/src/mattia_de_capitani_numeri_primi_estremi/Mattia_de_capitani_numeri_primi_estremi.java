/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mattia_de_capitani_numeri_primi_estremi;

import javax.swing.JOptionPane;

/**
 *
 * @author Mattia De Capitani
 */
public class Mattia_de_capitani_numeri_primi_estremi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,s,n=1;
        while(n!=0){
           
        boolean v;
        i=Integer.parseInt(JOptionPane.showInputDialog("Inserire l'estremo inferiore"));
        s=Integer.parseInt(JOptionPane.showInputDialog("Inserire l'estremo superiore"));
        while(n!=0){
            v=true;
            n=Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero"));
            if((n>=i)&&(n<=s)){
                for(int j=2; j<n; j++)
                    if(n%j==0){
                        v=false;
                        break;
                    }
                if(v==true)System.out.println(n+" e' un numero primo all'interno dell'intervallo");
            }
            
        }
    }
    }
}
