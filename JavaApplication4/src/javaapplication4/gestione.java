/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class gestione {
    private static ArrayList<alunno> ar = new ArrayList<alunno>();
    
    public static void creafile(){
        try{
            FileWriter f= new FileWriter("voti.csv");
            PrintWriter fin=new PrintWriter(f);// crea un file csv  con n dati inseriti dall esterno
            int x=Integer.parseInt(JOptionPane.showInputDialog("inserisci numero elementi"));
            for(int i=0;i<x;i++){
                String n_matricola = JOptionPane.showInputDialog("inserisci n_matricola");
                String cognome = JOptionPane.showInputDialog("inserisci cognome");
                String nome= JOptionPane.showInputDialog("inserisci nome");
                String materia= JOptionPane.showInputDialog("inserisci materia");
                int  voto =Integer.parseInt(JOptionPane.showInputDialog("voto"));
                int o=Integer.parseInt(JOptionPane.showInputDialog("giorno"));
                String p=JOptionPane.showInputDialog("mese");
                int d=Integer.parseInt(JOptionPane.showInputDialog("anno"));
                String data =o+"/"+p+"/"+d;
                String k=n_matricola+"*"+cognome+"*"+nome+"*"+materia+"*"+voto+"*"+data;                
                fin.println(k);
                f.flush();
            }
            f.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void carica(){
        ar.clear();
        try{
            // carica il contenuto di un file csv in un array 
            FileReader f = new FileReader("voti.csv");
            BufferedReader fout = new BufferedReader(f);
            String n = fout.readLine();
            while(n != null){ 
                StringTokenizer k=new StringTokenizer(n,"*");
                ar.add(new alunno(k.nextToken(),k.nextToken(),k.nextToken(),k.nextToken(),Integer.parseInt(k.nextToken()),k.nextToken()));
                n = fout.readLine();
            }
            f.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void stampa_voti_30(){
        carica();     // ricerca semplice per materia 
        for(int i=0;i<ar.size();i++){
            if(ar.get(i).getVoto()==30){
                JOptionPane.showMessageDialog(null,"matricola con voto 30"+ar.get(i).toString());
            }
        }
    }
    
    public static void new_materia_csv(String materia){
        String p= materia;
        materia+=".csv";
        boolean j=false;
        carica();
        if(ar.isEmpty()==true){// controlla se l'array e vuoto
            System.out.print("non sono presenti elementi nel array");
        }
        else{
        try{
            FileWriter f= new FileWriter(materia); // crea file e fa una ricerca semplice per materiase la trova scrive i dati dell alunno se no non fa niente
            PrintWriter fin=new PrintWriter(f);
            for(int i=0;i<ar.size();i++){
            if(ar.get(i).getMateria().equals(p)==true){
                fin.println(ar.get(i).toString());
                f.flush();
                j=true;// variabile di controllo per sapere se sono stati scritti dei studenti nel file 
                }
            }
            f.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        if(j==false){// controllo che definisce se sono presenti o meno dei studenti nel file
            System.out.print("il file creato e vuoto contine nessuno studente");
        }}
    }
    
    public static void FiltraPerVoto(){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Inserire il voto"));
        carica();
        // Elimino dall'array gli alunno che hanno voto non superiore a x
        for(alunno i: ar)if(i.getVoto() <= x)ar.remove(i);
        
        // Riscrivo l'array nel file voti.csv
        try{
            FileWriter f = new FileWriter("voti.csv");
            PrintWriter F = new PrintWriter(f);           
            for(alunno i: ar)F.println(i.toString());
            f.flush();
            f.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }  
    }
    
    public static void FileBackupCsv(){
        try{ 
            // Apro il file voti.csv in lettura
            FileReader f = new FileReader("voti.csv");
            BufferedReader F = new BufferedReader(f);
            
            // Apro il file in cui effettuare il backup in scrittura
            FileWriter f1 = new FileWriter("voti_backup.csv");
            PrintWriter F1 = new PrintWriter(f1);
            
            //Man mano che leggo dal file voti.csv scrivo nel file voti_backup.csv
            try{
                String s = F.readLine();
                while(s != null){
                    F1.println(s);
                    s = F.readLine();
                }
            } catch(Exception e){}
            f.close();
            f1.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void FileBackupDat(){
        carica();
        try{
            FileOutputStream f = new FileOutputStream("voti.dat");
            ObjectOutputStream F = new ObjectOutputStream(f);           
            for(alunno i: ar)F.writeObject(i);
            f.flush();
            f.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }  
        
    }
    
    public static void Append(){
        carica();
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserire il numero di persone si vuole inserire in coda"));
        for(int i = 0; i < n; i++)ar.add(new alunno());
        
        try{
            FileWriter f = new FileWriter("voti.csv");
            PrintWriter F = new PrintWriter(f);
            for(alunno i: ar)F.println(i.toString());
            f.flush();
            f.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }  
    }
}
