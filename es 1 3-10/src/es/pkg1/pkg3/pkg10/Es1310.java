/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.pkg1.pkg3.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author Mattia De Capitani
 */
public class Es1310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ar[]=new String[10];
        String s;
        boolean found = false;
        for(int i=0; i<ar.length; i++)ar[i]=JOptionPane.showInputDialog("Inserire una stringa");
        s=JOptionPane.showInputDialog("Inserire la stringa da ricercare");
        for(int i=0; i<ar.length; i++)if(s.equals(ar[i])==true)found=true;
        if(found==true)System.out.println("La stringa e' presente nell' array");
        else System.out.println("La stringa non e' presente nell' array");
        
    }
    
}
