/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import javax.swing.JOptionPane;



/**
 *
 * @author Mattia De Capitani
 */
public class alunno {
    private String n_matricola = "";
    private String cognome = "";
    private String nome = "";
    private String materia = "";
    private int voto = 0;
    private String data = "";

    public alunno(String n_matricola, String cognome, String nome, String materia, int voto, String data) {
        this.n_matricola = n_matricola;
        this.cognome = cognome;
        this.nome = nome;
        this.materia = materia;
        this.voto = voto;
        this.data = data;
    }
    
    public alunno(){
        this.n_matricola = JOptionPane.showInputDialog("inserisci n_matricola");
        this.cognome = JOptionPane.showInputDialog("inserisci cognome");
        this.nome = JOptionPane.showInputDialog("inserisci nome");
        this.materia = JOptionPane.showInputDialog("inserisci materia");
        this.voto = Integer.parseInt(JOptionPane.showInputDialog("voto"));
        int o = Integer.parseInt(JOptionPane.showInputDialog("giorno"));
        String p = JOptionPane.showInputDialog("mese");
        int d = Integer.parseInt(JOptionPane.showInputDialog("anno"));
        this.data = o+"/"+p+"/"+d;
    }
    
    public String getN_matricola() {
        return n_matricola;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return  n_matricola+"*"+cognome+"*"+nome+"*"+materia+"*"+voto+"*"+data;
    }

    public String getMateria() {
        return materia;
    }

    public int getVoto() {
        return voto;
    }

    public String getData() {
        return data;
    }
    
}
