/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.pkg2.pkg3.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author Mattia De Capitani
 */
public class Es2310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ar[] = new String[10];
        String s, temp;
        for (int i = 0; i < ar.length; i++)
            ar[i] = JOptionPane.showInputDialog("Inserire una stringa");
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j].compareTo(ar[++j]) == -1) {
                    temp = ar[j];
                    ar[j] = ar[++j];
                    ar[++j] = temp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++)
            System.out.println(ar[i] + "\n");
    }
}
