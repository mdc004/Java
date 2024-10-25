/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection.sort;

/**
 *
 * @author Mattia De Capitani
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ar[];
        ar= new int[10];
        int pos_min, temp;
        for(int i=0; i<10; i++){
            ar[i]= (int)(Math.random()*10);
        }
        for(int i=0; i<10; i++){
            pos_min=i;
            for(int j=i; i<10; j++){
               if(ar[j]<ar[pos_min])pos_min=j; 
            }
            temp=ar[i];
            ar[i]=ar[pos_min];
            ar[pos_min]=temp;
        }
        for(int i=0; i<10; i++)System.out.println("\t"+ar[i]);
    }
    
}
