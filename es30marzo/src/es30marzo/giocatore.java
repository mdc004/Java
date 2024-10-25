package es30marzo;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class giocatore implements Serializable{
    private String  nome = "";
    private String  cognome = "";
    private String  squadra = "";
    private int eta = 0;
    
    public giocatore(){
        this.nome = JOptionPane.showInputDialog("Inserire il nome del giocatore");
        this.cognome = JOptionPane.showInputDialog("Inserire il cognome del giocatore");
        this.squadra = JOptionPane.showInputDialog("Inserire la squadra del giocatore");
        this.eta = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'eta' del giocatore"));   
    }

    public String getSquadra() {
        return squadra;
    }

    public void stampa_nome(){
        JOptionPane.showMessageDialog(null, this.nome + "\n" + this.cognome);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    public void stampa(){
        JOptionPane.showMessageDialog(null, "Nome: "+ this.nome+"\nCognome: "+this.cognome+"\nSquadra: "+this.squadra+"\nEta': "+this.eta);
    } 
}
