import javax.swing.JOptionPane;

/**
 * neolaureato
 */
public class neolaureato {

    private String nome;
    private String cognome;
    private String materia;
    private int voto;

    public neolaureato(String nome, String cognome, String materia, int voto){
        this.nome = nome;
        this.cognome = cognome;
        this.materia = materia;
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMateria() {
        return materia;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public void stampa() {
        JOptionPane.showMessageDialog(null, nome+"\n"+cognome+"\n"+materia+"\n"+voto);
    }

}